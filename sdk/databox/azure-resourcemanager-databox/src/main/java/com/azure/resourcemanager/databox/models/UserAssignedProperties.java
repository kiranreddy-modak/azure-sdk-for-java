// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** User assigned identity properties. */
@Fluent
public final class UserAssignedProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserAssignedProperties.class);

    /*
     * Arm resource id for user assigned identity to be used to fetch MSI
     * token.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get the resourceId property: Arm resource id for user assigned identity to be used to fetch MSI token.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Arm resource id for user assigned identity to be used to fetch MSI token.
     *
     * @param resourceId the resourceId value to set.
     * @return the UserAssignedProperties object itself.
     */
    public UserAssignedProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
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