package com.github.nancho313.videoloaderconfig.contract;

import com.github.nancho313.videoloaderconfig.environment.MapConfigurationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/env")
@RequiredArgsConstructor
public class VideoLoaderConfigController {

  private final MapConfigurationRepository mapConfigurationRepository;

  @PostMapping("/{application}")
  public ResponseEntity<String> updateProperties(@RequestBody Map<String, String> newProperties, @PathVariable String application) {

    mapConfigurationRepository.updateProperties(newProperties, application);
    return ResponseEntity.ok("Properties updated.");
  }

}
