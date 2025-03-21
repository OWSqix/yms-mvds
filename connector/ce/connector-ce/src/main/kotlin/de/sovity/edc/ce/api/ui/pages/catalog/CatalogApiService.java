/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.catalog;

import de.sovity.edc.ce.api.ui.model.UiDataOffer;
import de.sovity.edc.ce.libs.mappers.dsp.DspCatalogService;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CatalogApiService {
    private final UiDataOfferBuilder uiDataOfferBuilder;
    private final DspCatalogService dspCatalogService;

    public List<UiDataOffer> fetchDataOffers(String participantId, String connectorEndpoint) {
        var dspCatalog = dspCatalogService.fetchDataOffers(participantId, connectorEndpoint);
        return uiDataOfferBuilder.buildUiDataOffers(dspCatalog);
    }
}
