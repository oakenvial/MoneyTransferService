package org.example.service;

import org.example.exception.InvalidData;
import org.example.exception.NoSuchCardNumber;
import org.example.model.Post200Response;
import org.example.model.TransferPostRequest;
import org.example.repository.Card;
import org.example.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class TransferService {
    private static final Logger logger = LoggerFactory.getLogger(TransferService.class);
    private final Random random = new Random();

    @Autowired
    CardRepository cardRepository;

    public ResponseEntity<Post200Response> transferPost(TransferPostRequest transferPostRequest) {
        String operationId = String.valueOf(random.nextInt(999999));

        try {
            Optional<Card> cardFrom = cardRepository.getCardByNumber(transferPostRequest.getCardFromNumber());
            if (cardFrom.isEmpty()) {
                throw new NoSuchCardNumber("Invalid card from. No such card number exists: " + transferPostRequest.getCardFromNumber(),
                        operationId
                );
            }

            if (!cardRepository.isValidCard(transferPostRequest.getCardFromNumber(),
                    transferPostRequest.getCardFromCVV(),
                    transferPostRequest.getCardFromValidTill())) {
                throw new InvalidData("Invalid card from data",
                        operationId
                );
            }

            Optional<Card> cardTo = cardRepository.getCardByNumber(transferPostRequest.getCardToNumber());
            if (cardTo.isEmpty()) {
                throw new NoSuchCardNumber("Invalid card to. No such card number exists: " + transferPostRequest.getCardToNumber(),
                        operationId
                );
            }

            String operationResult = "SUCCESS";

            // Log the operation details
            logger.info("Transfer: Date: {}, Time: {}, From Card: {}, To Card: {}, Amount: {}, OperationId: {}, Result: {}",
                    LocalDate.now(),
                    LocalTime.now(),
                    transferPostRequest.getCardFromNumber(),
                    transferPostRequest.getCardToNumber(),
                    transferPostRequest.getAmount() != null ? transferPostRequest.getAmount().getValue() : "N/A",
                    operationId,
                    operationResult);

            Post200Response response = new Post200Response();
            response.setOperationId(operationId);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (RuntimeException e) {
            // Log the error
            logger.error("Operation {} failed: {}", operationId, e.getMessage(), e);
            throw e;
        }
    }
}
