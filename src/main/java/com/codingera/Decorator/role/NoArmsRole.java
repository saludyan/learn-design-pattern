package com.codingera.Decorator.role;

import com.codingera.Decorator.AbstractGameRole;

public class NoArmsRole extends AbstractGameRole {

	private AbstractGameRole role;

	public String getArms() {
		return ",没有武器";
	}

	/**
	 * 
	 * @param role
	 */
	public NoArmsRole(AbstractGameRole role) {
		this.role = role;
	}

}