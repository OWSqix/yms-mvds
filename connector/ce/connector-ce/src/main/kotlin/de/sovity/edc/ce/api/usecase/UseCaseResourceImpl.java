/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.usecase;

import de.sovity.edc.ce.api.ui.model.UiDataOffer;
import de.sovity.edc.ce.api.usecase.model.CatalogQuery;
import de.sovity.edc.ce.api.usecase.model.KpiResult;
import de.sovity.edc.ce.api.usecase.pages.catalog.UseCaseCatalogApiService;
import de.sovity.edc.ce.api.usecase.services.KpiApiService;
import de.sovity.edc.ce.api.usecase.services.SupportedPolicyApiService;
import de.sovity.edc.ce.modules.db.DslContextFactory;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;


/**
 * Provides the endpoints for use-case specific requests.
 */
@RequiredArgsConstructor
@Service
public class UseCaseResourceImpl implements UseCaseResource {
    private final KpiApiService kpiApiService;
    private final SupportedPolicyApiService supportedPolicyApiService;
    private final UseCaseCatalogApiService useCaseCatalogApiService;
    private final DslContextFactory dslContextFactory;

    @Override
    public KpiResult getKpis() {
        return dslContextFactory.transactionResult(dsl -> kpiApiService.getKpis());
    }

    @Override
    public List<String> getSupportedFunctions() {
        return dslContextFactory.transactionResult(dsl -> supportedPolicyApiService.getSupportedFunctions());
    }

    @Override
    public List<UiDataOffer> queryCatalog(CatalogQuery catalogQuery) {
        return dslContextFactory.transactionResult(dsl -> useCaseCatalogApiService.fetchDataOffers(catalogQuery));
    }
}
