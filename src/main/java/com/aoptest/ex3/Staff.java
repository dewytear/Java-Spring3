package com.aoptest.ex3;

public class Staff {
	private String name;
	private String age;
	private String dept;

	//[region] setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}//[end]

	public void getInfo() {
		System.out.println("�̸�: " + getName());
		System.out.println("����: " + getAge());
		System.out.println("�μ�: " + getDept());
	}
}
