// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Controllers. */
public interface Controllers {
    /**
     * Gets details about the specified dnc controller.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified dnc controller.
     */
    DelegatedController getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Gets details about the specified dnc controller.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified dnc controller.
     */
    Response<DelegatedController> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Deletes the DNC controller.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Deletes the DNC controller.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, Context context);

    /**
     * Gets details about the specified dnc controller.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified dnc controller.
     */
    DelegatedController getById(String id);

    /**
     * Gets details about the specified dnc controller.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified dnc controller.
     */
    Response<DelegatedController> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the DNC controller.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the DNC controller.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DelegatedController resource.
     *
     * @param name resource name.
     * @return the first stage of the new DelegatedController definition.
     */
    DelegatedController.DefinitionStages.Blank define(String name);
}
