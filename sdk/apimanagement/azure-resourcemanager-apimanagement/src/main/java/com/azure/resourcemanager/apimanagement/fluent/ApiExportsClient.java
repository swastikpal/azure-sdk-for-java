// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiExportResultInner;
import com.azure.resourcemanager.apimanagement.models.ExportApi;
import com.azure.resourcemanager.apimanagement.models.ExportFormat;

/** An instance of this class provides access to all the operations defined in ApiExportsClient. */
public interface ApiExportsClient {
    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key
     * valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes.
     * @param export Query parameter required to export the API details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier in the format specified to the Storage Blob with SAS
     *     Key valid for 5 minutes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiExportResultInner get(
        String resourceGroupName, String serviceName, String apiId, ExportFormat format, ExportApi export);

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key
     * valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes.
     * @param export Query parameter required to export the API details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier in the format specified to the Storage Blob with SAS
     *     Key valid for 5 minutes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiExportResultInner> getWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        ExportFormat format,
        ExportApi export,
        Context context);
}
