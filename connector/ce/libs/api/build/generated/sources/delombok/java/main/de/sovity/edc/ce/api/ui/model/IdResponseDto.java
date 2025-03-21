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
import java.time.OffsetDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Marks the operation as successful")
public class IdResponseDto {
    @Schema(description = "ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private final String id;
    @Schema(description = "Change Date", requiredMode = Schema.RequiredMode.REQUIRED)
    private OffsetDateTime lastUpdatedDate;

    private static OffsetDateTime $default$lastUpdatedDate() {
        return OffsetDateTime.now();
    }


    public static class IdResponseDtoBuilder {
        private String id;
        private boolean lastUpdatedDate$set;
        private OffsetDateTime lastUpdatedDate$value;

        IdResponseDtoBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public IdResponseDto.IdResponseDtoBuilder id(final String id) {
            this.id = id;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public IdResponseDto.IdResponseDtoBuilder lastUpdatedDate(final OffsetDateTime lastUpdatedDate) {
            this.lastUpdatedDate$value = lastUpdatedDate;
            lastUpdatedDate$set = true;
            return this;
        }

        public IdResponseDto build() {
            OffsetDateTime lastUpdatedDate$value = this.lastUpdatedDate$value;
            if (!this.lastUpdatedDate$set) lastUpdatedDate$value = IdResponseDto.$default$lastUpdatedDate();
            return new IdResponseDto(this.id, lastUpdatedDate$value);
        }

        @Override
        public String toString() {
            return "IdResponseDto.IdResponseDtoBuilder(id=" + this.id + ", lastUpdatedDate$value=" + this.lastUpdatedDate$value + ")";
        }
    }

    public static IdResponseDto.IdResponseDtoBuilder builder() {
        return new IdResponseDto.IdResponseDtoBuilder();
    }

    public IdResponseDto.IdResponseDtoBuilder toBuilder() {
        return new IdResponseDto.IdResponseDtoBuilder().id(this.id).lastUpdatedDate(this.lastUpdatedDate);
    }

    public String getId() {
        return this.id;
    }

    public OffsetDateTime getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public void setLastUpdatedDate(final OffsetDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof IdResponseDto)) return false;
        final IdResponseDto other = (IdResponseDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$lastUpdatedDate = this.getLastUpdatedDate();
        final Object other$lastUpdatedDate = other.getLastUpdatedDate();
        if (this$lastUpdatedDate == null ? other$lastUpdatedDate != null : !this$lastUpdatedDate.equals(other$lastUpdatedDate)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof IdResponseDto;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $lastUpdatedDate = this.getLastUpdatedDate();
        result = result * PRIME + ($lastUpdatedDate == null ? 43 : $lastUpdatedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "IdResponseDto(id=" + this.getId() + ", lastUpdatedDate=" + this.getLastUpdatedDate() + ")";
    }

    public IdResponseDto(final String id, final OffsetDateTime lastUpdatedDate) {
        this.id = id;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public IdResponseDto(final String id) {
        this.id = id;
        this.lastUpdatedDate = IdResponseDto.$default$lastUpdatedDate();
    }
}
