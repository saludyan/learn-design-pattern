package com.codingera.Iterator;

import java.util.Iterator;

public class TvChannelIterator implements Iterator {

	private TvChannel tvChannel;



	private int position;

	/**
	 * 
	 * @param tvChannel
	 */
	public TvChannelIterator(TvChannel tvChannel) {
		this.tvChannel = tvChannel;
	}

	public String next() {
		String channel = tvChannel.getChannel()[position];
		position ++ ;
		return channel;
	}

	public boolean hasNext() {
		if(position>=tvChannel.getChannel().length || tvChannel.getChannel()[position] == null){
			return false;
		}
		return true;
	}

	public void remove() {
		// TODO - implement TvChannelIterator.remove
		throw new UnsupportedOperationException();
	}

}