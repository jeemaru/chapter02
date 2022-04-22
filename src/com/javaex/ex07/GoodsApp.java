package com.javaex.ex07;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램", 900000);
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods cup = new Goods(2000);
		cup.setName("cup");
	
	
		System.out.println(computer.toString());
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		
	}

}
