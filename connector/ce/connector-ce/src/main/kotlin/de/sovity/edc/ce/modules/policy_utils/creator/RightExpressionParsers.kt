/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.policy_utils.creator

import de.sovity.edc.utils.jsonld.JsonLdUtils
import jakarta.json.JsonValue
import java.time.Instant
import java.time.OffsetDateTime

/**
 * A few example policy right expression types
 */
object RightExpressionParsers {
    /**
     * Right expression parser: String
     *
     * @param jsonValue JSON-LD value
     * @return String(s)
     */
    fun stringValue(jsonValue: JsonValue): List<String> =
        JsonLdUtils.stringList(jsonValue).filterNotNull()


    /**
     * Right expression parser: String
     *
     * Each string can contain comma separated additional values
     *
     * @param jsonValue JSON-LD value
     * @return String(s)
     */
    fun stringValueCommaSeparated(jsonValue: JsonValue): List<String> =
        stringValue(jsonValue)
            .flatMap { it.split(",") }
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .toList()


    /**
     * Right expression parser: OffsetDateTime
     *
     * @param jsonValue JSON-LD value
     * @return Date(s)
     */
    fun offsetDateTimesAsInstants(jsonValue: JsonValue): List<Instant> =
        stringValue(jsonValue).map { OffsetDateTime.parse(it).toInstant() }
}
