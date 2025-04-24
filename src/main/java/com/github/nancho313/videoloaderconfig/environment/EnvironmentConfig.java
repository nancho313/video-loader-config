package com.github.nancho313.videoloaderconfig.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvironmentConfig {

  @Bean
  public MapConfigurationRepository mapConfigurationRepository() {
    return new MapConfigurationRepository();
  }
}
