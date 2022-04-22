package com.javaex.ex07;

public class Goods {
	
	// 필드
	private String name;
	private int price;
	
	// 생성자
	public Goods() { //기본생성자
		System.out.println("Goods()");//***** 메모리에 올리는 일
		//로직
	}
	public Goods(int price) {
		//***** 메모리에 올리는 일
		//추가진행 로직
		this.price = price;
		System.out.println("Goods(1)");
	}
	public Goods(String name, int price) {
		//***** 메모리에 올리는 일
		//추가진행 로직
		this.name = name;
		this.price = price;
		System.out.println("Goods(2)");
	}
	
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// 메소드 -일반 html(2일)
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}// 해당값이 잘 출력되는지 확인하는 명령어--> 알트 쉬프트 에스

	
	
	
}
