package com.house.review;

import java.util.Scanner;

public class review_0201 {

	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		//키보드로 부터 상품 수와 가격을 입력 받아야 됨
		Scanner sc=new Scanner(System.in);
		//상품 개수를 받아줘야함
		int count;
		//클래스 배열을 생성
		KeyBoard[] keyArry=null;
		//while문의 boolean값 정해주기
		boolean flag=true;
		//메뉴 구성 로직
		while(flag) {
			System.out.println("=======================================================");
			System.out.println("1.상품 수 | 2.상품명 및 가격입력 | 3. 제품별 가격 | 4.분석 | 5.종료");
			int No = Integer.parseInt(sc.nextLine());
			switch(No) {
			case 1:
				System.out.println("상품 개수 입력>");
				count = Integer.parseInt(sc.nextLine());
				keyArry=new KeyBoard[count];
				break;
				
			case 2:
				for(int i=0;i<keyArry.length;i++) {
				keyArry[i]=new KeyBoard();
				
				System.out.println("상품명 입력>");
				keyArry[i].name=sc.nextLine();
				
				System.out.println("가격 입력>");
				keyArry[i].pay=Integer.parseInt(sc.nextLine());
				}
				break;
				
			case 3:
				System.out.println("제품별 가격 안내");
				for(int i=0;i<keyArry.length;i++) {
					System.out.println("제품 명 : "+keyArry[i].name+"| 가격 : "+keyArry[i].pay);
				}
				break;
				
			case 4:
				//최고값 받을 변수 생성
				int max=0;
				//최고액 제품 제외한 제품들의 가격 총합 받을 변수 생성
				int sum=0;
				
				for(int i=0;i<keyArry.length;i++) {
				if(keyArry[i].pay>max) {
					max=keyArry[i].pay;
					}
				}
				for(int i=0;i<keyArry.length;i++) {
					if(keyArry[i].pay!=max) {
						sum+=keyArry[i].pay;
					}else {
						System.out.println("최고가의 제품은 "+keyArry[i].name+"이며 가격은 "+keyArry[i].pay+"원 입니다.");
					}
				}System.out.println("최고가 제품을 제외한 나머지 제품들 가격의 총액은 "+sum+"원 입니다.");
				break;
				
			case 5:
				System.out.println("Thank you for done");
				flag=false;
				break;
			}
			}
		


	}
}

