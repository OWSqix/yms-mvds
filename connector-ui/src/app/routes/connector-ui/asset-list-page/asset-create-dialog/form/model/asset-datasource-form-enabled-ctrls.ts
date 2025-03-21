/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {
  AssetDatasourceFormModel,
  AssetDatasourceFormValue,
} from './asset-datasource-form-model';

export const assetDatasourceFormEnabledCtrls = (
  value: AssetDatasourceFormValue,
): Record<keyof AssetDatasourceFormModel, boolean> => {
  const customDataAddressJson =
    value.dataAddressType === 'Custom-Data-Address-Json';

  const onRequest = value.dataAddressType === 'On-Request';

  const http = value.dataAddressType === 'Http';
  const httpAuth = value.httpAuthHeaderType !== 'None';
  const httpAuthByValue = value.httpAuthHeaderType === 'Value';
  const httpAuthByVault = value.httpAuthHeaderType === 'Vault-Secret';
  const proxyPath = !!value.httpProxyPath;

  return {
    dataAddressType: true,

    // Custom Datasource JSON
    dataDestination: customDataAddressJson,

    // On Request Datasource
    contactEmail: onRequest,
    contactPreferredEmailSubject: onRequest,

    // Http Datasource Fields
    httpUrl: http,
    httpMethod: http,

    httpAuthHeaderType: http,
    httpAuthHeaderName: http && httpAuth,
    httpAuthHeaderValue: http && httpAuthByValue,
    httpAuthHeaderSecretName: http && httpAuthByVault,
    httpQueryParams: http,

    httpDefaultPath: http && proxyPath,
    httpProxyMethod: http,
    httpProxyPath: http,
    httpProxyQueryParams: http,
    httpProxyBody: http,

    httpHeaders: http,
  };
};
