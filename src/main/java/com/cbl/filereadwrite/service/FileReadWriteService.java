package com.cbl.filereadwrite.service;

import com.cbl.filereadwrite.response.ResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class FileReadWriteService {

    static int count = 0;

    public static ResponseDto fileReadTrx(String filename) throws Exception {
        ResponseDto outModel = new ResponseDto();
        // Define the folder to watch
        Path folder = Path.of("E:\\rtgs\\output\\" + filename + "\\");

        // Create a WatchService
        WatchService watchService = FileSystems.getDefault().newWatchService();

        // Register the folder with the WatchService for creation events
        folder.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

        // Start an infinite loop to watch for events
        while (true) {
            // Wait for key to be signaled
            WatchKey key = watchService.take();

            // Process events
            for (WatchEvent<?> event : key.pollEvents()) {
                // Check if the event is a new file creation event
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    // Get the file name from the event context
                    Path createdFile = (Path) event.context();
                    System.out.println("New file created: " + createdFile);

                    // Process the new file (e.g., read its contents)
                    try {
                        // Construct the full path to the new file
                        Path filePath = folder.resolve(createdFile);
                        // Read the contents of the new file
                        readAndPrintFileContents(filePath.toString());
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                    }
                }
            }

            // Reset the key
            boolean valid = key.reset();
            if (!valid) {
                // If the key is no longer valid, exit the loop
                break;
            }
        }

        return outModel;

    }

    public static ResponseDto fileReadAdditional(String filename) throws Exception {
        ResponseDto outModel = new ResponseDto();
        // Define the folder to watch
        Path folder = Path.of("E:\\rtgs\\output\\" + filename + "\\");

        // Create a WatchService
        WatchService watchService = FileSystems.getDefault().newWatchService();

        // Register the folder with the WatchService for creation events
        folder.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

        // Start an infinite loop to watch for events
        while (true) {
            // Wait for key to be signaled
            WatchKey key = watchService.take();

            // Process events
            for (WatchEvent<?> event : key.pollEvents()) {
                // Check if the event is a new file creation event
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    // Get the file name from the event context
                    Path createdFile = (Path) event.context();
                    System.out.println("New file created: " + createdFile);

                    // Process the new file (e.g., read its contents)
                    try {
                        // Construct the full path to the new file
                        Path filePath = folder.resolve(createdFile);
                        // Read the contents of the new file
                        readAndPrintFileContents(filePath.toString());
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                    }
                }
            }

            // Reset the key
            boolean valid = key.reset();
            if (!valid) {
                // If the key is no longer valid, exit the loop
                break;
            }
        }

        return outModel;

    }

    public static ResponseDto fileReadStatement(String readType) throws Exception {
        ResponseDto outModel = new ResponseDto();
        // Define the folders to watch
        Path folder1 = Path.of("E:\\rtgs\\output\\txn\\");
        Path folder2 = Path.of("E:\\rtgs\\output\\additional\\");
        Path folder3 = Path.of("E:\\rtgs\\output\\statement\\");
        // Create a WatchService
        WatchService watchService = FileSystems.getDefault().newWatchService();

        // Register the folders with the WatchService for creation events
        folder1.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
        folder2.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
        folder3.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

        // Start an infinite loop to watch for events
        while (true) {
            if (readType.equals("MANUAL")) {
                // Check for new files even if watcher is temporarily disabled
                List<Path> newFiles = checkForNewFiles(folder1, folder2, folder3);
                if (!newFiles.isEmpty()) {
                    // Handle new files
                    //   System.out.println("New files detected:");
                    for (Path file : newFiles) {
                        System.out.println(file);
                        // Read The File
                        readAndPrintFileContents(file.toString());
                    }
                } else {
                    throw new RuntimeException("No File Found.");
                }
                break;
            }

            // Wait for key to be signaled
            WatchKey key = watchService.take();

            // Process events
            for (WatchEvent<?> event : key.pollEvents()) {
                // Check if the event is a new file creation event
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    // Get the file name from the event context
                    Path createdFile = (Path) event.context();
                    System.out.println("New file created: " + createdFile);
                    // Get the directory path being watched
                    Path watchedDir = (Path) key.watchable();
                    // Construct the full path to the new file
                    Path filePath = watchedDir.resolve(createdFile);

                    // Check which folder the file belongs to
                    if (filePath.startsWith(folder1)) {
                        System.out.println("File created in folder 1: " + filePath);
                        readAndPrintFileContents(filePath.toString());
                    } else if (filePath.startsWith(folder2)) {
                        System.out.println("File created in folder 2: " + filePath);
                        readAndPrintFileContents(filePath.toString());
                    } else if (filePath.startsWith(folder3)) {
                        System.out.println("File created in folder 3: " + filePath);
                        readAndPrintFileContents(filePath.toString());
                    } else {
                        System.out.println("File created in unknown folder: " + filePath);
                    }
                }
            }

            // Reset the key
            boolean valid = key.reset();
            if (!valid) {
                // If the key is no longer valid, exit the loop
                break;
            }
        }

        return outModel;
    }


    public static ResponseDto fileWrite(String data, String fileName) {
        ResponseDto outModel = new ResponseDto();
        String processData = "";
        Path folder1 = Path.of("E:\\rtgs\\output\\txn\\");
        Path folder2 = Path.of("E:\\rtgs\\output\\additional\\");
        Path folder3 = Path.of("E:\\rtgs\\output\\statement\\");
        // Specify the folder and file name
        // Create the file object
        File file = null;
        if (data.contains("pacs.008.001.04") || data.contains("pacs.009.001.04") || data.contains("pacs.004.001.04")) {
            file = new File(folder1 + "/" + fileName + ".xml");
        } else if (data.contains("pacs.002.001.04") || data.contains("camt.054.001.04") || data.contains("camt.025.001.04") || data.contains("camt.019.001.04")) {
            file = new File(folder2 + "/" + fileName + ".xml");
        } else if (data.contains("camt.52.001.04") || data.contains("camt.53.001.04")) {
            file = new File(folder3 + "/" + fileName + ".xml");
        } else {
            throw new RuntimeException("Invalid File or Data.");
        }

        try {
            // Create the directories if they don't exist
            Path parentDirectory = file.toPath().getParent();
            if (!Files.exists(parentDirectory)) {
                Files.createDirectories(parentDirectory);
            }

            // Write the content to the file
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("An error occurred while writing the file.");
        }
        return outModel;
    }


    public static ResponseDto fileWriteForOutWard(String data, String fileName) {
        ResponseDto outModel = new ResponseDto();
        String processData = "";
        Path folder1 = Path.of("E:\\rtgs\\input\\");
        // Specify the folder and file name
        // Create the file object
        File file = null;
        file = new File(folder1 + "/" + fileName + ".xml");
        try {
            // Create the directories if they don't exist
            //  file.getParentFile().mkdirs();

            // Write the content to the file
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
            throw new RuntimeException("An error occurred while writing the file.");
        }
        return outModel;
    }


    private static void readAndPrintFileContents(String filePath) throws IOException, ParserConfigurationException {
        // Open the file
        try {
            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XSD or XML file
            Document doc = builder.parse(new File(filePath));
            String data = toString(doc);
            System.out.println("data = " + data);

            // Extract the file name from the file path
            Path sourcePath = Paths.get(filePath);
            String fileName = sourcePath.getFileName().toString();

            // Destination directories
            Path destinationDirectory = Paths.get("E:\\rtgs\\output\\movefile\\");
            Path dbSuccess = Paths.get("E:\\rtgs\\output\\dbsuccess\\");
            Path dbFail = Paths.get("E:\\rtgs\\output\\dbfail\\");

            // Resolve the destination file paths
            Path destinationFile = destinationDirectory.resolve(fileName);
            Path dbSuccessFile = dbSuccess.resolve(fileName);
            Path dbFailFile = dbFail.resolve(fileName);

            // Check if the directory exists
            if (!Files.exists(destinationDirectory)) {
                Files.createDirectories(destinationDirectory);
            }
            if (!Files.exists(dbSuccess)) {
                Files.createDirectories(dbSuccess);
            }
            if (!Files.exists(dbFail)) {
                Files.createDirectories(dbFail);
            }

            // Move the file
            Files.move(sourcePath, destinationFile);

            if (!data.isEmpty()) {
                System.out.println("data = " + data);
                // DB Insert Api Call
                String url = "http://172.25.6.150:8085/test/inward-process-data";
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
                headers.setBearerAuth("208e640c601347f0861936d3da606bf6");

                MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
                map.add("data", data);

                HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);

                RestTemplate restTemplate = new RestTemplate();
                try {
                    ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

                    if (response.getStatusCode() == HttpStatus.OK) {
                        // Move the file after db success
                        Files.copy(destinationFile, dbSuccessFile);
                        System.out.println("Request processed successfully");
                    } else {
                        Files.copy(destinationFile, dbFailFile);
                        System.out.println("Request failed: " + response.getBody());
                    }
                } catch (HttpClientErrorException e) {
                    if (e.getStatusCode() == HttpStatus.CONFLICT) {
                        System.out.println("Conflict error: " + e.getResponseBodyAsString());
                    } else {
                        System.out.println("Client error: " + e.getResponseBodyAsString());
                    }
                    Files.copy(destinationFile, dbFailFile);
                } catch (Exception e) {
                    System.out.println("An error occurred while making the API call.");
                    e.printStackTrace();
                    Files.copy(destinationFile, dbFailFile);
                }
            }

        } catch (Exception ex) {
            count++;
            System.out.println("Count: " + count);
            ex.printStackTrace();
        }
    }

