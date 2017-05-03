package com.codingera.Facade;

/**
 * Created by Yan on 2017/5/3.
 */
public class TestFacade {

    public static void main(String[] args){
        Fan fan = new Fan();
        Tv tv = new Tv();
        MediaPlayer player = new MediaPlayer();
        SwitchFacade switchFacade = new SwitchFacade(fan,tv,player);
        switchFacade.on();
        switchFacade.off();
    }
}
