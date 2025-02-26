package org.example.service;

import org.example.model.ConfirmOperationPostRequest;
import org.example.model.Post200Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ConfirmOperationService {
    public ResponseEntity<Post200Response> confirmOperationPost(ConfirmOperationPostRequest confirmOperationPostRequest) {
        Post200Response response = new Post200Response();
        response.setOperationId("1");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
