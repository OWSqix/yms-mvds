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
package de.sovity.edc.ce.api.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "A value either inlined or to be fetched from the Vault. " + "Raw secret values will land in the database and will be retrievable via the " + "Eclipse EDC Management API.")
public class SecretValue {
    @Schema(description = "Secret Name / Vault Key Name.", example = "myApiAuthKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String secretName;
    @Schema(description = "Raw inline Value.", example = "<auth key here>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String rawValue;


    public static class SecretValueBuilder {
        private String secretName;
        private String rawValue;

        SecretValueBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public SecretValue.SecretValueBuilder secretName(final String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public SecretValue.SecretValueBuilder rawValue(final String rawValue) {
            this.rawValue = rawValue;
            return this;
        }

        public SecretValue build() {
            return new SecretValue(this.secretName, this.rawValue);
        }

        @Override
        public String toString() {
            return "SecretValue.SecretValueBuilder(secretName=" + this.secretName + ", rawValue=" + this.rawValue + ")";
        }
    }

    public static SecretValue.SecretValueBuilder builder() {
        return new SecretValue.SecretValueBuilder();
    }

    public SecretValue.SecretValueBuilder toBuilder() {
        return new SecretValue.SecretValueBuilder().secretName(this.secretName).rawValue(this.rawValue);
    }

    public String getSecretName() {
        return this.secretName;
    }

    public String getRawValue() {
        return this.rawValue;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    public void setRawValue(final String rawValue) {
        this.rawValue = rawValue;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SecretValue)) return false;
        final SecretValue other = (SecretValue) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$secretName = this.getSecretName();
        final Object other$secretName = other.getSecretName();
        if (this$secretName == null ? other$secretName != null : !this$secretName.equals(other$secretName)) return false;
        final Object this$rawValue = this.getRawValue();
        final Object other$rawValue = other.getRawValue();
        if (this$rawValue == null ? other$rawValue != null : !this$rawValue.equals(other$rawValue)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SecretValue;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $secretName = this.getSecretName();
        result = result * PRIME + ($secretName == null ? 43 : $secretName.hashCode());
        final Object $rawValue = this.getRawValue();
        result = result * PRIME + ($rawValue == null ? 43 : $rawValue.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SecretValue(secretName=" + this.getSecretName() + ", rawValue=" + this.getRawValue() + ")";
    }

    public SecretValue(final String secretName, final String rawValue) {
        this.secretName = secretName;
        this.rawValue = rawValue;
    }

    public SecretValue() {
    }
}
