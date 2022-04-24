package com.javaex.ex09;

public class Ex01App {

	public static void main(String[] args) {
		
		Ex01 tv = new Ex01(7, 20, false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(150);
		tv.status();

		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
		
	}

}
