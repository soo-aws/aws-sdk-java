/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSmsChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private SMSChannelResponse sMSChannelResponse;

    /**
     * @param sMSChannelResponse
     */

    public void setSMSChannelResponse(SMSChannelResponse sMSChannelResponse) {
        this.sMSChannelResponse = sMSChannelResponse;
    }

    /**
     * @return
     */

    public SMSChannelResponse getSMSChannelResponse() {
        return this.sMSChannelResponse;
    }

    /**
     * @param sMSChannelResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSmsChannelResult withSMSChannelResponse(SMSChannelResponse sMSChannelResponse) {
        setSMSChannelResponse(sMSChannelResponse);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSMSChannelResponse() != null)
            sb.append("SMSChannelResponse: ").append(getSMSChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSmsChannelResult == false)
            return false;
        GetSmsChannelResult other = (GetSmsChannelResult) obj;
        if (other.getSMSChannelResponse() == null ^ this.getSMSChannelResponse() == null)
            return false;
        if (other.getSMSChannelResponse() != null && other.getSMSChannelResponse().equals(this.getSMSChannelResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSMSChannelResponse() == null) ? 0 : getSMSChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetSmsChannelResult clone() {
        try {
            return (GetSmsChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}