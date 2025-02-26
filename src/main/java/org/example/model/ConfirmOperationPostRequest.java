package org.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConfirmOperationPostRequest
 */

@JsonTypeName("_confirmOperation_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-26T16:24:57.624708600+03:00[Europe/Moscow]", comments = "Generator version: 7.11.0")
public class ConfirmOperationPostRequest {

  private @Nullable String operationId;

  private @Nullable String code;

  public ConfirmOperationPostRequest operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Operation id
   * @return operationId
   */
  
  @Schema(name = "operationId", description = "Operation id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public ConfirmOperationPostRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Verification code
   * @return code
   */
  
  @Schema(name = "code", description = "Verification code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmOperationPostRequest confirmOperationPostRequest = (ConfirmOperationPostRequest) o;
    return Objects.equals(this.operationId, confirmOperationPostRequest.operationId) &&
        Objects.equals(this.code, confirmOperationPostRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmOperationPostRequest {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

