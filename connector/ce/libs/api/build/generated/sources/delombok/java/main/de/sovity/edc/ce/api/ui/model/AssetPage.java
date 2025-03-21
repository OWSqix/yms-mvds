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
import de.sovity.edc.ce.api.common.model.UiAsset;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "All data for the Asset Page")
public class AssetPage {
    @Schema(description = "Visible Assets", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<UiAsset> assets;


    public static class AssetPageBuilder {
        private List<UiAsset> assets;

        AssetPageBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public AssetPage.AssetPageBuilder assets(final List<UiAsset> assets) {
            this.assets = assets;
            return this;
        }

        public AssetPage build() {
            return new AssetPage(this.assets);
        }

        @Override
        public String toString() {
            return "AssetPage.AssetPageBuilder(assets=" + this.assets + ")";
        }
    }

    public static AssetPage.AssetPageBuilder builder() {
        return new AssetPage.AssetPageBuilder();
    }

    public AssetPage.AssetPageBuilder toBuilder() {
        return new AssetPage.AssetPageBuilder().assets(this.assets);
    }

    public List<UiAsset> getAssets() {
        return this.assets;
    }

    public void setAssets(final List<UiAsset> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AssetPage)) return false;
        final AssetPage other = (AssetPage) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$assets = this.getAssets();
        final Object other$assets = other.getAssets();
        if (this$assets == null ? other$assets != null : !this$assets.equals(other$assets)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AssetPage;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $assets = this.getAssets();
        result = result * PRIME + ($assets == null ? 43 : $assets.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "AssetPage(assets=" + this.getAssets() + ")";
    }

    public AssetPage(final List<UiAsset> assets) {
        this.assets = assets;
    }

    public AssetPage() {
    }
}
