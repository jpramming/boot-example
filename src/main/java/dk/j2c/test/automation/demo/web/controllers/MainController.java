package dk.j2c.test.automation.demo.web.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String mainPage() {
        return "{ \"message\": \"Demo app landing page\" }";
    }
    
    @GetMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
    public String status() {
        return ""{ \"status\": \"OK\" }";
    }
}
