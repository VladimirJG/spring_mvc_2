package org.mvc2;

import org.springframework.stereotype.Component;

@Component
public class Sword implements Weapon {

    public void initMethod() {
        System.out.println("Call init Method");
    }

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