//    public static String toString(Document doc) {
//        try {
//            StringWriter sw = new StringWriter();
//            TransformerFactory tf = TransformerFactory.newInstance();
//            Transformer transformer = tf.newTransformer();
//            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
//            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
//            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//
//            transformer.transform(new DOMSource(doc), new StreamResult(sw));
//            return sw.toString();
//        } catch (Exception ex) {
//            throw new RuntimeException("Error converting to String", ex);
//        }
//    }

    public static String toString(Document doc) {
        try {
            StringWriter sw = new StringWriter();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes"); // Exclude XML declaration
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2"); // Pretty print indentation
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            transformer.transform(new DOMSource(doc), new StreamResult(sw));
            return sw.toString();
        } catch (Exception ex) {
            throw new RuntimeException("Error converting to String", ex);
        }
    }


    private static List<Path> checkForNewFiles(Path... folders) throws IOException {
        List<Path> newFiles = new ArrayList<>();
        Instant now = Instant.now();
        for (Path folder : folders) {
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(folder)) {
                // Filter files that are newly created
                for (Path path : directoryStream) {
                    BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
                    Instant creationTime = attr.creationTime().toInstant();
//                    if (creationTime.isAfter(now.minusSeconds(60))) { // Adjust the time frame as needed
//                        newFiles.add(path);
//                    }

                    newFiles.add(path);
                }
            }
        }
        return newFiles;
    }

    private static String getCreationTime(Path file) throws IOException {
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
        return attr.creationTime().toString();
    }

}
