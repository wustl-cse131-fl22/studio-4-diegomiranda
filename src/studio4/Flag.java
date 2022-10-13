package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, 0.5, 0.4, 0.25);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.line(.4,.5,.9,.5);
		//StdDraw.line(0.1, 0.25, 0.4, 0.5);
		//StdDraw.line(0.1, 0.75, 0.4, 0.5);
		
		double [] x = {.1, .4, .1};
		double [] y = {.25, .5, .75};
		StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenColor(Color.green);
		double [] x1 = {.1, .9, .9, .4};
		double [] y1 = {.75, .75, .5, .5};
		StdDraw.filledPolygon(x1, y1);
		
		
	
		StdDraw.setPenColor(200, 0, 200);
		double [] x2 = {.1, .9, .9, .4};
		double [] y2 = {.25, .25, .5, .5};
		StdDraw.filledPolygon(x2, y2);
		
	}
}