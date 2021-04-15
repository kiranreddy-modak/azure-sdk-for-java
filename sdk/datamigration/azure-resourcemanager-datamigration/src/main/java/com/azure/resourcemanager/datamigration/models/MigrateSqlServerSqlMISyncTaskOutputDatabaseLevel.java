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
import java.util.List;

/** The MigrateSqlServerSqlMISyncTaskOutputDatabaseLevel model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelOutput")
@Immutable
public final class MigrateSqlServerSqlMISyncTaskOutputDatabaseLevel extends MigrateSqlServerSqlMISyncTaskOutput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MigrateSqlServerSqlMISyncTaskOutputDatabaseLevel.class);

    /*
     * Name of the database
     */
    @JsonProperty(value = "sourceDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceDatabaseName;

    /*
     * Current state of database
     */
    @JsonProperty(value = "migrationState", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseMigrationState migrationState;

    /*
     * Database migration start time
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedOn;

    /*
     * Database migration end time
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endedOn;

    /*
     * Details of full backup set
     */
    @JsonProperty(value = "fullBackupSetInfo", access = JsonProperty.Access.WRITE_ONLY)
    private BackupSetInfo fullBackupSetInfo;

    /*
     * Last applied backup set information
     */
    @JsonProperty(value = "lastRestoredBackupSetInfo", access = JsonProperty.Access.WRITE_ONLY)
    private BackupSetInfo lastRestoredBackupSetInfo;

    /*
     * Backup sets that are currently active (Either being uploaded or getting
     * restored)
     */
    @JsonProperty(value = "activeBackupSets", access = JsonProperty.Access.WRITE_ONLY)
    private List<BackupSetInfo> activeBackupSets;

    /*
     * Name of container created in the Azure Storage account where backups are
     * copied to
     */
    @JsonProperty(value = "containerName", access = JsonProperty.Access.WRITE_ONLY)
    private String containerName;

    /*
     * prefix string to use for querying errors for this database
     */
    @JsonProperty(value = "errorPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String errorPrefix;

    /*
     * Whether full backup has been applied to the target database or not
     */
    @JsonProperty(value = "isFullBackupRestored", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isFullBackupRestored;

    /*
     * Migration exceptions and warnings
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Get the sourceDatabaseName property: Name of the database.
     *
     * @return the sourceDatabaseName value.
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Get the migrationState property: Current state of database.
     *
     * @return the migrationState value.
     */
    public DatabaseMigrationState migrationState() {
        return this.migrationState;
    }

    /**
     * Get the startedOn property: Database migration start time.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get the endedOn property: Database migration end time.
     *
     * @return the endedOn value.
     */
    public OffsetDateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get the fullBackupSetInfo property: Details of full backup set.
     *
     * @return the fullBackupSetInfo value.
     */
    public BackupSetInfo fullBackupSetInfo() {
        return this.fullBackupSetInfo;
    }

    /**
     * Get the lastRestoredBackupSetInfo property: Last applied backup set information.
     *
     * @return the lastRestoredBackupSetInfo value.
     */
    public BackupSetInfo lastRestoredBackupSetInfo() {
        return this.lastRestoredBackupSetInfo;
    }

    /**
     * Get the activeBackupSets property: Backup sets that are currently active (Either being uploaded or getting
     * restored).
     *
     * @return the activeBackupSets value.
     */
    public List<BackupSetInfo> activeBackupSets() {
        return this.activeBackupSets;
    }

    /**
     * Get the containerName property: Name of container created in the Azure Storage account where backups are copied
     * to.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Get the errorPrefix property: prefix string to use for querying errors for this database.
     *
     * @return the errorPrefix value.
     */
    public String errorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Get the isFullBackupRestored property: Whether full backup has been applied to the target database or not.
     *
     * @return the isFullBackupRestored value.
     */
    public Boolean isFullBackupRestored() {
        return this.isFullBackupRestored;
    }

    /**
     * Get the exceptionsAndWarnings property: Migration exceptions and warnings.
     *
     * @return the exceptionsAndWarnings value.
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (fullBackupSetInfo() != null) {
            fullBackupSetInfo().validate();
        }
        if (lastRestoredBackupSetInfo() != null) {
            lastRestoredBackupSetInfo().validate();
        }
        if (activeBackupSets() != null) {
            activeBackupSets().forEach(e -> e.validate());
        }
        if (exceptionsAndWarnings() != null) {
            exceptionsAndWarnings().forEach(e -> e.validate());
        }
    }
}