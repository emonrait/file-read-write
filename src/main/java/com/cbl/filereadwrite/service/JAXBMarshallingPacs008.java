package com.cbl.filereadwrite.service;


import com.cbl.filereadwrite.service.camt_018.DataPDU;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JAXBMarshallingPacs008 {

    public static void main(String[] args) {
        try {

            // Step 1: Marshalling
            // Create JAXB context for Employee class
            JAXBContext context = JAXBContext.newInstance(DataPDU.class);
            // Create marshaller
            Marshaller marshaller = context.createMarshaller();
            // Set properties for pretty-printing XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


            // Populate DataPDU object

            // Marshal to DOM
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document doc = dbf.newDocumentBuilder().newDocument();
         //   marshaller.marshal(dataPDU, doc);

            // Get the DataPDU element
            Element dataPDUElement = (Element) doc.getElementsByTagNameNS("urn:swift:saa:xsd:saa.2.0", "DataPDU").item(0);
            dataPDUElement.removeAttribute("xmlns:ns2");
            dataPDUElement.removeAttribute("xmlns:ns3");
            dataPDUElement.removeAttribute("xmlns:ns4");
            //  dataPDUElement.setAttribute("xmlns:", "urn:swift:saa:xsd:saa.2.0");


            // Add namespace declaration to AppHdr element
            //  Element appHdrElement = (Element) doc.getElementsByTagNameNS("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "AppHdr").item(0);
            //   appHdrElement.removeAttribute("xmlns:ns3");
            //  appHdrElement.setAttribute("xmlns:", "urn:iso:std:iso:20022:tech:xsd:head.001.001.01");

            // Add namespace declaration to Documnet element
            //Element documentElement = (Element) doc.getElementsByTagNameNS("urn:swift:xsd:camt.018.001.03", "Document").item(0);
            // appHdrElement.removeAttribute("xmlns:ns4");
            // documentElement.setAttribute("xmlns:", "urn:swift:xsd:camt.018.001.03");

            // Transform DOM to String
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            DOMResult result = new DOMResult();
            transformer.transform(source, result);

            // Print the transformed XML
            Document transformedDoc = (Document) result.getNode();
            System.out.println(convertDocumentToString(transformedDoc));

//            // Marshal object to XML
//            StringWriter stringWriter = new StringWriter();
//            marshaller.marshal(dataPDU, stringWriter);
//            String xmlString = stringWriter.toString();
            //       System.out.println("xmlString = " + xmlString);
//              String xmlStringUnmarshal = stringWriter.toString().replace("ns2:", "");
//            System.out.println("Marshalled XML:");
//               System.out.println(xmlStringUnmarshal);
//
//            // Step 2: Unmarshalling
//            // Create unmarshaller
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//            // Unmarshal XML string back to Java object
//            DataPDU unmarshalledEmployee = (DataPDU) unmarshaller.unmarshal(new StringReader(xmlString));
//
//            // Print unmarshalled employee
//            System.out.println("\nUnmarshalled Employee:");
//            System.out.println("ID: " + unmarshalledEmployee.getRevision());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Utility method to convert Document to String
    private static String convertDocumentToString(Document document) {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");

            // Remove standalone attribute
            document.setXmlStandalone(false);

            java.io.StringWriter sw = new java.io.StringWriter();
            javax.xml.transform.stream.StreamResult sr = new javax.xml.transform.stream.StreamResult(sw);
            DOMSource domSource = new DOMSource(document);
            transformer.transform(domSource, sr);
            return replaceNamespacePrefix(sw.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected static String removeXmlStringNamespaceAndPreamble(String xmlString) {
        return xmlString
                //.replaceAll("(<\\?[^<]*\\?>)?", ""). /* remove preamble */
                // .  replaceAll("xmlns.*?(\"|\').*?(\"|\')", "") /* remove xmlns declaration */
                .replaceAll("(<)(\\w+:)(.*?>)", "$1$3") /* remove opening tag prefix */
                .replaceAll("(</)(\\w+:)(.*?>)", "$1$3"); /* remove closing tags prefix */
    }

    private static String replaceNamespacePrefix(String xml) {

        Pattern pattern = Pattern.compile("xmlns:\\w+");
        Matcher matcher = pattern.matcher(removeXmlStringNamespaceAndPreamble(xml));

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String replacement = "xmlns";
            matcher.appendReplacement(sb, replacement);
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}




