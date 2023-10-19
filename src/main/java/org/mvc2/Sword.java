package org.mvc2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Sword implements Weapon {
    @PostConstruct
    public void initMethod() {
        System.out.println("Call init Method");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Call destroy method");
    }

    @Override
    public String getType() {
        return "sword";
    }

    @Override
    public int getDamage() {
        return 5;
    }
}
