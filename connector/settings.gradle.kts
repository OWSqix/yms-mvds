/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
rootProject.name = "connector"

include(":ce:connector-ce")
include(":ce:docker-image-ce")
include(":ce:libs:api")
include(":ce:libs:api-clients:java-client")
include(":ce:libs:api-clients:typescript-client")
include(":ce:libs:jsonld-lib")
include(":ce:libs:mappers-lib")
include(":ce:libs:runtime-lib")
include(":ce:libs:runtime-os-lib")
include(":ce:libs:runtime-test-lib")
include(":ce:utils:db-schema-ce")
include(":ce:utils:dependency-bundles-ce")
include(":ce:utils:versions-ce")
