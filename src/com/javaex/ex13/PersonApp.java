package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			/*
			Person person = new Person("김지수", 30);
			
//			System.out.println(person);
			person.showInfo();
			
			Student s01 = new Student("서울고등학교");
			System.out.println(s01.toString());
			
			Student s02 = new Student();
			s02.setAge(29);
			s02.setName("김지수");
			s02.setSchoolname("서울고등학교");
			System.out.println(s02.toString());
			*/
//			System.out.println(s02);

			
			Student s03 = new Student("김지수", 30, "남강고");
			
			System.out.println(s03.getName());
			System.out.println(s03.toString());
			s03.showInfo();
//			Student s03 = new Student("서울고등학교");
			
			
			
		}
		
	}


