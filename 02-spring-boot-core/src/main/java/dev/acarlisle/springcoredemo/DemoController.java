package dev.acarlisle.springcoredemo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

        private Coach myCoach;

    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }
}
