package com.javaex.ex12;

public class Math {
	
	private static double pi = 3.14;
	//필드

	//생성자
	//메소드
	//메소드 일반
	
	public static int plus(int a, int b) {
		return a+b;
	}
	public static double plus(double a, double b) {
		return a+b;
	}//필드 생성자 메소드와 별개로 스태틱라인에 값을 줌
	
	public static double circleArea(int radius) {
		double area = pi*radius*radius;
		return area;
	}
	
}
