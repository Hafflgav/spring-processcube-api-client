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
import io.miragon.processcube.client.model.Correlation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A list of Correlations.
 */
@ApiModel(description = "A list of Correlations.")
@JsonPropertyOrder({
  CorrelationList.JSON_PROPERTY_CORRELATIONS,
  CorrelationList.JSON_PROPERTY_TOTAL_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-19T14:39:29.278702+02:00[Europe/Berlin]")
public class CorrelationList {
  public static final String JSON_PROPERTY_CORRELATIONS = "correlations";
  private List<Correlation> correlations = new ArrayList<Correlation>();

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private BigDecimal totalCount;


  public CorrelationList correlations(List<Correlation> correlations) {
    
    this.correlations = correlations;
    return this;
  }

  public CorrelationList addCorrelationsItem(Correlation correlationsItem) {
    this.correlations.add(correlationsItem);
    return this;
  }

   /**
   * The correlations
   * @return correlations
  **/
  @ApiModelProperty(required = true, value = "The correlations")
  @JsonProperty(JSON_PROPERTY_CORRELATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Correlation> getCorrelations() {
    return correlations;
  }


  public void setCorrelations(List<Correlation> correlations) {
    this.correlations = correlations;
  }


  public CorrelationList totalCount(BigDecimal totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of correlations
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "The total number of correlations")
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
    CorrelationList correlationList = (CorrelationList) o;
    return Objects.equals(this.correlations, correlationList.correlations) &&
        Objects.equals(this.totalCount, correlationList.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlations, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrelationList {\n");
    sb.append("    correlations: ").append(toIndentedString(correlations)).append("\n");
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

