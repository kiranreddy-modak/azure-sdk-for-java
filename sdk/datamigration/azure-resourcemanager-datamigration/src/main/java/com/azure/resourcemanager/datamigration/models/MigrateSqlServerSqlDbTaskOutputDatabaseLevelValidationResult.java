// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Database validation result for Sql Server to Azure Sql DB migration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrationDatabaseLevelValidationOutput")
@Immutable
public final class MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResult
    extends MigrateSqlServerSqlDbTaskOutput {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResult.class);

    /*
     * Migration Identifier
     */
    @JsonProperty(value = "migrationId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationId;

    /*
     * Name of the source database
     */
    @JsonProperty(value = "sourceDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceDatabaseName;

    /*
     * Name of the target database
     */
    @JsonProperty(value = "targetDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetDatabaseName;

    /*
     * Validation start time
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedOn;

    /*
     * Validation end time
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endedOn;

    /*
     * Provides data integrity validation result between the source and target
     * tables that are migrated.
     */
    @JsonProperty(value = "dataIntegrityValidationResult", access = JsonProperty.Access.WRITE_ONLY)
    private DataIntegrityValidationResult dataIntegrityValidationResult;

    /*
     * Provides schema comparison result between source and target database
     */
    @JsonProperty(value = "schemaValidationResult", access = JsonProperty.Access.WRITE_ONLY)
    private SchemaComparisonValidationResult schemaValidationResult;

    /*
     * Results of some of the query execution result between source and target
     * database
     */
    @JsonProperty(value = "queryAnalysisValidationResult", access = JsonProperty.Access.WRITE_ONLY)
    private QueryAnalysisValidationResult queryAnalysisValidationResult;

    /*
     * Current status of validation at the database level
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ValidationStatus status;

    /**
     * Get the migrationId property: Migration Identifier.
     *
     * @return the migrationId value.
     */
    public String migrationId() {
        return this.migrationId;
    }

    /**
     * Get the sourceDatabaseName property: Name of the source database.
     *
     * @return the sourceDatabaseName value.
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Get the targetDatabaseName property: Name of the target database.
     *
     * @return the targetDatabaseName value.
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * Get the startedOn property: Validation start time.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get the endedOn property: Validation end time.
     *
     * @return the endedOn value.
     */
    public OffsetDateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get the dataIntegrityValidationResult property: Provides data integrity validation result between the source and
     * target tables that are migrated.
     *
     * @return the dataIntegrityValidationResult value.
     */
    public DataIntegrityValidationResult dataIntegrityValidationResult() {
        return this.dataIntegrityValidationResult;
    }

    /**
     * Get the schemaValidationResult property: Provides schema comparison result between source and target database.
     *
     * @return the schemaValidationResult value.
     */
    public SchemaComparisonValidationResult schemaValidationResult() {
        return this.schemaValidationResult;
    }

    /**
     * Get the queryAnalysisValidationResult property: Results of some of the query execution result between source and
     * target database.
     *
     * @return the queryAnalysisValidationResult value.
     */
    public QueryAnalysisValidationResult queryAnalysisValidationResult() {
        return this.queryAnalysisValidationResult;
    }

    /**
     * Get the status property: Current status of validation at the database level.
     *
     * @return the status value.
     */
    public ValidationStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataIntegrityValidationResult() != null) {
            dataIntegrityValidationResult().validate();
        }
        if (schemaValidationResult() != null) {
            schemaValidationResult().validate();
        }
        if (queryAnalysisValidationResult() != null) {
            queryAnalysisValidationResult().validate();
        }
    }
}