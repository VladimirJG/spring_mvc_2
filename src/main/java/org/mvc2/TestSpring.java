package org.mvc2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       /* Weapon weapon = context.getBean(Weapon.class);

        Player player = new Player(weapon);
        player.attack();

        context.close();*/ // 1 вариант

       /* Player player = context.getBean(Player.class);
        player.attack();
        context.close();*/ // 2 вариант

        /*Game game = context.getBean(Game.class);
        game.playerAttacking();
        context.close();*/  //3 вариант

        Player player = context.getBean(Player.class);
        System.out.println(player.getHealth());

        context.close();
    }
}
