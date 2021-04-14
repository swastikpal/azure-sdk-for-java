// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Key-value pairs of instance details in the legacy format. */
@Fluent
public final class InfoField {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InfoField.class);

    /*
     * Identifies the name of the instance provisioned by the user.
     */
    @JsonProperty(value = "project")
    private String project;

    /**
     * Get the project property: Identifies the name of the instance provisioned by the user.
     *
     * @return the project value.
     */
    public String project() {
        return this.project;
    }

    /**
     * Set the project property: Identifies the name of the instance provisioned by the user.
     *
     * @param project the project value to set.
     * @return the InfoField object itself.
     */
    public InfoField withProject(String project) {
        this.project = project;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
