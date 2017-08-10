package com.mike.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

class Greeting {
  @JsonProperty String content;
}

@RestController
public class Controller {

  @RequestMapping(value = "/information", method = RequestMethod.GET)
  public String getInformation() {
    return "The Title.";
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String getIndex() {
    return "greeting";
  }

  @RequestMapping(value = "/greeting", method = RequestMethod.POST)
  public @ResponseBody
  Greeting greeting(@RequestBody Greeting greeting) {
    return greeting;
  }
}