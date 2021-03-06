/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudformation.model;

/**
 * List Stacks Result
 */
public class ListStacksResult {

    private java.util.List<StackSummary> stackSummaries;

    private String nextToken;

    /**
     * Returns the value of the StackSummaries property for this object.
     *
     * @return The value of the StackSummaries property for this object.
     */
    public java.util.List<StackSummary> getStackSummaries() {
        
        if (stackSummaries == null) {
            stackSummaries = new java.util.ArrayList<StackSummary>();
        }
        return stackSummaries;
    }
    
    /**
     * Sets the value of the StackSummaries property for this object.
     *
     * @param stackSummaries The new value for the StackSummaries property for this object.
     */
    public void setStackSummaries(java.util.Collection<StackSummary> stackSummaries) {
        if (stackSummaries == null) {
            this.stackSummaries = null;
            return;
        }

        java.util.List<StackSummary> stackSummariesCopy = new java.util.ArrayList<StackSummary>(stackSummaries.size());
        stackSummariesCopy.addAll(stackSummaries);
        this.stackSummaries = stackSummariesCopy;
    }
    
    /**
     * Sets the value of the StackSummaries property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackSummaries The new value for the StackSummaries property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListStacksResult withStackSummaries(StackSummary... stackSummaries) {
        if (getStackSummaries() == null) setStackSummaries(new java.util.ArrayList<StackSummary>(stackSummaries.length));
        for (StackSummary value : stackSummaries) {
            getStackSummaries().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the StackSummaries property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackSummaries The new value for the StackSummaries property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListStacksResult withStackSummaries(java.util.Collection<StackSummary> stackSummaries) {
        if (stackSummaries == null) {
            this.stackSummaries = null;
        } else {
            java.util.List<StackSummary> stackSummariesCopy = new java.util.ArrayList<StackSummary>(stackSummaries.size());
            stackSummariesCopy.addAll(stackSummaries);
            this.stackSummaries = stackSummariesCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the NextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken The new value for the NextToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListStacksResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (stackSummaries != null) sb.append("StackSummaries: " + stackSummaries + ", ");
        if (nextToken != null) sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackSummaries() == null) ? 0 : getStackSummaries().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListStacksResult == false) return false;
        ListStacksResult other = (ListStacksResult)obj;
        
        if (other.getStackSummaries() == null ^ this.getStackSummaries() == null) return false;
        if (other.getStackSummaries() != null && other.getStackSummaries().equals(this.getStackSummaries()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    