package com.codingera.Factory;

/**
 * Created by Yan on 2017/4/25.
 */
public class TestFactory {

    public static void main(String[] args){

        // 生产国产汽车
        AbstractCarFactory chinese = new ChineseCarFactory();
        //生产比亚迪汽车
        AbstractCar bydCar = chinese.produce("byd");
        System.out.println("生产:" + bydCar.info());
        // 生产吉利汽车
        AbstractCar geelyCar = chinese.produce("geely");
        System.out.println("生产:"+geelyCar.info());

        // 生产德国汽车
        AbstractCarFactory germany = new GermanyCarFactory();
        //生产奥迪汽车
        AbstractCar audiCar = germany.produce("audi");
        System.out.println("生产:"+audiCar.info());
        //生产大众汽车
        AbstractCar volkswagenCar = germany.produce("volkswagen");
        System.out.println("生产:"+volkswagenCar.info());

        //如果没有该品牌...
        AbstractCar xxxxCar = germany.produce("xxx");
        System.out.println("生产:"+volkswagenCar.info());
    }
}
