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
package de.sovity.edc.ce.api.usecase.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NonNull;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "FilterExpression Criterion Literal")
public class CatalogFilterExpressionLiteral {
    private CatalogFilterExpressionLiteralType type;
    @Schema(description = "Only for type VALUE. The single value representation.")
    private String value;
    @Schema(description = "Only for type VALUE_LIST. List of values, e.g. for the IN-Operator.")
    private List<String> valueList;

    public static CatalogFilterExpressionLiteral ofValue(@NonNull String value) {
        if (value == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        return new CatalogFilterExpressionLiteral(CatalogFilterExpressionLiteralType.VALUE, value, null);
    }

    public static CatalogFilterExpressionLiteral ofValueList(@NonNull List<String> valueList) {
        if (valueList == null) {
            throw new NullPointerException("valueList is marked non-null but is null");
        }
        return new CatalogFilterExpressionLiteral(CatalogFilterExpressionLiteralType.VALUE_LIST, null, valueList);
    }


    public static class CatalogFilterExpressionLiteralBuilder {
        private CatalogFilterExpressionLiteralType type;
        private String value;
        private List<String> valueList;

        CatalogFilterExpressionLiteralBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public CatalogFilterExpressionLiteral.CatalogFilterExpressionLiteralBuilder type(final CatalogFilterExpressionLiteralType type) {
            this.type = type;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public CatalogFilterExpressionLiteral.CatalogFilterExpressionLiteralBuilder value(final String value) {
            this.value = value;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public CatalogFilterExpressionLiteral.CatalogFilterExpressionLiteralBuilder valueList(final List<String> valueList) {
            this.valueList = valueList;
            return this;
        }

        public CatalogFilterExpressionLiteral build() {
            return new CatalogFilterExpressionLiteral(this.type, this.value, this.valueList);
        }

        @Override
        public String toString() {
            return "CatalogFilterExpressionLiteral.CatalogFilterExpressionLiteralBuilder(type=" + this.type + ", value=" + this.value + ", valueList=" + this.valueList + ")";
        }
    }

    public static CatalogFilterExpressionLiteral.CatalogFilterExpressionLiteralBuilder builder() {
        return new CatalogFilterExpressionLiteral.CatalogFilterExpressionLiteralBuilder();
    }

    public CatalogFilterExpressionLiteral.CatalogFilterExpressionLiteralBuilder toBuilder() {
        return new CatalogFilterExpressionLiteral.CatalogFilterExpressionLiteralBuilder().type(this.type).value(this.value).valueList(this.valueList);
    }

    public CatalogFilterExpressionLiteralType getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public List<String> getValueList() {
        return this.valueList;
    }

    public void setType(final CatalogFilterExpressionLiteralType type) {
        this.type = type;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void setValueList(final List<String> valueList) {
        this.valueList = valueList;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CatalogFilterExpressionLiteral)) return false;
        final CatalogFilterExpressionLiteral other = (CatalogFilterExpressionLiteral) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        final Object this$valueList = this.getValueList();
        final Object other$valueList = other.getValueList();
        if (this$valueList == null ? other$valueList != null : !this$valueList.equals(other$valueList)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CatalogFilterExpressionLiteral;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        final Object $valueList = this.getValueList();
        result = result * PRIME + ($valueList == null ? 43 : $valueList.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CatalogFilterExpressionLiteral(type=" + this.getType() + ", value=" + this.getValue() + ", valueList=" + this.getValueList() + ")";
    }

    public CatalogFilterExpressionLiteral(final CatalogFilterExpressionLiteralType type, final String value, final List<String> valueList) {
        this.type = type;
        this.value = value;
        this.valueList = valueList;
    }

    public CatalogFilterExpressionLiteral() {
    }
}
