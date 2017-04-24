package com.codingera.Decorator.role;

import com.codingera.Decorator.AbstractGameRole;

public class ArrowRole extends AbstractGameRole {

	private AbstractGameRole role;

	public String getArms() {
		return ",装备[弓箭]";
	}

	/**
	 * 
	 * @param role
	 */
	public ArrowRole(AbstractGameRole role) {
		this.role = role;
	}

}