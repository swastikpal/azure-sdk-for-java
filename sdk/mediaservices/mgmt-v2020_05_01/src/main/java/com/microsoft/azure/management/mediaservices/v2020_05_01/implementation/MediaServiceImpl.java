/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.mediaservices.v2020_05_01.MediaService;
import rx.Observable;
import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2020_05_01.StorageAccount;
import com.microsoft.azure.management.mediaservices.v2020_05_01.StorageAuthentication;
import com.microsoft.azure.management.mediaservices.v2020_05_01.AccountEncryption;
import com.microsoft.azure.management.mediaservices.v2020_05_01.MediaServiceIdentity;

class MediaServiceImpl extends GroupableResourceCoreImpl<MediaService, MediaServiceInner, MediaServiceImpl, MediaManager> implements MediaService, MediaService.Definition, MediaService.Update {
    MediaServiceImpl(String name, MediaServiceInner inner, MediaManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<MediaService> createResourceAsync() {
        MediaservicesInner client = this.manager().inner().mediaservices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<MediaService> updateResourceAsync() {
        MediaservicesInner client = this.manager().inner().mediaservices();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<MediaServiceInner> getInnerAsync() {
        MediaservicesInner client = this.manager().inner().mediaservices();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AccountEncryption encryption() {
        return this.inner().encryption();
    }

    @Override
    public MediaServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public UUID mediaServiceId() {
        return this.inner().mediaServiceId();
    }

    @Override
    public List<StorageAccount> storageAccounts() {
        return this.inner().storageAccounts();
    }

    @Override
    public StorageAuthentication storageAuthentication() {
        return this.inner().storageAuthentication();
    }

    @Override
    public MediaServiceImpl withEncryption(AccountEncryption encryption) {
        this.inner().withEncryption(encryption);
        return this;
    }

    @Override
    public MediaServiceImpl withIdentity(MediaServiceIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public MediaServiceImpl withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.inner().withStorageAccounts(storageAccounts);
        return this;
    }

    @Override
    public MediaServiceImpl withStorageAuthentication(StorageAuthentication storageAuthentication) {
        this.inner().withStorageAuthentication(storageAuthentication);
        return this;
    }

}
