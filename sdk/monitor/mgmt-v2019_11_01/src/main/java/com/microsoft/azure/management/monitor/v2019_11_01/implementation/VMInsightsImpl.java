/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.VMInsights;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2019_11_01.VMInsightsOnboardingStatus;

class VMInsightsImpl extends WrapperImpl<VMInsightsInner> implements VMInsights {
    private final MonitorManager manager;

    VMInsightsImpl(MonitorManager manager) {
        super(manager.inner().vMInsights());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VMInsightsOnboardingStatus> getOnboardingStatusAsync(String resourceUri) {
        VMInsightsInner client = this.inner();
        return client.getOnboardingStatusAsync(resourceUri)
        .map(new Func1<VMInsightsOnboardingStatusInner, VMInsightsOnboardingStatus>() {
            @Override
            public VMInsightsOnboardingStatus call(VMInsightsOnboardingStatusInner inner) {
                return new VMInsightsOnboardingStatusImpl(inner, manager());
            }
        });
    }

}