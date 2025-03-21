/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.db

import de.sovity.edc.ce.config.CeConfigProps
import de.sovity.edc.ce.modules.db.DbExtension.JdbcCredentials
import org.eclipse.edc.spi.system.configuration.Config
import org.flywaydb.core.Flyway

object FlywayFactory {
    fun newFlyway(config: Config, jdbcCredentials: JdbcCredentials): Flyway {
        val locations = mutableListOf<String>()
        locations.add(CeConfigProps.SOVITY_FLYWAY_MIGRATION_LOCATION.getStringOrThrow(config))
        locations.addAll(CeConfigProps.SOVITY_FLYWAY_ADDITIONAL_MIGRATION_LOCATIONS.getListOrEmpty(config))

        return Flyway.configure()
            .dataSource(jdbcCredentials.url, jdbcCredentials.user, jdbcCredentials.password)
            .cleanDisabled(!CeConfigProps.SOVITY_FLYWAY_CLEAN_ENABLE.getBooleanOrFalse(config))
            .baselineVersion("0")
            .baselineOnMigrate(true)
            .table("flyway_schema_history_sovity")
            .locations(*locations.toTypedArray<String?>())
            .load()
    }
}
