package org.example.controller;

import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.example.model.ConfirmOperationPostRequest;
import org.example.model.Post200Response;
import org.example.service.ConfirmOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/confirmOperation")
public class ConfirmOperationController {
    @Autowired
    ConfirmOperationService confirmOperationService;
    /**
     * POST /confirmOperation : Confirm operation
     * Confirming operataion with code
     *
     * @param confirmOperationPostRequest Confirm operation (required)
     * @return Success confirmation (status code 200)
     * or Error input data (status code 400)
     * or Error confirmation (status code 500)
     */
    @PostMapping(
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<Post200Response> confirmOperationPost(
            @Parameter(name = "ConfirmOperationPostRequest", description = "Confirm operation", required = true) @Valid @RequestBody ConfirmOperationPostRequest confirmOperationPostRequest
    ) {
        return confirmOperationService.confirmOperationPost(confirmOperationPostRequest);
    }
}
