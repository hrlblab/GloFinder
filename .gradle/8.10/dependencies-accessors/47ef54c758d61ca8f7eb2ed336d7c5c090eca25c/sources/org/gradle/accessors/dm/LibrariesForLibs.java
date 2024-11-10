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
    private final BioimageioLibraryAccessors laccForBioimageioLibraryAccessors = new BioimageioLibraryAccessors(owner);
    private final CommonmarkLibraryAccessors laccForCommonmarkLibraryAccessors = new CommonmarkLibraryAccessors(owner);
    private final CommonsLibraryAccessors laccForCommonsLibraryAccessors = new CommonsLibraryAccessors(owner);
    private final CudaLibraryAccessors laccForCudaLibraryAccessors = new CudaLibraryAccessors(owner);
    private final GroovyLibraryAccessors laccForGroovyLibraryAccessors = new GroovyLibraryAccessors(owner);
    private final IkonliLibraryAccessors laccForIkonliLibraryAccessors = new IkonliLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final LogviewerLibraryAccessors laccForLogviewerLibraryAccessors = new LogviewerLibraryAccessors(owner);
    private final OpencvLibraryAccessors laccForOpencvLibraryAccessors = new OpencvLibraryAccessors(owner);
    private final QupathLibraryAccessors laccForQupathLibraryAccessors = new QupathLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>controlsfx</b> with <b>org.controlsfx:controlsfx</b> coordinates and
     * with version reference <b>controlsFX</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getControlsfx() {
        return create("controlsfx");
    }

    /**
     * Dependency provider for <b>deepJavaLibrary</b> with <b>ai.djl:api</b> coordinates and
     * with version reference <b>deepJavaLibrary</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getDeepJavaLibrary() {
        return create("deepJavaLibrary");
    }

    /**
     * Dependency provider for <b>gson</b> with <b>com.google.code.gson:gson</b> coordinates and
     * with version reference <b>gson</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getGson() {
        return create("gson");
    }

    /**
     * Dependency provider for <b>guava</b> with <b>com.google.guava:guava</b> coordinates and
     * with version reference <b>guava</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getGuava() {
        return create("guava");
    }

    /**
     * Dependency provider for <b>imagej</b> with <b>net.imagej:ij</b> coordinates and
     * with version reference <b>imagej</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getImagej() {
        return create("imagej");
    }

    /**
     * Dependency provider for <b>javacpp</b> with <b>org.bytedeco:javacpp</b> coordinates and
     * with version reference <b>javacpp</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getJavacpp() {
        return create("javacpp");
    }

    /**
     * Dependency provider for <b>jfreesvg</b> with <b>org.jfree:org.jfree.svg</b> coordinates and
     * with version reference <b>jfreeSvg</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getJfreesvg() {
        return create("jfreesvg");
    }

    /**
     * Dependency provider for <b>jfxtras</b> with <b>org.jfxtras:jfxtras-menu</b> coordinates and
     * with version reference <b>jfxtras</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getJfxtras() {
        return create("jfxtras");
    }

    /**
     * Dependency provider for <b>jna</b> with <b>net.java.dev.jna:jna</b> coordinates and
     * with version reference <b>jna</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getJna() {
        return create("jna");
    }

    /**
     * Dependency provider for <b>jts</b> with <b>org.locationtech.jts:jts-core</b> coordinates and
     * with version reference <b>jts</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getJts() {
        return create("jts");
    }

    /**
     * Dependency provider for <b>logback</b> with <b>ch.qos.logback:logback-classic</b> coordinates and
     * with version reference <b>logback</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getLogback() {
        return create("logback");
    }

    /**
     * Dependency provider for <b>picocli</b> with <b>info.picocli:picocli</b> coordinates and
     * with version reference <b>picocli</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getPicocli() {
        return create("picocli");
    }

    /**
     * Dependency provider for <b>richtextfx</b> with <b>org.fxmisc.richtext:richtextfx</b> coordinates and
     * with version reference <b>richtextfx</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getRichtextfx() {
        return create("richtextfx");
    }

    /**
     * Dependency provider for <b>slf4j</b> with <b>org.slf4j:slf4j-api</b> coordinates and
     * with version reference <b>slf4j</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getSlf4j() {
        return create("slf4j");
    }

    /**
     * Dependency provider for <b>snakeyaml</b> with <b>org.yaml:snakeyaml</b> coordinates and
     * with version reference <b>snakeyaml</b>
     * <p>
     * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
     */
    public Provider<MinimalExternalModuleDependency> getSnakeyaml() {
        return create("snakeyaml");
    }

    /**
     * Group of libraries at <b>bioimageio</b>
     */
    public BioimageioLibraryAccessors getBioimageio() {
        return laccForBioimageioLibraryAccessors;
    }

    /**
     * Group of libraries at <b>commonmark</b>
     */
    public CommonmarkLibraryAccessors getCommonmark() {
        return laccForCommonmarkLibraryAccessors;
    }

    /**
     * Group of libraries at <b>commons</b>
     */
    public CommonsLibraryAccessors getCommons() {
        return laccForCommonsLibraryAccessors;
    }

    /**
     * Group of libraries at <b>cuda</b>
     */
    public CudaLibraryAccessors getCuda() {
        return laccForCudaLibraryAccessors;
    }

    /**
     * Group of libraries at <b>groovy</b>
     */
    public GroovyLibraryAccessors getGroovy() {
        return laccForGroovyLibraryAccessors;
    }

    /**
     * Group of libraries at <b>ikonli</b>
     */
    public IkonliLibraryAccessors getIkonli() {
        return laccForIkonliLibraryAccessors;
    }

    /**
     * Group of libraries at <b>junit</b>
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>logviewer</b>
     */
    public LogviewerLibraryAccessors getLogviewer() {
        return laccForLogviewerLibraryAccessors;
    }

    /**
     * Group of libraries at <b>opencv</b>
     */
    public OpencvLibraryAccessors getOpencv() {
        return laccForOpencvLibraryAccessors;
    }

    /**
     * Group of libraries at <b>qupath</b>
     */
    public QupathLibraryAccessors getQupath() {
        return laccForQupathLibraryAccessors;
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

    public static class BioimageioLibraryAccessors extends SubDependencyFactory {

        public BioimageioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>spec</b> with <b>io.github.qupath:qupath-bioimageio-spec</b> coordinates and
         * with version reference <b>bioimageIoSpec</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getSpec() {
            return create("bioimageio.spec");
        }

    }

    public static class CommonmarkLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public CommonmarkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>commonmark</b> with <b>org.commonmark:commonmark</b> coordinates and
         * with version reference <b>commonmark</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("commonmark");
        }

        /**
         * Dependency provider for <b>yaml</b> with <b>org.commonmark:commonmark-ext-yaml-front-matter</b> coordinates and
         * with version reference <b>commonmark</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getYaml() {
            return create("commonmark.yaml");
        }

    }

    public static class CommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>math</b> with <b>org.apache.commons:commons-math3</b> coordinates and
         * with version reference <b>commonsMath3</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getMath() {
            return create("commons.math");
        }

        /**
         * Dependency provider for <b>text</b> with <b>org.apache.commons:commons-text</b> coordinates and
         * with version reference <b>commonsText</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getText() {
            return create("commons.text");
        }

    }

    public static class CudaLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public CudaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>cuda</b> with <b>org.bytedeco:cuda-platform</b> coordinates and
         * with version reference <b>cuda</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("cuda");
        }

        /**
         * Dependency provider for <b>redist</b> with <b>org.bytedeco:cuda-platform-redist</b> coordinates and
         * with version reference <b>cuda</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getRedist() {
            return create("cuda.redist");
        }

    }

    public static class GroovyLibraryAccessors extends SubDependencyFactory {

        public GroovyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.apache.groovy:groovy</b> coordinates and
         * with version reference <b>groovy</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("groovy.core");
        }

        /**
         * Dependency provider for <b>jsr223</b> with <b>org.apache.groovy:groovy-jsr223</b> coordinates and
         * with version reference <b>groovy</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getJsr223() {
            return create("groovy.jsr223");
        }

        /**
         * Dependency provider for <b>xml</b> with <b>org.apache.groovy:groovy-xml</b> coordinates and
         * with version reference <b>groovy</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getXml() {
            return create("groovy.xml");
        }

    }

    public static class IkonliLibraryAccessors extends SubDependencyFactory {

        public IkonliLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ionicons4</b> with <b>org.kordamp.ikonli:ikonli-ionicons4-pack</b> coordinates and
         * with version reference <b>ikonli</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getIonicons4() {
            return create("ikonli.ionicons4");
        }

        /**
         * Dependency provider for <b>javafx</b> with <b>org.kordamp.ikonli:ikonli-javafx</b> coordinates and
         * with version reference <b>ikonli</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getJavafx() {
            return create("ikonli.javafx");
        }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit</b> with <b>org.junit.jupiter:junit-jupiter</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("junit");
        }

        /**
         * Dependency provider for <b>platform</b> with <b>org.junit.platform:junit-platform-launcher</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getPlatform() {
            return create("junit.platform");
        }

    }

    public static class LogviewerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public LogviewerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>logviewer</b> with <b>io.github.qupath:logviewer-ui-main</b> coordinates and
         * with version reference <b>logviewer</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("logviewer");
        }

        /**
         * Dependency provider for <b>console</b> with <b>io.github.qupath:logviewer-ui-textarea</b> coordinates and
         * with version reference <b>logviewer</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getConsole() {
            return create("logviewer.console");
        }

        /**
         * Dependency provider for <b>logback</b> with <b>io.github.qupath:logviewer-logging-logback</b> coordinates and
         * with version reference <b>logviewer</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getLogback() {
            return create("logviewer.logback");
        }

        /**
         * Dependency provider for <b>rich</b> with <b>io.github.qupath:logviewer-ui-richtextfx</b> coordinates and
         * with version reference <b>logviewer</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getRich() {
            return create("logviewer.rich");
        }

    }

    public static class OpencvLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OpencvLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>opencv</b> with <b>org.bytedeco:opencv-platform</b> coordinates and
         * with version reference <b>opencv</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("opencv");
        }

        /**
         * Dependency provider for <b>gpu</b> with <b>org.bytedeco:opencv-platform-gpu</b> coordinates and
         * with version reference <b>opencv</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getGpu() {
            return create("opencv.gpu");
        }

    }

    public static class QupathLibraryAccessors extends SubDependencyFactory {

        public QupathLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>fxtras</b> with <b>io.github.qupath:qupath-fxtras</b> coordinates and
         * with version reference <b>qupath.fxtras</b>
         * <p>
         * This dependency was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<MinimalExternalModuleDependency> getFxtras() {
            return create("qupath.fxtras");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final QupathVersionAccessors vaccForQupathVersionAccessors = new QupathVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>bioformats</b> with value <b>7.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getBioformats() { return getVersion("bioformats"); }

        /**
         * Version alias <b>bioimageIoSpec</b> with value <b>0.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getBioimageIoSpec() { return getVersion("bioimageIoSpec"); }

        /**
         * Version alias <b>commonmark</b> with value <b>0.21.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getCommonmark() { return getVersion("commonmark"); }

        /**
         * Version alias <b>commonsMath3</b> with value <b>3.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getCommonsMath3() { return getVersion("commonsMath3"); }

        /**
         * Version alias <b>commonsText</b> with value <b>1.10.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getCommonsText() { return getVersion("commonsText"); }

        /**
         * Version alias <b>controlsFX</b> with value <b>11.1.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getControlsFX() { return getVersion("controlsFX"); }

        /**
         * Version alias <b>cuda</b> with value <b>11.8-8.6-1.5.8</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getCuda() { return getVersion("cuda"); }

        /**
         * Version alias <b>deepJavaLibrary</b> with value <b>0.24.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getDeepJavaLibrary() { return getVersion("deepJavaLibrary"); }

        /**
         * Version alias <b>groovy</b> with value <b>4.0.15</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getGroovy() { return getVersion("groovy"); }

        /**
         * Version alias <b>gson</b> with value <b>2.10.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getGson() { return getVersion("gson"); }

        /**
         * Version alias <b>guava</b> with value <b>32.1.3-jre</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getGuava() { return getVersion("guava"); }

        /**
         * Version alias <b>ikonli</b> with value <b>12.3.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getIkonli() { return getVersion("ikonli"); }

        /**
         * Version alias <b>imagej</b> with value <b>1.54f</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getImagej() { return getVersion("imagej"); }

        /**
         * Version alias <b>javacpp</b> with value <b>1.5.8</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJavacpp() { return getVersion("javacpp"); }

        /**
         * Version alias <b>javacppgradle</b> with value <b>1.5.9</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJavacppgradle() { return getVersion("javacppgradle"); }

        /**
         * Version alias <b>javafx</b> with value <b>20</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJavafx() { return getVersion("javafx"); }

        /**
         * Version alias <b>jdk</b> with value <b>17</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJdk() { return getVersion("jdk"); }

        /**
         * Version alias <b>jfreeSvg</b> with value <b>5.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJfreeSvg() { return getVersion("jfreeSvg"); }

        /**
         * Version alias <b>jfxtras</b> with value <b>17-r1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJfxtras() { return getVersion("jfxtras"); }

        /**
         * Version alias <b>jna</b> with value <b>5.13.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJna() { return getVersion("jna"); }

        /**
         * Version alias <b>jts</b> with value <b>1.19.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJts() { return getVersion("jts"); }

        /**
         * Version alias <b>junit</b> with value <b>5.9.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>logback</b> with value <b>1.3.11</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getLogback() { return getVersion("logback"); }

        /**
         * Version alias <b>logviewer</b> with value <b>0.1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getLogviewer() { return getVersion("logviewer"); }

        /**
         * Version alias <b>opencv</b> with value <b>4.6.0-1.5.8</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getOpencv() { return getVersion("opencv"); }

        /**
         * Version alias <b>openslide</b> with value <b>4.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getOpenslide() { return getVersion("openslide"); }

        /**
         * Version alias <b>picocli</b> with value <b>4.7.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getPicocli() { return getVersion("picocli"); }

        /**
         * Version alias <b>richtextfx</b> with value <b>0.11.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getRichtextfx() { return getVersion("richtextfx"); }

        /**
         * Version alias <b>slf4j</b> with value <b>2.0.9</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getSlf4j() { return getVersion("slf4j"); }

        /**
         * Version alias <b>snakeyaml</b> with value <b>2.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getSnakeyaml() { return getVersion("snakeyaml"); }

        /**
         * Group of versions at <b>versions.qupath</b>
         */
        public QupathVersionAccessors getQupath() {
            return vaccForQupathVersionAccessors;
        }

    }

    public static class QupathVersionAccessors extends VersionFactory  {

        public QupathVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>qupath.fxtras</b> with value <b>0.1.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<String> getFxtras() { return getVersion("qupath.fxtras"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final OpencvBundleAccessors baccForOpencvBundleAccessors = new OpencvBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>groovy</b> which contains the following dependencies:
         * <ul>
         *    <li>org.apache.groovy:groovy</li>
         *    <li>org.apache.groovy:groovy-jsr223</li>
         *    <li>org.apache.groovy:groovy-xml</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> getGroovy() {
            return createBundle("groovy");
        }

        /**
         * Dependency bundle provider for <b>ikonli</b> which contains the following dependencies:
         * <ul>
         *    <li>org.kordamp.ikonli:ikonli-javafx</li>
         *    <li>org.kordamp.ikonli:ikonli-ionicons4-pack</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> getIkonli() {
            return createBundle("ikonli");
        }

        /**
         * Dependency bundle provider for <b>logging</b> which contains the following dependencies:
         * <ul>
         *    <li>org.slf4j:slf4j-api</li>
         *    <li>ch.qos.logback:logback-classic</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> getLogging() {
            return createBundle("logging");
        }

        /**
         * Dependency bundle provider for <b>logviewer</b> which contains the following dependencies:
         * <ul>
         *    <li>io.github.qupath:logviewer-ui-main</li>
         *    <li>io.github.qupath:logviewer-ui-textarea</li>
         *    <li>io.github.qupath:logviewer-ui-richtextfx</li>
         *    <li>io.github.qupath:logviewer-logging-logback</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> getLogviewer() {
            return createBundle("logviewer");
        }

        /**
         * Dependency bundle provider for <b>markdown</b> which contains the following dependencies:
         * <ul>
         *    <li>org.commonmark:commonmark</li>
         *    <li>org.commonmark:commonmark-ext-yaml-front-matter</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> getMarkdown() {
            return createBundle("markdown");
        }

        /**
         * Dependency bundle provider for <b>yaml</b> which contains the following dependencies:
         * <ul>
         *    <li>org.yaml:snakeyaml</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> getYaml() {
            return createBundle("yaml");
        }

        /**
         * Group of bundles at <b>bundles.opencv</b>
         */
        public OpencvBundleAccessors getOpencv() {
            return baccForOpencvBundleAccessors;
        }

    }

    public static class OpencvBundleAccessors extends BundleFactory  implements BundleNotationSupplier{

        public OpencvBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Dependency bundle provider for <b>opencv</b> which contains the following dependencies:
         * <ul>
         *    <li>org.bytedeco:javacpp</li>
         *    <li>org.bytedeco:opencv-platform</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> asProvider() {
            return createBundle("opencv");
        }

        /**
         * Dependency bundle provider for <b>opencv.cuda</b> which contains the following dependencies:
         * <ul>
         *    <li>org.bytedeco:javacpp</li>
         *    <li>org.bytedeco:opencv-platform-gpu</li>
         *    <li>org.bytedeco:cuda-platform</li>
         *    <li>org.bytedeco:cuda-platform-redist</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> getCuda() {
            return createBundle("opencv.cuda");
        }

        /**
         * Dependency bundle provider for <b>opencv.gpu</b> which contains the following dependencies:
         * <ul>
         *    <li>org.bytedeco:javacpp</li>
         *    <li>org.bytedeco:opencv-platform-gpu</li>
         *    <li>org.bytedeco:cuda-platform</li>
         * </ul>
         * <p>
         * This bundle was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<ExternalModuleDependencyBundle> getGpu() {
            return createBundle("opencv.gpu");
        }

    }

    public static class PluginAccessors extends PluginFactory {
        private final LicensePluginAccessors paccForLicensePluginAccessors = new LicensePluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>javacpp</b> with plugin id <b>org.bytedeco.gradle-javacpp-platform</b> and
         * with version reference <b>javacppgradle</b>
         * <p>
         * This plugin was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<PluginDependency> getJavacpp() { return createPlugin("javacpp"); }

        /**
         * Plugin provider for <b>javafx</b> with plugin id <b>org.openjfx.javafxplugin</b> and
         * with version <b>0.1.0</b>
         * <p>
         * This plugin was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<PluginDependency> getJavafx() { return createPlugin("javafx"); }

        /**
         * Plugin provider for <b>jpackage</b> with plugin id <b>org.beryx.runtime</b> and
         * with version <b>1.13.0</b>
         * <p>
         * This plugin was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<PluginDependency> getJpackage() { return createPlugin("jpackage"); }

        /**
         * Group of plugins at <b>plugins.license</b>
         */
        public LicensePluginAccessors getLicense() {
            return paccForLicensePluginAccessors;
        }

    }

    public static class LicensePluginAccessors extends PluginFactory {

        public LicensePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>license.report</b> with plugin id <b>com.github.jk1.dependency-license-report</b> and
         * with version <b>2.5</b>
         * <p>
         * This plugin was declared in catalog io.github.qupath:qupath-catalog:0.5.0
         */
        public Provider<PluginDependency> getReport() { return createPlugin("license.report"); }

    }

}
