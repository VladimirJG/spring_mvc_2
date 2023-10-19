package org.mvc2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Weapon weapon = context.getBean( Weapon.class);

        Player player = new Player(weapon);
        player.attack();

        context.close();
    }
}
