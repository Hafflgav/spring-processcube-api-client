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
import io.miragon.processcube.client.model.ProcessModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A list of ProcessModels.
 */
@ApiModel(description = "A list of ProcessModels.")
@JsonPropertyOrder({
  ProcessModelList.JSON_PROPERTY_PROCESS_MODELS,
  ProcessModelList.JSON_PROPERTY_TOTAL_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class ProcessModelList {
  public static final String JSON_PROPERTY_PROCESS_MODELS = "processModels";
  private List<ProcessModel> processModels = new ArrayList<ProcessModel>();

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private BigDecimal totalCount;


  public ProcessModelList processModels(List<ProcessModel> processModels) {
    
    this.processModels = processModels;
    return this;
  }

  public ProcessModelList addProcessModelsItem(ProcessModel processModelsItem) {
    this.processModels.add(processModelsItem);
    return this;
  }

   /**
   * The ProcessModels.
   * @return processModels
  **/
  @ApiModelProperty(required = true, value = "The ProcessModels.")
  @JsonProperty(JSON_PROPERTY_PROCESS_MODELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ProcessModel> getProcessModels() {
    return processModels;
  }


  public void setProcessModels(List<ProcessModel> processModels) {
    this.processModels = processModels;
  }


  public ProcessModelList totalCount(BigDecimal totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of ProcessModels.
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "The total number of ProcessModels.")
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
    ProcessModelList processModelList = (ProcessModelList) o;
    return Objects.equals(this.processModels, processModelList.processModels) &&
        Objects.equals(this.totalCount, processModelList.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processModels, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessModelList {\n");
    sb.append("    processModels: ").append(toIndentedString(processModels)).append("\n");
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
