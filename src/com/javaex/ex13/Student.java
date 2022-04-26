package com.javaex.ex13;

public class Student extends Person{
	
	//필드
		private String schoolname;

		
		//생성자
		public Student() {
			System.out.println("Student1");
		}
		public Student(String schoolname) {
			this.schoolname = schoolname;
			System.out.println("Student2");
		}
		public Student(String name, int age, String schoolname) {
			super(name, age);
			this.schoolname= schoolname;
			System.out.println("Student3");
		}
		
		
		//GS
		public void setSchoolname(String schoolname) {
			this.schoolname = schoolname;
		}
		
		public String getSchoolname() {
			return schoolname;
		}
		
		//일반
		@Override
		public String toString() {
			return "Student [schoolname=" + schoolname + ", getName()=" + name + ", getAge()=" + this.getAge() + "]";
		}
		
		public void showInfo() {
			//부모 showInfo()그대로 사용
			//부모 toString사용
			System.out.println(super.toString());
			//내 toString 사용
			System.out.println(this.toString());
			
			System.out.print("이름 : " + name + ", 나이 : " + getAge() + ", 학교 :" + schoolname);
		}

}
