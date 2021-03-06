// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** The CrrAccessToken model. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = CrrAccessToken.class)
@JsonTypeName("CrrAccessToken")
@JsonSubTypes({@JsonSubTypes.Type(name = "WorkloadCrrAccessToken", value = WorkloadCrrAccessToken.class)})
@Fluent
public class CrrAccessToken {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CrrAccessToken.class);

    /*
     * Access token used for authentication
     */
    @JsonProperty(value = "accessTokenString")
    private String accessTokenString;

    /*
     * Subscription Id of the source vault
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * Resource Group name of the source vault
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /*
     * Resource Name of the source vault
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /*
     * Resource Id of the source vault
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Protected item container id
     */
    @JsonProperty(value = "protectionContainerId")
    private Long protectionContainerId;

    /*
     * Recovery Point Id
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /*
     * Recovery Point Time
     */
    @JsonProperty(value = "recoveryPointTime")
    private String recoveryPointTime;

    /*
     * Container Unique name
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /*
     * Container Type
     */
    @JsonProperty(value = "containerType")
    private String containerType;

    /*
     * Backup Management Type
     */
    @JsonProperty(value = "backupManagementType")
    private String backupManagementType;

    /*
     * Datasource Type
     */
    @JsonProperty(value = "datasourceType")
    private String datasourceType;

    /*
     * Datasource Friendly Name
     */
    @JsonProperty(value = "datasourceName")
    private String datasourceName;

    /*
     * Datasource Id
     */
    @JsonProperty(value = "datasourceId")
    private String datasourceId;

    /*
     * Datasource Container Unique Name
     */
    @JsonProperty(value = "datasourceContainerName")
    private String datasourceContainerName;

    /*
     * CoordinatorServiceStampId to be used by BCM in restore call
     */
    @JsonProperty(value = "coordinatorServiceStampId")
    private String coordinatorServiceStampId;

    /*
     * CoordinatorServiceStampUri to be used by BCM in restore call
     */
    @JsonProperty(value = "coordinatorServiceStampUri")
    private String coordinatorServiceStampUri;

    /*
     * ProtectionServiceStampId to be used by BCM in restore call
     */
    @JsonProperty(value = "protectionServiceStampId")
    private String protectionServiceStampId;

    /*
     * ProtectionServiceStampUri to be used by BCM in restore call
     */
    @JsonProperty(value = "protectionServiceStampUri")
    private String protectionServiceStampUri;

    /*
     * Extended Information about the token like FileSpec etc.
     */
    @JsonProperty(value = "tokenExtendedInformation")
    private String tokenExtendedInformation;

    /*
     * Recovery point Tier Information
     */
    @JsonProperty(value = "rpTierInformation")
    private Map<String, String> rpTierInformation;

    /*
     * Recovery point information: Original SA option
     */
    @JsonProperty(value = "rpOriginalSAOption")
    private Boolean rpOriginalSAOption;

    /*
     * Recovery point information: Managed virtual machine
     */
    @JsonProperty(value = "rpIsManagedVirtualMachine")
    private Boolean rpIsManagedVirtualMachine;

    /*
     * Recovery point information: VM size description
     */
    @JsonProperty(value = "rpVMSizeDescription")
    private String rpVMSizeDescription;

    /*
     * Active region name of BMS Stamp
     */
    @JsonProperty(value = "bMSActiveRegion")
    private String bMSActiveRegion;

    /**
     * Get the accessTokenString property: Access token used for authentication.
     *
     * @return the accessTokenString value.
     */
    public String accessTokenString() {
        return this.accessTokenString;
    }

    /**
     * Set the accessTokenString property: Access token used for authentication.
     *
     * @param accessTokenString the accessTokenString value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withAccessTokenString(String accessTokenString) {
        this.accessTokenString = accessTokenString;
        return this;
    }

    /**
     * Get the subscriptionId property: Subscription Id of the source vault.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Subscription Id of the source vault.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Resource Group name of the source vault.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Resource Group name of the source vault.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the resourceName property: Resource Name of the source vault.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: Resource Name of the source vault.
     *
     * @param resourceName the resourceName value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the resourceId property: Resource Id of the source vault.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource Id of the source vault.
     *
     * @param resourceId the resourceId value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the protectionContainerId property: Protected item container id.
     *
     * @return the protectionContainerId value.
     */
    public Long protectionContainerId() {
        return this.protectionContainerId;
    }

    /**
     * Set the protectionContainerId property: Protected item container id.
     *
     * @param protectionContainerId the protectionContainerId value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withProtectionContainerId(Long protectionContainerId) {
        this.protectionContainerId = protectionContainerId;
        return this;
    }

    /**
     * Get the recoveryPointId property: Recovery Point Id.
     *
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: Recovery Point Id.
     *
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get the recoveryPointTime property: Recovery Point Time.
     *
     * @return the recoveryPointTime value.
     */
    public String recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set the recoveryPointTime property: Recovery Point Time.
     *
     * @param recoveryPointTime the recoveryPointTime value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withRecoveryPointTime(String recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

    /**
     * Get the containerName property: Container Unique name.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Container Unique name.
     *
     * @param containerName the containerName value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the containerType property: Container Type.
     *
     * @return the containerType value.
     */
    public String containerType() {
        return this.containerType;
    }

    /**
     * Set the containerType property: Container Type.
     *
     * @param containerType the containerType value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }

    /**
     * Get the backupManagementType property: Backup Management Type.
     *
     * @return the backupManagementType value.
     */
    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backupManagementType property: Backup Management Type.
     *
     * @param backupManagementType the backupManagementType value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withBackupManagementType(String backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the datasourceType property: Datasource Type.
     *
     * @return the datasourceType value.
     */
    public String datasourceType() {
        return this.datasourceType;
    }

    /**
     * Set the datasourceType property: Datasource Type.
     *
     * @param datasourceType the datasourceType value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * Get the datasourceName property: Datasource Friendly Name.
     *
     * @return the datasourceName value.
     */
    public String datasourceName() {
        return this.datasourceName;
    }

    /**
     * Set the datasourceName property: Datasource Friendly Name.
     *
     * @param datasourceName the datasourceName value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }

    /**
     * Get the datasourceId property: Datasource Id.
     *
     * @return the datasourceId value.
     */
    public String datasourceId() {
        return this.datasourceId;
    }

    /**
     * Set the datasourceId property: Datasource Id.
     *
     * @param datasourceId the datasourceId value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /**
     * Get the datasourceContainerName property: Datasource Container Unique Name.
     *
     * @return the datasourceContainerName value.
     */
    public String datasourceContainerName() {
        return this.datasourceContainerName;
    }

    /**
     * Set the datasourceContainerName property: Datasource Container Unique Name.
     *
     * @param datasourceContainerName the datasourceContainerName value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withDatasourceContainerName(String datasourceContainerName) {
        this.datasourceContainerName = datasourceContainerName;
        return this;
    }

    /**
     * Get the coordinatorServiceStampId property: CoordinatorServiceStampId to be used by BCM in restore call.
     *
     * @return the coordinatorServiceStampId value.
     */
    public String coordinatorServiceStampId() {
        return this.coordinatorServiceStampId;
    }

    /**
     * Set the coordinatorServiceStampId property: CoordinatorServiceStampId to be used by BCM in restore call.
     *
     * @param coordinatorServiceStampId the coordinatorServiceStampId value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withCoordinatorServiceStampId(String coordinatorServiceStampId) {
        this.coordinatorServiceStampId = coordinatorServiceStampId;
        return this;
    }

    /**
     * Get the coordinatorServiceStampUri property: CoordinatorServiceStampUri to be used by BCM in restore call.
     *
     * @return the coordinatorServiceStampUri value.
     */
    public String coordinatorServiceStampUri() {
        return this.coordinatorServiceStampUri;
    }

    /**
     * Set the coordinatorServiceStampUri property: CoordinatorServiceStampUri to be used by BCM in restore call.
     *
     * @param coordinatorServiceStampUri the coordinatorServiceStampUri value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withCoordinatorServiceStampUri(String coordinatorServiceStampUri) {
        this.coordinatorServiceStampUri = coordinatorServiceStampUri;
        return this;
    }

    /**
     * Get the protectionServiceStampId property: ProtectionServiceStampId to be used by BCM in restore call.
     *
     * @return the protectionServiceStampId value.
     */
    public String protectionServiceStampId() {
        return this.protectionServiceStampId;
    }

    /**
     * Set the protectionServiceStampId property: ProtectionServiceStampId to be used by BCM in restore call.
     *
     * @param protectionServiceStampId the protectionServiceStampId value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withProtectionServiceStampId(String protectionServiceStampId) {
        this.protectionServiceStampId = protectionServiceStampId;
        return this;
    }

    /**
     * Get the protectionServiceStampUri property: ProtectionServiceStampUri to be used by BCM in restore call.
     *
     * @return the protectionServiceStampUri value.
     */
    public String protectionServiceStampUri() {
        return this.protectionServiceStampUri;
    }

    /**
     * Set the protectionServiceStampUri property: ProtectionServiceStampUri to be used by BCM in restore call.
     *
     * @param protectionServiceStampUri the protectionServiceStampUri value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withProtectionServiceStampUri(String protectionServiceStampUri) {
        this.protectionServiceStampUri = protectionServiceStampUri;
        return this;
    }

    /**
     * Get the tokenExtendedInformation property: Extended Information about the token like FileSpec etc.
     *
     * @return the tokenExtendedInformation value.
     */
    public String tokenExtendedInformation() {
        return this.tokenExtendedInformation;
    }

    /**
     * Set the tokenExtendedInformation property: Extended Information about the token like FileSpec etc.
     *
     * @param tokenExtendedInformation the tokenExtendedInformation value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withTokenExtendedInformation(String tokenExtendedInformation) {
        this.tokenExtendedInformation = tokenExtendedInformation;
        return this;
    }

    /**
     * Get the rpTierInformation property: Recovery point Tier Information.
     *
     * @return the rpTierInformation value.
     */
    public Map<String, String> rpTierInformation() {
        return this.rpTierInformation;
    }

    /**
     * Set the rpTierInformation property: Recovery point Tier Information.
     *
     * @param rpTierInformation the rpTierInformation value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withRpTierInformation(Map<String, String> rpTierInformation) {
        this.rpTierInformation = rpTierInformation;
        return this;
    }

    /**
     * Get the rpOriginalSAOption property: Recovery point information: Original SA option.
     *
     * @return the rpOriginalSAOption value.
     */
    public Boolean rpOriginalSAOption() {
        return this.rpOriginalSAOption;
    }

    /**
     * Set the rpOriginalSAOption property: Recovery point information: Original SA option.
     *
     * @param rpOriginalSAOption the rpOriginalSAOption value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withRpOriginalSAOption(Boolean rpOriginalSAOption) {
        this.rpOriginalSAOption = rpOriginalSAOption;
        return this;
    }

    /**
     * Get the rpIsManagedVirtualMachine property: Recovery point information: Managed virtual machine.
     *
     * @return the rpIsManagedVirtualMachine value.
     */
    public Boolean rpIsManagedVirtualMachine() {
        return this.rpIsManagedVirtualMachine;
    }

    /**
     * Set the rpIsManagedVirtualMachine property: Recovery point information: Managed virtual machine.
     *
     * @param rpIsManagedVirtualMachine the rpIsManagedVirtualMachine value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withRpIsManagedVirtualMachine(Boolean rpIsManagedVirtualMachine) {
        this.rpIsManagedVirtualMachine = rpIsManagedVirtualMachine;
        return this;
    }

    /**
     * Get the rpVMSizeDescription property: Recovery point information: VM size description.
     *
     * @return the rpVMSizeDescription value.
     */
    public String rpVMSizeDescription() {
        return this.rpVMSizeDescription;
    }

    /**
     * Set the rpVMSizeDescription property: Recovery point information: VM size description.
     *
     * @param rpVMSizeDescription the rpVMSizeDescription value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withRpVMSizeDescription(String rpVMSizeDescription) {
        this.rpVMSizeDescription = rpVMSizeDescription;
        return this;
    }

    /**
     * Get the bMSActiveRegion property: Active region name of BMS Stamp.
     *
     * @return the bMSActiveRegion value.
     */
    public String bMSActiveRegion() {
        return this.bMSActiveRegion;
    }

    /**
     * Set the bMSActiveRegion property: Active region name of BMS Stamp.
     *
     * @param bMSActiveRegion the bMSActiveRegion value to set.
     * @return the CrrAccessToken object itself.
     */
    public CrrAccessToken withBMSActiveRegion(String bMSActiveRegion) {
        this.bMSActiveRegion = bMSActiveRegion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
