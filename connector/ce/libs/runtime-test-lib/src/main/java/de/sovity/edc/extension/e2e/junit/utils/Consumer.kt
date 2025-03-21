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
 * In test code, in conjunction with [CeE2eTestExtension], specifies that the injected instance must come from the Consumer EDC
 */
@Retention(AnnotationRetention.RUNTIME)
annotation class Consumer
