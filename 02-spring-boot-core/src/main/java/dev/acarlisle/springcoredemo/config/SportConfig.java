package dev.acarlisle.springcoredemo.config;

import dev.acarlisle.springcoredemo.common.Coach;
import dev.acarlisle.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
