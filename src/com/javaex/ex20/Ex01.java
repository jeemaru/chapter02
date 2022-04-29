package com.javaex.ex20;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double result;
		int num;
		
		num = sc.nextInt();
		
		
		try {
			result = 100/num; //예외상황 발생 ArithmeticException
			System.out.println(result);
		}catch(ArithmeticException e) { //상황에 맞는 값을 넣어야 작동이됨
			System.out.println("0으로 나눌수 없습니다.");
		}finally{
			System.out.println("finally 영역");
		}
		
		
		
		
		
		sc.close();
				
		

	}

}
