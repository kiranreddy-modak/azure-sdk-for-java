// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.resourcemanager.storageimportexport.fluent.models.OperationInner;

/** An immutable client-side representation of Operation. */
public interface Operation {
    /**
     * Gets the name property: Name of the operation.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the provider property: The resource provider name to which the operation belongs.
     *
     * @return the provider value.
     */
    String provider();

    /**
     * Gets the resource property: The name of the resource to which the operation belongs.
     *
     * @return the resource value.
     */
    String resource();

    /**
     * Gets the operation property: The display name of the operation.
     *
     * @return the operation value.
     */
    String operation();

    /**
     * Gets the description property: Short description of the operation.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the inner com.azure.resourcemanager.storageimportexport.fluent.models.OperationInner object.
     *
     * @return the inner object.
     */
    OperationInner innerModel();
}