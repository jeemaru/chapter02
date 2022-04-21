package com.javaex.ex06;

public class Point {

	public int x;
	public int y;
	
	//=======================
	public void setX (int x2) {
		x = x2;
	}
	public void setY (int y2) {
		y = y2;
	}
	
	//========================
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//========================
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
	
}
