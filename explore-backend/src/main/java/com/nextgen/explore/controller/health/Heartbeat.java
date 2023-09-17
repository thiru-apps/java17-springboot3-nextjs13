package com.nextgen.explore.controller.health;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Heartbeat {

  @GetMapping("/ping")
  public String ping(){
    return "Pong";
  }

}
