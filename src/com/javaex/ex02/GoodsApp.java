package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.Goodsname = "- 상품이름:";
		camera.name = "\"니콘\",   ";
		camera.price = "가격: 400000";
		
		Goods lgg = new Goods();
		lgg.Goodsname = "- 상품이름:";
		lgg.name = "\"LG그램\",   ";
		lgg.price = "가격: 900000";
		
		Goods mug = new Goods();
		mug.Goodsname = "- 상품이름:";
		mug.name = "\"머그컵\",   ";
		mug.price = "가격: 2000";
		
		System.out.println(camera.Goodsname+camera.name+camera.price);
		System.out.println(lgg.Goodsname+lgg.name+lgg.price);
		System.out.println(mug.Goodsname+mug.name+mug.price);
		
	}

}
