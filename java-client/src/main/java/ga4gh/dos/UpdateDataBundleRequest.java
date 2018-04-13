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
import ga4gh.dos.DataBundle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateDataBundleRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T15:01:18.579-07:00")
public class UpdateDataBundleRequest {
  @SerializedName("data_bundle_id")
  private String dataBundleId = null;

  @SerializedName("data_bundle")
  private DataBundle dataBundle = null;

  public UpdateDataBundleRequest dataBundleId(String dataBundleId) {
    this.dataBundleId = dataBundleId;
    return this;
  }

   /**
   * REQUIRED
   * @return dataBundleId
  **/
  @ApiModelProperty(value = "REQUIRED")
  public String getDataBundleId() {
    return dataBundleId;
  }

  public void setDataBundleId(String dataBundleId) {
    this.dataBundleId = dataBundleId;
  }

  public UpdateDataBundleRequest dataBundle(DataBundle dataBundle) {
    this.dataBundle = dataBundle;
    return this;
  }

   /**
   * REQUIRED The new Data Bundle content.
   * @return dataBundle
  **/
  @ApiModelProperty(value = "REQUIRED The new Data Bundle content.")
  public DataBundle getDataBundle() {
    return dataBundle;
  }

  public void setDataBundle(DataBundle dataBundle) {
    this.dataBundle = dataBundle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDataBundleRequest updateDataBundleRequest = (UpdateDataBundleRequest) o;
    return Objects.equals(this.dataBundleId, updateDataBundleRequest.dataBundleId) &&
        Objects.equals(this.dataBundle, updateDataBundleRequest.dataBundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataBundleId, dataBundle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataBundleRequest {\n");
    
    sb.append("    dataBundleId: ").append(toIndentedString(dataBundleId)).append("\n");
    sb.append("    dataBundle: ").append(toIndentedString(dataBundle)).append("\n");
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

