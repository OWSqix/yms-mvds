/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Pipe, PipeTransform} from '@angular/core';
import {ActiveFeatureSet} from '../../core/config/active-feature-set';
import {EdcUiFeature} from '../../core/config/profiles/edc-ui-feature';

/**
 * Easily check for active features in angular templates.
 */
@Pipe({name: 'isActiveFeature'})
export class IsActiveFeaturePipe implements PipeTransform {
  constructor(private activeFeatureSet: ActiveFeatureSet) {}

  transform(feature: EdcUiFeature): boolean {
    return this.activeFeatureSet.has(feature);
  }
}
