package com.cbl.filereadwrite.service;


import com.cbl.filereadwrite.service.camt_018.BusinessApplicationHeaderV01;
import com.cbl.filereadwrite.service.camt_018.DataPDU;
import com.cbl.filereadwrite.service.camt_018.GetBusinessDayInformationV03CMA;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.io.StringWriter;

public class JAXBMarshalling {

    public static void main(String[] args) {
        try {   // Create an instance of Employee
//            Document document = new Document();
//            NotificationToReceiveStatusReportV08 reportV08 = new NotificationToReceiveStatusReportV08();
//            GroupHeader121 header121 = new GroupHeader121();
//            header121.setMsgId("1234567");
//            reportV08.setGrpHdr(header121);
//            document.setNtfctnToRcvStsRpt(reportV08);
            DataPDU dataPDU = new DataPDU();
            dataPDU.setRevision("1234456");
            DataPDU.Body body = new DataPDU.Body();
            BusinessApplicationHeaderV01 headerV01 = new BusinessApplicationHeaderV01();
            headerV01.setBizMsgIdr("sdeeewe");
            com.cbl.filereadwrite.service.camt_018.Document document = new com.cbl.filereadwrite.service.camt_018.Document();
            GetBusinessDayInformationV03CMA v03CMA = new GetBusinessDayInformationV03CMA();
            //  v03CMA.setBizDayInfQryDef();
            document.setGetBizDayInf(v03CMA);
            body.setDocument(document);
            body.setAppHdr(headerV01);
            dataPDU.setBody(body);

            // Step 1: Marshalling
            // Create JAXB context for Employee class
            JAXBContext context = JAXBContext.newInstance(DataPDU.class);
            // Create marshaller
            Marshaller marshaller = context.createMarshaller();
            // Set properties for pretty-printing XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // Marshal object to XML
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(dataPDU, stringWriter);
            String xmlString = stringWriter.toString();
              String xmlStringUnmarshal = stringWriter.toString().replace("ns2:", "");
            System.out.println("Marshalled XML:");
               System.out.println(xmlStringUnmarshal);

            // Step 2: Unmarshalling
            // Create unmarshaller
            Unmarshaller unmarshaller = context.createUnmarshaller();
            // Unmarshal XML string back to Java object
            DataPDU unmarshalledEmployee = (DataPDU) unmarshaller.unmarshal(new StringReader(xmlString));

            // Print unmarshalled employee
            System.out.println("\nUnmarshalled Employee:");
            System.out.println("ID: " + unmarshalledEmployee.getRevision());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

// Sample Employee class
@XmlRootElement
class Employee {
    private int id;
    private String name;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


