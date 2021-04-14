// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.models.HubBillingInfoFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Hub resource. */
@JsonFlatten
@Fluent
public class HubInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HubInner.class);

    /*
     * API endpoint URL of the hub.
     */
    @JsonProperty(value = "properties.apiEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String apiEndpoint;

    /*
     * Web endpoint URL of the hub.
     */
    @JsonProperty(value = "properties.webEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String webEndpoint;

    /*
     * Provisioning state of the hub.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The bit flags for enabled hub features. Bit 0 is set to 1 indicates
     * graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates
     * the hub is disabled, or enabled if set to 0.
     */
    @JsonProperty(value = "properties.tenantFeatures")
    private Integer tenantFeatures;

    /*
     * Billing settings of the hub.
     */
    @JsonProperty(value = "properties.hubBillingInfo")
    private HubBillingInfoFormat hubBillingInfo;

    /**
     * Get the apiEndpoint property: API endpoint URL of the hub.
     *
     * @return the apiEndpoint value.
     */
    public String apiEndpoint() {
        return this.apiEndpoint;
    }

    /**
     * Get the webEndpoint property: Web endpoint URL of the hub.
     *
     * @return the webEndpoint value.
     */
    public String webEndpoint() {
        return this.webEndpoint;
    }

    /**
     * Get the provisioningState property: Provisioning state of the hub.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the tenantFeatures property: The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is
     * enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     *
     * @return the tenantFeatures value.
     */
    public Integer tenantFeatures() {
        return this.tenantFeatures;
    }

    /**
     * Set the tenantFeatures property: The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is
     * enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     *
     * @param tenantFeatures the tenantFeatures value to set.
     * @return the HubInner object itself.
     */
    public HubInner withTenantFeatures(Integer tenantFeatures) {
        this.tenantFeatures = tenantFeatures;
        return this;
    }

    /**
     * Get the hubBillingInfo property: Billing settings of the hub.
     *
     * @return the hubBillingInfo value.
     */
    public HubBillingInfoFormat hubBillingInfo() {
        return this.hubBillingInfo;
    }

    /**
     * Set the hubBillingInfo property: Billing settings of the hub.
     *
     * @param hubBillingInfo the hubBillingInfo value to set.
     * @return the HubInner object itself.
     */
    public HubInner withHubBillingInfo(HubBillingInfoFormat hubBillingInfo) {
        this.hubBillingInfo = hubBillingInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HubInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HubInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hubBillingInfo() != null) {
            hubBillingInfo().validate();
        }
    }
}
