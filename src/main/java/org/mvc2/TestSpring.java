package org.mvc2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
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

        /*Player player = context.getBean(Player.class);
        System.out.println(player.getHealth());
        context.close();*/ //4 вариант

        /*Player player1 = context.getBean(Player.class);
        Player player2 = context.getBean(Player.class);

        System.out.println(player1.hashCode());
        System.out.println(player2.hashCode());

        System.out.println(player1 == player2);

        context.close();*/ //5 вариант/часть

        Player player = context.getBean(Player.class);
        player.attack();
        context.close();
    }
}
