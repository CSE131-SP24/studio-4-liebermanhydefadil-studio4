package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	Color body = new Color(163, 216, 109);
	StdDraw.setPenColor(body);
	StdDraw.filledCircle(0.5, 0.5, 0.45);
	
	StdDraw.setPenColor(Color.WHITE);
	StdDraw.filledEllipse(0.5, 0.65, 0.2, 0.175);

	Color eye = new Color(20, 130, 83);
	StdDraw.setPenColor(eye);
	StdDraw.filledCircle(0.5, 0.65, 0.11);
	
	StdDraw.setPenColor(Color.black);
	StdDraw.filledCircle(0.5, 0.65, 0.06);

	StdDraw.setPenColor(Color.darkGray);
	StdDraw.filledEllipse(0.5, 0.302, 0.30, 0.17);

	StdDraw.setPenColor(body);
	StdDraw.filledEllipse(0.5, 0.375, 0.30, 0.10);



		
	}
}