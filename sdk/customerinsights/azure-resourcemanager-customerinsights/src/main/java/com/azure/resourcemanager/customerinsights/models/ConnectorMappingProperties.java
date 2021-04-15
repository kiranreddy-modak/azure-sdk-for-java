// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The connector mapping properties. */
@Fluent
public final class ConnectorMappingProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectorMappingProperties.class);

    /*
     * The folder path for the mapping.
     */
    @JsonProperty(value = "folderPath")
    private String folderPath;

    /*
     * The file filter for the mapping.
     */
    @JsonProperty(value = "fileFilter")
    private String fileFilter;

    /*
     * If the file contains a header or not.
     */
    @JsonProperty(value = "hasHeader")
    private Boolean hasHeader;

    /*
     * The error management setting for the mapping.
     */
    @JsonProperty(value = "errorManagement", required = true)
    private ConnectorMappingErrorManagement errorManagement;

    /*
     * The format of mapping property.
     */
    @JsonProperty(value = "format", required = true)
    private ConnectorMappingFormat format;

    /*
     * The availability of mapping property.
     */
    @JsonProperty(value = "availability", required = true)
    private ConnectorMappingAvailability availability;

    /*
     * Ingestion mapping information at property level.
     */
    @JsonProperty(value = "structure", required = true)
    private List<ConnectorMappingStructure> structure;

    /*
     * The operation after import is done.
     */
    @JsonProperty(value = "completeOperation", required = true)
    private ConnectorMappingCompleteOperation completeOperation;

    /**
     * Get the folderPath property: The folder path for the mapping.
     *
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The folder path for the mapping.
     *
     * @param folderPath the folderPath value to set.
     * @return the ConnectorMappingProperties object itself.
     */
    public ConnectorMappingProperties withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the fileFilter property: The file filter for the mapping.
     *
     * @return the fileFilter value.
     */
    public String fileFilter() {
        return this.fileFilter;
    }

    /**
     * Set the fileFilter property: The file filter for the mapping.
     *
     * @param fileFilter the fileFilter value to set.
     * @return the ConnectorMappingProperties object itself.
     */
    public ConnectorMappingProperties withFileFilter(String fileFilter) {
        this.fileFilter = fileFilter;
        return this;
    }

    /**
     * Get the hasHeader property: If the file contains a header or not.
     *
     * @return the hasHeader value.
     */
    public Boolean hasHeader() {
        return this.hasHeader;
    }

    /**
     * Set the hasHeader property: If the file contains a header or not.
     *
     * @param hasHeader the hasHeader value to set.
     * @return the ConnectorMappingProperties object itself.
     */
    public ConnectorMappingProperties withHasHeader(Boolean hasHeader) {
        this.hasHeader = hasHeader;
        return this;
    }

    /**
     * Get the errorManagement property: The error management setting for the mapping.
     *
     * @return the errorManagement value.
     */
    public ConnectorMappingErrorManagement errorManagement() {
        return this.errorManagement;
    }

    /**
     * Set the errorManagement property: The error management setting for the mapping.
     *
     * @param errorManagement the errorManagement value to set.
     * @return the ConnectorMappingProperties object itself.
     */
    public ConnectorMappingProperties withErrorManagement(ConnectorMappingErrorManagement errorManagement) {
        this.errorManagement = errorManagement;
        return this;
    }

    /**
     * Get the format property: The format of mapping property.
     *
     * @return the format value.
     */
    public ConnectorMappingFormat format() {
        return this.format;
    }

    /**
     * Set the format property: The format of mapping property.
     *
     * @param format the format value to set.
     * @return the ConnectorMappingProperties object itself.
     */
    public ConnectorMappingProperties withFormat(ConnectorMappingFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the availability property: The availability of mapping property.
     *
     * @return the availability value.
     */
    public ConnectorMappingAvailability availability() {
        return this.availability;
    }

    /**
     * Set the availability property: The availability of mapping property.
     *
     * @param availability the availability value to set.
     * @return the ConnectorMappingProperties object itself.
     */
    public ConnectorMappingProperties withAvailability(ConnectorMappingAvailability availability) {
        this.availability = availability;
        return this;
    }

    /**
     * Get the structure property: Ingestion mapping information at property level.
     *
     * @return the structure value.
     */
    public List<ConnectorMappingStructure> structure() {
        return this.structure;
    }

    /**
     * Set the structure property: Ingestion mapping information at property level.
     *
     * @param structure the structure value to set.
     * @return the ConnectorMappingProperties object itself.
     */
    public ConnectorMappingProperties withStructure(List<ConnectorMappingStructure> structure) {
        this.structure = structure;
        return this;
    }

    /**
     * Get the completeOperation property: The operation after import is done.
     *
     * @return the completeOperation value.
     */
    public ConnectorMappingCompleteOperation completeOperation() {
        return this.completeOperation;
    }

    /**
     * Set the completeOperation property: The operation after import is done.
     *
     * @param completeOperation the completeOperation value to set.
     * @return the ConnectorMappingProperties object itself.
     */
    public ConnectorMappingProperties withCompleteOperation(ConnectorMappingCompleteOperation completeOperation) {
        this.completeOperation = completeOperation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorManagement() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property errorManagement in model ConnectorMappingProperties"));
        } else {
            errorManagement().validate();
        }
        if (format() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property format in model ConnectorMappingProperties"));
        } else {
            format().validate();
        }
        if (availability() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property availability in model ConnectorMappingProperties"));
        } else {
            availability().validate();
        }
        if (structure() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property structure in model ConnectorMappingProperties"));
        } else {
            structure().forEach(e -> e.validate());
        }
        if (completeOperation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property completeOperation in model ConnectorMappingProperties"));
        } else {
            completeOperation().validate();
        }
    }
}