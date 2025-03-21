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

import de.sovity.edc.ce.config.CeConfigProps;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;
import org.eclipse.edc.spi.system.configuration.Config;

@RequiredArgsConstructor
@Service
public class SelfDescriptionService {
    private final Config config;

    public String getParticipantId() {
        return CeConfigProps.getEDC_PARTICIPANT_ID().getStringOrThrow(config);
    }

    public String getConnectorEndpoint() {
        return CeConfigProps.getEDC_DSP_CALLBACK_ADDRESS().getStringOrThrow(config);
    }

    public String getConnectorTitle() {
        return CeConfigProps.getSOVITY_EDC_TITLE().getStringOrThrow(config);
    }

    public String getConnectorDescription() {
        return CeConfigProps.getSOVITY_EDC_DESCRIPTION().getStringOrThrow(config);
    }

    public String getCuratorUrl() {
        return CeConfigProps.getSOVITY_EDC_CURATOR_URL().getStringOrThrow(config);
    }

    public String getCuratorName() {
        return CeConfigProps.getSOVITY_EDC_CURATOR_NAME().getStringOrThrow(config);
    }

    public String getMaintainerUrl() {
        return CeConfigProps.getSOVITY_EDC_MAINTAINER_URL().getStringOrThrow(config);
    }

    public String getMaintainerName() {
        return CeConfigProps.getSOVITY_EDC_MAINTAINER_NAME().getStringOrThrow(config);
    }
}
