package com.codingera.Facade;

public class SwitchFacade {

	private Fan fan;
	private Tv tv;
	private MediaPlayer player;

	public void on() {
		fan.openFan();
		tv.on();
		player.play();
	}

	public void off() {
		fan.closeFan();
		tv.off();
		player.stop();
	}

	/**
	 * 
	 * @param fan
	 * @param tv
	 * @param player
	 */
	public SwitchFacade(Fan fan, Tv tv, MediaPlayer player) {
		this.fan = fan;
		this.tv=tv;
		this.player = player;
	}

}