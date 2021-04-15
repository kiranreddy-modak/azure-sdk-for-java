// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input for the task that migrates PostgreSQL databases to Azure Database for PostgreSQL for online migrations. */
@Fluent
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput.class);

    /*
     * Databases to migrate
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput> selectedDatabases;

    /*
     * Connection information for target Azure Database for PostgreSQL
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private PostgreSqlConnectionInfo targetConnectionInfo;

    /*
     * Connection information for source PostgreSQL
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private PostgreSqlConnectionInfo sourceConnectionInfo;

    /**
     * Get the selectedDatabases property: Databases to migrate.
     *
     * @return the selectedDatabases value.
     */
    public List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set the selectedDatabases property: Databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set.
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput withSelectedDatabases(
        List<MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Connection information for target Azure Database for PostgreSQL.
     *
     * @return the targetConnectionInfo value.
     */
    public PostgreSqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for target Azure Database for PostgreSQL.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput withTargetConnectionInfo(
        PostgreSqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the sourceConnectionInfo property: Connection information for source PostgreSQL.
     *
     * @return the sourceConnectionInfo value.
     */
    public PostgreSqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Connection information for source PostgreSQL.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput object itself.
     */
    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput withSourceConnectionInfo(
        PostgreSqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (selectedDatabases() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedDatabases in model"
                            + " MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput"));
        } else {
            selectedDatabases().forEach(e -> e.validate());
        }
        if (targetConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model"
                            + " MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (sourceConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceConnectionInfo in model"
                            + " MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
    }
}