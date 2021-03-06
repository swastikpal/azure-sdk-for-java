/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.BigDataPoolsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BigDataPools.
 */
public interface BigDataPools extends SupportsCreating<BigDataPoolResourceInfo.DefinitionStages.Blank>, HasInner<BigDataPoolsInner> {
    /**
     * Get Big Data pool.
     * Get a Big Data pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param bigDataPoolName Big Data pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BigDataPoolResourceInfo> getAsync(String resourceGroupName, String workspaceName, String bigDataPoolName);

    /**
     * List the Big Data pools in a workspace.
     * List Big Data pools in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BigDataPoolResourceInfo> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName);

    /**
     * Delete a Big Data pool.
     * Delete a Big Data pool from the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param bigDataPoolName Big Data pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName, String bigDataPoolName);

}
