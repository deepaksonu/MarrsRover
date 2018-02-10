/**
 * 
 */
package com.here.marsrover.dto;

import com.here.marsrover.enums.Direction;

/**
 * @author deepak
 *
 */
public class MarsRover {
	
	private String marsRoverName;
	
	private int xAxis;
	
	private int yAxis;
	
	private Direction direction;

	public MarsRover(int xAxis, int yAxis, Direction direction) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.direction = direction;
	}

	public String getMarsRoverName() {
		return marsRoverName;
	}

	public void setMarsRoverName(String marsRoverName) {
		this.marsRoverName = marsRoverName;
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
		
		if(xAxis >= MarsPlateau.MIN_X_AXIS && xAxis <= MarsPlateau.MAX_X_AXIS) {
			this.xAxis = xAxis;
		}else {
			throw new IllegalArgumentException("x Axis out of plateau");
		}
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		
		if(yAxis >= MarsPlateau.MIN_Y_AXIS && yAxis <= MarsPlateau.MAX_Y_AXIS) {
			this.yAxis = yAxis;
		}else {
			throw new IllegalArgumentException("y Axis out of plateau");
		}
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof MarsRover) {
			MarsRover that = (MarsRover) obj;
			return this.marsRoverName.equals(that.marsRoverName);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.marsRoverName.hashCode();
	}

	@Override
	public String toString() {
		return this.xAxis + " " + this.yAxis + " " + this.direction.name();
	}
	
	
}
