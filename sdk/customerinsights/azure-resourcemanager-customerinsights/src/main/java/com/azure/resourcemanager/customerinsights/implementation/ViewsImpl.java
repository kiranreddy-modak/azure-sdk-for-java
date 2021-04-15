// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.fluent.ViewsClient;
import com.azure.resourcemanager.customerinsights.fluent.models.ViewResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.ViewResourceFormat;
import com.azure.resourcemanager.customerinsights.models.Views;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ViewsImpl implements Views {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ViewsImpl.class);

    private final ViewsClient innerClient;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public ViewsImpl(
        ViewsClient innerClient, com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ViewResourceFormat> listByHub(String resourceGroupName, String hubName, String userId) {
        PagedIterable<ViewResourceFormatInner> inner =
            this.serviceClient().listByHub(resourceGroupName, hubName, userId);
        return Utils.mapPage(inner, inner1 -> new ViewResourceFormatImpl(inner1, this.manager()));
    }

    public PagedIterable<ViewResourceFormat> listByHub(
        String resourceGroupName, String hubName, String userId, Context context) {
        PagedIterable<ViewResourceFormatInner> inner =
            this.serviceClient().listByHub(resourceGroupName, hubName, userId, context);
        return Utils.mapPage(inner, inner1 -> new ViewResourceFormatImpl(inner1, this.manager()));
    }

    public ViewResourceFormat get(String resourceGroupName, String hubName, String viewName, String userId) {
        ViewResourceFormatInner inner = this.serviceClient().get(resourceGroupName, hubName, viewName, userId);
        if (inner != null) {
            return new ViewResourceFormatImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ViewResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String viewName, String userId, Context context) {
        Response<ViewResourceFormatInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, hubName, viewName, userId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ViewResourceFormatImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String hubName, String viewName, String userId) {
        this.serviceClient().delete(resourceGroupName, hubName, viewName, userId);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String hubName, String viewName, String userId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, hubName, viewName, userId, context);
    }

    private ViewsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    public ViewResourceFormatImpl define(String name) {
        return new ViewResourceFormatImpl(name, this.manager());
    }
}