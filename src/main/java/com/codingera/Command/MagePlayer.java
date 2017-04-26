package com.codingera.Command;

/**
 * 法师
 */
public class MagePlayer implements InterfacePlayer {

	public void attack() {
		System.out.println("法师:使用魔法攻击");
	}

	public void defense() {
		System.out.println("法师:使用冰盾防御");
	}

}