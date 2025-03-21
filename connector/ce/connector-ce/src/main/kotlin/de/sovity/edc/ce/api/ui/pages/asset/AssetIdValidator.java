/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.asset;

import de.sovity.edc.runtime.simple_di.Service;
import org.apache.commons.lang3.Validate;

import java.util.regex.Pattern;

@Service
public class AssetIdValidator {
    private final Pattern pattern = Pattern.compile("^[^\\s:]+$");

    public boolean isValid(String assetId) {
        return pattern.matcher(assetId).matches();
    }

    public void assertValid(String assetId) {
        Validate.isTrue(isValid(assetId), "Asset ID must not contain colons or whitespaces.");
    }
}
