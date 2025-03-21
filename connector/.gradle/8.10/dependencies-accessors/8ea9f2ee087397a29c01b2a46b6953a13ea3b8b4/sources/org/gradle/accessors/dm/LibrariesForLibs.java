package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ApacheLibraryAccessors laccForApacheLibraryAccessors = new ApacheLibraryAccessors(owner);
    private final ApicatalogLibraryAccessors laccForApicatalogLibraryAccessors = new ApicatalogLibraryAccessors(owner);
    private final AssertjLibraryAccessors laccForAssertjLibraryAccessors = new AssertjLibraryAccessors(owner);
    private final AwaitilityLibraryAccessors laccForAwaitilityLibraryAccessors = new AwaitilityLibraryAccessors(owner);
    private final EdcLibraryAccessors laccForEdcLibraryAccessors = new EdcLibraryAccessors(owner);
    private final FindbugsLibraryAccessors laccForFindbugsLibraryAccessors = new FindbugsLibraryAccessors(owner);
    private final FlexmarkLibraryAccessors laccForFlexmarkLibraryAccessors = new FlexmarkLibraryAccessors(owner);
    private final FlywayLibraryAccessors laccForFlywayLibraryAccessors = new FlywayLibraryAccessors(owner);
    private final HibernateLibraryAccessors laccForHibernateLibraryAccessors = new HibernateLibraryAccessors(owner);
    private final JacksonLibraryAccessors laccForJacksonLibraryAccessors = new JacksonLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final JooqLibraryAccessors laccForJooqLibraryAccessors = new JooqLibraryAccessors(owner);
    private final JsonUnitLibraryAccessors laccForJsonUnitLibraryAccessors = new JsonUnitLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final Log4jLibraryAccessors laccForLog4jLibraryAccessors = new Log4jLibraryAccessors(owner);
    private final MockitoLibraryAccessors laccForMockitoLibraryAccessors = new MockitoLibraryAccessors(owner);
    private final MockserverLibraryAccessors laccForMockserverLibraryAccessors = new MockserverLibraryAccessors(owner);
    private final NimbusLibraryAccessors laccForNimbusLibraryAccessors = new NimbusLibraryAccessors(owner);
    private final OkhttpLibraryAccessors laccForOkhttpLibraryAccessors = new OkhttpLibraryAccessors(owner);
    private final OpenapiLibraryAccessors laccForOpenapiLibraryAccessors = new OpenapiLibraryAccessors(owner);
    private final RestAssuredLibraryAccessors laccForRestAssuredLibraryAccessors = new RestAssuredLibraryAccessors(owner);
    private final SquareupLibraryAccessors laccForSquareupLibraryAccessors = new SquareupLibraryAccessors(owner);
    private final SwaggerLibraryAccessors laccForSwaggerLibraryAccessors = new SwaggerLibraryAccessors(owner);
    private final T9tJooqLibraryAccessors laccForT9tJooqLibraryAccessors = new T9tJooqLibraryAccessors(owner);
    private final TestcontainersLibraryAccessors laccForTestcontainersLibraryAccessors = new TestcontainersLibraryAccessors(owner);
    private final TractusLibraryAccessors laccForTractusLibraryAccessors = new TractusLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>gson</b> with <b>com.google.code.gson:gson</b> coordinates and
     * with version reference <b>gson</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getGson() {
        return create("gson");
    }

    /**
     * Dependency provider for <b>gsonFire</b> with <b>io.gsonfire:gson-fire</b> coordinates and
     * with version reference <b>gsonFire</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getGsonFire() {
        return create("gsonFire");
    }

    /**
     * Dependency provider for <b>lombok</b> with <b>org.projectlombok:lombok</b> coordinates and
     * with version reference <b>lombok</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getLombok() {
        return create("lombok");
    }

    /**
     * Dependency provider for <b>postgres</b> with <b>org.postgresql:postgresql</b> coordinates and
     * with version reference <b>postgres</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getPostgres() {
        return create("postgres");
    }

    /**
     * Group of libraries at <b>apache</b>
     */
    public ApacheLibraryAccessors getApache() {
        return laccForApacheLibraryAccessors;
    }

    /**
     * Group of libraries at <b>apicatalog</b>
     */
    public ApicatalogLibraryAccessors getApicatalog() {
        return laccForApicatalogLibraryAccessors;
    }

    /**
     * Group of libraries at <b>assertj</b>
     */
    public AssertjLibraryAccessors getAssertj() {
        return laccForAssertjLibraryAccessors;
    }

    /**
     * Group of libraries at <b>awaitility</b>
     */
    public AwaitilityLibraryAccessors getAwaitility() {
        return laccForAwaitilityLibraryAccessors;
    }

    /**
     * Group of libraries at <b>edc</b>
     */
    public EdcLibraryAccessors getEdc() {
        return laccForEdcLibraryAccessors;
    }

    /**
     * Group of libraries at <b>findbugs</b>
     */
    public FindbugsLibraryAccessors getFindbugs() {
        return laccForFindbugsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>flexmark</b>
     */
    public FlexmarkLibraryAccessors getFlexmark() {
        return laccForFlexmarkLibraryAccessors;
    }

    /**
     * Group of libraries at <b>flyway</b>
     */
    public FlywayLibraryAccessors getFlyway() {
        return laccForFlywayLibraryAccessors;
    }

    /**
     * Group of libraries at <b>hibernate</b>
     */
    public HibernateLibraryAccessors getHibernate() {
        return laccForHibernateLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jackson</b>
     */
    public JacksonLibraryAccessors getJackson() {
        return laccForJacksonLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jakarta</b>
     */
    public JakartaLibraryAccessors getJakarta() {
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jooq</b>
     */
    public JooqLibraryAccessors getJooq() {
        return laccForJooqLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jsonUnit</b>
     */
    public JsonUnitLibraryAccessors getJsonUnit() {
        return laccForJsonUnitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>junit</b>
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>log4j</b>
     */
    public Log4jLibraryAccessors getLog4j() {
        return laccForLog4jLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mockito</b>
     */
    public MockitoLibraryAccessors getMockito() {
        return laccForMockitoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mockserver</b>
     */
    public MockserverLibraryAccessors getMockserver() {
        return laccForMockserverLibraryAccessors;
    }

    /**
     * Group of libraries at <b>nimbus</b>
     */
    public NimbusLibraryAccessors getNimbus() {
        return laccForNimbusLibraryAccessors;
    }

    /**
     * Group of libraries at <b>okhttp</b>
     */
    public OkhttpLibraryAccessors getOkhttp() {
        return laccForOkhttpLibraryAccessors;
    }

    /**
     * Group of libraries at <b>openapi</b>
     */
    public OpenapiLibraryAccessors getOpenapi() {
        return laccForOpenapiLibraryAccessors;
    }

    /**
     * Group of libraries at <b>restAssured</b>
     */
    public RestAssuredLibraryAccessors getRestAssured() {
        return laccForRestAssuredLibraryAccessors;
    }

    /**
     * Group of libraries at <b>squareup</b>
     */
    public SquareupLibraryAccessors getSquareup() {
        return laccForSquareupLibraryAccessors;
    }

    /**
     * Group of libraries at <b>swagger</b>
     */
    public SwaggerLibraryAccessors getSwagger() {
        return laccForSwaggerLibraryAccessors;
    }

    /**
     * Group of libraries at <b>t9tJooq</b>
     */
    public T9tJooqLibraryAccessors getT9tJooq() {
        return laccForT9tJooqLibraryAccessors;
    }

    /**
     * Group of libraries at <b>testcontainers</b>
     */
    public TestcontainersLibraryAccessors getTestcontainers() {
        return laccForTestcontainersLibraryAccessors;
    }

    /**
     * Group of libraries at <b>tractus</b>
     */
    public TractusLibraryAccessors getTractus() {
        return laccForTractusLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class ApacheLibraryAccessors extends SubDependencyFactory {

        public ApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>commonsCollections</b> with <b>org.apache.commons:commons-collections4</b> coordinates and
         * with version reference <b>commonsCollections</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommonsCollections() {
            return create("apache.commonsCollections");
        }

        /**
         * Dependency provider for <b>commonsIo</b> with <b>commons-io:commons-io</b> coordinates and
         * with version reference <b>commonsIo</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommonsIo() {
            return create("apache.commonsIo");
        }

        /**
         * Dependency provider for <b>commonsLang</b> with <b>org.apache.commons:commons-lang3</b> coordinates and
         * with version reference <b>commonsLang</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommonsLang() {
            return create("apache.commonsLang");
        }

    }

    public static class ApicatalogLibraryAccessors extends SubDependencyFactory {

        public ApicatalogLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>titaniumJsonLd</b> with <b>com.apicatalog:titanium-json-ld</b> coordinates and
         * with version reference <b>titaniumLd</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTitaniumJsonLd() {
            return create("apicatalog.titaniumJsonLd");
        }

    }

    public static class AssertjLibraryAccessors extends SubDependencyFactory {

        public AssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.assertj:assertj-core</b> coordinates and
         * with version reference <b>assertj</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("assertj.core");
        }

    }

    public static class AwaitilityLibraryAccessors extends SubDependencyFactory {

        public AwaitilityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>java</b> with <b>org.awaitility:awaitility</b> coordinates and
         * with version reference <b>awaitility</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJava() {
            return create("awaitility.java");
        }

    }

    public static class EdcLibraryAccessors extends SubDependencyFactory {
        private final EdcAwsLibraryAccessors laccForEdcAwsLibraryAccessors = new EdcAwsLibraryAccessors(owner);
        private final EdcAzureLibraryAccessors laccForEdcAzureLibraryAccessors = new EdcAzureLibraryAccessors(owner);

        public EdcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>accesstokendataStoreSql</b> with <b>org.eclipse.edc:accesstokendata-store-sql</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAccesstokendataStoreSql() {
            return create("edc.accesstokendataStoreSql");
        }

        /**
         * Dependency provider for <b>apiCore</b> with <b>org.eclipse.edc:api-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApiCore() {
            return create("edc.apiCore");
        }

        /**
         * Dependency provider for <b>apiObservability</b> with <b>org.eclipse.edc:api-observability</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApiObservability() {
            return create("edc.apiObservability");
        }

        /**
         * Dependency provider for <b>assetSpi</b> with <b>org.eclipse.edc:asset-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAssetSpi() {
            return create("edc.assetSpi");
        }

        /**
         * Dependency provider for <b>authSpi</b> with <b>org.eclipse.edc:auth-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAuthSpi() {
            return create("edc.authSpi");
        }

        /**
         * Dependency provider for <b>authTokenbased</b> with <b>org.eclipse.edc:auth-tokenbased</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAuthTokenbased() {
            return create("edc.authTokenbased");
        }

        /**
         * Dependency provider for <b>boot</b> with <b>org.eclipse.edc:boot</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBoot() {
            return create("edc.boot");
        }

        /**
         * Dependency provider for <b>bootLib</b> with <b>org.eclipse.edc:boot-lib</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBootLib() {
            return create("edc.bootLib");
        }

        /**
         * Dependency provider for <b>callbackEventDispatcher</b> with <b>org.eclipse.edc:callback-event-dispatcher</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCallbackEventDispatcher() {
            return create("edc.callbackEventDispatcher");
        }

        /**
         * Dependency provider for <b>callbackHttpDispatcher</b> with <b>org.eclipse.edc:callback-http-dispatcher</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCallbackHttpDispatcher() {
            return create("edc.callbackHttpDispatcher");
        }

        /**
         * Dependency provider for <b>callbackStaticEndpoint</b> with <b>org.eclipse.edc:callback-static-endpoint</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCallbackStaticEndpoint() {
            return create("edc.callbackStaticEndpoint");
        }

        /**
         * Dependency provider for <b>connectorCore</b> with <b>org.eclipse.edc:connector-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getConnectorCore() {
            return create("edc.connectorCore");
        }

        /**
         * Dependency provider for <b>contractDefinitionApi</b> with <b>org.eclipse.edc:contract-definition-api</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getContractDefinitionApi() {
            return create("edc.contractDefinitionApi");
        }

        /**
         * Dependency provider for <b>contractSpi</b> with <b>org.eclipse.edc:contract-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getContractSpi() {
            return create("edc.contractSpi");
        }

        /**
         * Dependency provider for <b>controlApiConfiguration</b> with <b>org.eclipse.edc:control-api-configuration</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getControlApiConfiguration() {
            return create("edc.controlApiConfiguration");
        }

        /**
         * Dependency provider for <b>controlPlaneApi</b> with <b>org.eclipse.edc:control-plane-api</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getControlPlaneApi() {
            return create("edc.controlPlaneApi");
        }

        /**
         * Dependency provider for <b>controlPlaneApiClient</b> with <b>org.eclipse.edc:control-plane-api-client</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getControlPlaneApiClient() {
            return create("edc.controlPlaneApiClient");
        }

        /**
         * Dependency provider for <b>controlPlaneContract</b> with <b>org.eclipse.edc:control-plane-contract</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getControlPlaneContract() {
            return create("edc.controlPlaneContract");
        }

        /**
         * Dependency provider for <b>controlPlaneCore</b> with <b>org.eclipse.edc:control-plane-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getControlPlaneCore() {
            return create("edc.controlPlaneCore");
        }

        /**
         * Dependency provider for <b>controlPlaneSpi</b> with <b>org.eclipse.edc:control-plane-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getControlPlaneSpi() {
            return create("edc.controlPlaneSpi");
        }

        /**
         * Dependency provider for <b>controlPlaneSql</b> with <b>org.eclipse.edc:control-plane-sql</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getControlPlaneSql() {
            return create("edc.controlPlaneSql");
        }

        /**
         * Dependency provider for <b>coreSpi</b> with <b>org.eclipse.edc:core-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCoreSpi() {
            return create("edc.coreSpi");
        }

        /**
         * Dependency provider for <b>dataPlaneCore</b> with <b>org.eclipse.edc:data-plane-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneCore() {
            return create("edc.dataPlaneCore");
        }

        /**
         * Dependency provider for <b>dataPlaneHttp</b> with <b>org.eclipse.edc:data-plane-http</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneHttp() {
            return create("edc.dataPlaneHttp");
        }

        /**
         * Dependency provider for <b>dataPlaneInstanceStoreSql</b> with <b>org.eclipse.edc:data-plane-instance-store-sql</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneInstanceStoreSql() {
            return create("edc.dataPlaneInstanceStoreSql");
        }

        /**
         * Dependency provider for <b>dataPlanePublicApiV2</b> with <b>org.eclipse.edc:data-plane-public-api-v2</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlanePublicApiV2() {
            return create("edc.dataPlanePublicApiV2");
        }

        /**
         * Dependency provider for <b>dataPlaneSelectorApi</b> with <b>org.eclipse.edc:data-plane-selector-api</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneSelectorApi() {
            return create("edc.dataPlaneSelectorApi");
        }

        /**
         * Dependency provider for <b>dataPlaneSelectorCore</b> with <b>org.eclipse.edc:data-plane-selector-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneSelectorCore() {
            return create("edc.dataPlaneSelectorCore");
        }

        /**
         * Dependency provider for <b>dataPlaneSignalingApi</b> with <b>org.eclipse.edc:data-plane-signaling-api</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneSignalingApi() {
            return create("edc.dataPlaneSignalingApi");
        }

        /**
         * Dependency provider for <b>dataPlaneStoreSql</b> with <b>org.eclipse.edc:data-plane-store-sql</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneStoreSql() {
            return create("edc.dataPlaneStoreSql");
        }

        /**
         * Dependency provider for <b>dsp</b> with <b>org.eclipse.edc:dsp</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDsp() {
            return create("edc.dsp");
        }

        /**
         * Dependency provider for <b>dspApiConfiguration</b> with <b>org.eclipse.edc:dsp-http-api-configuration</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDspApiConfiguration() {
            return create("edc.dspApiConfiguration");
        }

        /**
         * Dependency provider for <b>dspHttpCore</b> with <b>org.eclipse.edc:dsp-http-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDspHttpCore() {
            return create("edc.dspHttpCore");
        }

        /**
         * Dependency provider for <b>dspHttpSpi</b> with <b>org.eclipse.edc:dsp-http-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDspHttpSpi() {
            return create("edc.dspHttpSpi");
        }

        /**
         * Dependency provider for <b>dspNegotiationTransform</b> with <b>org.eclipse.edc:dsp-negotiation-transform</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDspNegotiationTransform() {
            return create("edc.dspNegotiationTransform");
        }

        /**
         * Dependency provider for <b>edrIndexSql</b> with <b>org.eclipse.edc:edr-index-sql</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEdrIndexSql() {
            return create("edc.edrIndexSql");
        }

        /**
         * Dependency provider for <b>edrStoreCore</b> with <b>org.eclipse.edc:edr-store-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEdrStoreCore() {
            return create("edc.edrStoreCore");
        }

        /**
         * Dependency provider for <b>edrStoreReceiver</b> with <b>org.eclipse.edc:edr-store-receiver</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEdrStoreReceiver() {
            return create("edc.edrStoreReceiver");
        }

        /**
         * Dependency provider for <b>http</b> with <b>org.eclipse.edc:http</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttp() {
            return create("edc.http");
        }

        /**
         * Dependency provider for <b>httpLib</b> with <b>org.eclipse.edc:http-lib</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttpLib() {
            return create("edc.httpLib");
        }

        /**
         * Dependency provider for <b>httpSpi</b> with <b>org.eclipse.edc:http-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttpSpi() {
            return create("edc.httpSpi");
        }

        /**
         * Dependency provider for <b>iamMock</b> with <b>org.eclipse.edc:iam-mock</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIamMock() {
            return create("edc.iamMock");
        }

        /**
         * Dependency provider for <b>identityDidCore</b> with <b>org.eclipse.edc:identity-did-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIdentityDidCore() {
            return create("edc.identityDidCore");
        }

        /**
         * Dependency provider for <b>identityDidWeb</b> with <b>org.eclipse.edc:identity-did-web</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIdentityDidWeb() {
            return create("edc.identityDidWeb");
        }

        /**
         * Dependency provider for <b>identityTrustCore</b> with <b>org.eclipse.edc:identity-trust-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIdentityTrustCore() {
            return create("edc.identityTrustCore");
        }

        /**
         * Dependency provider for <b>identityTrustIssuersConfiguration</b> with <b>org.eclipse.edc:identity-trust-issuers-configuration</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIdentityTrustIssuersConfiguration() {
            return create("edc.identityTrustIssuersConfiguration");
        }

        /**
         * Dependency provider for <b>identityTrustTransform</b> with <b>org.eclipse.edc:identity-trust-transform</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getIdentityTrustTransform() {
            return create("edc.identityTrustTransform");
        }

        /**
         * Dependency provider for <b>jerseyMicrometer</b> with <b>org.eclipse.edc:jersey-micrometer</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJerseyMicrometer() {
            return create("edc.jerseyMicrometer");
        }

        /**
         * Dependency provider for <b>jettyCore</b> with <b>org.eclipse.edc:jetty-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJettyCore() {
            return create("edc.jettyCore");
        }

        /**
         * Dependency provider for <b>jettyMicrometer</b> with <b>org.eclipse.edc:jetty-micrometer</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJettyMicrometer() {
            return create("edc.jettyMicrometer");
        }

        /**
         * Dependency provider for <b>jsonLd</b> with <b>org.eclipse.edc:json-ld</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsonLd() {
            return create("edc.jsonLd");
        }

        /**
         * Dependency provider for <b>jsonLdLib</b> with <b>org.eclipse.edc:json-ld-lib</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsonLdLib() {
            return create("edc.jsonLdLib");
        }

        /**
         * Dependency provider for <b>jsonLdSpi</b> with <b>org.eclipse.edc:json-ld-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsonLdSpi() {
            return create("edc.jsonLdSpi");
        }

        /**
         * Dependency provider for <b>junit</b> with <b>org.eclipse.edc:junit</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("edc.junit");
        }

        /**
         * Dependency provider for <b>keysLib</b> with <b>org.eclipse.edc:keys-lib</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKeysLib() {
            return create("edc.keysLib");
        }

        /**
         * Dependency provider for <b>managementApi</b> with <b>org.eclipse.edc:management-api</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getManagementApi() {
            return create("edc.managementApi");
        }

        /**
         * Dependency provider for <b>managementApiConfiguration</b> with <b>org.eclipse.edc:management-api-configuration</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getManagementApiConfiguration() {
            return create("edc.managementApiConfiguration");
        }

        /**
         * Dependency provider for <b>micrometerCore</b> with <b>org.eclipse.edc:micrometer-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMicrometerCore() {
            return create("edc.micrometerCore");
        }

        /**
         * Dependency provider for <b>oauth2Core</b> with <b>org.eclipse.edc:oauth2-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOauth2Core() {
            return create("edc.oauth2Core");
        }

        /**
         * Dependency provider for <b>oauth2Daps</b> with <b>org.eclipse.edc:oauth2-daps</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOauth2Daps() {
            return create("edc.oauth2Daps");
        }

        /**
         * Dependency provider for <b>oauth2Spi</b> with <b>org.eclipse.edc:oauth2-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOauth2Spi() {
            return create("edc.oauth2Spi");
        }

        /**
         * Dependency provider for <b>policyDefinitionApi</b> with <b>org.eclipse.edc:policy-definition-api</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPolicyDefinitionApi() {
            return create("edc.policyDefinitionApi");
        }

        /**
         * Dependency provider for <b>policyEngineSpi</b> with <b>org.eclipse.edc:policy-engine-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPolicyEngineSpi() {
            return create("edc.policyEngineSpi");
        }

        /**
         * Dependency provider for <b>policyModel</b> with <b>org.eclipse.edc:policy-model</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPolicyModel() {
            return create("edc.policyModel");
        }

        /**
         * Dependency provider for <b>policyMonitorCore</b> with <b>org.eclipse.edc:policy-monitor-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPolicyMonitorCore() {
            return create("edc.policyMonitorCore");
        }

        /**
         * Dependency provider for <b>policyMonitorStoreSql</b> with <b>org.eclipse.edc:policy-monitor-store-sql</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPolicyMonitorStoreSql() {
            return create("edc.policyMonitorStoreSql");
        }

        /**
         * Dependency provider for <b>secretsApi</b> with <b>org.eclipse.edc:secrets-api</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSecretsApi() {
            return create("edc.secretsApi");
        }

        /**
         * Dependency provider for <b>sqlCore</b> with <b>org.eclipse.edc:sql-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSqlCore() {
            return create("edc.sqlCore");
        }

        /**
         * Dependency provider for <b>sqlPoolApacheCommons</b> with <b>org.eclipse.edc:sql-pool-apache-commons</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSqlPoolApacheCommons() {
            return create("edc.sqlPoolApacheCommons");
        }

        /**
         * Dependency provider for <b>tokenCore</b> with <b>org.eclipse.edc:token-core</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTokenCore() {
            return create("edc.tokenCore");
        }

        /**
         * Dependency provider for <b>transactionLocal</b> with <b>org.eclipse.edc:transaction-local</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTransactionLocal() {
            return create("edc.transactionLocal");
        }

        /**
         * Dependency provider for <b>transferProcessApi</b> with <b>org.eclipse.edc:transfer-process-api</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTransferProcessApi() {
            return create("edc.transferProcessApi");
        }

        /**
         * Dependency provider for <b>transferPullHttpDynamicReceiver</b> with <b>org.eclipse.edc:transfer-pull-http-dynamic-receiver</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTransferPullHttpDynamicReceiver() {
            return create("edc.transferPullHttpDynamicReceiver");
        }

        /**
         * Dependency provider for <b>transferSpi</b> with <b>org.eclipse.edc:transfer-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTransferSpi() {
            return create("edc.transferSpi");
        }

        /**
         * Dependency provider for <b>transformLib</b> with <b>org.eclipse.edc:transform-lib</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTransformLib() {
            return create("edc.transformLib");
        }

        /**
         * Dependency provider for <b>transformSpi</b> with <b>org.eclipse.edc:transform-spi</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTransformSpi() {
            return create("edc.transformSpi");
        }

        /**
         * Dependency provider for <b>validatorDataAddressHttpData</b> with <b>org.eclipse.edc:validator-data-address-http-data</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getValidatorDataAddressHttpData() {
            return create("edc.validatorDataAddressHttpData");
        }

        /**
         * Dependency provider for <b>vaultHashicorp</b> with <b>org.eclipse.edc:vault-hashicorp</b> coordinates and
         * with version reference <b>edc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getVaultHashicorp() {
            return create("edc.vaultHashicorp");
        }

        /**
         * Group of libraries at <b>edc.aws</b>
         */
        public EdcAwsLibraryAccessors getAws() {
            return laccForEdcAwsLibraryAccessors;
        }

        /**
         * Group of libraries at <b>edc.azure</b>
         */
        public EdcAzureLibraryAccessors getAzure() {
            return laccForEdcAzureLibraryAccessors;
        }

    }

    public static class EdcAwsLibraryAccessors extends SubDependencyFactory {

        public EdcAwsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>dataPlaneAwsS3</b> with <b>org.eclipse.edc.aws:data-plane-aws-s3</b> coordinates and
         * with version reference <b>edcUniverse</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneAwsS3() {
            return create("edc.aws.dataPlaneAwsS3");
        }

    }

    public static class EdcAzureLibraryAccessors extends SubDependencyFactory {

        public EdcAzureLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>dataPlaneAzureStorage</b> with <b>org.eclipse.edc.azure:data-plane-azure-storage</b> coordinates and
         * with version reference <b>edcUniverse</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataPlaneAzureStorage() {
            return create("edc.azure.dataPlaneAzureStorage");
        }

        /**
         * Dependency provider for <b>vaultAzure</b> with <b>org.eclipse.edc.azure:vault-azure</b> coordinates and
         * with version reference <b>edcUniverse</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getVaultAzure() {
            return create("edc.azure.vaultAzure");
        }

    }

    public static class FindbugsLibraryAccessors extends SubDependencyFactory {

        public FindbugsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jsr305</b> with <b>com.google.code.findbugs:jsr305</b> coordinates and
         * with version reference <b>findbugs</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsr305() {
            return create("findbugs.jsr305");
        }

    }

    public static class FlexmarkLibraryAccessors extends SubDependencyFactory {

        public FlexmarkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>all</b> with <b>com.vladsch.flexmark:flexmark-all</b> coordinates and
         * with version reference <b>flexmark</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAll() {
            return create("flexmark.all");
        }

    }

    public static class FlywayLibraryAccessors extends SubDependencyFactory {

        public FlywayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.flywaydb:flyway-core</b> coordinates and
         * with version reference <b>flyway</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("flyway.core");
        }

    }

    public static class HibernateLibraryAccessors extends SubDependencyFactory {

        public HibernateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>validation</b> with <b>org.hibernate.validator:hibernate-validator</b> coordinates and
         * with version reference <b>hibernateValidator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getValidation() {
            return create("hibernate.validation");
        }

    }

    public static class JacksonLibraryAccessors extends SubDependencyFactory {

        public JacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jsr310</b> with <b>com.fasterxml.jackson.datatype:jackson-datatype-jsr310</b> coordinates and
         * with version reference <b>jacksonJsr310</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsr310() {
            return create("jackson.jsr310");
        }

    }

    public static class JakartaLibraryAccessors extends SubDependencyFactory {

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>annotationApi</b> with <b>jakarta.annotation:jakarta.annotation-api</b> coordinates and
         * with version reference <b>jakartaAnnotation</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotationApi() {
            return create("jakarta.annotationApi");
        }

        /**
         * Dependency provider for <b>el</b> with <b>org.glassfish:jakarta.el</b> coordinates and
         * with version reference <b>jakartaEl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEl() {
            return create("jakarta.el");
        }

        /**
         * Dependency provider for <b>json</b> with <b>org.glassfish:jakarta.json</b> coordinates and
         * with version reference <b>jakartaJson</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJson() {
            return create("jakarta.json");
        }

        /**
         * Dependency provider for <b>rsApi</b> with <b>jakarta.ws.rs:jakarta.ws.rs-api</b> coordinates and
         * with version reference <b>jakartaRs</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRsApi() {
            return create("jakarta.rsApi");
        }

        /**
         * Dependency provider for <b>servletApi</b> with <b>jakarta.servlet:jakarta.servlet-api</b> coordinates and
         * with version reference <b>jakartaServletApi</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getServletApi() {
            return create("jakarta.servletApi");
        }

        /**
         * Dependency provider for <b>validationApi</b> with <b>jakarta.validation:jakarta.validation-api</b> coordinates and
         * with version reference <b>jakartaValidation</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getValidationApi() {
            return create("jakarta.validationApi");
        }

    }

    public static class JooqLibraryAccessors extends SubDependencyFactory {

        public JooqLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jooq</b> with <b>org.jooq:jooq</b> coordinates and
         * with version reference <b>jooq</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJooq() {
            return create("jooq.jooq");
        }

    }

    public static class JsonUnitLibraryAccessors extends SubDependencyFactory {

        public JsonUnitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>assertj</b> with <b>net.javacrumbs.json-unit:json-unit-assertj</b> coordinates and
         * with version reference <b>jsonUnit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAssertj() {
            return create("jsonUnit.assertj");
        }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory {

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>org.junit.jupiter:junit-jupiter-api</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("junit.api");
        }

        /**
         * Dependency provider for <b>engine</b> with <b>org.junit.jupiter:junit-jupiter-engine</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEngine() {
            return create("junit.engine");
        }

        /**
         * Dependency provider for <b>params</b> with <b>org.junit.jupiter:junit-jupiter-params</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getParams() {
            return create("junit.params");
        }

    }

    public static class Log4jLibraryAccessors extends SubDependencyFactory {

        public Log4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.apache.logging.log4j:log4j-core</b> coordinates and
         * with version reference <b>log4j</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("log4j.core");
        }

        /**
         * Dependency provider for <b>jul</b> with <b>org.apache.logging.log4j:log4j-jul</b> coordinates and
         * with version reference <b>log4j</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJul() {
            return create("log4j.jul");
        }

        /**
         * Dependency provider for <b>layoutTemplateJson</b> with <b>org.apache.logging.log4j:log4j-layout-template-json</b> coordinates and
         * with version reference <b>log4j</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLayoutTemplateJson() {
            return create("log4j.layoutTemplateJson");
        }

    }

    public static class MockitoLibraryAccessors extends SubDependencyFactory {

        public MockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.mockito:mockito-core</b> coordinates and
         * with version reference <b>mockito</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("mockito.core");
        }

        /**
         * Dependency provider for <b>junitJupiter</b> with <b>org.mockito:mockito-junit-jupiter</b> coordinates and
         * with version reference <b>mockito</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunitJupiter() {
            return create("mockito.junitJupiter");
        }

        /**
         * Dependency provider for <b>kotlin</b> with <b>org.mockito.kotlin:mockito-kotlin</b> coordinates and
         * with version reference <b>mockitoKotlin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlin() {
            return create("mockito.kotlin");
        }

    }

    public static class MockserverLibraryAccessors extends SubDependencyFactory {

        public MockserverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>netty</b> with <b>org.mock-server:mockserver-netty</b> coordinates and
         * with version reference <b>mockserver</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNetty() {
            return create("mockserver.netty");
        }

    }

    public static class NimbusLibraryAccessors extends SubDependencyFactory {

        public NimbusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>joseJwt</b> with <b>com.nimbusds:nimbus-jose-jwt</b> coordinates and
         * with version reference <b>nimbus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJoseJwt() {
            return create("nimbus.joseJwt");
        }

    }

    public static class OkhttpLibraryAccessors extends SubDependencyFactory {

        public OkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>loggingInterceptor</b> with <b>com.squareup.okhttp3:logging-interceptor</b> coordinates and
         * with version reference <b>okhttp</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLoggingInterceptor() {
            return create("okhttp.loggingInterceptor");
        }

        /**
         * Dependency provider for <b>okhttp</b> with <b>com.squareup.okhttp3:okhttp</b> coordinates and
         * with version reference <b>okhttp</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() {
            return create("okhttp.okhttp");
        }

    }

    public static class OpenapiLibraryAccessors extends SubDependencyFactory {

        public OpenapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jacksonDatabindNullable</b> with <b>org.openapitools:jackson-databind-nullable</b> coordinates and
         * with version reference <b>openapiJackson</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonDatabindNullable() {
            return create("openapi.jacksonDatabindNullable");
        }

    }

    public static class RestAssuredLibraryAccessors extends SubDependencyFactory {

        public RestAssuredLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>restAssured</b> with <b>io.rest-assured:rest-assured</b> coordinates and
         * with version reference <b>restAssured</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRestAssured() {
            return create("restAssured.restAssured");
        }

    }

    public static class SquareupLibraryAccessors extends SubDependencyFactory {

        public SquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>javapoet</b> with <b>com.squareup:javapoet</b> coordinates and
         * with version reference <b>javapoet</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJavapoet() {
            return create("squareup.javapoet");
        }

        /**
         * Dependency provider for <b>kotlinpoet</b> with <b>com.squareup:kotlinpoet</b> coordinates and
         * with version reference <b>kotlinPoet</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinpoet() {
            return create("squareup.kotlinpoet");
        }

    }

    public static class SwaggerLibraryAccessors extends SubDependencyFactory {

        public SwaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>annotations</b> with <b>io.swagger:swagger-annotations</b> coordinates and
         * with version reference <b>swagger</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotations() {
            return create("swagger.annotations");
        }

        /**
         * Dependency provider for <b>annotationsJakarta</b> with <b>io.swagger.core.v3:swagger-annotations-jakarta</b> coordinates and
         * with version reference <b>swaggerCore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotationsJakarta() {
            return create("swagger.annotationsJakarta");
        }

        /**
         * Dependency provider for <b>jaxrs2Jakarta</b> with <b>io.swagger.core.v3:swagger-jaxrs2-jakarta</b> coordinates and
         * with version reference <b>swaggerCore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJaxrs2Jakarta() {
            return create("swagger.jaxrs2Jakarta");
        }

    }

    public static class T9tJooqLibraryAccessors extends SubDependencyFactory {

        public T9tJooqLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jooqPostgresqlJson</b> with <b>com.github.t9t.jooq:jooq-postgresql-json</b> coordinates and
         * with version reference <b>jooqPostgresqlJson</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJooqPostgresqlJson() {
            return create("t9tJooq.jooqPostgresqlJson");
        }

    }

    public static class TestcontainersLibraryAccessors extends SubDependencyFactory {

        public TestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>postgresql</b> with <b>org.testcontainers:postgresql</b> coordinates and
         * with version reference <b>testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPostgresql() {
            return create("testcontainers.postgresql");
        }

        /**
         * Dependency provider for <b>testcontainers</b> with <b>org.testcontainers:testcontainers</b> coordinates and
         * with version reference <b>testcontainers</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTestcontainers() {
            return create("testcontainers.testcontainers");
        }

    }

    public static class TractusLibraryAccessors extends SubDependencyFactory {

        public TractusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>azblobProvisioner</b> with <b>org.eclipse.tractusx.edc:azblob-provisioner</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAzblobProvisioner() {
            return create("tractus.azblobProvisioner");
        }

        /**
         * Dependency provider for <b>bdrsClient</b> with <b>org.eclipse.tractusx.edc:bdrs-client</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBdrsClient() {
            return create("tractus.bdrsClient");
        }

        /**
         * Dependency provider for <b>bpnValidation</b> with <b>org.eclipse.tractusx.edc:bpn-validation</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBpnValidation() {
            return create("tractus.bpnValidation");
        }

        /**
         * Dependency provider for <b>businessPartnerStoreSql</b> with <b>org.eclipse.tractusx.edc:business-partner-store-sql</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBusinessPartnerStoreSql() {
            return create("tractus.businessPartnerStoreSql");
        }

        /**
         * Dependency provider for <b>cxPolicy</b> with <b>org.eclipse.tractusx.edc:cx-policy</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCxPolicy() {
            return create("tractus.cxPolicy");
        }

        /**
         * Dependency provider for <b>dataFlowPropertiesProvider</b> with <b>org.eclipse.tractusx.edc:data-flow-properties-provider</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDataFlowPropertiesProvider() {
            return create("tractus.dataFlowPropertiesProvider");
        }

        /**
         * Dependency provider for <b>datasetBugfix</b> with <b>org.eclipse.tractusx.edc:dataset-bugfix</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDatasetBugfix() {
            return create("tractus.datasetBugfix");
        }

        /**
         * Dependency provider for <b>edcDataplaneProxyConsumerApi</b> with <b>org.eclipse.tractusx.edc:edc-dataplane-proxy-consumer-api</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEdcDataplaneProxyConsumerApi() {
            return create("tractus.edcDataplaneProxyConsumerApi");
        }

        /**
         * Dependency provider for <b>edrApiV2</b> with <b>org.eclipse.tractusx.edc:edr-api-v2</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEdrApiV2() {
            return create("tractus.edrApiV2");
        }

        /**
         * Dependency provider for <b>edrCallback</b> with <b>org.eclipse.tractusx.edc:edr-callback</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEdrCallback() {
            return create("tractus.edrCallback");
        }

        /**
         * Dependency provider for <b>edrCore</b> with <b>org.eclipse.tractusx.edc:edr-core</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEdrCore() {
            return create("tractus.edrCore");
        }

        /**
         * Dependency provider for <b>edrIndexLockSql</b> with <b>org.eclipse.tractusx.edc:edr-index-lock-sql</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEdrIndexLockSql() {
            return create("tractus.edrIndexLockSql");
        }

        /**
         * Dependency provider for <b>jsonLdCore</b> with <b>org.eclipse.tractusx.edc:json-ld-core</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsonLdCore() {
            return create("tractus.jsonLdCore");
        }

        /**
         * Dependency provider for <b>pipelineService</b> with <b>org.eclipse.tractusx.edc:pipeline-service</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPipelineService() {
            return create("tractus.pipelineService");
        }

        /**
         * Dependency provider for <b>provisionAdditionalHeaders</b> with <b>org.eclipse.tractusx.edc:provision-additional-headers</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getProvisionAdditionalHeaders() {
            return create("tractus.provisionAdditionalHeaders");
        }

        /**
         * Dependency provider for <b>tokenRefreshApi</b> with <b>org.eclipse.tractusx.edc:token-refresh-api</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTokenRefreshApi() {
            return create("tractus.tokenRefreshApi");
        }

        /**
         * Dependency provider for <b>tokenRefreshCore</b> with <b>org.eclipse.tractusx.edc:token-refresh-core</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTokenRefreshCore() {
            return create("tractus.tokenRefreshCore");
        }

        /**
         * Dependency provider for <b>tokenrefreshHandler</b> with <b>org.eclipse.tractusx.edc:tokenrefresh-handler</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTokenrefreshHandler() {
            return create("tractus.tokenrefreshHandler");
        }

        /**
         * Dependency provider for <b>transferDataplaneSignaling</b> with <b>org.eclipse.tractusx.edc:transfer-dataplane-signaling</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTransferDataplaneSignaling() {
            return create("tractus.transferDataplaneSignaling");
        }

        /**
         * Dependency provider for <b>txIatp</b> with <b>org.eclipse.tractusx.edc:tx-iatp</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTxIatp() {
            return create("tractus.txIatp");
        }

        /**
         * Dependency provider for <b>txIatpStsDim</b> with <b>org.eclipse.tractusx.edc:tx-iatp-sts-dim</b> coordinates and
         * with version reference <b>tractus</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTxIatpStsDim() {
            return create("tractus.txIatpStsDim");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>assertj</b> with value <b>3.23.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAssertj() { return getVersion("assertj"); }

        /**
         * Version alias <b>awaitility</b> with value <b>4.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAwaitility() { return getVersion("awaitility"); }

        /**
         * Version alias <b>commonsCollections</b> with value <b>4.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCommonsCollections() { return getVersion("commonsCollections"); }

        /**
         * Version alias <b>commonsIo</b> with value <b>2.14.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCommonsIo() { return getVersion("commonsIo"); }

        /**
         * Version alias <b>commonsLang</b> with value <b>3.13.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCommonsLang() { return getVersion("commonsLang"); }

        /**
         * Version alias <b>edc</b> with value <b>0.7.2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEdc() { return getVersion("edc"); }

        /**
         * Version alias <b>edcUniverse</b> with value <b>0.7.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEdcUniverse() { return getVersion("edcUniverse"); }

        /**
         * Version alias <b>findbugs</b> with value <b>3.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getFindbugs() { return getVersion("findbugs"); }

        /**
         * Version alias <b>flexmark</b> with value <b>0.64.8</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getFlexmark() { return getVersion("flexmark"); }

        /**
         * Version alias <b>flyway</b> with value <b>9.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getFlyway() { return getVersion("flyway"); }

        /**
         * Version alias <b>flywayPlugin</b> with value <b>9.21.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getFlywayPlugin() { return getVersion("flywayPlugin"); }

        /**
         * Version alias <b>freefairLombokPlugin</b> with value <b>8.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getFreefairLombokPlugin() { return getVersion("freefairLombokPlugin"); }

        /**
         * Version alias <b>gson</b> with value <b>2.10.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGson() { return getVersion("gson"); }

        /**
         * Version alias <b>gsonFire</b> with value <b>1.8.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGsonFire() { return getVersion("gsonFire"); }

        /**
         * Version alias <b>hibernateValidator</b> with value <b>8.0.1.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHibernateValidator() { return getVersion("hibernateValidator"); }

        /**
         * Version alias <b>jacksonJsr310</b> with value <b>2.18.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJacksonJsr310() { return getVersion("jacksonJsr310"); }

        /**
         * Version alias <b>jakartaAnnotation</b> with value <b>1.3.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJakartaAnnotation() { return getVersion("jakartaAnnotation"); }

        /**
         * Version alias <b>jakartaEl</b> with value <b>4.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJakartaEl() { return getVersion("jakartaEl"); }

        /**
         * Version alias <b>jakartaJson</b> with value <b>2.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJakartaJson() { return getVersion("jakartaJson"); }

        /**
         * Version alias <b>jakartaRs</b> with value <b>3.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJakartaRs() { return getVersion("jakartaRs"); }

        /**
         * Version alias <b>jakartaServletApi</b> with value <b>5.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJakartaServletApi() { return getVersion("jakartaServletApi"); }

        /**
         * Version alias <b>jakartaValidation</b> with value <b>3.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJakartaValidation() { return getVersion("jakartaValidation"); }

        /**
         * Version alias <b>java</b> with value <b>17</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJava() { return getVersion("java"); }

        /**
         * Version alias <b>javapoet</b> with value <b>1.13.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJavapoet() { return getVersion("javapoet"); }

        /**
         * Version alias <b>jooq</b> with value <b>3.18.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJooq() { return getVersion("jooq"); }

        /**
         * Version alias <b>jooqPlugin</b> with value <b>7.1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJooqPlugin() { return getVersion("jooqPlugin"); }

        /**
         * Version alias <b>jooqPostgresqlJson</b> with value <b>4.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJooqPostgresqlJson() { return getVersion("jooqPostgresqlJson"); }

        /**
         * Version alias <b>jsonUnit</b> with value <b>3.2.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJsonUnit() { return getVersion("jsonUnit"); }

        /**
         * Version alias <b>junit</b> with value <b>5.10.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>kotlin</b> with value <b>2.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("kotlin"); }

        /**
         * Version alias <b>kotlinPoet</b> with value <b>2.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlinPoet() { return getVersion("kotlinPoet"); }

        /**
         * Version alias <b>log4j</b> with value <b>2.20.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLog4j() { return getVersion("log4j"); }

        /**
         * Version alias <b>lombok</b> with value <b>1.18.30</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLombok() { return getVersion("lombok"); }

        /**
         * Version alias <b>mockito</b> with value <b>5.12.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMockito() { return getVersion("mockito"); }

        /**
         * Version alias <b>mockitoKotlin</b> with value <b>5.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMockitoKotlin() { return getVersion("mockitoKotlin"); }

        /**
         * Version alias <b>mockserver</b> with value <b>5.15.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMockserver() { return getVersion("mockserver"); }

        /**
         * Version alias <b>nimbus</b> with value <b>9.37.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNimbus() { return getVersion("nimbus"); }

        /**
         * Version alias <b>npmVersion</b> with value <b>8.15.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNpmVersion() { return getVersion("npmVersion"); }

        /**
         * Version alias <b>okhttp</b> with value <b>4.12.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getOkhttp() { return getVersion("okhttp"); }

        /**
         * Version alias <b>openapiGenerator</b> with value <b>7.10.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getOpenapiGenerator() { return getVersion("openapiGenerator"); }

        /**
         * Version alias <b>openapiJackson</b> with value <b>0.2.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getOpenapiJackson() { return getVersion("openapiJackson"); }

        /**
         * Version alias <b>postgres</b> with value <b>42.4.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPostgres() { return getVersion("postgres"); }

        /**
         * Version alias <b>postgresDbImage</b> with value <b>postgres:16-alpine</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPostgresDbImage() { return getVersion("postgresDbImage"); }

        /**
         * Version alias <b>restAssured</b> with value <b>5.5.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRestAssured() { return getVersion("restAssured"); }

        /**
         * Version alias <b>shadow</b> with value <b>7.1.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getShadow() { return getVersion("shadow"); }

        /**
         * Version alias <b>sovityCeGroupName</b> with value <b>de.sovity.edc</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSovityCeGroupName() { return getVersion("sovityCeGroupName"); }

        /**
         * Version alias <b>swagger</b> with value <b>1.6.12</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSwagger() { return getVersion("swagger"); }

        /**
         * Version alias <b>swaggerCore</b> with value <b>2.2.26</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSwaggerCore() { return getVersion("swaggerCore"); }

        /**
         * Version alias <b>taskinfo</b> with value <b>2.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTaskinfo() { return getVersion("taskinfo"); }

        /**
         * Version alias <b>testcontainers</b> with value <b>1.19.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTestcontainers() { return getVersion("testcontainers"); }

        /**
         * Version alias <b>titaniumLd</b> with value <b>1.3.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTitaniumLd() { return getVersion("titaniumLd"); }

        /**
         * Version alias <b>tractus</b> with value <b>0.7.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTractus() { return getVersion("tractus"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>testUtils</b> which contains the following dependencies:
         * <ul>
         *    <li>org.assertj:assertj-core</li>
         *    <li>org.awaitility:awaitility</li>
         *    <li>org.junit.jupiter:junit-jupiter-api</li>
         *    <li>org.junit.jupiter:junit-jupiter-engine</li>
         *    <li>org.junit.jupiter:junit-jupiter-params</li>
         *    <li>net.javacrumbs.json-unit:json-unit-assertj</li>
         *    <li>org.mockito:mockito-core</li>
         *    <li>org.mockito.kotlin:mockito-kotlin</li>
         *    <li>org.mockito:mockito-junit-jupiter</li>
         *    <li>org.mock-server:mockserver-netty</li>
         *    <li>io.rest-assured:rest-assured</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog libs.versions.toml
         */
        public Provider<ExternalModuleDependencyBundle> getTestUtils() {
            return createBundle("testUtils");
        }

    }

    public static class PluginAccessors extends PluginFactory {
        private final FreefairPluginAccessors paccForFreefairPluginAccessors = new FreefairPluginAccessors(providers, config);
        private final OpenapiPluginAccessors paccForOpenapiPluginAccessors = new OpenapiPluginAccessors(providers, config);
        private final SwaggerPluginAccessors paccForSwaggerPluginAccessors = new SwaggerPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>flyway</b> with plugin id <b>org.flywaydb.flyway</b> and
         * with version reference <b>flywayPlugin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getFlyway() { return createPlugin("flyway"); }

        /**
         * Plugin provider for <b>jooq</b> with plugin id <b>nu.studer.jooq</b> and
         * with version reference <b>jooqPlugin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getJooq() { return createPlugin("jooq"); }

        /**
         * Plugin provider for <b>shadow</b> with plugin id <b>com.github.johnrengelman.shadow</b> and
         * with version reference <b>shadow</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getShadow() { return createPlugin("shadow"); }

        /**
         * Plugin provider for <b>taskinfo</b> with plugin id <b>org.barfuin.gradle.taskinfo</b> and
         * with version reference <b>taskinfo</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getTaskinfo() { return createPlugin("taskinfo"); }

        /**
         * Group of plugins at <b>plugins.freefair</b>
         */
        public FreefairPluginAccessors getFreefair() {
            return paccForFreefairPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.openapi</b>
         */
        public OpenapiPluginAccessors getOpenapi() {
            return paccForOpenapiPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.swagger</b>
         */
        public SwaggerPluginAccessors getSwagger() {
            return paccForSwaggerPluginAccessors;
        }

    }

    public static class FreefairPluginAccessors extends PluginFactory {

        public FreefairPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>freefair.lombok</b> with plugin id <b>io.freefair.lombok</b> and
         * with version reference <b>freefairLombokPlugin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getLombok() { return createPlugin("freefair.lombok"); }

    }

    public static class OpenapiPluginAccessors extends PluginFactory {

        public OpenapiPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>openapi.generator</b> with plugin id <b>org.openapi.generator</b> and
         * with version reference <b>openapiGenerator</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getGenerator() { return createPlugin("openapi.generator"); }

    }

    public static class SwaggerPluginAccessors extends PluginFactory {

        public SwaggerPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>swagger.plugin</b> with plugin id <b>io.swagger.core.v3.swagger-gradle-plugin</b> and
         * with version reference <b>swaggerCore</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getPlugin() { return createPlugin("swagger.plugin"); }

    }

}
