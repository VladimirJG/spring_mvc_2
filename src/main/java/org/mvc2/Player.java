package org.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Player {
    private Weapon weapon;
    @Value("${playerBean.health}")
    private int health = 100;

    public Player() {
    }

    @Autowired
    public Player(@Qualifier("sword") Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack() {
        System.out.println("Dealing " + weapon.getDamage() + " damage with " + weapon.getType()
                + ", health = " + health);
    }
}
