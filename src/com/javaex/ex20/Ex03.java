package com.javaex.ex20;

public class Ex03 {

	public static void main(String[] args) {
		
		
		String str = new String("hello");
		str = null;
		
		try {
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			
		}
		
		

	}

}
