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
import io.miragon.processcube.client.model.UserMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A list of user metadata
 */
@ApiModel(description = "A list of user metadata")
@JsonPropertyOrder({
  UserMetadataObject.JSON_PROPERTY_METADATA,
  UserMetadataObject.JSON_PROPERTY_TOTAL_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class UserMetadataObject {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<UserMetadata> metadata = new ArrayList<UserMetadata>();

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private BigDecimal totalCount;


  public UserMetadataObject metadata(List<UserMetadata> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public UserMetadataObject addMetadataItem(UserMetadata metadataItem) {
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * The user metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "The user metadata")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UserMetadata> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<UserMetadata> metadata) {
    this.metadata = metadata;
  }


  public UserMetadataObject totalCount(BigDecimal totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of user metadata
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "The total number of user metadata")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMetadataObject userMetadataObject = (UserMetadataObject) o;
    return Objects.equals(this.metadata, userMetadataObject.metadata) &&
        Objects.equals(this.totalCount, userMetadataObject.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMetadataObject {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

