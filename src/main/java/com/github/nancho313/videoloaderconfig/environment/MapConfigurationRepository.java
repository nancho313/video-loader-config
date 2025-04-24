package com.github.nancho313.videoloaderconfig.environment;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.core.Ordered;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapConfigurationRepository implements EnvironmentRepository, Ordered {

  private final Map<String, Map<String, String>> properties = new ConcurrentHashMap<>();

  @Override
  public int getOrder() {
    return 0;
  }

  @Override
  public Environment findOne(String application, String profile, String label) {

    Environment environment = new Environment(application, profile);
    environment.add(new PropertySource("propertySource", properties.get(application)));
    return environment;
  }

  public void updateProperties(Map<String, String> newProperties, String application) {

    this.properties.put(application, newProperties);
  }

}
