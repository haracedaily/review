package com.house.review;

public class EmpDept extends Employee {
	//필드 마찬가지로 게터를 정의함으로 프라이빗 제한자
	private String dep;
	
	public EmpDept(String name,String payment,String dep) {
		super(name, payment);
		this.dep=dep;
	}
	//세터는 정의하지 않음으로 생성자엔 퍼블릭 프로텍 디폴트제한자 설정까진 가능할듯
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.print("부서 : "+dep+"   \n");
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}

	public String getDep() {
		return dep;
	}
	
	
}
