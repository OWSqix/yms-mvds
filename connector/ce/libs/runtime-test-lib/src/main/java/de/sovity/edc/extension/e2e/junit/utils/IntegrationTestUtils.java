/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.extension.e2e.junit.utils;

import de.sovity.edc.client.EdcClient;
import de.sovity.edc.extension.e2e.connector.remotes.management_api.ManagementApiConnectorRemote;
import de.sovity.edc.extension.e2e.connector.remotes.management_api.ManagementApiConnectorRemoteConfig;
import de.sovity.edc.runtime.config.ConfigUtils;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class IntegrationTestUtils {

    public static EdcClient getEdcClient(ConfigUtils configUtils) {
        return EdcClient.builder()
            .managementApiUrl(configUtils.getManagementApiUrl())
            .managementApiKey(configUtils.getManagementApiKey())
            .customConfigurer(it -> it
                .setConnectTimeout(0)
                .setReadTimeout(0)
                .setWriteTimeout(0)
            )
            .build();
    }

    public static ManagementApiConnectorRemote getManagementApiConnectorRemote(ConfigUtils configUtils) {
        var connectorRemoteConfig = ManagementApiConnectorRemoteConfig.forConnector(configUtils);
        return new ManagementApiConnectorRemote(connectorRemoteConfig);
    }
}
