/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
plugins {
    `java-library`
}

dependencies {
    annotationProcessor(libs.lombok)
    compileOnly(libs.lombok)

    api(project(":ce:libs:api-clients:java-client"))
    api(project(":ce:libs:jsonld-lib"))
    api(project(":ce:libs:runtime-lib"))
    api(project(":ce:utils:dependency-bundles-ce"))

    api(libs.edc.contractSpi)
    api(libs.edc.jsonLdSpi)
    api(libs.edc.jsonLdLib)
    api(libs.edc.junit)

    api(libs.apache.commonsLang)

    api(libs.bundles.testUtils)
    api(libs.mockserver.netty)
    api(libs.awaitility.java)
}
