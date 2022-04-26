package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵",2000);
	
		Goods[] GoodsArray= new Goods[3];
		GoodsArray[0] = camera;
		GoodsArray[1] = computer;
		GoodsArray[2] = cup;
		
		System.out.println(GoodsArray[0].getName());
		System.out.println(GoodsArray[2].getPrice());
		System.out.println("==================");
		
		System.out.println(GoodsArray[0].toString());
		System.out.println(GoodsArray[1].toString());
		System.out.println(GoodsArray[2].toString());
		System.out.println("==================");
		
		GoodsArray[0].showinfo();
		GoodsArray[1].showinfo();
		GoodsArray[2].showinfo();
		System.out.println("==================");
		
		for(int i=0; i<GoodsArray.length; i++) {
			GoodsArray[i].showinfo();
		}
		
		
	}
}
