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

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Object indicates whether an ID for the given object type is already taken or not")
public class IdAvailabilityResponse {
    @Schema(description = "ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private final String id;
    @Schema(description = "ID Availability", requiredMode = Schema.RequiredMode.REQUIRED)
    private boolean isAvailable;

    public String getId() {
        return this.id;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(final boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof IdAvailabilityResponse)) return false;
        final IdAvailabilityResponse other = (IdAvailabilityResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isAvailable() != other.isAvailable()) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof IdAvailabilityResponse;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isAvailable() ? 79 : 97);
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "IdAvailabilityResponse(id=" + this.getId() + ", isAvailable=" + this.isAvailable() + ")";
    }

    public IdAvailabilityResponse(final String id, final boolean isAvailable) {
        this.id = id;
        this.isAvailable = isAvailable;
    }

    public IdAvailabilityResponse(final String id) {
        this.id = id;
    }
}
