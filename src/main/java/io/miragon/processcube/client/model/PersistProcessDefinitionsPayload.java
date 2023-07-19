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
 * The payload for persisting process definitions.
 */
@ApiModel(description = "The payload for persisting process definitions.")
@JsonPropertyOrder({
  PersistProcessDefinitionsPayload.JSON_PROPERTY_XML,
  PersistProcessDefinitionsPayload.JSON_PROPERTY_OVERWRITE_EXISTING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class PersistProcessDefinitionsPayload {
  public static final String JSON_PROPERTY_XML = "xml";
  private String xml = null;

  public static final String JSON_PROPERTY_OVERWRITE_EXISTING = "overwriteExisting";
  private Boolean overwriteExisting;


  public PersistProcessDefinitionsPayload xml(String xml) {
    
    this.xml = xml;
    return this;
  }

   /**
   * The xml of the process definition(s) to persist.
   * @return xml
  **/
  @ApiModelProperty(example = "string | string[]", required = true, value = "The xml of the process definition(s) to persist.")
  @JsonProperty(JSON_PROPERTY_XML)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getXml() {
    return xml;
  }


  public void setXml(String xml) {
    this.xml = xml;
  }


  public PersistProcessDefinitionsPayload overwriteExisting(Boolean overwriteExisting) {
    
    this.overwriteExisting = overwriteExisting;
    return this;
  }

   /**
   * A flag indicating whether existing process definitions should be overwritten.
   * @return overwriteExisting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether existing process definitions should be overwritten.")
  @JsonProperty(JSON_PROPERTY_OVERWRITE_EXISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverwriteExisting() {
    return overwriteExisting;
  }


  public void setOverwriteExisting(Boolean overwriteExisting) {
    this.overwriteExisting = overwriteExisting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistProcessDefinitionsPayload persistProcessDefinitionsPayload = (PersistProcessDefinitionsPayload) o;
    return Objects.equals(this.xml, persistProcessDefinitionsPayload.xml) &&
        Objects.equals(this.overwriteExisting, persistProcessDefinitionsPayload.overwriteExisting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xml, overwriteExisting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistProcessDefinitionsPayload {\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    overwriteExisting: ").append(toIndentedString(overwriteExisting)).append("\n");
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

