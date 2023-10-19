package org.mvc2;
import org.springframework.stereotype.Component;

@Component
public class Axe implements Weapon{
    @Override
    public String getType() {
        return "axe";
    }

    @Override
    public int getDamage() {
        return 7;
    }
}
