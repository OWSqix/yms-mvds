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
@Schema(description = "Transfer Process State interpreted")
public class TransferProcessState {
    @Schema(description = "State name or \'CUSTOM\'. State names only exist for original EDC Transfer Process States.", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    @Schema(description = "State code", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer code;
    @Schema(description = "Whether we are running, in an error state or done.", requiredMode = Schema.RequiredMode.REQUIRED)
    private TransferProcessSimplifiedState simplifiedState;


    public static class TransferProcessStateBuilder {
        private String name;
        private Integer code;
        private TransferProcessSimplifiedState simplifiedState;

        TransferProcessStateBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public TransferProcessState.TransferProcessStateBuilder name(final String name) {
            this.name = name;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferProcessState.TransferProcessStateBuilder code(final Integer code) {
            this.code = code;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferProcessState.TransferProcessStateBuilder simplifiedState(final TransferProcessSimplifiedState simplifiedState) {
            this.simplifiedState = simplifiedState;
            return this;
        }

        public TransferProcessState build() {
            return new TransferProcessState(this.name, this.code, this.simplifiedState);
        }

        @Override
        public String toString() {
            return "TransferProcessState.TransferProcessStateBuilder(name=" + this.name + ", code=" + this.code + ", simplifiedState=" + this.simplifiedState + ")";
        }
    }

    public static TransferProcessState.TransferProcessStateBuilder builder() {
        return new TransferProcessState.TransferProcessStateBuilder();
    }

    public TransferProcessState.TransferProcessStateBuilder toBuilder() {
        return new TransferProcessState.TransferProcessStateBuilder().name(this.name).code(this.code).simplifiedState(this.simplifiedState);
    }

    public String getName() {
        return this.name;
    }

    public Integer getCode() {
        return this.code;
    }

    public TransferProcessSimplifiedState getSimplifiedState() {
        return this.simplifiedState;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setSimplifiedState(final TransferProcessSimplifiedState simplifiedState) {
        this.simplifiedState = simplifiedState;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransferProcessState)) return false;
        final TransferProcessState other = (TransferProcessState) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$simplifiedState = this.getSimplifiedState();
        final Object other$simplifiedState = other.getSimplifiedState();
        if (this$simplifiedState == null ? other$simplifiedState != null : !this$simplifiedState.equals(other$simplifiedState)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransferProcessState;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $simplifiedState = this.getSimplifiedState();
        result = result * PRIME + ($simplifiedState == null ? 43 : $simplifiedState.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "TransferProcessState(name=" + this.getName() + ", code=" + this.getCode() + ", simplifiedState=" + this.getSimplifiedState() + ")";
    }

    public TransferProcessState(final String name, final Integer code, final TransferProcessSimplifiedState simplifiedState) {
        this.name = name;
        this.code = code;
        this.simplifiedState = simplifiedState;
    }

    public TransferProcessState() {
    }
}
