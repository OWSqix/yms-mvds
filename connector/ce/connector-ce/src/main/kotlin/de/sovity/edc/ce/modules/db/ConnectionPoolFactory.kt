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
import org.eclipse.edc.spi.monitor.Monitor
import org.eclipse.edc.spi.system.configuration.Config
import org.eclipse.edc.sql.ConnectionFactory
import org.eclipse.edc.sql.datasource.ConnectionFactoryDataSource
import org.eclipse.edc.sql.pool.commons.CommonsConnectionPool
import org.eclipse.edc.sql.pool.commons.CommonsConnectionPoolConfig
import java.util.Properties

object ConnectionPoolFactory {

    /**
     * Core EDC Connection pool that interweaves their ConnectionFactory that interfaces with their transaction handling
     *
     * see [org.eclipse.edc.transaction.local.LocalTransactionExtension]
     * see [org.eclipse.edc.sql.pool.commons.CommonsConnectionPoolServiceExtension]
     */
    fun newInstance(
        config: Config,
        monitor: Monitor,
        jdbcCredentials: JdbcCredentials,
        connectionFactory: ConnectionFactory
    ): CommonsConnectionPool {
        val connectionPoolConfig = CommonsConnectionPoolConfig.Builder.newInstance()
            .maxTotalConnections(CeConfigProps.SOVITY_DB_CONNECTION_POOL_SIZE.getIntOrThrow(config))
            .build()

        val properties = Properties().apply {
            put("user", jdbcCredentials.user)
            put("password", jdbcCredentials.password)
        }
        val dataSource = ConnectionFactoryDataSource(connectionFactory, jdbcCredentials.url, properties)
        return CommonsConnectionPool(dataSource, connectionPoolConfig, monitor)
    }

}
