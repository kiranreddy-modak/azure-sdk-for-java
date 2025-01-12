// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Image reference information. Used in the virtual machine profile. */
@Fluent
public final class ImageReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageReference.class);

    /*
     * Image resource ID
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The image offer if applicable.
     */
    @JsonProperty(value = "offer")
    private String offer;

    /*
     * The image publisher
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * The image SKU
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * The image version specified on creation.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The actual version of the image after use.
     */
    @JsonProperty(value = "exactVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String exactVersion;

    /**
     * Get the id property: Image resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Image resource ID.
     *
     * @param id the id value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the offer property: The image offer if applicable.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: The image offer if applicable.
     *
     * @param offer the offer value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the publisher property: The image publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The image publisher.
     *
     * @param publisher the publisher value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the sku property: The image SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The image SKU.
     *
     * @param sku the sku value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the version property: The image version specified on creation.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The image version specified on creation.
     *
     * @param version the version value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the exactVersion property: The actual version of the image after use.
     *
     * @return the exactVersion value.
     */
    public String exactVersion() {
        return this.exactVersion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
