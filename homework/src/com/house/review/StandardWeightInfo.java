package com.house.review;

public class StandardWeightInfo extends Human{
	
	public StandardWeightInfo(String name,int height,int weight) {
		super(name, height, weight);
	}
	
	@Override
	public void getInformation() {
//		double nrm=(height-100)*0.9;
		super.getInformation();
		System.out.print(", 표준체중 "+this.getStandardWeight()+" 입니다.\n");
	}
	public double getStandardWeight() {
		double result=(height-100)*0.9;
		return result;
	}

}
