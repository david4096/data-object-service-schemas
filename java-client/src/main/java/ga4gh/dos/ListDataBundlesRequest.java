/*
 * Data Object Service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ga4gh.dos;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import ga4gh.dos.Checksum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Only return Data Bundles that match all of the request parameters. A page_size and page_token are provided for retrieving a large number of results.
 */
@ApiModel(description = "Only return Data Bundles that match all of the request parameters. A page_size and page_token are provided for retrieving a large number of results.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T15:01:18.579-07:00")
public class ListDataBundlesRequest {
  @SerializedName("alias")
  private String alias = null;

  @SerializedName("checksum")
  private Checksum checksum = null;

  @SerializedName("page_size")
  private Integer pageSize = null;

  @SerializedName("page_token")
  private String pageToken = null;

  public ListDataBundlesRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * OPTIONAL If provided returns Data Bundles that have any alias that matches the request.
   * @return alias
  **/
  @ApiModelProperty(value = "OPTIONAL If provided returns Data Bundles that have any alias that matches the request.")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ListDataBundlesRequest checksum(Checksum checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * OPTIONAL If provided, will only return Data Bundles which have the provided checksum.
   * @return checksum
  **/
  @ApiModelProperty(value = "OPTIONAL If provided, will only return Data Bundles which have the provided checksum.")
  public Checksum getChecksum() {
    return checksum;
  }

  public void setChecksum(Checksum checksum) {
    this.checksum = checksum;
  }

  public ListDataBundlesRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * OPTIONAL Specifies the maximum number of results to return in a single page. If unspecified, a system default will be used.
   * @return pageSize
  **/
  @ApiModelProperty(value = "OPTIONAL Specifies the maximum number of results to return in a single page. If unspecified, a system default will be used.")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ListDataBundlesRequest pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

   /**
   * OPTIONAL The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of &#x60;next_page_token&#x60; from the previous response.
   * @return pageToken
  **/
  @ApiModelProperty(value = "OPTIONAL The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of `next_page_token` from the previous response.")
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDataBundlesRequest listDataBundlesRequest = (ListDataBundlesRequest) o;
    return Objects.equals(this.alias, listDataBundlesRequest.alias) &&
        Objects.equals(this.checksum, listDataBundlesRequest.checksum) &&
        Objects.equals(this.pageSize, listDataBundlesRequest.pageSize) &&
        Objects.equals(this.pageToken, listDataBundlesRequest.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, checksum, pageSize, pageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataBundlesRequest {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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

