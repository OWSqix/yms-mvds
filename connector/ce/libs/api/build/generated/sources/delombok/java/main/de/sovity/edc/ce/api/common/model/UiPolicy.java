/*
 * Copyright 2025 sovity GmbH
 * Copyright 2023 Fraunhofer-Institut für Software- und Systemtechnik ISST
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
 *     Fraunhofer ISST - initial implementation of an unified workflow for creating data offerings
 */
package de.sovity.edc.ce.api.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Type-Safe OpenAPI generator friendly ODLR policy subset as endorsed by sovity.")
public class UiPolicy {
    @Schema(description = "EDC Policy JSON-LD. This is required because the EDC requires the " + "full policy when initiating contract negotiations.", requiredMode = RequiredMode.REQUIRED)
    private String policyJsonLd;
    @Schema(description = "Policy expression")
    private UiPolicyExpression expression;
    @Schema(description = "When trying to reduce the policy JSON-LD to our opinionated subset of functionalities, " + "many fields and functionalities are unsupported. Should any discrepancies occur during " + "the mapping process, we\'ll collect them here.", requiredMode = RequiredMode.REQUIRED)
    private List<String> errors;


    public static class UiPolicyBuilder {
        private String policyJsonLd;
        private UiPolicyExpression expression;
        private List<String> errors;

        UiPolicyBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiPolicy.UiPolicyBuilder policyJsonLd(final String policyJsonLd) {
            this.policyJsonLd = policyJsonLd;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiPolicy.UiPolicyBuilder expression(final UiPolicyExpression expression) {
            this.expression = expression;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiPolicy.UiPolicyBuilder errors(final List<String> errors) {
            this.errors = errors;
            return this;
        }

        public UiPolicy build() {
            return new UiPolicy(this.policyJsonLd, this.expression, this.errors);
        }

        @Override
        public String toString() {
            return "UiPolicy.UiPolicyBuilder(policyJsonLd=" + this.policyJsonLd + ", expression=" + this.expression + ", errors=" + this.errors + ")";
        }
    }

    public static UiPolicy.UiPolicyBuilder builder() {
        return new UiPolicy.UiPolicyBuilder();
    }

    public UiPolicy.UiPolicyBuilder toBuilder() {
        return new UiPolicy.UiPolicyBuilder().policyJsonLd(this.policyJsonLd).expression(this.expression).errors(this.errors);
    }

    public String getPolicyJsonLd() {
        return this.policyJsonLd;
    }

    public UiPolicyExpression getExpression() {
        return this.expression;
    }

    public List<String> getErrors() {
        return this.errors;
    }

    public void setPolicyJsonLd(final String policyJsonLd) {
        this.policyJsonLd = policyJsonLd;
    }

    public void setExpression(final UiPolicyExpression expression) {
        this.expression = expression;
    }

    public void setErrors(final List<String> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiPolicy)) return false;
        final UiPolicy other = (UiPolicy) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$policyJsonLd = this.getPolicyJsonLd();
        final Object other$policyJsonLd = other.getPolicyJsonLd();
        if (this$policyJsonLd == null ? other$policyJsonLd != null : !this$policyJsonLd.equals(other$policyJsonLd)) return false;
        final Object this$expression = this.getExpression();
        final Object other$expression = other.getExpression();
        if (this$expression == null ? other$expression != null : !this$expression.equals(other$expression)) return false;
        final Object this$errors = this.getErrors();
        final Object other$errors = other.getErrors();
        if (this$errors == null ? other$errors != null : !this$errors.equals(other$errors)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiPolicy;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $policyJsonLd = this.getPolicyJsonLd();
        result = result * PRIME + ($policyJsonLd == null ? 43 : $policyJsonLd.hashCode());
        final Object $expression = this.getExpression();
        result = result * PRIME + ($expression == null ? 43 : $expression.hashCode());
        final Object $errors = this.getErrors();
        result = result * PRIME + ($errors == null ? 43 : $errors.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiPolicy(policyJsonLd=" + this.getPolicyJsonLd() + ", expression=" + this.getExpression() + ", errors=" + this.getErrors() + ")";
    }

    public UiPolicy(final String policyJsonLd, final UiPolicyExpression expression, final List<String> errors) {
        this.policyJsonLd = policyJsonLd;
        this.expression = expression;
        this.errors = errors;
    }

    public UiPolicy() {
    }
}
