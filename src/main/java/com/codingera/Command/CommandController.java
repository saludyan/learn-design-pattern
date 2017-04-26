package com.codingera.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandController {

	private List<InterfaceCommand> attackCommands = new ArrayList<InterfaceCommand>();
	private List<InterfaceCommand> defenseCommands = new ArrayList<InterfaceCommand>();

	public void executeAttack() {
		for(InterfaceCommand command : attackCommands){
			command.execute();
		}
	}

	public void executeDefense() {
		for(InterfaceCommand command : defenseCommands){
			command.execute();
		}
	}


	public void setCommand(InterfaceCommand attack,InterfaceCommand defense) {
		this.attackCommands.add(attack);
		this.defenseCommands.add(defense);
	}

}