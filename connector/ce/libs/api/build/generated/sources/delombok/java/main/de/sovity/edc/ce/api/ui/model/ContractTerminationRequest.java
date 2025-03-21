/*
 * Copyright 2025 sovity GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     sovity - init and continued development
 */
package de.sovity.edc.ce.api.ui.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Schema(description = "Data for terminating a Contract Agreement")
public class ContractTerminationRequest {
    public static final int MAX_REASON_SIZE = 100;
    public static final int MAX_DETAIL_SIZE = 1000;
    @Schema(title = "Termination detail", description = "A user explanation to detail why the contract was terminated.", requiredMode = Schema.RequiredMode.REQUIRED)
    @Size(max = MAX_DETAIL_SIZE)
    @NotNull
    @NotEmpty
    @NotBlank
    String detail;
    @Schema(title = "Termination reason", description = "A short reason why this contract was terminated", requiredMode = Schema.RequiredMode.REQUIRED)
    @Size(max = MAX_REASON_SIZE)
    @NotBlank
    @NotEmpty
    @NotNull
    String reason;

    public String getDetail() {
        return this.detail;
    }

    public String getReason() {
        return this.reason;
    }

    public void setDetail(final String detail) {
        this.detail = detail;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ContractTerminationRequest(detail=" + this.getDetail() + ", reason=" + this.getReason() + ")";
    }

    public ContractTerminationRequest(final String detail, final String reason) {
        this.detail = detail;
        this.reason = reason;
    }

    public ContractTerminationRequest() {
    }
}
