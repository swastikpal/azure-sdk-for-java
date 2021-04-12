// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the Create TagDescription operation. */
@JsonFlatten
@Fluent
public class TagDescriptionCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagDescriptionCreateParameters.class);

    /*
     * Description of the Tag.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Absolute URL of external resources describing the tag.
     */
    @JsonProperty(value = "properties.externalDocsUrl")
    private String externalDocsUrl;

    /*
     * Description of the external resources describing the tag.
     */
    @JsonProperty(value = "properties.externalDocsDescription")
    private String externalDocsDescription;

    /**
     * Get the description property: Description of the Tag.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the Tag.
     *
     * @param description the description value to set.
     * @return the TagDescriptionCreateParameters object itself.
     */
    public TagDescriptionCreateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the externalDocsUrl property: Absolute URL of external resources describing the tag.
     *
     * @return the externalDocsUrl value.
     */
    public String externalDocsUrl() {
        return this.externalDocsUrl;
    }

    /**
     * Set the externalDocsUrl property: Absolute URL of external resources describing the tag.
     *
     * @param externalDocsUrl the externalDocsUrl value to set.
     * @return the TagDescriptionCreateParameters object itself.
     */
    public TagDescriptionCreateParameters withExternalDocsUrl(String externalDocsUrl) {
        this.externalDocsUrl = externalDocsUrl;
        return this;
    }

    /**
     * Get the externalDocsDescription property: Description of the external resources describing the tag.
     *
     * @return the externalDocsDescription value.
     */
    public String externalDocsDescription() {
        return this.externalDocsDescription;
    }

    /**
     * Set the externalDocsDescription property: Description of the external resources describing the tag.
     *
     * @param externalDocsDescription the externalDocsDescription value to set.
     * @return the TagDescriptionCreateParameters object itself.
     */
    public TagDescriptionCreateParameters withExternalDocsDescription(String externalDocsDescription) {
        this.externalDocsDescription = externalDocsDescription;
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
