package org.mvc2;

public class Player {
    private Weapon weapon;
    private int health = 100;

    public Player() {
    }

    public Player(Weapon weapon) {
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
        +", health = " + health);
    }
}
