package com.house.review;

public class ObesityInfo extends StandardWeightInfo{
	public ObesityInfo(String name,int height,int weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		double nrm=(height-100)*0.9;
		double obes=((weight-nrm)/nrm)*100;
		String var="";
		if(obes>=20) {
			var="비만입니다.";
		}else {
			var="정상입니다.";
		}
		System.out.print(name+"님의 신장 "+height+", 몸무게 "+weight+", "+var);
	}
	
}
