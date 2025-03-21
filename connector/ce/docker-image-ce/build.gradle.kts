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
    application
    alias(libs.plugins.shadow)
}

dependencies {
    api(project(":ce:connector-ce"))
}

application {
    mainClass.set("de.sovity.edc.ce.CeMainKt")
}

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    isZip64 = true
    exclude("**/pom.properties", "**/pom.xml")

    // Required to avoid Log4j2 errors on startup
    // https://stackoverflow.com/a/52923153
    // https://stackoverflow.com/a/61475766
    // https://issues.apache.org/jira/browse/LOG4J2-673
    transform(com.github.jengelman.gradle.plugins.shadow.transformers.Log4j2PluginsCacheFileTransformer::class.java)
    // Required by Log4j2
    // https://issues.apache.org/jira/browse/LOG4J2-2537
    manifest {
        attributes(mapOf("Multi-Release" to "true"))
    }

    mergeServiceFiles()
    archiveFileName.set("app.jar")
}
