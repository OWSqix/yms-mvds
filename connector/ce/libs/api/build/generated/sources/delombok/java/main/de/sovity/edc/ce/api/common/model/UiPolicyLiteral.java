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
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Sum type: A String, a list of Strings or a generic JSON value.")
public class UiPolicyLiteral {
    @Schema(description = "Value Type", requiredMode = RequiredMode.REQUIRED)
    private UiPolicyLiteralType type;
    @Schema(description = "Only for types STRING and JSON")
    private String value;
    @Schema(description = "Only for type STRING_LIST")
    private List<String> valueList;

    public static UiPolicyLiteral ofString(String string) {
        return UiPolicyLiteral.builder().type(UiPolicyLiteralType.STRING).value(string).build();
    }

    public static UiPolicyLiteral ofJson(String jsonString) {
        return UiPolicyLiteral.builder().type(UiPolicyLiteralType.JSON).value(jsonString).build();
    }

    public static UiPolicyLiteral ofStringList(Collection<String> strings) {
        return UiPolicyLiteral.builder().type(UiPolicyLiteralType.STRING_LIST).valueList(new ArrayList<>(strings)).build();
    }


    public static class UiPolicyLiteralBuilder {
        private UiPolicyLiteralType type;
        private String value;
        private List<String> valueList;

        UiPolicyLiteralBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyLiteral.UiPolicyLiteralBuilder type(final UiPolicyLiteralType type) {
            this.type = type;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyLiteral.UiPolicyLiteralBuilder value(final String value) {
            this.value = value;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyLiteral.UiPolicyLiteralBuilder valueList(final List<String> valueList) {
            this.valueList = valueList;
            return this;
        }

        public UiPolicyLiteral build() {
            return new UiPolicyLiteral(this.type, this.value, this.valueList);
        }

        @Override
        public String toString() {
            return "UiPolicyLiteral.UiPolicyLiteralBuilder(type=" + this.type + ", value=" + this.value + ", valueList=" + this.valueList + ")";
        }
    }

    public static UiPolicyLiteral.UiPolicyLiteralBuilder builder() {
        return new UiPolicyLiteral.UiPolicyLiteralBuilder();
    }

    public UiPolicyLiteral.UiPolicyLiteralBuilder toBuilder() {
        return new UiPolicyLiteral.UiPolicyLiteralBuilder().type(this.type).value(this.value).valueList(this.valueList);
    }

    public UiPolicyLiteralType getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public List<String> getValueList() {
        return this.valueList;
    }

    public void setType(final UiPolicyLiteralType type) {
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
        if (!(o instanceof UiPolicyLiteral)) return false;
        final UiPolicyLiteral other = (UiPolicyLiteral) o;
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
        return other instanceof UiPolicyLiteral;
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
        return "UiPolicyLiteral(type=" + this.getType() + ", value=" + this.getValue() + ", valueList=" + this.getValueList() + ")";
    }

    public UiPolicyLiteral(final UiPolicyLiteralType type, final String value, final List<String> valueList) {
        this.type = type;
        this.value = value;
        this.valueList = valueList;
    }

    public UiPolicyLiteral() {
    }
}
