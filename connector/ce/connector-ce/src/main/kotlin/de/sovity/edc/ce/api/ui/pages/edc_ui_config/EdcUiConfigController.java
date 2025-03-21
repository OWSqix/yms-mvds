/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.edc_ui_config;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Map;

@Produces({MediaType.APPLICATION_JSON})
@Path("/edc-ui-config")
public class EdcUiConfigController {
    private final EdcUiConfigService edcUiConfigService;

    public EdcUiConfigController(EdcUiConfigService edcUiConfigService) {
        this.edcUiConfigService = edcUiConfigService;
    }

    @GET
    public Map<String, String> getEdcUiProperties() {
        return edcUiConfigService.getEdcUiProperties();
    }
}
