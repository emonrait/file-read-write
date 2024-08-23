package com.cbl.filereadwrite.service.fileReadWriteApacheCommon;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class FIleReadWriteServiceApache {

    static int count = 0;

    public static void readFiles() throws Exception {
        final String FOLDER =
                "E:\\rtgs\\output\\txn\\";
        final String FOLDER2 =
                "E:\\rtgs\\output\\additional\\";
        final String FOLDER3 =
                "E:\\rtgs\\output\\statement\\";
        final long pollingInterval = 5 * 1000;

        File folder1 = new File(FOLDER);
        File folder2 = new File(FOLDER2);
        File folder3 = new File(FOLDER3);

        if (!folder1.exists() || !folder2.exists() || !folder3.exists()) {
            throw new RuntimeException("Directory not found: ");
        }

        FileAlterationObserver observer = new FileAlterationObserver(folder1);
        FileAlterationObserver observer2 = new FileAlterationObserver(folder2);
        FileAlterationObserver observer3 = new FileAlterationObserver(folder3);
        FileAlterationMonitor monitor =
                new FileAlterationMonitor(pollingInterval);
        FileAlterationListener listener = new FileAlterationListenerAdaptor() {
            // Is triggered when a file is created in the monitored folder
            @Override
            public void onFileCreate(File file) {
                try {
                    // "file" is the reference to the newly created file
                    System.out.println("File created: "
                            + file.getCanonicalPath());
                    this.readDocument(file);
                    //this.readAndPrintFileContents(file);
                } catch (IOException e) {
                    e.printStackTrace(System.err);
                    Path destinationPath = Paths.get("D:\\test\\failed");
                    Path destinationFile = destinationPath.resolve(file.getName());
                    try {
                        Files.move(file.toPath(), destinationFile);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } catch (ParserConfigurationException e) {
                    e.printStackTrace();
                    Path destinationPath = Paths.get("D:\\test\\failed");
                    Path destinationFile = destinationPath.resolve(file.getName());
                    try {
                        Files.move(file.toPath(), destinationFile);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } catch (SAXException e) {
                    e.printStackTrace();
                }
            }

            public void readDocument(File file) throws ParserConfigurationException, IOException, SAXException {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();

                // Parse the XSD or XML file
                Document doc = builder.parse(file);

                String data = toString(doc);
                System.out.println("data = " + data);
                Path destinationPath = Paths.get("E:\\rtgs\\output\\movefile\\");
                Path destinationFile = destinationPath.resolve(file.getName());
                Files.move(file.toPath(), destinationFile);

            }

            private static void readAndPrintFileContents(File file) throws IOException, ParserConfigurationException {
                // Open the file
                try {

                    // Create a DocumentBuilder
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = factory.newDocumentBuilder();

                    // Parse the XSD or XML file
                    Document doc = builder.parse(file);
                    // System.out.println("doc = " + toString(doc));
                    String data = toString(doc);
                    // Extract the file name from the file path
                    Path sourcePath = Paths.get(String.valueOf(file.toPath()));
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
                    if (!data.isEmpty()) {
                        //Manual process call
                        String url = "http://172.25.6.92:8085/test/inward-process-data";
                        HttpHeaders headers = new HttpHeaders();
                        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
                        // headers.setBearerAuth("6869f660bce14d1a958e16a0bc6f4408");
                        headers.setBearerAuth("6869f660bce14d1a958e16a0bc6f4408");

                        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
                        map.add("data", data);

                        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);

                        RestTemplate restTemplate = new RestTemplate();
                        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

                        if (response.getStatusCode() == HttpStatus.OK) {
                            System.out.println("Request processed successfully");
                        } else {
                            System.out.println("Request failed: " + response.getBody());
                        }

                    }


                } catch (SAXException ex) {
                    count++;
                    System.out.println("count = " + count);
                    ex.printStackTrace();
                }
                System.out.println("count = " + count);
            }

            public static String toString(Document doc) {
                try {
                    // Use StringWriter to capture the output
                    StringWriter sw = new StringWriter();

                    // Create a TransformerFactory instance
                    TransformerFactory tf = TransformerFactory.newInstance();

                    // Protect against XXE attacks
                    tf.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
                    tf.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");

                    // Create a Transformer instance
                    Transformer transformer = tf.newTransformer();

                    // Set output properties for the transformer
                    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                    transformer.setOutputProperty(OutputKeys.METHOD, "xml");
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

                    // Properly set the indent amount (2 spaces in this case)
                    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "5");

                    // Transform the document to a string
                    transformer.transform(new DOMSource(doc), new StreamResult(sw));

                    return sw.toString();

                } catch (Exception ex) {
                    throw new RuntimeException("Error converting to String", ex);
                }
            }

            // Is triggered when a file is deleted from the monitored folder
//            @Override
//            public void onFileDelete(File file) {
//                try {
//                    // "file" is the reference to the removed file
//                    System.out.println("File removed: "
//                            + file.getCanonicalPath());
//                    // "file" does not exists anymore in the location
//                    System.out.println("File still exists in location: "
//                            + file.exists());
//                } catch (IOException e) {
//                    e.printStackTrace(System.err);
//                }
//            }
        };

        observer.addListener(listener);
        observer2.addListener(listener);
        observer3.addListener(listener);
        monitor.addObserver(observer);
        monitor.addObserver(observer2);
        monitor.addObserver(observer3);
        monitor.start();
    }

}
