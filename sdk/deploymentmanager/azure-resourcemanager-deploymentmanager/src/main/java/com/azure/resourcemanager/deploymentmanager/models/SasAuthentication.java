// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the properties to access the artifacts using an Azure Storage SAS URI. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Sas")
@JsonFlatten
@Fluent
public class SasAuthentication extends Authentication {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SasAuthentication.class);

    /*
     * The SAS URI to the Azure Storage blob container. Any offset from the
     * root of the container to where the artifacts are located can be defined
     * in the artifactRoot.
     */
    @JsonProperty(value = "properties.sasUri")
    private String sasUri;

    /**
     * Get the sasUri property: The SAS URI to the Azure Storage blob container. Any offset from the root of the
     * container to where the artifacts are located can be defined in the artifactRoot.
     *
     * @return the sasUri value.
     */
    public String sasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: The SAS URI to the Azure Storage blob container. Any offset from the root of the
     * container to where the artifacts are located can be defined in the artifactRoot.
     *
     * @param sasUri the sasUri value to set.
     * @return the SasAuthentication object itself.
     */
    public SasAuthentication withSasUri(String sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}