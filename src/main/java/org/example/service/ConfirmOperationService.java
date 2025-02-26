package org.example.service;

import org.example.model.ConfirmOperationPostRequest;
import org.example.model.Post200Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;


@Service
public class ConfirmOperationService {
    private static final Logger logger = LoggerFactory.getLogger(TransferService.class);

    public ResponseEntity<Post200Response> confirmOperationPost(ConfirmOperationPostRequest confirmOperationPostRequest) {
        String operationId = UUID.randomUUID().toString();
        String operationResult = "SUCCESS";

        // Log the operation details
        logger.info("Transfer: Date: {}, Time: {}, Code: {}, OperationId: {}, Result: {}",
                LocalDate.now(),
                LocalTime.now(),
                confirmOperationPostRequest.getCode(),
                operationId,
                operationResult);

        Post200Response response = new Post200Response();
        response.setOperationId(operationId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
