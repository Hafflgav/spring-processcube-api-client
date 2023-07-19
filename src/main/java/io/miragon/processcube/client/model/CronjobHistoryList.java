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
import io.miragon.processcube.client.model.CronjobHistoryEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A list of cronjob histories.
 */
@ApiModel(description = "A list of cronjob histories.")
@JsonPropertyOrder({
  CronjobHistoryList.JSON_PROPERTY_CRONJOB_HISTORIES,
  CronjobHistoryList.JSON_PROPERTY_TOTAL_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class CronjobHistoryList {
  public static final String JSON_PROPERTY_CRONJOB_HISTORIES = "cronjobHistories";
  private List<CronjobHistoryEntry> cronjobHistories = new ArrayList<CronjobHistoryEntry>();

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private BigDecimal totalCount;


  public CronjobHistoryList cronjobHistories(List<CronjobHistoryEntry> cronjobHistories) {
    
    this.cronjobHistories = cronjobHistories;
    return this;
  }

  public CronjobHistoryList addCronjobHistoriesItem(CronjobHistoryEntry cronjobHistoriesItem) {
    this.cronjobHistories.add(cronjobHistoriesItem);
    return this;
  }

   /**
   * The cronjob histories
   * @return cronjobHistories
  **/
  @ApiModelProperty(required = true, value = "The cronjob histories")
  @JsonProperty(JSON_PROPERTY_CRONJOB_HISTORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CronjobHistoryEntry> getCronjobHistories() {
    return cronjobHistories;
  }


  public void setCronjobHistories(List<CronjobHistoryEntry> cronjobHistories) {
    this.cronjobHistories = cronjobHistories;
  }


  public CronjobHistoryList totalCount(BigDecimal totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of cronjob histories
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "The total number of cronjob histories")
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
    CronjobHistoryList cronjobHistoryList = (CronjobHistoryList) o;
    return Objects.equals(this.cronjobHistories, cronjobHistoryList.cronjobHistories) &&
        Objects.equals(this.totalCount, cronjobHistoryList.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronjobHistories, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronjobHistoryList {\n");
    sb.append("    cronjobHistories: ").append(toIndentedString(cronjobHistories)).append("\n");
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
