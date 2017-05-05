package com.codingera.Composite;

/**
 * Created by Yan on 2017/5/5.
 */
public class TestComposite {

    public static void main(String[] args){
        Menu rootMenu = new Menu("首页");

        Menu nodeMenu= new Menu("分类");
        AbstractMenu subItem1 = new MenuItem("精选");
        AbstractMenu subItem2 = new MenuItem("热门");

        rootMenu.add(nodeMenu);
        nodeMenu.add(subItem1);
        nodeMenu.add(subItem2);

        AbstractMenu nodeMenu2 = new Menu("关于");
        rootMenu.add(nodeMenu2);

        System.out.println(rootMenu.getName());
        for(AbstractMenu menu :rootMenu.getChildren()){
            if(menu instanceof Menu){
                Menu root = (Menu) menu;
                System.out.println("--"+root.getName());
                for(AbstractMenu menuItem :root.getChildren()){
                    System.out.println("----"+menuItem.getName());
                }
            }

        }
    }


}
