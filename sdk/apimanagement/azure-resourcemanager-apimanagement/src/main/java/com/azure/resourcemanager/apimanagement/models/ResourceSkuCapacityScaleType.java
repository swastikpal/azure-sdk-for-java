// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceSkuCapacityScaleType. */
public final class ResourceSkuCapacityScaleType extends ExpandableStringEnum<ResourceSkuCapacityScaleType> {
    /** Static value automatic for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType AUTOMATIC = fromString("automatic");

    /** Static value manual for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType MANUAL = fromString("manual");

    /** Static value none for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType NONE = fromString("none");

    /**
     * Creates or finds a ResourceSkuCapacityScaleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceSkuCapacityScaleType.
     */
    @JsonCreator
    public static ResourceSkuCapacityScaleType fromString(String name) {
        return fromString(name, ResourceSkuCapacityScaleType.class);
    }

    /** @return known ResourceSkuCapacityScaleType values. */
    public static Collection<ResourceSkuCapacityScaleType> values() {
        return values(ResourceSkuCapacityScaleType.class);
    }
}
