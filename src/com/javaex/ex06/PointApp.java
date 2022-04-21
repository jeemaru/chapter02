package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point x = new Point();
		x.setX(5);
		x.setY(5);
		
		Point y = new Point();
		y.setX(10);
		y.setY(23);

		x.draw();
		y.draw();
	}

}
