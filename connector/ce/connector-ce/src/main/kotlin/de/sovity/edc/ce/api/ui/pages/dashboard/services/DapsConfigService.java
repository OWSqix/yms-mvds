/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.dashboard.services;

import de.sovity.edc.ce.api.ui.model.DashboardDapsConfig;
import de.sovity.edc.ce.config.CeConfigProps;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;
import org.eclipse.edc.spi.system.configuration.Config;

import static com.apicatalog.jsonld.StringUtils.isBlank;

@RequiredArgsConstructor
@Service
public class DapsConfigService {
    private final Config config;

    public DashboardDapsConfig buildDapsConfigOrNull() {
        var dapsConfig = new DashboardDapsConfig();
        dapsConfig.setTokenUrl(CeConfigProps.getEDC_OAUTH_TOKEN_URL().getStringOrNull(config));
        dapsConfig.setJwksUrl(CeConfigProps.getEDC_OAUTH_PROVIDER_JWKS_URL().getStringOrNull(config));
        return isBlank(dapsConfig.getTokenUrl()) ? null : dapsConfig;
    }
}
