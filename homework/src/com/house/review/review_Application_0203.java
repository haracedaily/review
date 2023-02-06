package com.house.review;

public class review_Application_0203 {

	public static void main(String[] args) {
		//문제1
		
		EmpDept p1=new EmpDept("이지나","3000만원","교육부");
		
		p1.getInformation();
		p1.print();
		
		//문제2
		
//		Human p2=new StandardWeightInfo("홍길동", 168, 45);
		
//		Human p3=new ObesityInfo("박둘이", 168, 90);
		
		Human human=null;
		human = new StandardWeightInfo("글치", 168, 45);
		human.getInformation();
		human = new ObesityInfo("끙", 168, 90);
		human.getInformation();
		
		
//		p2.getInformation();
//		p3.getInformation();
//		System.out.println();
	}

}
