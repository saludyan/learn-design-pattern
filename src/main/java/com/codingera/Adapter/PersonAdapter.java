package com.codingera.Adapter;

public class PersonAdapter implements Animal {

	private Person person;

	public String eat() {
		return person.eatRice();
	}

	/**
	 * 
	 * @param person
	 */
	public PersonAdapter(Person person) {
		this.person = person;
	}

}