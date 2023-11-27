package jp.ac.uryukyu.ie.e235712;

public class Enemy extends LivingThing {
    public Enemy(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        super.wounded(damage);
        System.out.printf("モンスター%sは倒れた。\n", getName());
    }
}