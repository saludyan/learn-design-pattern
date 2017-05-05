package com.codingera.Iterator;

public class TvChannel {

	private String[] channel = {"翡翠台","浙江卫视","湖南卫视"};

	public TvChannelIterator iterator() {
		return new TvChannelIterator(this);
	}

	public String[] getChannel() {
		return this.channel;
	}

}