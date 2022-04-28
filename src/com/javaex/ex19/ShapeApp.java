package com.javaex.ex19;

import java.time.Instant;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Point p01 = new Point(5,1);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(100,100);
		p02.draw();
		
		Shape p03 = new Ractangle("빨강","노랑",4,5);
		System.out.println(p03.toString());
		
		System.out.println("===========");
		
		Ractangle r00 = new Ractangle("빨강","노랑",4,5);
		r00.draw();
		r00.area();
		
		Shape r01 = new Ractangle("빨강","노랑",4,5);
		r01.area();
		//r01.draw(); <--  안나옴..!
		
		Drawable r02 = new Ractangle("빨강","노랑",10,10);
		r02.draw();
		//r02.area(); 다른영역이라 사용불가능
		//r02.getWidth(); 값이 없어서 사용불가능
		 */
		
		//배열선언
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle("빨강","노랑",4,5);
		Drawable c02 = new Circle("빨강","분홍",3);
		Drawable t03 = new Triangle("주황","노랑",5,10);
		Drawable p04 = new Point(8,8);
		
		dArray[0] = r01;
		dArray[1] = c02;
		dArray[2] = t03;
		dArray[3] = p04;
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로값을 가져와야함 --> 강제형변환
		System.out.println(((Ractangle)dArray[0]).getWidth());
		
		//사각형의 면의 색
		System.out.println(((Shape)dArray[0]).getFillColor());
		
		for(int i=0; i<dArray.length; i++) {
			
			//System.out.println(dArray[i] instanceof Shape);
			
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
			
			//double area = ((Shape)dArray[i]).area();
			//System.out.println(area);
		}
		
		
	}
}
