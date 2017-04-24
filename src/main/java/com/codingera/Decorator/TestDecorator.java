package com.codingera.Decorator;

import com.codingera.Decorator.role.ArrowRole;
import com.codingera.Decorator.role.NoArmsRole;
import com.codingera.Decorator.role.ShieldRole;
import com.codingera.Decorator.role.SwordRole;

/**
 * Created by Yan on 2017/4/24.
 */
public class TestDecorator {

    public static void main(String[] args){


        //创建剑士角色
        AbstractGameRole swordsmen = new Person();
        swordsmen = new SwordRole(swordsmen);//装备[圣剑] -- 拥有剑的角色
        swordsmen = new ShieldRole(swordsmen);//装备[盾牌] -- 拥有盾牌的角色(好像怪怪的...)
        System.out.println("剑士"+swordsmen.getArms());

        // 创建弓箭手角色
        AbstractGameRole bowmen = new Person();
        bowmen = new ArrowRole(bowmen);//装备[弓箭] -- 拥有弓箭的角色
        System.out.println("弓箭手"+bowmen.getArms());

        //创建平民角色
        AbstractGameRole civilian = new Person();
        civilian = new NoArmsRole(civilian);//平民没有武器
        System.out.println("平民"+civilian.getArms());

        // 给平民一个盾牌防身
        civilian = new ShieldRole(civilian);
        System.out.println("平民"+civilian.getArms());
    }

}
