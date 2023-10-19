package org.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Game {
    @Autowired
    Player player;

    public void playerAttacking() {
        System.out.println("Player is attacking: ");
        player.attack();
    }
}
