// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Output for task that migrates SQL Server databases to Azure SQL Database Managed Instance. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "resultType",
    defaultImpl = MigrateSqlServerSqlMITaskOutput.class)
@JsonTypeName("MigrateSqlServerSqlMITaskOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "MigrationLevelOutput", value = MigrateSqlServerSqlMITaskOutputMigrationLevel.class),
    @JsonSubTypes.Type(name = "DatabaseLevelOutput", value = MigrateSqlServerSqlMITaskOutputDatabaseLevel.class),
    @JsonSubTypes.Type(name = "AgentJobLevelOutput", value = MigrateSqlServerSqlMITaskOutputAgentJobLevel.class),
    @JsonSubTypes.Type(name = "LoginLevelOutput", value = MigrateSqlServerSqlMITaskOutputLoginLevel.class),
    @JsonSubTypes.Type(name = "ErrorOutput", value = MigrateSqlServerSqlMITaskOutputError.class)
})
@Immutable
public class MigrateSqlServerSqlMITaskOutput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateSqlServerSqlMITaskOutput.class);

    /*
     * Result identifier
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the id property: Result identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
