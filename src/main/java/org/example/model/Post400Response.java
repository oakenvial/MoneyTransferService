package org.example.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * Post400Response
 */

@JsonTypeName("_transfer_post_400_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-26T16:24:57.624708600+03:00[Europe/Moscow]", comments = "Generator version: 7.11.0")
public class Post400Response {

  private @Nullable String message;

  private @Nullable Integer id;

  public Post400Response message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error customer message
   * @return message
   */
  
  @Schema(name = "message", description = "Error customer message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Post400Response id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post400Response post400Response = (Post400Response) o;
    return Objects.equals(this.message, post400Response.message) &&
        Objects.equals(this.id, post400Response.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post400Response {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

