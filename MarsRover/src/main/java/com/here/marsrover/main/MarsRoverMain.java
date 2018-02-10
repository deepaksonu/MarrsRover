/**
 * 
 */
package com.here.marsrover.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.here.marsrover.dto.MarsPlateau;
import com.here.marsrover.dto.MarsRover;
import com.here.marsrover.enums.Direction;
import com.here.marsrover.service.MarsRoverService;
import com.here.marsrover.service.impl.MarsRoverServiceImpl;

/**
 * @author deepak
 *
 */
public class MarsRoverMain {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		MarsPlateau marsPlateau = null;
		MarsRoverService marsRoverService = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] upperRightCorner = br.readLine().split(" ");	
		
		if(upperRightCorner.length == 2) {
			marsPlateau = new MarsPlateau(Integer.valueOf(upperRightCorner[0]), Integer.valueOf(upperRightCorner[1]));
		}
		int i = 0;
		while(i <2) {
			String currentMarrsPosition =br.readLine();
			
			if(currentMarrsPosition == null) {
				break;
			}
			String position[] = currentMarrsPosition.split(" ");

			MarsRover marsRover = new MarsRover(Integer.valueOf(position[0]),
												Integer.valueOf(position[1]),
												Direction.valueOf(position[2]));
			marsRoverService = new MarsRoverServiceImpl(marsRover);
			
			marsRover = marsRoverService.moveRover(br.readLine());
			
			System.out.println(marsRover);
			i++;
			
		}
	}
	

}
