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
    `maven-publish`
}

dependencies {
    annotationProcessor(libs.lombok)
    compileOnly(libs.lombok)

    api(project(":ce:libs:runtime-os-lib"))
    api(project(":ce:utils:dependency-bundles-ce"))
    api(libs.edc.boot)

    // Logging
    api(libs.log4j.core)
    api(libs.log4j.jul)
    api(libs.log4j.layoutTemplateJson)

    testAnnotationProcessor(libs.lombok)
    testImplementation(libs.lombok)
    testImplementation(libs.bundles.testUtils)
    testRuntimeOnly(libs.junit.engine)
}
