package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
				
		Shape s01 = new Shape("빨강","노랑");
		
		Ractangle sl01 = new Ractangle("빨강","검정",4,4);
		System.out.println(sl01.getWidth()); //자식의 메소드 사용가능
		
		
		
		//메모리에는 올라가고 부모쪽만 보인다.(섞어쓰기)
		Shape sr01 = new Ractangle("빨강","검정",15,14);
		//System.out.println(sr01.getWidth()); 자식의 메소드는 표현이안됨 부모의 값,모양만 가져감
		
		
		//Shape 배열에 모든 도형을 담아서 관리하고 싶다
		
		//Shape배열 생성
		
		Shape[] sArray = new Shape[6];
		
		//사각형2개
		Shape r01 = new Ractangle("빨강","검정",15,14);
		Shape r02 = new Ractangle("주황","검정",5,4);
		//원2개
		Shape c01 = new Circle("보라","검정",5);
		Shape c02 = new Circle("빨강","보라",8);
		//삼각형2개
		Shape t01 = new Triangle("분홍","검정",7,15);
		Shape t02 = new Triangle("노랑","초록",9,16);
		
		sArray[0] = (r01);
		sArray[1] = (r02);
		sArray[2] = (c01);
		sArray[3] = (c02);
		sArray[4] = (t01);
		sArray[5] = (t02);
		
		//System.out.println(sArray[0].getWidth());
		System.out.println(sArray[0].toString()); //자식에있는 스트링 값을 쓸수있음
		//다른값의 스트링 드로우값을 만들고싶으면 다른이름으로 추가 생성해야함
		//값.형식 프린트값을 자식에서 사용하려면 같은 형식의 틀이라도 부모가 값을 가지고있어야함(이름이 겹쳐야함..!)
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
			System.out.println(sArray[i].area()); 
		}
		System.out.println(((Ractangle)sArray[0]).getWidth());
		//필요할때는 강제형변환으로 값과 변하고자하는 값을 묶어준뒤 필요값을 부르면 됨
		
	}
}
