package org.mvc2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.mvc2")
@PropertySource("classpath:player.properties")
public class SpringConfig {
}
