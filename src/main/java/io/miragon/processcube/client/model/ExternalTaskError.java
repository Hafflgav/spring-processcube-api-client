/*
 * 5Minds Engine API
 * This is the swagger ui documentation of the 5Minds Engine API.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.miragon.processcube.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Describes an error that occured while processing an External Task.
 */
@ApiModel(description = "Describes an error that occured while processing an External Task.")
@JsonPropertyOrder({
  ExternalTaskError.JSON_PROPERTY_ERROR_CODE,
  ExternalTaskError.JSON_PROPERTY_ERROR_MESSAGE,
  ExternalTaskError.JSON_PROPERTY_ERROR_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class ExternalTaskError {
  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private Object errorDetails;


  public ExternalTaskError errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code of the error.
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "The error code of the error.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public ExternalTaskError errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message of the error.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error message of the error.")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ExternalTaskError errorDetails(Object errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Additional information about the error.
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information about the error.")
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getErrorDetails() {
    return errorDetails;
  }


  public void setErrorDetails(Object errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTaskError externalTaskError = (ExternalTaskError) o;
    return Objects.equals(this.errorCode, externalTaskError.errorCode) &&
        Objects.equals(this.errorMessage, externalTaskError.errorMessage) &&
        Objects.equals(this.errorDetails, externalTaskError.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, errorDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskError {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

