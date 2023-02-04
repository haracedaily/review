package com.house.review;

public class Human {
	String name;
	int height;
	int weight;

	
	public Human(String name,int height,int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public void getInformation() {
		System.out.print(name+"님의 신장 "+height+", 몸무게 "+weight);
	}
}
