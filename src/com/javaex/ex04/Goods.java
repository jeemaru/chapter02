package com.javaex.ex04;

public class Goods {
	
	private String name;
	private int price;
	
	public void setName(String n) {
		name = n;
	}
	public void setPrice(int p) {
		price = p;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void showInpo(){
		System.out.println("상품이름 : "+name);
		System.out.println("상품가격 : "+price);
		System.out.println("");
	}
	
}
