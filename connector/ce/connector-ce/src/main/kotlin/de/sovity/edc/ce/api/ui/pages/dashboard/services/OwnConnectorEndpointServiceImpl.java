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

import de.sovity.edc.ce.libs.mappers.asset.OwnConnectorEndpointService;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OwnConnectorEndpointServiceImpl implements OwnConnectorEndpointService {
    private final SelfDescriptionService selfDescriptionService;

    @Override
    public boolean isOwnConnectorEndpoint(String endpoint) {
        return selfDescriptionService.getConnectorEndpoint().equals(endpoint);
    }
}
