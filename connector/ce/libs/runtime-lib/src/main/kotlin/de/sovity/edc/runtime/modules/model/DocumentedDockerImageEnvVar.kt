/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.modules.model

/**
 * For non-EDC non-application logic configuration
 *
 * These are properties that aren't validated by the EDC
 */
class DocumentedDockerImageEnvVar(
    /**
     * The name of the environment variable
     */
    val envVarName: String,

    /**
     * Documentation in Markdown about the "required" state or "default value"
     */
    val requiredOrDefault: String,

    /**
     * General documentation in Markdown
     */
    val documentation: String
) {
    init {
        require(envVarName.matches(Regex("^[A-Z_][A-Z0-9_]*$"))) {
            "Docker Image documented Env variable must be in uppercase snake case: $envVarName"
        }
    }
}
