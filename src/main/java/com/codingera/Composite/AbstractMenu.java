package com.codingera.Composite;

public abstract class AbstractMenu {

	private String name;

	/**
	 * 
	 * @param name
	 */
	public AbstractMenu(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param menu
	 */
	public void add(AbstractMenu menu) {
		// TODO - implement AbstractMenu.add
		throw new UnsupportedOperationException();
	}

	public String getName(){
		return this.name;
	}

}