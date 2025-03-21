/*/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Inject, Injectable} from '@angular/core';
import {APP_CONFIG, AppConfig} from './app-config';
import {EdcUiFeature} from './profiles/edc-ui-feature';

@Injectable({providedIn: 'root'})
export class ActiveFeatureSet {
  constructor(@Inject(APP_CONFIG) private config: AppConfig) {}

  hasMdsFields(): boolean {
    return this.has('mds-fields');
  }

  hasConnectorLimits(): boolean {
    return this.has('connector-limits');
  }

  has(feature: EdcUiFeature): boolean {
    return this.config.features.has(feature);
  }
}
