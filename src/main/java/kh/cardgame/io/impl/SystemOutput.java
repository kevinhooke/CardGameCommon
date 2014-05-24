package kh.cardgame.io.impl;

import kh.cardgame.io.Output;

/**
 * Console based implementation of Output.
 * 
 * @author Kevin Hooke
 *
 */
public class SystemOutput implements Output {

	@Override
	public void write(String line) {
		System.out.println(line);
		
	}

}
