package com.codingera.Decorator.role;

import com.codingera.Decorator.AbstractGameRole;

public class SwordRole extends AbstractGameRole {

	private AbstractGameRole role;

	public String getArms() {
		return role.getArms() + ",装备[圣剑]";
	}

	/**
	 * 
	 * @param role
	 */
	public SwordRole(AbstractGameRole role) {
		this.role = role;
	}

}