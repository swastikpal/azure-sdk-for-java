// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Self-hosted integration runtime. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SelfHosted")
@JsonFlatten
@Fluent
public class SelfHostedIntegrationRuntime extends IntegrationRuntime {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SelfHostedIntegrationRuntime.class);

    /*
     * The base definition of a linked integration runtime.
     */
    @JsonProperty(value = "typeProperties.linkedInfo")
    private LinkedIntegrationRuntimeType linkedInfo;

    /**
     * Get the linkedInfo property: The base definition of a linked integration runtime.
     *
     * @return the linkedInfo value.
     */
    public LinkedIntegrationRuntimeType linkedInfo() {
        return this.linkedInfo;
    }

    /**
     * Set the linkedInfo property: The base definition of a linked integration runtime.
     *
     * @param linkedInfo the linkedInfo value to set.
     * @return the SelfHostedIntegrationRuntime object itself.
     */
    public SelfHostedIntegrationRuntime withLinkedInfo(LinkedIntegrationRuntimeType linkedInfo) {
        this.linkedInfo = linkedInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SelfHostedIntegrationRuntime withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (linkedInfo() != null) {
            linkedInfo().validate();
        }
    }
}
