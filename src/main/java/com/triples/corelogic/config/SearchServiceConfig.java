package com.triples.corelogic.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "search_services")
public class SearchServiceConfig extends ServiceConfig {

}
