package com.springboot.locations_deployment.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring")
public class SpringPropertiesConfiguration {

    private DatasourceConfiguration datasourceConfiguration = new DatasourceConfiguration();

    public DatasourceConfiguration getDatasourceConfiguration() {
        return datasourceConfiguration;
    }

    public void setDatasourceConfiguration(DatasourceConfiguration datasourceConfiguration) {
        this.datasourceConfiguration = datasourceConfiguration;
    }

    @Override
    public String toString() {
        return "SpringPropertiesConfiguration [datasourceConfiguration=" + datasourceConfiguration + "]";
    }

    
}
