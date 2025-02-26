package org.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.example.model.TransferPostRequestAmount;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TransferPostRequest
 */

@JsonTypeName("_transfer_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-26T16:24:57.624708600+03:00[Europe/Moscow]", comments = "Generator version: 7.11.0")
public class TransferPostRequest {

  private @Nullable String cardFromNumber;

  private @Nullable String cardFromValidTill;

  private @Nullable String cardFromCVV;

  private @Nullable String cardToNumber;

  private @Nullable TransferPostRequestAmount amount;

  public TransferPostRequest cardFromNumber(String cardFromNumber) {
    this.cardFromNumber = cardFromNumber;
    return this;
  }

  /**
   * Get cardFromNumber
   * @return cardFromNumber
   */
  
  @Schema(name = "cardFromNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardFromNumber")
  public String getCardFromNumber() {
    return cardFromNumber;
  }

  public void setCardFromNumber(String cardFromNumber) {
    this.cardFromNumber = cardFromNumber;
  }

  public TransferPostRequest cardFromValidTill(String cardFromValidTill) {
    this.cardFromValidTill = cardFromValidTill;
    return this;
  }

  /**
   * Get cardFromValidTill
   * @return cardFromValidTill
   */
  
  @Schema(name = "cardFromValidTill", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardFromValidTill")
  public String getCardFromValidTill() {
    return cardFromValidTill;
  }

  public void setCardFromValidTill(String cardFromValidTill) {
    this.cardFromValidTill = cardFromValidTill;
  }

  public TransferPostRequest cardFromCVV(String cardFromCVV) {
    this.cardFromCVV = cardFromCVV;
    return this;
  }

  /**
   * Get cardFromCVV
   * @return cardFromCVV
   */
  
  @Schema(name = "cardFromCVV", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardFromCVV")
  public String getCardFromCVV() {
    return cardFromCVV;
  }

  public void setCardFromCVV(String cardFromCVV) {
    this.cardFromCVV = cardFromCVV;
  }

  public TransferPostRequest cardToNumber(String cardToNumber) {
    this.cardToNumber = cardToNumber;
    return this;
  }

  /**
   * Get cardToNumber
   * @return cardToNumber
   */
  
  @Schema(name = "cardToNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardToNumber")
  public String getCardToNumber() {
    return cardToNumber;
  }

  public void setCardToNumber(String cardToNumber) {
    this.cardToNumber = cardToNumber;
  }

  public TransferPostRequest amount(TransferPostRequestAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @Valid 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public TransferPostRequestAmount getAmount() {
    return amount;
  }

  public void setAmount(TransferPostRequestAmount amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferPostRequest transferPostRequest = (TransferPostRequest) o;
    return Objects.equals(this.cardFromNumber, transferPostRequest.cardFromNumber) &&
        Objects.equals(this.cardFromValidTill, transferPostRequest.cardFromValidTill) &&
        Objects.equals(this.cardFromCVV, transferPostRequest.cardFromCVV) &&
        Objects.equals(this.cardToNumber, transferPostRequest.cardToNumber) &&
        Objects.equals(this.amount, transferPostRequest.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardFromNumber, cardFromValidTill, cardFromCVV, cardToNumber, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferPostRequest {\n");
    sb.append("    cardFromNumber: ").append(toIndentedString(cardFromNumber)).append("\n");
    sb.append("    cardFromValidTill: ").append(toIndentedString(cardFromValidTill)).append("\n");
    sb.append("    cardFromCVV: ").append(toIndentedString(cardFromCVV)).append("\n");
    sb.append("    cardToNumber: ").append(toIndentedString(cardToNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

