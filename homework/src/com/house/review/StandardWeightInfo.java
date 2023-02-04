package com.house.review;

public class StandardWeightInfo extends Human{
	
	public StandardWeightInfo(String name,int height,int weight) {
		super(name, height, weight);
	}
	
	@Override
	public void getInformation() {
		double nrm=(height-100)*0.9;
		super.getInformation();
		System.out.print(", 표준체중 "+((height-100)*0.9)+" 입니다.\n");
	}

}
