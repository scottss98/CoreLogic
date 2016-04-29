package com.triples.corelogic.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "statistics_services")
public class StatisticsServiceConfig extends ServiceConfig {

}
