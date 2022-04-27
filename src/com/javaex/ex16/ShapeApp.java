package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		/*
		 * Shape s01 = new Shape("빨강","노랑"); System.out.println(s01.toString());
		 * s01.draw();
		 */
		Ractangle[] rac = new Ractangle[2];
		
		Ractangle r01 = new Ractangle("빨강","노랑",4,5);
		Ractangle r02 = new Ractangle("파랑","노랑",4,5);
		rac[0] = (r01);
		rac[1] = (r02);
		for(int i=0; i<rac.length; i++) {
			System.out.println(rac[i]);
		}
	

	 	Triangle[] tri = new  Triangle[2];
	 	
	 	Triangle t01 = new Triangle("빨강","노랑",4,5);
	 	Triangle t02 = new Triangle("빨강","노랑",4,5);
	 	tri[0] = (t01);
		tri[1] = (t02);
		for(int i=0; i<tri.length; i++) {
			System.out.println(tri[i]);
		}
		
	 
		Circle[] cir = new Circle[2];
		
		Circle c01 = new Circle("빨강","노랑",4);
		Circle c02 = new Circle("빨강","파랑",5);
		
		cir[0] = (c01);
		cir[1] = (c02);
		for(int i=0; i<cir.length; i++) {
			System.out.println(cir[i]);
		}
	}
}
