// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CloudServiceVaultAndSecretReference model. */
@Fluent
public final class CloudServiceVaultAndSecretReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudServiceVaultAndSecretReference.class);

    /*
     * The sourceVault property.
     */
    @JsonProperty(value = "sourceVault")
    private SubResource sourceVault;

    /*
     * The secretUrl property.
     */
    @JsonProperty(value = "secretUrl")
    private String secretUrl;

    /**
     * Get the sourceVault property: The sourceVault property.
     *
     * @return the sourceVault value.
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: The sourceVault property.
     *
     * @param sourceVault the sourceVault value to set.
     * @return the CloudServiceVaultAndSecretReference object itself.
     */
    public CloudServiceVaultAndSecretReference withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the secretUrl property: The secretUrl property.
     *
     * @return the secretUrl value.
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl property: The secretUrl property.
     *
     * @param secretUrl the secretUrl value to set.
     * @return the CloudServiceVaultAndSecretReference object itself.
     */
    public CloudServiceVaultAndSecretReference withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
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
