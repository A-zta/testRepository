package com.kh.git.board;

public class Board {
	String name;
	String age;
	String gender;
	
	public Board() {
		super();
	}

	public Board(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Board [이름 : " + name + "\n나이 : " + age + "\n성별 : " + gender + "]";
	}
	
	
	
}
