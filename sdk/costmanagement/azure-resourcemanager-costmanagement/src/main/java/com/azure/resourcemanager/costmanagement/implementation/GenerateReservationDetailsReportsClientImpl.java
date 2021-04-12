// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.costmanagement.fluent.GenerateReservationDetailsReportsClient;
import com.azure.resourcemanager.costmanagement.fluent.models.OperationStatusInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in GenerateReservationDetailsReportsClient.
 */
public final class GenerateReservationDetailsReportsClientImpl implements GenerateReservationDetailsReportsClient {
    private final ClientLogger logger = new ClientLogger(GenerateReservationDetailsReportsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GenerateReservationDetailsReportsService service;

    /** The service client containing this operation class. */
    private final CostManagementClientImpl client;

    /**
     * Initializes an instance of GenerateReservationDetailsReportsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GenerateReservationDetailsReportsClientImpl(CostManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    GenerateReservationDetailsReportsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CostManagementClientGenerateReservationDetailsReports to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CostManagementClient")
    private interface GenerateReservationDetailsReportsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/providers/Microsoft.CostManagement"
                + "/generateReservationDetailsReport")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> byBillingAccountId(
            @HostParam("$host") String endpoint,
            @PathParam("billingAccountId") String billingAccountId,
            @QueryParam("startDate") String startDate,
            @QueryParam("endDate") String endDate,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}"
                + "/providers/Microsoft.CostManagement/generateReservationDetailsReport")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> byBillingProfileId(
            @HostParam("$host") String endpoint,
            @PathParam("billingAccountId") String billingAccountId,
            @PathParam("billingProfileId") String billingProfileId,
            @QueryParam("startDate") String startDate,
            @QueryParam("endDate") String endDate,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> byBillingAccountIdWithResponseAsync(
        String billingAccountId, String startDate, String endDate) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountId is required and cannot be null."));
        }
        if (startDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter startDate is required and cannot be null."));
        }
        if (endDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter endDate is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .byBillingAccountId(
                            this.client.getEndpoint(),
                            billingAccountId,
                            startDate,
                            endDate,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> byBillingAccountIdWithResponseAsync(
        String billingAccountId, String startDate, String endDate, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountId is required and cannot be null."));
        }
        if (startDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter startDate is required and cannot be null."));
        }
        if (endDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter endDate is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .byBillingAccountId(
                this.client.getEndpoint(),
                billingAccountId,
                startDate,
                endDate,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingAccountIdAsync(
        String billingAccountId, String startDate, String endDate) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            byBillingAccountIdWithResponseAsync(billingAccountId, startDate, endDate);
        return this
            .client
            .<OperationStatusInner, OperationStatusInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                OperationStatusInner.class,
                OperationStatusInner.class,
                Context.NONE);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingAccountIdAsync(
        String billingAccountId, String startDate, String endDate, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            byBillingAccountIdWithResponseAsync(billingAccountId, startDate, endDate, context);
        return this
            .client
            .<OperationStatusInner, OperationStatusInner>getLroResult(
                mono, this.client.getHttpPipeline(), OperationStatusInner.class, OperationStatusInner.class, context);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingAccountId(
        String billingAccountId, String startDate, String endDate) {
        return beginByBillingAccountIdAsync(billingAccountId, startDate, endDate).getSyncPoller();
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingAccountId(
        String billingAccountId, String startDate, String endDate, Context context) {
        return beginByBillingAccountIdAsync(billingAccountId, startDate, endDate, context).getSyncPoller();
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> byBillingAccountIdAsync(
        String billingAccountId, String startDate, String endDate) {
        return beginByBillingAccountIdAsync(billingAccountId, startDate, endDate)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> byBillingAccountIdAsync(
        String billingAccountId, String startDate, String endDate, Context context) {
        return beginByBillingAccountIdAsync(billingAccountId, startDate, endDate, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner byBillingAccountId(String billingAccountId, String startDate, String endDate) {
        return byBillingAccountIdAsync(billingAccountId, startDate, endDate).block();
    }

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner byBillingAccountId(
        String billingAccountId, String startDate, String endDate, Context context) {
        return byBillingAccountIdAsync(billingAccountId, startDate, endDate, context).block();
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> byBillingProfileIdWithResponseAsync(
        String billingAccountId, String billingProfileId, String startDate, String endDate) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountId is required and cannot be null."));
        }
        if (billingProfileId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingProfileId is required and cannot be null."));
        }
        if (startDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter startDate is required and cannot be null."));
        }
        if (endDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter endDate is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .byBillingProfileId(
                            this.client.getEndpoint(),
                            billingAccountId,
                            billingProfileId,
                            startDate,
                            endDate,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> byBillingProfileIdWithResponseAsync(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountId is required and cannot be null."));
        }
        if (billingProfileId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingProfileId is required and cannot be null."));
        }
        if (startDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter startDate is required and cannot be null."));
        }
        if (endDate == null) {
            return Mono.error(new IllegalArgumentException("Parameter endDate is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .byBillingProfileId(
                this.client.getEndpoint(),
                billingAccountId,
                billingProfileId,
                startDate,
                endDate,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingProfileIdAsync(
        String billingAccountId, String billingProfileId, String startDate, String endDate) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            byBillingProfileIdWithResponseAsync(billingAccountId, billingProfileId, startDate, endDate);
        return this
            .client
            .<OperationStatusInner, OperationStatusInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                OperationStatusInner.class,
                OperationStatusInner.class,
                Context.NONE);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingProfileIdAsync(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            byBillingProfileIdWithResponseAsync(billingAccountId, billingProfileId, startDate, endDate, context);
        return this
            .client
            .<OperationStatusInner, OperationStatusInner>getLroResult(
                mono, this.client.getHttpPipeline(), OperationStatusInner.class, OperationStatusInner.class, context);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate) {
        return beginByBillingProfileIdAsync(billingAccountId, billingProfileId, startDate, endDate).getSyncPoller();
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context) {
        return beginByBillingProfileIdAsync(billingAccountId, billingProfileId, startDate, endDate, context)
            .getSyncPoller();
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> byBillingProfileIdAsync(
        String billingAccountId, String billingProfileId, String startDate, String endDate) {
        return beginByBillingProfileIdAsync(billingAccountId, billingProfileId, startDate, endDate)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> byBillingProfileIdAsync(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context) {
        return beginByBillingProfileIdAsync(billingAccountId, billingProfileId, startDate, endDate, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner byBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate) {
        return byBillingProfileIdAsync(billingAccountId, billingProfileId, startDate, endDate).block();
    }

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner byBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context) {
        return byBillingProfileIdAsync(billingAccountId, billingProfileId, startDate, endDate, context).block();
    }
}
