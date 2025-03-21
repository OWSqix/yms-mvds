/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.extension.e2e.connector.remotes.api_wrapper;

import de.sovity.edc.extension.e2e.utils.DebugUtils;
import de.sovity.edc.runtime.config.ConfigUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.time.Duration;

import static java.time.Duration.ofHours;
import static java.time.Duration.ofSeconds;


@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class E2eTestScenarioConfig {
    @NonNull
    private final String providerParticipantId;

    @NonNull
    private final String providerProtocolApiUrl;

    @Builder.Default
    private final Duration timeout = DebugUtils.INSTANCE.isDebug() ? ofHours(10) : ofSeconds(20);

    public static E2eTestScenarioConfig forProviderConfig(ConfigUtils configUtils) {
        return builder()
            .providerParticipantId(configUtils.getParticipantId())
            .providerProtocolApiUrl(configUtils.getProtocolApiUrl())
            .build();
    }
}
