/**
 * 
 */
package com.here.marsrover.enums;

/**
 * @author deepak
 *
 */
public enum Direction {

	N("NORTH"),
	S("SOUTH"),
	E("EAST"),
	W("WEST");
	
	private String direction;
	
	private Direction(String direction) {
		this.direction = direction;
	}
	
	/**
	 * Gets the Current Direction
	 * @return
	 */
	public String getDirection() {
		return this.direction;
	}
	
	public Direction getDirection(String direction) {
		
		if(direction.equalsIgnoreCase(Direction.E.name())) {
			return Direction.E;
		}else if(direction.equalsIgnoreCase(Direction.W.name())) {
			return Direction.W;
		}else if(direction.equalsIgnoreCase(Direction.N.name())) {
			return Direction.N;
		}else{
			return Direction.S;
		}
	}
	
}
