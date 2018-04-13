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
import ga4gh.dos.ChecksumRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Allows a requester to list and filter Data Objects. Only Data Objects matching all of the requested parameters will be returned.
 */
@ApiModel(description = "Allows a requester to list and filter Data Objects. Only Data Objects matching all of the requested parameters will be returned.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T15:01:18.579-07:00")
public class ListDataObjectsRequest {
  @SerializedName("alias")
  private String alias = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("checksum")
  private ChecksumRequest checksum = null;

  @SerializedName("page_size")
  private Integer pageSize = null;

  @SerializedName("page_token")
  private String pageToken = null;

  public ListDataObjectsRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * OPTIONAL If provided will only return Data Objects with the given alias.
   * @return alias
  **/
  @ApiModelProperty(value = "OPTIONAL If provided will only return Data Objects with the given alias.")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ListDataObjectsRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * OPTIONAL If provided will return only Data Objects with a that URL matches this string.
   * @return url
  **/
  @ApiModelProperty(value = "OPTIONAL If provided will return only Data Objects with a that URL matches this string.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ListDataObjectsRequest checksum(ChecksumRequest checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * OPTIONAL If provided will only return data object messages with the provided checksum. If the checksum type is provided
   * @return checksum
  **/
  @ApiModelProperty(value = "OPTIONAL If provided will only return data object messages with the provided checksum. If the checksum type is provided")
  public ChecksumRequest getChecksum() {
    return checksum;
  }

  public void setChecksum(ChecksumRequest checksum) {
    this.checksum = checksum;
  }

  public ListDataObjectsRequest pageSize(Integer pageSize) {
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

  public ListDataObjectsRequest pageToken(String pageToken) {
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
    ListDataObjectsRequest listDataObjectsRequest = (ListDataObjectsRequest) o;
    return Objects.equals(this.alias, listDataObjectsRequest.alias) &&
        Objects.equals(this.url, listDataObjectsRequest.url) &&
        Objects.equals(this.checksum, listDataObjectsRequest.checksum) &&
        Objects.equals(this.pageSize, listDataObjectsRequest.pageSize) &&
        Objects.equals(this.pageToken, listDataObjectsRequest.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, url, checksum, pageSize, pageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataObjectsRequest {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

