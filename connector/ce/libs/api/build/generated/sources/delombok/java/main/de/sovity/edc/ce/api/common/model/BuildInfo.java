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
@Schema(description = "Build information about the connector backend.")
public class BuildInfo {
    @Schema(description = "Container build date. May be overridden.", example = "2021-02-03T04:05:06.789Z", requiredMode = Schema.RequiredMode.REQUIRED)
    private final String buildDate;
    @Schema(description = "Container build release version or a combination of last tag + commit hash. May be overridden.", example = "v4.5.1-1445-gff95cb8e2", requiredMode = Schema.RequiredMode.REQUIRED)
    private final String buildVersion;


    public static class BuildInfoBuilder {
        private String buildDate;
        private String buildVersion;

        BuildInfoBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public BuildInfo.BuildInfoBuilder buildDate(final String buildDate) {
            this.buildDate = buildDate;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public BuildInfo.BuildInfoBuilder buildVersion(final String buildVersion) {
            this.buildVersion = buildVersion;
            return this;
        }

        public BuildInfo build() {
            return new BuildInfo(this.buildDate, this.buildVersion);
        }

        @Override
        public String toString() {
            return "BuildInfo.BuildInfoBuilder(buildDate=" + this.buildDate + ", buildVersion=" + this.buildVersion + ")";
        }
    }

    public static BuildInfo.BuildInfoBuilder builder() {
        return new BuildInfo.BuildInfoBuilder();
    }

    public BuildInfo.BuildInfoBuilder toBuilder() {
        return new BuildInfo.BuildInfoBuilder().buildDate(this.buildDate).buildVersion(this.buildVersion);
    }

    public String getBuildDate() {
        return this.buildDate;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BuildInfo)) return false;
        final BuildInfo other = (BuildInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$buildDate = this.getBuildDate();
        final Object other$buildDate = other.getBuildDate();
        if (this$buildDate == null ? other$buildDate != null : !this$buildDate.equals(other$buildDate)) return false;
        final Object this$buildVersion = this.getBuildVersion();
        final Object other$buildVersion = other.getBuildVersion();
        if (this$buildVersion == null ? other$buildVersion != null : !this$buildVersion.equals(other$buildVersion)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BuildInfo;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $buildDate = this.getBuildDate();
        result = result * PRIME + ($buildDate == null ? 43 : $buildDate.hashCode());
        final Object $buildVersion = this.getBuildVersion();
        result = result * PRIME + ($buildVersion == null ? 43 : $buildVersion.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "BuildInfo(buildDate=" + this.getBuildDate() + ", buildVersion=" + this.getBuildVersion() + ")";
    }

    public BuildInfo(final String buildDate, final String buildVersion) {
        this.buildDate = buildDate;
        this.buildVersion = buildVersion;
    }
}
