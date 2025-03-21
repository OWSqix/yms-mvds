/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.messaging.messenger.impl;

import org.eclipse.edc.spi.agent.ParticipantAgent;

import java.util.function.BiFunction;

public record HandlerBox<IN, OUT>(
    Class<IN> clazz,
    BiFunction<ParticipantAgent, IN, OUT> handler
) {
}
