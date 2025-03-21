/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
export interface HttpDataAddressParams {
  /**
   * (Base) URL of the request
   */
  baseUrl: string;

  /**
   * Http-method
   */
  method: string | null;

  /**
   * Header-Name ("Authorization"), where the secrets are passed into
   */
  authHeaderName: string | null;

  /**
   * Header-Value ("Bearer ...")
   */
  authHeaderValue: string | null;

  /**
   * Secret referencing API Key
   */
  authHeaderSecretName: string | null;

  /**
   * Additional headers to be sent
   */
  headers: Record<string, string>;

  /**
   * Query Parameters
   */
  queryParams: string | null;
}
