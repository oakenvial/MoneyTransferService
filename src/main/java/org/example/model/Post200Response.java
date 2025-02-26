package org.example.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * Post200Response
 */

@JsonTypeName("_transfer_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-26T16:24:57.624708600+03:00[Europe/Moscow]", comments = "Generator version: 7.11.0")
public class Post200Response {

  private @Nullable String operationId;

  public Post200Response operationId(String operationId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post200Response post200Response = (Post200Response) o;
    return Objects.equals(this.operationId, post200Response.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post200Response {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

