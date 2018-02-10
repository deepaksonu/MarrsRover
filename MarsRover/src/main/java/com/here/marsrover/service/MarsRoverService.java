/**
 * 
 */
package com.here.marsrover.service;

import com.here.marsrover.dto.MarsRover;
import com.here.marsrover.enums.InstructionEnum;

/**
 * @author deepak
 *
 */
public interface MarsRoverService {

	public MarsRover moveRover(String instructions); 
	
	public MarsRover changeDirection(InstructionEnum instruction);
	
	public MarsRover moveForward();
}
