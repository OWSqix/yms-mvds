/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {EdcUiFeature} from '../../config/profiles/edc-ui-feature';

export interface NavItem {
  testId: string;
  path: string;
  title: string;
  icon: string;
  requiresFeature?: EdcUiFeature;
}
