// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiReleaseContractInner;

/** Contains all response data for the update operation. */
public final class ApiReleasesUpdateResponse extends ResponseBase<ApiReleasesUpdateHeaders, ApiReleaseContractInner> {
    /**
     * Creates an instance of ApiReleasesUpdateResponse.
     *
     * @param request the request which resulted in this ApiReleasesUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ApiReleasesUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ApiReleaseContractInner value,
        ApiReleasesUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ApiReleaseContractInner getValue() {
        return super.getValue();
    }
}
