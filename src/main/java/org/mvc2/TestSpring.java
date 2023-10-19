package org.mvc2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());
//        context.close();

       /* Player player = new Player(new Axe());
        player.attack();*/

       /* Weapon weapon = context.getBean("weaponBean", Weapon.class);
        System.out.println("Type = " + weapon.getType() + ", damage = " + weapon.getDamage());
        context.close();*/

        // 2 вариант
        /*Weapon weapon = context.getBean("weaponBean", Weapon.class);
        Player player = new Player(weapon);
        player.attack();
        context.close();*/

        //3 вариант после создания playerBean
      /*  Player player = context.getBean("playerBean", Player.class);
        player.attack();
        context.close();*/


        //4 вариант
        Axe axe1 = context.getBean("axeBean", Axe.class);
        Axe axe2 = context.getBean("axeBean", Axe.class);

        Sword sword1 = context.getBean("swordBean", Sword.class);
        Sword sword2 = context.getBean("swordBean", Sword.class);

        System.out.println(axe1.hashCode());
        System.out.println(axe2.hashCode());

        System.out.println(axe1 == axe2);

        System.out.println(sword1.hashCode());
        System.out.println(sword2.hashCode());
        System.out.println(sword1 == sword2);

        context.close();
    }
}
