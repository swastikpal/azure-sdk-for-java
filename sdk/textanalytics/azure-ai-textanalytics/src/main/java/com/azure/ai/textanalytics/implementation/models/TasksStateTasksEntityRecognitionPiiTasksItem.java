// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TasksStateTasksEntityRecognitionPiiTasksItem model. */
@Fluent
public final class TasksStateTasksEntityRecognitionPiiTasksItem extends TaskState {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private PiiResult results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public PiiResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the TasksStateTasksEntityRecognitionPiiTasksItem object itself.
     */
    public TasksStateTasksEntityRecognitionPiiTasksItem setResults(PiiResult results) {
        this.results = results;
        return this;
    }
}
