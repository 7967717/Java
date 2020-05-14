package io.rr.restjson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ControllerOne {

    @GetMapping
    public String get() {
        return "get response";
    }

    @PostMapping
    public String post(@RequestBody Person person) {
        return "The method returns " + person;
    }
}
