package com.codingera.Command;

public class AttackCommand implements InterfaceCommand {

	private InterfacePlayer player;

	/**
	 * 
	 * @param player
	 */
	public AttackCommand(InterfacePlayer player) {
		this.player = player;
	}

	public void execute() {
		player.attack();
	}

}