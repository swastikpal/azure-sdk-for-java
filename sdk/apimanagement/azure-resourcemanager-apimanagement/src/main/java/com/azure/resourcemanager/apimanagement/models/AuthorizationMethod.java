// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AuthorizationMethod. */
public enum AuthorizationMethod {
    /** Enum value HEAD. */
    HEAD("HEAD"),

    /** Enum value OPTIONS. */
    OPTIONS("OPTIONS"),

    /** Enum value TRACE. */
    TRACE("TRACE"),

    /** Enum value GET. */
    GET("GET"),

    /** Enum value POST. */
    POST("POST"),

    /** Enum value PUT. */
    PUT("PUT"),

    /** Enum value PATCH. */
    PATCH("PATCH"),

    /** Enum value DELETE. */
    DELETE("DELETE");

    /** The actual serialized value for a AuthorizationMethod instance. */
    private final String value;

    AuthorizationMethod(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AuthorizationMethod instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AuthorizationMethod object, or null if unable to parse.
     */
    @JsonCreator
    public static AuthorizationMethod fromString(String value) {
        AuthorizationMethod[] items = AuthorizationMethod.values();
        for (AuthorizationMethod item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
