package com.codingera.Observer;

import java.util.ArrayList;
import java.util.List;

public class Radio implements InterfaceObservable {


	private List<InterfaceObserver> observers;

	public Radio(){
		observers = new ArrayList<InterfaceObserver>();
	}

	/**
	 * 
	 * @param observer
	 */
	public void registerObserver(InterfaceObserver observer) {
		observers.add(observer);
	}

	/**
	 * 
	 * @param observer
	 */
	public void removeObserver(InterfaceObserver observer) {
		int index = observers.indexOf(observer);
		if(index>=0){
			this.observers.remove(index);
		}
	}

	/**
	 * 
	 * @param parameter
	 */
	public void notifyObserver(String parameter) {
		for(InterfaceObserver observer : observers){
			observer.update(parameter);
		}
	}



}