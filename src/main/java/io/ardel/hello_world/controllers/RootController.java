package io.ardel.hello_world;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RootController {

  @RequestMapping("/")
  public String index() {
    return "Greetings from Hello World API!";
  }
} 
