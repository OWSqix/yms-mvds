/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.test_utils.model

import com.fasterxml.jackson.annotation.JsonProperty

data class TestBackendOAuth2TokenResponse(
    @field:JsonProperty("access_token")
    val accessToken: String
)
