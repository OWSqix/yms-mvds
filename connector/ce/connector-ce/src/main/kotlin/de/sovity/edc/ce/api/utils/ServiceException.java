/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.utils;

import jakarta.ws.rs.WebApplicationException;
import org.eclipse.edc.spi.result.Failure;

public class ServiceException extends WebApplicationException {
    public ServiceException(Failure failure) {
        super(failure.getFailureDetail(), 500);
    }
}
