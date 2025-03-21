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
@Schema(description = "ON_REQUEST type Data Source.")
public class UiDataSourceOnRequest {
    @Schema(description = "Contact E-Mail address", example = "contact@my-org.com", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contactEmail;
    @Schema(description = "Contact Preferred E-Mail Subject", example = "Department XYZ Data Offer Request - My Product, My API", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contactPreferredEmailSubject;


    public static class UiDataSourceOnRequestBuilder {
        private String contactEmail;
        private String contactPreferredEmailSubject;

        UiDataSourceOnRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceOnRequest.UiDataSourceOnRequestBuilder contactEmail(final String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceOnRequest.UiDataSourceOnRequestBuilder contactPreferredEmailSubject(final String contactPreferredEmailSubject) {
            this.contactPreferredEmailSubject = contactPreferredEmailSubject;
            return this;
        }

        public UiDataSourceOnRequest build() {
            return new UiDataSourceOnRequest(this.contactEmail, this.contactPreferredEmailSubject);
        }

        @Override
        public String toString() {
            return "UiDataSourceOnRequest.UiDataSourceOnRequestBuilder(contactEmail=" + this.contactEmail + ", contactPreferredEmailSubject=" + this.contactPreferredEmailSubject + ")";
        }
    }

    public static UiDataSourceOnRequest.UiDataSourceOnRequestBuilder builder() {
        return new UiDataSourceOnRequest.UiDataSourceOnRequestBuilder();
    }

    public UiDataSourceOnRequest.UiDataSourceOnRequestBuilder toBuilder() {
        return new UiDataSourceOnRequest.UiDataSourceOnRequestBuilder().contactEmail(this.contactEmail).contactPreferredEmailSubject(this.contactPreferredEmailSubject);
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public String getContactPreferredEmailSubject() {
        return this.contactPreferredEmailSubject;
    }

    public void setContactEmail(final String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setContactPreferredEmailSubject(final String contactPreferredEmailSubject) {
        this.contactPreferredEmailSubject = contactPreferredEmailSubject;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiDataSourceOnRequest)) return false;
        final UiDataSourceOnRequest other = (UiDataSourceOnRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contactEmail = this.getContactEmail();
        final Object other$contactEmail = other.getContactEmail();
        if (this$contactEmail == null ? other$contactEmail != null : !this$contactEmail.equals(other$contactEmail)) return false;
        final Object this$contactPreferredEmailSubject = this.getContactPreferredEmailSubject();
        final Object other$contactPreferredEmailSubject = other.getContactPreferredEmailSubject();
        if (this$contactPreferredEmailSubject == null ? other$contactPreferredEmailSubject != null : !this$contactPreferredEmailSubject.equals(other$contactPreferredEmailSubject)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiDataSourceOnRequest;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contactEmail = this.getContactEmail();
        result = result * PRIME + ($contactEmail == null ? 43 : $contactEmail.hashCode());
        final Object $contactPreferredEmailSubject = this.getContactPreferredEmailSubject();
        result = result * PRIME + ($contactPreferredEmailSubject == null ? 43 : $contactPreferredEmailSubject.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiDataSourceOnRequest(contactEmail=" + this.getContactEmail() + ", contactPreferredEmailSubject=" + this.getContactPreferredEmailSubject() + ")";
    }

    public UiDataSourceOnRequest(final String contactEmail, final String contactPreferredEmailSubject) {
        this.contactEmail = contactEmail;
        this.contactPreferredEmailSubject = contactPreferredEmailSubject;
    }

    public UiDataSourceOnRequest() {
    }
}
