/**
 * 
 */
package com.here.marsrover.dto;

/**
 * @author deepa
 *
 */
public class MarsPlateau {

	public static int MIN_X_AXIS;
	
	public static int MIN_Y_AXIS;
	
	public static int MAX_X_AXIS;
	
	public static int MAX_Y_AXIS;
	
	public MarsPlateau(int maxXAxis,int maxYAxis) {
		MarsPlateau.MIN_X_AXIS = 0;
		MarsPlateau.MIN_Y_AXIS = 0;
		MarsPlateau.MAX_X_AXIS = maxXAxis;
		MarsPlateau.MAX_Y_AXIS = maxYAxis;
	}
	
}
