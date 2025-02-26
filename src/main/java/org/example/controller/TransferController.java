package org.example.controller;

import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.example.model.Post200Response;
import org.example.model.TransferPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.service.TransferService;


@RestController
@RequestMapping("/transfer")
public class TransferController {
    @Autowired
    TransferService transferService;

    /**
     * POST /transfer : Transfer money card to card
     * Call to send money between cards
     *
     * @param transferPostRequest Card from and card to (required)
     * @return Success transfer (status code 200)
     * or Error input data (status code 400)
     * or Error transfer (status code 500)
     */
    @PostMapping(
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<Post200Response> transferPost(
            @Parameter(name = "TransferPostRequest", description = "Card from and card to", required = true) @Valid @RequestBody TransferPostRequest transferPostRequest
    ) {
        return transferService.transferPost(transferPostRequest);
    }
}
