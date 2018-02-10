/**
 * 
 */
package com.here.marsrover.service.impl;

import com.here.marsrover.dto.MarsRover;
import com.here.marsrover.enums.Direction;
import com.here.marsrover.enums.InstructionEnum;
import com.here.marsrover.service.MarsRoverService;

/**
 * @author deepak
 *
 */
public class MarsRoverServiceImpl implements MarsRoverService{
	
	
	private MarsRover marsRover;
	
	
	public MarsRoverServiceImpl(MarsRover marsRover) {
		this.marsRover = marsRover;
	}

	/**
	 * Moves Rover based on instruction provided.
	 * @param marsRover
	 * @param instructions
	 * @return
	 */
	@Override
	public MarsRover moveRover(String instructions) {
		
		//LMLMLMLMM 
		
		//Checks null;
		if(this.marsRover == null) {
			return this.marsRover;
		}
		
		for(int i = 0 ; i < instructions.length() ; i++){
			
			if(InstructionEnum.valueOf(String.valueOf(instructions.charAt(i))).equals(InstructionEnum.L) || 
					InstructionEnum.valueOf(String.valueOf(instructions.charAt(i))).equals(InstructionEnum.R)) {
				
				this.marsRover = this.changeDirection(InstructionEnum.valueOf(String.valueOf(instructions.charAt(i))));
			}else {
				this.moveForward();
			}
			
		}
		return this.marsRover;
	}

	/**
	 * Changes direction.
	 */
	@Override
	public MarsRover changeDirection(InstructionEnum instruction) {
		
		if(this.marsRover == null || instruction == null) {
			return this.marsRover;
		}

		Direction currentDirecion = this.marsRover.getDirection();
		
		//Setting direction based on instructions L or R.
		
		if(currentDirecion.equals(Direction.N)) {
			if(instruction.equals(InstructionEnum.L)) {
				this.marsRover.setDirection(Direction.W); 
			}else {
				this.marsRover.setDirection(Direction.E); 
			}
		}else if(currentDirecion.equals(Direction.W)) {
			if(instruction.equals(InstructionEnum.L)) {
				this.marsRover.setDirection(Direction.S); 
			}else {
				this.marsRover.setDirection(Direction.N); 
			}
		}else if(currentDirecion.equals(Direction.S)) {
			if(instruction.equals(InstructionEnum.L)) {
				this.marsRover.setDirection(Direction.E); 
			}else {
				this.marsRover.setDirection(Direction.W); 
			}
		}else if(currentDirecion.equals(Direction.E)) {
			if(instruction.equals(InstructionEnum.L)) {
				this.marsRover.setDirection(Direction.N); 
			}else {
				this.marsRover.setDirection(Direction.S); 
			}
		}
		
		System.out.println("Changing Direction : " + this.marsRover);
		return this.marsRover;
	}

	/**
	 * Check direction and moves forward.
	 */
	@Override
	public MarsRover moveForward() {
		
		//Check for null;
		if(this.marsRover == null) {
			return this.marsRover;
		}
		
		//Check directionand moves forward.
		if(this.marsRover.getDirection().equals(Direction.N)) {
			this.marsRover.setyAxis(this.marsRover.getyAxis()+1);
		}else if(this.marsRover.getDirection().equals(Direction.S)){
			this.marsRover.setyAxis(this.marsRover.getyAxis()-1);
		}else if(this.marsRover.getDirection().equals(Direction.E)) {
			this.marsRover.setxAxis(this.marsRover.getxAxis()+1);
		}else{
			this.marsRover.setxAxis(this.marsRover.getxAxis()-1);
		}
		
		System.out.println("Moving forward : " + this.marsRover);
		return this.marsRover;
	}

	
}
