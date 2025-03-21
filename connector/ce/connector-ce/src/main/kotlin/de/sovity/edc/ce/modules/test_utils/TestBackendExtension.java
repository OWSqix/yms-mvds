/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.test_utils;

import org.eclipse.edc.runtime.metamodel.annotation.Inject;
import org.eclipse.edc.spi.system.ServiceExtension;
import org.eclipse.edc.spi.system.ServiceExtensionContext;
import org.eclipse.edc.web.spi.WebService;

/**
 * An EDC extension that adds a dummy data source and a dummy data sink on the Web Endpoint (usually :11001).
 * <br>
 * This allows us to emulate a data address for our E2E tests.
 */
public class TestBackendExtension implements ServiceExtension {
    @Inject
    private WebService webService;

    @Override
    public String name() {
        return "Test Backend Controller";
    }

    @Override
    public void initialize(ServiceExtensionContext context) {
        webService.registerResource(new TestBackendController());
    }
}
