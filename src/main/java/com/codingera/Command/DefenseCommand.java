package com.codingera.Command;

public class DefenseCommand implements InterfaceCommand {

	private InterfacePlayer player;

	/**
	 * 
	 * @param player
	 */
	public DefenseCommand(InterfacePlayer player) {
		this.player = player;
	}

	public void execute() {
		player.defense();
	}

}