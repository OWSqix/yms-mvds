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

import org.eclipse.edc.runtime.metamodel.annotation.Inject;
import org.eclipse.edc.spi.system.ServiceExtension;
import org.eclipse.edc.spi.system.ServiceExtensionContext;
import org.eclipse.edc.web.spi.WebService;
import org.eclipse.edc.web.spi.configuration.ApiContext;

/**
 * Our EDC UI requires many configuration properties which exist in the EDC backend.
 * <br>
 * This extension provides an endpoint on the Management Endpoint {@code /edc-ui-config} which allows our EDC UI to retrieve
 * additional {@code EDC_UI_} properties from the backend.
 * <br>
 * It will pass all config properties starting with {@code edc.ui.} in general.
 */
public class EdcUiConfigExtension implements ServiceExtension {

    public static final String EXTENSION_NAME = "EdcUiConfigExtension";

    @Inject
    private WebService webService;

    @Override
    public String name() {
        return EXTENSION_NAME;
    }

    @Override
    public void initialize(ServiceExtensionContext context) {
        var edcUiConfigService = new EdcUiConfigService(context.getConfig());
        var controller = new EdcUiConfigController(edcUiConfigService);
        webService.registerResource(ApiContext.MANAGEMENT, controller);
    }
}
