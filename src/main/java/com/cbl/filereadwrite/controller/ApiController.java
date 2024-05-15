package com.cbl.filereadwrite.controller;

import com.cbl.filereadwrite.ResponseHandler;
import com.cbl.filereadwrite.response.ResponseDto;
import com.cbl.filereadwrite.service.FileReadWriteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/back-service")
public class ApiController {

    private final FileReadWriteService fileReadWriteService;

    @PostMapping("/status")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> getStatus() {
        try {
            return ResponseHandler.generateResponse("Request process Successfully", HttpStatus.OK, null);

        } catch (Exception ex) {
            return ResponseHandler.generateResponse("Request process Failed", HttpStatus.NOT_FOUND, null);

        }
    }

    @PostMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> fileRead(@RequestParam(value = "readType", required = false) String readType) {
        try {
            ResponseDto response = FileReadWriteService.fileReadStatement(readType);
            return ResponseHandler.generateResponse("Request process Successfully", HttpStatus.OK, response);

        } catch (Exception ex) {
            return ResponseHandler.generateResponse("Request process Failed. " + ex.getMessage(), HttpStatus.NOT_FOUND, null);
        }
    }

    @PostMapping("/write")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> fileWrite(@RequestParam(value = "data") String data, @RequestParam(value = "fileName") String fileName) {
        try {
            ResponseDto response = FileReadWriteService.fileWrite(data, fileName);
            return ResponseHandler.generateResponse("Request process Successfully", HttpStatus.OK, response);
        } catch (Exception ex) {
            return ResponseHandler.generateResponse("Request process Failed. " + ex.getMessage(), HttpStatus.NOT_FOUND, null);

        }
    }

    @PostMapping("/write-outward")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> fileWriteForOutWard(@RequestParam(value = "data") String data, @RequestParam(value = "fileName") String fileName) {
        try {
            ResponseDto response = FileReadWriteService.fileWriteForOutWard(data, fileName);
            return ResponseHandler.generateResponse("Request process Successfully", HttpStatus.OK, response);
        } catch (Exception ex) {
            return ResponseHandler.generateResponse("Request process Failed. " + ex.getMessage(), HttpStatus.NOT_FOUND, null);

        }
    }
}
