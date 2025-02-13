package com.example.nginxbackendspringboot;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health")
public class HealthController {

  private final String uniqueId = UUID.randomUUID().toString();

  @GetMapping()
  public String checkHealth() {
    return "Server ID: " + uniqueId;
  }
}
