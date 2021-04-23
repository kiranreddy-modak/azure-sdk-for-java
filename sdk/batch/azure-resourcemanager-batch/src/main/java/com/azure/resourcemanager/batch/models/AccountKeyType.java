// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AccountKeyType. */
public enum AccountKeyType {
    /** Enum value Primary. */
    PRIMARY("Primary"),

    /** Enum value Secondary. */
    SECONDARY("Secondary");

    /** The actual serialized value for a AccountKeyType instance. */
    private final String value;

    AccountKeyType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccountKeyType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccountKeyType object, or null if unable to parse.
     */
    @JsonCreator
    public static AccountKeyType fromString(String value) {
        AccountKeyType[] items = AccountKeyType.values();
        for (AccountKeyType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}