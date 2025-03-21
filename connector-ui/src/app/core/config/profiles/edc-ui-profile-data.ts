/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {MDS_THEME, SOVITY_THEME} from './edc-ui-theme-data';
import {COMMUNITY_EDITION_FEATURES} from './feature-sets/community-edition-features';
import {ENTERPRISE_EDITION_FEATURES} from './feature-sets/enterprise-edition-features';
import {MDS_FEATURES} from './feature-sets/mds-features';
import {inferEdcUiProfileType} from './infer-edc-ui-profile-type';

/**
 * List of available profiles.
 *
 * This codebase supports multiple profiles since it incorporates multiple deployment targets.
 */
export const EDC_UI_PROFILE_DATA = inferEdcUiProfileType({
  'sovity-open-source': {
    ...SOVITY_THEME,
    routes: 'connector-ui',
    features: new Set(COMMUNITY_EDITION_FEATURES),
  },
  'sovity-hosted-by-sovity': {
    ...SOVITY_THEME,
    routes: 'connector-ui',
    features: new Set(ENTERPRISE_EDITION_FEATURES),
  },
  'mds-blue-hosted-by-sovity': {
    ...SOVITY_THEME,
    routes: 'connector-ui',
    features: new Set([...MDS_FEATURES, ...ENTERPRISE_EDITION_FEATURES]),
  },
});
