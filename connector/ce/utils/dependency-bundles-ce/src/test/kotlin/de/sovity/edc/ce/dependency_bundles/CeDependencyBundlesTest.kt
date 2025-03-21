/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.dependency_bundles

import org.assertj.core.api.Assertions.assertThat
import org.eclipse.edc.iam.mock.IamMockExtension
import org.eclipse.edc.spi.system.ServiceExtension
import org.junit.jupiter.api.Test

class CeDependencyBundlesTest {
    @Test
    fun testIamMockBundle() {
        val classes = CeDependencyBundles.c2cIamMock.getServices(ServiceExtension::class.java)
        assertThat(classes).containsExactly(IamMockExtension::class.java)
    }
}
