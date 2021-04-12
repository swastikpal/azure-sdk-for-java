// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the dependency override of the move resource. */
@Fluent
public final class MoveResourceDependencyOverride {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MoveResourceDependencyOverride.class);

    /*
     * Gets or sets the ARM ID of the dependent resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Gets or sets the resource ARM id of either the MoveResource or the
     * resource ARM ID of
     * the dependent resource.
     */
    @JsonProperty(value = "targetId")
    private String targetId;

    /**
     * Get the id property: Gets or sets the ARM ID of the dependent resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Gets or sets the ARM ID of the dependent resource.
     *
     * @param id the id value to set.
     * @return the MoveResourceDependencyOverride object itself.
     */
    public MoveResourceDependencyOverride withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the targetId property: Gets or sets the resource ARM id of either the MoveResource or the resource ARM ID of
     * the dependent resource.
     *
     * @return the targetId value.
     */
    public String targetId() {
        return this.targetId;
    }

    /**
     * Set the targetId property: Gets or sets the resource ARM id of either the MoveResource or the resource ARM ID of
     * the dependent resource.
     *
     * @param targetId the targetId value to set.
     * @return the MoveResourceDependencyOverride object itself.
     */
    public MoveResourceDependencyOverride withTargetId(String targetId) {
        this.targetId = targetId;
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
