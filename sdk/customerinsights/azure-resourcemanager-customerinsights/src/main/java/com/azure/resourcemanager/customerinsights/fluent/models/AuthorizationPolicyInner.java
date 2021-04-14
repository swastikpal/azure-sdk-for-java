// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.models.PermissionTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The authorization policy. */
@Fluent
public final class AuthorizationPolicyInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AuthorizationPolicyInner.class);

    /*
     * Name of the policy.
     */
    @JsonProperty(value = "policyName", access = JsonProperty.Access.WRITE_ONLY)
    private String policyName;

    /*
     * The permissions associated with the policy.
     */
    @JsonProperty(value = "permissions", required = true)
    private List<PermissionTypes> permissions;

    /*
     * Primary key associated with the policy.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /*
     * Secondary key associated with the policy.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /**
     * Get the policyName property: Name of the policy.
     *
     * @return the policyName value.
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Get the permissions property: The permissions associated with the policy.
     *
     * @return the permissions value.
     */
    public List<PermissionTypes> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The permissions associated with the policy.
     *
     * @param permissions the permissions value to set.
     * @return the AuthorizationPolicyInner object itself.
     */
    public AuthorizationPolicyInner withPermissions(List<PermissionTypes> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the primaryKey property: Primary key associated with the policy.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: Primary key associated with the policy.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the AuthorizationPolicyInner object itself.
     */
    public AuthorizationPolicyInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: Secondary key associated with the policy.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: Secondary key associated with the policy.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the AuthorizationPolicyInner object itself.
     */
    public AuthorizationPolicyInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (permissions() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property permissions in model AuthorizationPolicyInner"));
        }
    }
}
