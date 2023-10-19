package org.mvc2;

public class Game {

    Player player;

    public void playerAttacking() {
        System.out.println("Player is attacking: ");
        player.attack();
    }
}
