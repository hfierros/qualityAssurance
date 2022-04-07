package iteso.qaassurance.trianglejava.controller;

import iteso.qaassurance.trianglejava.service.TriangleJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleJavaController {

    @Autowired
    TriangleJava triangleJava;

    @RequestMapping("/")
    public String alive() { return "Alive";}

    @RequestMapping("/triangle")
    public String triangle(@RequestParam Integer a,
                           @RequestParam Integer b,
                           @RequestParam Integer c) {
        return triangleJava.triangleType(a,b,c);
    }
}