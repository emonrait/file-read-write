package com.cbl.filereadwrite.service;

import com.cbl.filereadwrite.response.ResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
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
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.attribute.BasicFileAttributes;

@Slf4j
@RequiredArgsConstructor
@Service
public class FileReadWriteService {


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
                    System.out.println("New files detected:");
                    for (Path file : newFiles) {
                        System.out.println(file);
                        // Check file creation time
                        readAndPrintFileContents(file.toString());
                    }
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


    public ResponseDto fileWrite(String data) throws Exception {
        ResponseDto outModel = new ResponseDto();
        String processData = "";
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
            System.out.println("doc = " + toString(doc));

            // Extract the file name from the file path
            Path sourcePath = Paths.get(filePath);
            String fileName = sourcePath.getFileName().toString();
            // Destination directory path
            Path destinationDirectory = Paths.get("E:\\rtgs\\output\\movefile\\");

            // Resolve the destination file path with the same name and extension
            Path destinationFile = destinationDirectory.resolve(fileName);
            // Check if the directory exists
            if (!Files.exists(destinationDirectory)) {
                Files.createDirectories(destinationDirectory);
            }
            // Move the file
            Files.move(sourcePath, destinationFile);

            System.out.println("File moved successfully.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String toString(Document doc) {
        try {
            StringWriter sw = new StringWriter();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
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
                    if (creationTime.isAfter(now.minusSeconds(60))) { // Adjust the time frame as needed
                        newFiles.add(path);
                    }
                }
            }
        }
        return newFiles;
    }

    private static String getCreationTime(Path file) throws IOException {
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
        return attr.creationTime().toString();
    }

    private static void fileMove() {
        // Source and destination file paths
        Path sourcePath = Paths.get("source.txt");
        Path destinationPath = Paths.get("destination.txt");

        try {
            // Move the file
            Files.move(sourcePath, destinationPath);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
