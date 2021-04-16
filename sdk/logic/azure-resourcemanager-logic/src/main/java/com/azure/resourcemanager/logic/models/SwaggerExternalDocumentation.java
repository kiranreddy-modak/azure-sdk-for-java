// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The swagger external documentation. */
@Fluent
public final class SwaggerExternalDocumentation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SwaggerExternalDocumentation.class);

    /*
     * The document description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The documentation Uri.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * The vendor extensions.
     */
    @JsonProperty(value = "extensions")
    private Map<String, Object> extensions;

    /**
     * Get the description property: The document description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The document description.
     *
     * @param description the description value to set.
     * @return the SwaggerExternalDocumentation object itself.
     */
    public SwaggerExternalDocumentation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the uri property: The documentation Uri.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The documentation Uri.
     *
     * @param uri the uri value to set.
     * @return the SwaggerExternalDocumentation object itself.
     */
    public SwaggerExternalDocumentation withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the extensions property: The vendor extensions.
     *
     * @return the extensions value.
     */
    public Map<String, Object> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The vendor extensions.
     *
     * @param extensions the extensions value to set.
     * @return the SwaggerExternalDocumentation object itself.
     */
    public SwaggerExternalDocumentation withExtensions(Map<String, Object> extensions) {
        this.extensions = extensions;
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