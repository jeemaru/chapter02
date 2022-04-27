package com.javaex.ex16;

public class Circle extends Shape{
	
	private int radius;

	public Circle() {

	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
		System.out.println("Circle(4)");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}

	
	
	
}
