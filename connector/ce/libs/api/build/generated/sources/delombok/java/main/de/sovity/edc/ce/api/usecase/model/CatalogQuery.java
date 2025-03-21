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
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Catalog query parameters")
public class CatalogQuery {
    @Schema(description = "Target EDC DSP endpoint URL. Can contain a queryParam \'participantId\', which is provided by default in the " + "Connector Endpoint in the EDC UI.", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorEndpoint;
    @Schema(description = "Target EDC Participant ID. It is required if the connector endpoint does not contain the queryParam " + "\'participantId\'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String participantId;
    @Schema(description = "Limit the number of results", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Integer limit;
    @Schema(description = "Offset for returned results, e.g. start at result 2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Integer offset;
    @Schema(description = "Filter expressions for catalog filtering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<CatalogFilterExpression> filterExpressions;


    public static class CatalogQueryBuilder {
        private String connectorEndpoint;
        private String participantId;
        private Integer limit;
        private Integer offset;
        private List<CatalogFilterExpression> filterExpressions;

        CatalogQueryBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public CatalogQuery.CatalogQueryBuilder connectorEndpoint(final String connectorEndpoint) {
            this.connectorEndpoint = connectorEndpoint;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public CatalogQuery.CatalogQueryBuilder participantId(final String participantId) {
            this.participantId = participantId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public CatalogQuery.CatalogQueryBuilder limit(final Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public CatalogQuery.CatalogQueryBuilder offset(final Integer offset) {
            this.offset = offset;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public CatalogQuery.CatalogQueryBuilder filterExpressions(final List<CatalogFilterExpression> filterExpressions) {
            this.filterExpressions = filterExpressions;
            return this;
        }

        public CatalogQuery build() {
            return new CatalogQuery(this.connectorEndpoint, this.participantId, this.limit, this.offset, this.filterExpressions);
        }

        @Override
        public String toString() {
            return "CatalogQuery.CatalogQueryBuilder(connectorEndpoint=" + this.connectorEndpoint + ", participantId=" + this.participantId + ", limit=" + this.limit + ", offset=" + this.offset + ", filterExpressions=" + this.filterExpressions + ")";
        }
    }

    public static CatalogQuery.CatalogQueryBuilder builder() {
        return new CatalogQuery.CatalogQueryBuilder();
    }

    public CatalogQuery.CatalogQueryBuilder toBuilder() {
        return new CatalogQuery.CatalogQueryBuilder().connectorEndpoint(this.connectorEndpoint).participantId(this.participantId).limit(this.limit).offset(this.offset).filterExpressions(this.filterExpressions);
    }

    public String getConnectorEndpoint() {
        return this.connectorEndpoint;
    }

    public String getParticipantId() {
        return this.participantId;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public List<CatalogFilterExpression> getFilterExpressions() {
        return this.filterExpressions;
    }

    public void setConnectorEndpoint(final String connectorEndpoint) {
        this.connectorEndpoint = connectorEndpoint;
    }

    public void setParticipantId(final String participantId) {
        this.participantId = participantId;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setOffset(final Integer offset) {
        this.offset = offset;
    }

    public void setFilterExpressions(final List<CatalogFilterExpression> filterExpressions) {
        this.filterExpressions = filterExpressions;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CatalogQuery)) return false;
        final CatalogQuery other = (CatalogQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        final Object this$offset = this.getOffset();
        final Object other$offset = other.getOffset();
        if (this$offset == null ? other$offset != null : !this$offset.equals(other$offset)) return false;
        final Object this$connectorEndpoint = this.getConnectorEndpoint();
        final Object other$connectorEndpoint = other.getConnectorEndpoint();
        if (this$connectorEndpoint == null ? other$connectorEndpoint != null : !this$connectorEndpoint.equals(other$connectorEndpoint)) return false;
        final Object this$participantId = this.getParticipantId();
        final Object other$participantId = other.getParticipantId();
        if (this$participantId == null ? other$participantId != null : !this$participantId.equals(other$participantId)) return false;
        final Object this$filterExpressions = this.getFilterExpressions();
        final Object other$filterExpressions = other.getFilterExpressions();
        if (this$filterExpressions == null ? other$filterExpressions != null : !this$filterExpressions.equals(other$filterExpressions)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CatalogQuery;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        final Object $offset = this.getOffset();
        result = result * PRIME + ($offset == null ? 43 : $offset.hashCode());
        final Object $connectorEndpoint = this.getConnectorEndpoint();
        result = result * PRIME + ($connectorEndpoint == null ? 43 : $connectorEndpoint.hashCode());
        final Object $participantId = this.getParticipantId();
        result = result * PRIME + ($participantId == null ? 43 : $participantId.hashCode());
        final Object $filterExpressions = this.getFilterExpressions();
        result = result * PRIME + ($filterExpressions == null ? 43 : $filterExpressions.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CatalogQuery(connectorEndpoint=" + this.getConnectorEndpoint() + ", participantId=" + this.getParticipantId() + ", limit=" + this.getLimit() + ", offset=" + this.getOffset() + ", filterExpressions=" + this.getFilterExpressions() + ")";
    }

    public CatalogQuery(final String connectorEndpoint, final String participantId, final Integer limit, final Integer offset, final List<CatalogFilterExpression> filterExpressions) {
        this.connectorEndpoint = connectorEndpoint;
        this.participantId = participantId;
        this.limit = limit;
        this.offset = offset;
        this.filterExpressions = filterExpressions;
    }

    public CatalogQuery() {
    }
}
