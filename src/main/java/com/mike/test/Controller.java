package com.mike.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

import java.util.List;

class Person {
  @JsonProperty
  String name;
}
class Greeting {
  @JsonProperty
  Person person;
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

  @RequestMapping(value = "/echo", method = RequestMethod.POST)
  public List<Greeting> echoAll(@RequestBody List<Greeting> greetings) {
    return greetings;
  }
}