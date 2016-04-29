package com.triples.corelogic.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "charts_services")
public class ChartServiceConfig extends ServiceConfig {

}
