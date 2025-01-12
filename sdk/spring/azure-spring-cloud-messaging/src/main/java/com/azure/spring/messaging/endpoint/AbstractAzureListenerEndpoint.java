// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.messaging.endpoint;

import com.azure.spring.messaging.listener.AzureMessageHandler;
import com.azure.spring.messaging.container.MessageListenerContainer;
import org.springframework.lang.Nullable;

/**
 * Base model for a Azure listener endpoint.
 *
 * @author Warren Zhu
 * @see MethodAzureListenerEndpoint
 */
public abstract class AbstractAzureListenerEndpoint implements AzureListenerEndpoint {

    private String id = "";

    @Nullable
    private String destination;

    @Nullable
    private String group;

    @Nullable
    private String concurrency;

    @Override
    public void setupListenerContainer(MessageListenerContainer listenerContainer) {
        if (getDestination() != null) {
            listenerContainer.setDestination(getDestination());
        }
        if (this.getGroup() != null) {
            listenerContainer.setGroup(this.getGroup());
        }

        listenerContainer.setMessageHandler(createMessageHandler(listenerContainer));
    }

    /**
     * Create a {@link AzureMessageHandler} that is able to serve this endpoint for the
     * specified container.
     *
     * @param container MessageListenerContainer
     * @return AzureMessageHandler
     */
    protected abstract AzureMessageHandler createMessageHandler(MessageListenerContainer container);

    /**
     * Return a description for this endpoint.
     * <p>Available to subclasses, for inclusion in their {@code toString()} result.
     * @return StringBuilder
     */
    protected StringBuilder getEndpointDescription() {
        StringBuilder result = new StringBuilder();
        return result.append(getClass().getSimpleName()).append("[").append(this.id).append("] destination=").
                append(this.destination).append("' | group='").append(this.group).append("'");
    }

    @Override
    public String toString() {
        return getEndpointDescription().toString();
    }

    /**
     * Get the destination.
     * @return the destination.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Set the destination.
     * @param destination the destination.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Get the group for the corresponding listener container.
     * @return the group for the corresponding listener container.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Set the group for the corresponding listener container.
     * @param group the group for the corresponding listener container.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String getId() {
        return id;
    }

    /**
     * Set the id of this endpoint.
     * @param id the id of this endpoint.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Set the concurrency expression.
     * @param concurrency the concurrency expression.
     */
    public void setConcurrency(String concurrency) {
        this.concurrency = concurrency;
    }

    /**
     * Get the concurrency expression.
     * @return the concurrency expression.
     */
    public String getConcurrency() {
        return concurrency;
    }
}
