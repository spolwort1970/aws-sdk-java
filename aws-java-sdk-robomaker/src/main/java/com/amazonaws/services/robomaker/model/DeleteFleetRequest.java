/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     */
    private String fleet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleet
     *        The Amazon Resource Name (ARN) of the fleet.
     */

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet.
     */

    public String getFleet() {
        return this.fleet;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleet
     *        The Amazon Resource Name (ARN) of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetRequest withFleet(String fleet) {
        setFleet(fleet);
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
        if (getFleet() != null)
            sb.append("Fleet: ").append(getFleet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetRequest == false)
            return false;
        DeleteFleetRequest other = (DeleteFleetRequest) obj;
        if (other.getFleet() == null ^ this.getFleet() == null)
            return false;
        if (other.getFleet() != null && other.getFleet().equals(this.getFleet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleet() == null) ? 0 : getFleet().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFleetRequest clone() {
        return (DeleteFleetRequest) super.clone();
    }

}
