package com.javaex.ex17;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	
	public Triangle() {
		super();
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Triangle(4)");
	}
	
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + 
		                        ", 가로:" + width + ", 세로:" + height + 
		                        "] 삼각형을 그렸습니다. " );
		}
	
	public double area() {
		double area =  width*height/2;
		return area;
	}
	
}
