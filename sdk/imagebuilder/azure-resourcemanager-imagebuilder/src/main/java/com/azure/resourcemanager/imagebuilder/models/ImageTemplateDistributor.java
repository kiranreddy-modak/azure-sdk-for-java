// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Generic distribution object. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ImageTemplateDistributor.class)
@JsonTypeName("ImageTemplateDistributor")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ManagedImage", value = ImageTemplateManagedImageDistributor.class),
    @JsonSubTypes.Type(name = "SharedImage", value = ImageTemplateSharedImageDistributor.class),
    @JsonSubTypes.Type(name = "VHD", value = ImageTemplateVhdDistributor.class)
})
@Fluent
public class ImageTemplateDistributor {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageTemplateDistributor.class);

    /*
     * The name to be used for the associated RunOutput.
     */
    @JsonProperty(value = "runOutputName", required = true)
    private String runOutputName;

    /*
     * Tags that will be applied to the artifact once it has been
     * created/updated by the distributor.
     */
    @JsonProperty(value = "artifactTags")
    private Map<String, String> artifactTags;

    /**
     * Get the runOutputName property: The name to be used for the associated RunOutput.
     *
     * @return the runOutputName value.
     */
    public String runOutputName() {
        return this.runOutputName;
    }

    /**
     * Set the runOutputName property: The name to be used for the associated RunOutput.
     *
     * @param runOutputName the runOutputName value to set.
     * @return the ImageTemplateDistributor object itself.
     */
    public ImageTemplateDistributor withRunOutputName(String runOutputName) {
        this.runOutputName = runOutputName;
        return this;
    }

    /**
     * Get the artifactTags property: Tags that will be applied to the artifact once it has been created/updated by the
     * distributor.
     *
     * @return the artifactTags value.
     */
    public Map<String, String> artifactTags() {
        return this.artifactTags;
    }

    /**
     * Set the artifactTags property: Tags that will be applied to the artifact once it has been created/updated by the
     * distributor.
     *
     * @param artifactTags the artifactTags value to set.
     * @return the ImageTemplateDistributor object itself.
     */
    public ImageTemplateDistributor withArtifactTags(Map<String, String> artifactTags) {
        this.artifactTags = artifactTags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (runOutputName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property runOutputName in model ImageTemplateDistributor"));
        }
    }
}