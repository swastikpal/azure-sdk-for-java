// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The ClearRange model. */
@JacksonXmlRootElement(localName = "ClearRange")
@Fluent
public final class ClearRange {
    /*
     * The Start property.
     */
    @JsonProperty(value = "Start", required = true)
    private long start;

    /*
     * The End property.
     */
    @JsonProperty(value = "End", required = true)
    private long end;

    /**
     * Get the start property: The Start property.
     *
     * @return the start value.
     */
    public long getStart() {
        return this.start;
    }

    /**
     * Set the start property: The Start property.
     *
     * @param start the start value to set.
     * @return the ClearRange object itself.
     */
    public ClearRange setStart(long start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: The End property.
     *
     * @return the end value.
     */
    public long getEnd() {
        return this.end;
    }

    /**
     * Set the end property: The End property.
     *
     * @param end the end value to set.
     * @return the ClearRange object itself.
     */
    public ClearRange setEnd(long end) {
        this.end = end;
        return this;
    }
}
