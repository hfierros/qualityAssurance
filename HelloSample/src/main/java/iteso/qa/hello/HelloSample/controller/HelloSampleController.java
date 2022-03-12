package iteso.qa.hello.HelloSample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSampleController {
    @RequestMapping("/")
    public String hello() {
        return "Hello world";
    }
}
