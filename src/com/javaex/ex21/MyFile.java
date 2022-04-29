package com.javaex.ex21;

import java.io.IOException;

public class MyFile {
	
	//필드
	
	//생성자
	public MyFile() {
		
	}
	//메소드gs
	
	//메소드
	//정상적인 경우
	public String read(String path) {
		//path에 있는 파일을 읽어서 문자열을 만들어준다
		String result = "학교종이 땡땡땡 어서 모이자";
		return result;
	}
	
	//파일이 없는 경우 - 만드는쪽에서 예외처리 하는경우
	public String read2(String path) {
		try {
			//path에 있는 파일을 읽어서 문자열을 만들어준다
			//파일이 없을떄
			throw new IOException(); //파일이 없는 상황을 강제로 발생
			String result = "";
			return result;
		}catch(IOException e) {
			System.out.println(path+"no file");
		}
		
	//파일이 없는 경우 --사용하는쪽에 예외를 알리는경우	
	public void read3(String path) throws IOException{
		String result = "";
		throw new IOException(); //파일이 없는 상황을 강제로 발생

		return result;
		}

				
		
		
		
	}

}
