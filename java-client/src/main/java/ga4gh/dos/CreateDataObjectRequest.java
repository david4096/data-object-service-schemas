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
import ga4gh.dos.DataObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The Data Object one would like to index. One must provide any aliases and URLs to this file when sending the CreateDataObjectRequest. It is up to implementations to validate that the Data Object is available from the provided URLs.
 */
@ApiModel(description = "The Data Object one would like to index. One must provide any aliases and URLs to this file when sending the CreateDataObjectRequest. It is up to implementations to validate that the Data Object is available from the provided URLs.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T15:01:18.579-07:00")
public class CreateDataObjectRequest {
  @SerializedName("data_object")
  private DataObject dataObject = null;

  public CreateDataObjectRequest dataObject(DataObject dataObject) {
    this.dataObject = dataObject;
    return this;
  }

   /**
   * REQUIRED The data object to be created. The ID scheme is left up to the implementor but should be unique to the server instance.
   * @return dataObject
  **/
  @ApiModelProperty(value = "REQUIRED The data object to be created. The ID scheme is left up to the implementor but should be unique to the server instance.")
  public DataObject getDataObject() {
    return dataObject;
  }

  public void setDataObject(DataObject dataObject) {
    this.dataObject = dataObject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataObjectRequest createDataObjectRequest = (CreateDataObjectRequest) o;
    return Objects.equals(this.dataObject, createDataObjectRequest.dataObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataObject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataObjectRequest {\n");
    
    sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
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

