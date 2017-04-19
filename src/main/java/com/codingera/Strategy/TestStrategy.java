package com.codingera.Strategy;

/**
 * Created by Yan on 2017/4/19.
 */
public class TestStrategy {

    public static void main(String[] args) {
        AbstractDuck duck = new RedHeadDuck();
        duck.perFormFly();

        AbstractDuck toyDuck = new ToyDuck();
        toyDuck.perFormFly();//我不会飞
        toyDuck.setFlyBehavior(new FLyWithWings());
        toyDuck.perFormFly();//又会飞了
    }
}
