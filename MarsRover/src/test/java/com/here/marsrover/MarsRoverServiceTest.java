/**
 * 
 */
package com.here.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.here.marsrover.dto.MarsPlateau;
import com.here.marsrover.dto.MarsRover;
import com.here.marsrover.enums.Direction;
import com.here.marsrover.enums.InstructionEnum;
import com.here.marsrover.service.MarsRoverService;
import com.here.marsrover.service.impl.MarsRoverServiceImpl;

/**
 * @author deepak
 *
 */


public class MarsRoverServiceTest {

	@Test
	public void moveForwardTest() {
		MarsPlateau marsPlateau = new MarsPlateau(5, 5);
		MarsRover marsRover = new MarsRover(1, 2, Direction.N);
		MarsRoverService marsRoverService = new MarsRoverServiceImpl(marsRover);
		
		marsRover = marsRoverService.moveForward();
		
		assertEquals(3, marsRover.getyAxis());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void moveForwardTestIllegalArgumentException() {
		MarsPlateau marsPlateau = new MarsPlateau(2, 2);
		MarsRover marsRover = new MarsRover(1, 2, Direction.N);
		MarsRoverService marsRoverService = new MarsRoverServiceImpl(marsRover);
		
		marsRover = marsRoverService.moveForward();
		
	}
	
	@Test
	public void changeDirectionTest() {
		MarsPlateau marsPlateau = new MarsPlateau(5, 5);
		MarsRover marsRover = new MarsRover(1, 2, Direction.N);
		MarsRoverService marsRoverService = new MarsRoverServiceImpl(marsRover);
		
		marsRover = marsRoverService.changeDirection(InstructionEnum.R);
		
		assertEquals(Direction.E, marsRover.getDirection());
	}
	
	@Test
	public void moveRoverTest() {
		MarsPlateau marsPlateau = new MarsPlateau(5, 5);
		MarsRover marsRover = new MarsRover(1, 2, Direction.N);
		MarsRoverService marsRoverService = new MarsRoverServiceImpl(marsRover);
		
		marsRover = marsRoverService.moveRover("LMLMLMLMM");
		
		assertEquals("1 3 N", marsRover.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void moveRoverTestIllegalArgumentException() {
		MarsPlateau marsPlateau = new MarsPlateau(5, 5);
		MarsRover marsRover = new MarsRover(1, 2, Direction.N);
		MarsRoverService marsRoverService = new MarsRoverServiceImpl(marsRover);
		
		marsRover = marsRoverService.moveRover("LMLMMMMMLMLMM");
		
		assertEquals("1 3 N", marsRover.toString());
	}
	
}
