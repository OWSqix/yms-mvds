/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
export type EdcUiFeature =
  // Enables MDS Specific Asset Fields such as Data Category, Transport Mode
  | 'mds-fields'

  // Enables MDS Specific Connector ID support
  | 'mds-connector-id'

  // Enables support functionalities of connectors commercially hosted by sovity.
  | 'sovity-zammad-integration'

  // Enables logout button to configured LOGOUT_URL
  | 'logout-button'

  // Enables marketing for sovity in open-source variants
  | 'open-source-marketing'

  // Enterprise Edition specific attribute to view limits enforced on consuming contract agreements
  | 'connector-limits'

  // Enterprise Edition specific flag to enable marketing for other Enterprise Edition variants in basic connectors
  | 'mds-marketing';
