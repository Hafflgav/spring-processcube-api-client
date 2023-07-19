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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Describes the payload that must be send with a extendLock HTTP POST request.
 */
@ApiModel(description = "Describes the payload that must be send with a extendLock HTTP POST request.")
@JsonPropertyOrder({
  ExtendLockRequestPayload.JSON_PROPERTY_WORKER_ID,
  ExtendLockRequestPayload.JSON_PROPERTY_ADDITIONAL_DURATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class ExtendLockRequestPayload {
  public static final String JSON_PROPERTY_WORKER_ID = "workerId";
  private String workerId;

  public static final String JSON_PROPERTY_ADDITIONAL_DURATION = "additionalDuration";
  private BigDecimal additionalDuration;


  public ExtendLockRequestPayload workerId(String workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * The ID of the worker that wants to extend the lock.
   * @return workerId
  **/
  @ApiModelProperty(required = true, value = "The ID of the worker that wants to extend the lock.")
  @JsonProperty(JSON_PROPERTY_WORKER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  public ExtendLockRequestPayload additionalDuration(BigDecimal additionalDuration) {
    
    this.additionalDuration = additionalDuration;
    return this;
  }

   /**
   * The additional duration in milliseconds that the lock should be extended.
   * @return additionalDuration
  **/
  @ApiModelProperty(required = true, value = "The additional duration in milliseconds that the lock should be extended.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAdditionalDuration() {
    return additionalDuration;
  }


  public void setAdditionalDuration(BigDecimal additionalDuration) {
    this.additionalDuration = additionalDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendLockRequestPayload extendLockRequestPayload = (ExtendLockRequestPayload) o;
    return Objects.equals(this.workerId, extendLockRequestPayload.workerId) &&
        Objects.equals(this.additionalDuration, extendLockRequestPayload.additionalDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId, additionalDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendLockRequestPayload {\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    additionalDuration: ").append(toIndentedString(additionalDuration)).append("\n");
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

