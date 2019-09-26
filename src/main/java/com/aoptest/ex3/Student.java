package com.aoptest.ex3;

public class Student {
	private String name;
	private String nonum;
	private String age;
	private String grade;


	//[region] setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNonum() {
		return nonum;
	}

	public void setNonum(String nonum) {
		this.nonum = nonum;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	//[end]

	//학생정보 얻어오기
	public void getInfo() {
		System.out.println("이름: " + getName());
		System.out.println("학번: " + getNonum());
		System.out.println("나이: " + getAge());
		System.out.println("학년: " + getGrade());

		try {
			System.out.println(10/0);
		} catch(Exception e) {

		}
	}//getInfo

}

