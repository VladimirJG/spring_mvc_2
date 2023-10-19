package org.mvc2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.mvc2")
@PropertySource("classpath:player.properties")
public class SpringConfig {
    @Bean
    public Sword swordBean() {
        return new Sword();
    }

    @Bean
    public Axe axeBean() {
        return new Axe();
    }

    @Bean
    public Player playerBean() {
        return new Player(axeBean());
    }
}
