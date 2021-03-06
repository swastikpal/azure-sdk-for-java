/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.QuotaByCounterKeysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing QuotaByCounterKeys.
 */
public interface QuotaByCounterKeys extends HasInner<QuotaByCounterKeysInner> {
    /**
     * Lists a collection of current quota counter periods associated with the counter-key configured in the policy on the specified service instance. The api does not support paging yet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible by "ba" key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QuotaCounterCollection> listByServiceAsync(String resourceGroupName, String serviceName, String quotaCounterKey);

    /**
     * Updates all the quota counter values specified with the existing quota counter key to a value in the specified service instance. This should be used for reset of the quota counter values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible by "ba" key
     * @param parameters The value of the quota counter to be applied to all quota counter periods.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable updateAsync(String resourceGroupName, String serviceName, String quotaCounterKey, QuotaCounterValueContractProperties parameters);

}
