package com.codingera.Observer;

public interface InterfaceObservable {

	/**
	 * 
	 * @param observer
	 */
	void registerObserver(InterfaceObserver observer);

	/**
	 * 
	 * @param observer
	 */
	void removeObserver(InterfaceObserver observer);

	/**
	 * 
	 * @param parameter
	 */
	void notifyObserver(String parameter);

}