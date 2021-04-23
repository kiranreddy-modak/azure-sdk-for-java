// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.fluent.StreamAnalyticsManagementClient;
import com.azure.resourcemanager.streamanalytics.implementation.ClustersImpl;
import com.azure.resourcemanager.streamanalytics.implementation.FunctionsImpl;
import com.azure.resourcemanager.streamanalytics.implementation.InputsImpl;
import com.azure.resourcemanager.streamanalytics.implementation.OperationsImpl;
import com.azure.resourcemanager.streamanalytics.implementation.OutputsImpl;
import com.azure.resourcemanager.streamanalytics.implementation.PrivateEndpointsImpl;
import com.azure.resourcemanager.streamanalytics.implementation.StreamAnalyticsManagementClientBuilder;
import com.azure.resourcemanager.streamanalytics.implementation.StreamingJobsImpl;
import com.azure.resourcemanager.streamanalytics.implementation.SubscriptionsImpl;
import com.azure.resourcemanager.streamanalytics.implementation.TransformationsImpl;
import com.azure.resourcemanager.streamanalytics.models.Clusters;
import com.azure.resourcemanager.streamanalytics.models.Functions;
import com.azure.resourcemanager.streamanalytics.models.Inputs;
import com.azure.resourcemanager.streamanalytics.models.Operations;
import com.azure.resourcemanager.streamanalytics.models.Outputs;
import com.azure.resourcemanager.streamanalytics.models.PrivateEndpoints;
import com.azure.resourcemanager.streamanalytics.models.StreamingJobs;
import com.azure.resourcemanager.streamanalytics.models.Subscriptions;
import com.azure.resourcemanager.streamanalytics.models.Transformations;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to StreamAnalyticsManager. Stream Analytics Client. */
public final class StreamAnalyticsManager {
    private Functions functions;

    private Inputs inputs;

    private Outputs outputs;

    private StreamingJobs streamingJobs;

    private Subscriptions subscriptions;

    private Transformations transformations;

    private Operations operations;

    private Clusters clusters;

    private PrivateEndpoints privateEndpoints;

    private final StreamAnalyticsManagementClient clientObject;

    private StreamAnalyticsManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new StreamAnalyticsManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of StreamAnalytics service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the StreamAnalytics service API instance.
     */
    public static StreamAnalyticsManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create StreamAnalyticsManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new StreamAnalyticsManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of StreamAnalytics service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the StreamAnalytics service API instance.
         */
        public StreamAnalyticsManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.streamanalytics")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new StreamAnalyticsManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Functions. */
    public Functions functions() {
        if (this.functions == null) {
            this.functions = new FunctionsImpl(clientObject.getFunctions(), this);
        }
        return functions;
    }

    /** @return Resource collection API of Inputs. */
    public Inputs inputs() {
        if (this.inputs == null) {
            this.inputs = new InputsImpl(clientObject.getInputs(), this);
        }
        return inputs;
    }

    /** @return Resource collection API of Outputs. */
    public Outputs outputs() {
        if (this.outputs == null) {
            this.outputs = new OutputsImpl(clientObject.getOutputs(), this);
        }
        return outputs;
    }

    /** @return Resource collection API of StreamingJobs. */
    public StreamingJobs streamingJobs() {
        if (this.streamingJobs == null) {
            this.streamingJobs = new StreamingJobsImpl(clientObject.getStreamingJobs(), this);
        }
        return streamingJobs;
    }

    /** @return Resource collection API of Subscriptions. */
    public Subscriptions subscriptions() {
        if (this.subscriptions == null) {
            this.subscriptions = new SubscriptionsImpl(clientObject.getSubscriptions(), this);
        }
        return subscriptions;
    }

    /** @return Resource collection API of Transformations. */
    public Transformations transformations() {
        if (this.transformations == null) {
            this.transformations = new TransformationsImpl(clientObject.getTransformations(), this);
        }
        return transformations;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Clusters. */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(clientObject.getClusters(), this);
        }
        return clusters;
    }

    /** @return Resource collection API of PrivateEndpoints. */
    public PrivateEndpoints privateEndpoints() {
        if (this.privateEndpoints == null) {
            this.privateEndpoints = new PrivateEndpointsImpl(clientObject.getPrivateEndpoints(), this);
        }
        return privateEndpoints;
    }

    /**
     * @return Wrapped service client StreamAnalyticsManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public StreamAnalyticsManagementClient serviceClient() {
        return this.clientObject;
    }
}