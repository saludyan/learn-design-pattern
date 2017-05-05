package com.codingera.Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AbstractMenu {

	private List<AbstractMenu> children;

	/**
	 * @param name
	 */
	public Menu(String name) {
		super(name);
		this.children = new ArrayList<AbstractMenu>();
	}





	/**
	 * 
	 * @param menu
	 */
	public void add(AbstractMenu menu) {
		this.children.add(menu);
	}

	public List<AbstractMenu> getChildren() {
		return this.children;
	}

}