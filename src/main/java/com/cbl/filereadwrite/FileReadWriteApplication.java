package com.cbl.filereadwrite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.cbl.filereadwrite.service.FileReadWriteService.fileReadStatement;


@SpringBootApplication
public class FileReadWriteApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FileReadWriteApplication.class, args);
        fileReadStatement("MANUAL1");
    }

}
