// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ServiceResourceInner;
import com.azure.resourcemanager.deploymentmanager.models.ServiceResource;
import java.util.Collections;
import java.util.Map;

public final class ServiceResourceImpl implements ServiceResource, ServiceResource.Definition, ServiceResource.Update {
    private ServiceResourceInner innerObject;

    private final com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String targetLocation() {
        return this.innerModel().targetLocation();
    }

    public String targetSubscriptionId() {
        return this.innerModel().targetSubscriptionId();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ServiceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deploymentmanager.DeploymentManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceTopologyName;

    private String serviceName;

    public ServiceResourceImpl withExistingServiceTopology(String resourceGroupName, String serviceTopologyName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceTopologyName = serviceTopologyName;
        return this;
    }

    public ServiceResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceTopologyName, serviceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ServiceResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceTopologyName, serviceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ServiceResourceImpl(String name, com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = new ServiceResourceInner();
        this.serviceManager = serviceManager;
        this.serviceName = name;
    }

    public ServiceResourceImpl update() {
        return this;
    }

    public ServiceResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceTopologyName, serviceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ServiceResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceTopologyName, serviceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ServiceResourceImpl(
        ServiceResourceInner innerObject,
        com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceTopologyName = Utils.getValueFromIdByName(innerObject.id(), "serviceTopologies");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "services");
    }

    public ServiceResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .getWithResponse(resourceGroupName, serviceTopologyName, serviceName, Context.NONE)
                .getValue();
        return this;
    }

    public ServiceResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServices()
                .getWithResponse(resourceGroupName, serviceTopologyName, serviceName, context)
                .getValue();
        return this;
    }

    public ServiceResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServiceResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServiceResourceImpl withTargetLocation(String targetLocation) {
        this.innerModel().withTargetLocation(targetLocation);
        return this;
    }

    public ServiceResourceImpl withTargetSubscriptionId(String targetSubscriptionId) {
        this.innerModel().withTargetSubscriptionId(targetSubscriptionId);
        return this;
    }

    public ServiceResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }
}