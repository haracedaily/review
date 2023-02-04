package com.house.review;

public class Employee {
	//필드<-게터를 만들어야함으로 프라이빗 제한
	private String name;
	private String payment;
	//세터는 정의하지 않음으로 생성자엔 퍼블릭 프로텍 디폴트제한자 설정까진 가능할듯
	public Employee(String name, String payment) {
		this.name=name;
		this.payment=payment;
	}
	//메소드
	public void getInformation() {
		System.out.print("이름 : "+name+"   ");
		System.out.print("연봉 : "+payment+"   ");
	}
	public void print() {
		System.out.println("수퍼클래스");
	}
	public String getName() {
		return name;
	}
	public String getPayment() {
		return payment;
	}
	
	
}
