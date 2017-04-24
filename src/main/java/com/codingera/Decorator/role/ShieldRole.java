package com.codingera.Decorator.role;

import com.codingera.Decorator.AbstractGameRole;

public class ShieldRole extends AbstractGameRole {

	private AbstractGameRole role;

	public String getArms() {
		return role.getArms() + ",装备[盾牌]";
	}

	/**
	 * 
	 * @param role
	 */
	public ShieldRole(AbstractGameRole role) {
		this.role = role;
	}

}