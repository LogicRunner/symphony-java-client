/*
 *
 * Copyright 2016 The Symphony Software Foundation
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Agent API
 * This document refers to Symphony API calls to send and receive messages and content. They need the on-premise Agent installed to perform decryption/encryption of content.  - sessionToken and keyManagerToken can be obtained by calling the authenticationAPI on the symphony back end and the key manager respectively. Refer to the methods described in authenticatorAPI.yaml. - Actions are defined to be atomic, ie will succeed in their entirety or fail and have changed nothing. - If it returns a 40X status then it will have sent no message to any stream even if a request to aome subset of the requested streams would have succeeded. - If this contract cannot be met for any reason then this is an error and the response code will be 50X. - MessageML is a markup language for messages. See reference here: https://developers.symphony.com/documentation/message_format_reference 
 *
 * OpenAPI spec version: 1.40.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.symphonyoss.symphony.agent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


/**
 *
 * V2BaseMessage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-06T18:03:29.319-04:00")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "v2messageType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RoomCreatedMessage.class),
        @JsonSubTypes.Type(value = RoomDeactivatedMessage.class),
        @JsonSubTypes.Type(value = RoomMemberDemotedFromOwnerMessage.class),
        @JsonSubTypes.Type(value = RoomMemberPromotedToOwnerMessage.class),
        @JsonSubTypes.Type(value = RoomReactivatedMessage.class),
        @JsonSubTypes.Type(value = RoomUpdatedMessage.class),
        @JsonSubTypes.Type(value = UserJoinedRoomMessage.class),
        @JsonSubTypes.Type(value = UserLeftRoomMessage.class),
        @JsonSubTypes.Type(value = V2Message.class)
})
public class V2BaseMessage   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("v2messageType")
  private String v2messageType = null;

  @JsonProperty("streamId")
  private String streamId = null;

  public V2BaseMessage id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The messageId is assigned by the ingestor service when a message is sent.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The messageId is assigned by the ingestor service when a message is sent.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V2BaseMessage timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public V2BaseMessage v2messageType(String v2messageType) {
    this.v2messageType = v2messageType;
    return this;
  }

   /**
   * Get v2messageType
   * @return v2messageType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getV2messageType() {
    return v2messageType;
  }

  public void setV2messageType(String v2messageType) {
    this.v2messageType = v2messageType;
  }

  public V2BaseMessage streamId(String streamId) {
    this.streamId = streamId;
    return this;
  }

   /**
   * Get streamId
   * @return streamId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getStreamId() {
    return streamId;
  }

  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2BaseMessage v2BaseMessage = (V2BaseMessage) o;
    return Objects.equals(this.id, v2BaseMessage.id) &&
        Objects.equals(this.timestamp, v2BaseMessage.timestamp) &&
        Objects.equals(this.v2messageType, v2BaseMessage.v2messageType) &&
        Objects.equals(this.streamId, v2BaseMessage.streamId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, v2messageType, streamId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2BaseMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    v2messageType: ").append(toIndentedString(v2messageType)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
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
