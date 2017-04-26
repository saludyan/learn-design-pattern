package com.codingera.Command;

/**
 * Created by Yan on 2017/4/26.
 */
public class TestCommand {

    public static void main(String[] args){
        //指令控制器
        CommandController commandController = new CommandController();

        // 战士
        InterfacePlayer warriorPlayer = new WarriorPlayer();
        commandController.setCommand(new AttackCommand(warriorPlayer),new DefenseCommand(warriorPlayer));

        //法师
        InterfacePlayer magePlayer = new MagePlayer();
        commandController.setCommand(new AttackCommand(magePlayer),new DefenseCommand(magePlayer));

        // 执行攻击
        commandController.executeAttack();

        // 执行防御
        commandController.executeDefense();
    }
}
