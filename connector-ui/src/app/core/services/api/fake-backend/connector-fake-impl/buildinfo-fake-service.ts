/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {BuildInfo} from '@sovity.de/edc-client';

export const buildInfo = (): BuildInfo => {
  return {
    buildDate: '2021-02-03T04:05:06',
    buildVersion: '1.2.3',
  };
};
