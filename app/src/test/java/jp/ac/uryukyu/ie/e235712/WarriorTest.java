package jp.ac.uryukyu.ie.e235712;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test
    public void testAttackWithWeaponSkill() {
        Warrior warrior = new Warrior("Warrior", 100, 20);
        LivingThing target = new LivingThing("Target", 100, 10);


        for (int i = 0; i < 3; i++) {
            warrior.attackWithWeaponSkill(target);
            assertTrue(target.getHitPoint() < 100);
        }
    }
}