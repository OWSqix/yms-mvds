/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.extension.e2e.junit.utils

/**
 * When annotated on a parameter injected by JUnit, in conjunction with
 * [de.sovity.edc.extension.e2e.junit.IntegrationTestCpDpExtension],
 * specifies that the injected instance must come from the Data Plane
 */
@Retention(AnnotationRetention.RUNTIME)
annotation class DataPlane
