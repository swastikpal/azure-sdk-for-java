// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The integration account partner's business identity. */
@Fluent
public class BusinessIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BusinessIdentity.class);

    /*
     * The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
     */
    @JsonProperty(value = "qualifier", required = true)
    private String qualifier;

    /*
     * The user defined business identity value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the qualifier property: The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32.
     *
     * @return the qualifier value.
     */
    public String qualifier() {
        return this.qualifier;
    }

    /**
     * Set the qualifier property: The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32.
     *
     * @param qualifier the qualifier value to set.
     * @return the BusinessIdentity object itself.
     */
    public BusinessIdentity withQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }

    /**
     * Get the value property: The user defined business identity value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The user defined business identity value.
     *
     * @param value the value value to set.
     * @return the BusinessIdentity object itself.
     */
    public BusinessIdentity withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (qualifier() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property qualifier in model BusinessIdentity"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model BusinessIdentity"));
        }
    }
}
