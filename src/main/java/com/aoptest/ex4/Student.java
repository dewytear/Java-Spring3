package com.aoptest.ex4;

public class Student {
	private String name;
	private String nonum;
	private String age;
	private String grade;

	//�л����� ������
	public void getInfo() {
		System.out.println("�̸�: " + getName());
		System.out.println("�й�: " + getNonum());
		System.out.println("����: " + getAge());
		System.out.println("�г�: " + getGrade());
	}//getInfo

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

}

