package com.house.review;

import java.util.Scanner;

public class review_0130 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		System.out.println("x의 위치를 입력하세요");
		int locax=Integer.parseInt(sc.nextLine());
		System.out.println("y의 위치를 입력하세요");
		int locay=Integer.parseInt(sc.nextLine());
		if(locax>0 &locay>0) {
			System.out.println("제1사분면 입니다.");
		}else if(locax<0 & locay>0) {
			System.out.println("제2사분면 입니다.");
		}else if(locax<0 &locay<0) {
			System.out.println("제3사분면 입니다.");
		}else if(locax>0 & locay<0) {
			System.out.println("제4사분면 입니다.");
		}
		
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하여주세요.");
		int year=Integer.parseInt(sc.nextLine());
		if(year%4==0&year%100!=0) {
			System.out.println(year+"년은 윤년입니다.");
		}else if(year%400==0){
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		

		
		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		boolean flag=true;
		while(flag) {
			System.out.println("가위,바위,보 중에 하나를 입력해주세요");
			String rps = sc.nextLine();
		switch(rps) {
		case "가위":
			System.out.println("이기기 위해선 바위를 내야합니다.");
			flag =false;
			break;
		case "바위":
			System.out.println("이기기 위해선 보를 내야합니다.");
			flag =false;
			break;
		case "보":
			System.out.println("이기기 위해선 가위를 내야합니다.");
			flag =false;
			break;
		default:
			System.out.println("빈칸 없이 가위,바위,보를 입력해주세요");
			break;
			};
		};
		
		// 문제4) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		System.out.println("단의 값을 입력해주세요");
		int m=Integer.parseInt(sc.nextLine());
		System.out.println("곱셈할 값을 입력해주세요");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=n;i++) {
			System.out.println(m+" X "+i+" = "+(m*i));
		}
		//문제5) 호수에서 살고 있는 얼음요정이 곱셈을 공부하기로 했다. 근데 이 요정은 너무 멍청해서 9라는 숫자 이외에는 헷갈려서 잘 쓰지 못한다고 한다. 그래서 사람과는 곱셈방식이 좀 다르다.
		//(규칙 1)

		//곱하는 수나 곱한 결과에 9가 없으면 뭘 곱하든 9가 된다.

		//3*4=9

		//13*17=9
		//n*n = n
		//(규칙 2)

		//곱하는 수나 곱한 결과에 9가 있으면 값을 그대로 출력한다.

		//19*2=38

		//13*7=91

		//얼음요정의 n*n단을 출력해보자.

		//예시 ) 입력 9
		//출력 
		//1*1=9  2*1=9	 3*1=9	4*1=9	5*1=9	6*1=9	7*1=9	8*1=9	9*1=9 
		//1*2=9  2*2=9	 3*2=9 	4*2=9 	5*2=9 	6*2=9 	7*2=9 	8*2=9	9*2=18 
		//1*3=9	 2*3=9	 3*3=9 	4*3=9 	5*3=9 	6*3=9 	7*3=9 	8*3=9	9*3=27 
		//1*4=9	 2*4=9	 3*4=9 	4*4=9 	5*4=9 	6*4=9 	7*4=9 	8*4=9	9*4=36 
		//1*5=9	 2*5=9	 3*5=9 	4*5=9 	5*5=9 	6*5=9 	7*5=9 	8*5=9 	9*5=45 
		//1*6=9	 2*6=9	 3*6=9 	4*6=9 	5*6=9 	6*6=9 	7*6=9 	8*6=9 	9*6=54 
		//1*7=9	 2*7=9	 3*7=9 	4*7=9 	5*7=9 	6*7=9 	7*7=49 	8*7=9 	9*7=63 
		//1*8=9	 2*8=9	 3*8=9 	4*8=9 	5*8=9 	6*8=9 	7*8=9 	8*8=9 	9*8=72 
		//1*9=9	 2*9=18	 3*9=27 4*9=36 	5*9=45 	6*9=54 	7*9=63 	8*9=72 	9*9=81

//			System.out.println("N단을 입력해주세요");
//			int N=Integer.parseInt(sc.nextLine());
//			System.out.println("==얼음요정의"+N+N+"단==");
//			for(int i=1;i<=N;i++) {
//				for(int j=1;j<=N;j++) {
//					if(i<10&j<10) {
//					if(j==9|i==9|(i*j)%10==9|(i*j/10)%10==9|(i*j)/100==9) {
//					System.out.print(j+" * "+i+" = "+(i*j)+"\t");
//					}else {
//						System.out.print(j+" * "+i+" = "+"9\t");
//					}
//					}if(i>=10|j>=10) {
//						if(i<8|j<8) {if(j==9|i==9|(i*j)%10==9|(i*j/10)%10==9|(i*j)/100==9) {
//							System.out.print(j+" * "+i+" = "+(i*j)+"\t");
//							}else {
//								System.out.print(j+" * "+i+" = "+"9\t");
//							}
//							}else {
//								if(j==9|i==9|(i*j)%10==9|(i*j/10)%10==9|(i*j)/100==9) {
//									System.out.print(j+" * "+i+" = "+(i*j)+"\t");
//									}else {
//										System.out.print(j+" * "+i+" = "+"9\t");
										
					//10이상인 결과값엔 " "로 주려고 고쳤다가 그냥 "u*u" "u-u"로 고치면서 해결됬는데 그냥 만든 김에 놔둔 계산식
					//지금와서 추가한다면(i>=10|j>=10&&(i*j)>10)했어도 되지 않았을까..? 싶은 생각도..
					// %10==9 |(i*j/10)%10==9 이렇게 하는게 더 정밀할듯
					//간략화 시킨다면 이렇게만 하면 끝 | 길이 맞춰보려다가 너무 길어졌어요..!

			System.out.println("N단을 입력해주세요");
			int N=Integer.parseInt(sc.nextLine());
			System.out.println("==얼음요정의"+N+N+"단==");
				for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					if(j==9|i==9|(i*j)%10==9|(i*j/10)%10==9|(i*j)/100==9) {
					System.out.print(j+" * "+i+" = "+(i*j)+"\t");
					}else {
						System.out.print(j+" * "+i+" = "+"9\t");
					}
										
										
					//여기서 추가한다면 i와 j의 값도 %10==9|(i or j/10)%10==9 해주면 되지 않을까..?
					//자리수 표현 -> String.length
										
										
									}
				System.out.println();
						}
							
				
				
			
//					}else if(i==9) {
//						System.out.print(j+"*"+i+"="+(i*j)+"\t");
//					}else if((i*j)%10==9) {
//						System.out.print(j+"*"+i+"="+(i*j)+"\t");
//					}else if((i*j)/10==9){
//						System.out.print(j+"*"+i+"="+(i*j)+"\t");
//					}else if((i*j)/100==9){
//						System.out.print(j+"*"+i+"="+(i*j)+"\t");
			System.out.println("while문으로 만드는 M단을 입력해주세요");
			int M=Integer.parseInt(sc.nextLine());
			int dan = 1;
			int multi = 1;
			System.out.println("\n==while로 만드는 얼음요정의"+M+M+"단==");
			while (dan <= M) {
				System.out.print(dan+"단\t");
				dan++;
			}
			System.out.println();
			
			while (multi <= M) {
				dan=1;
				while (dan <= M) {
					if(dan==9|multi==9|(dan*multi)%10==9|(dan*multi/10)%10==9|(dan*multi)/100==9) {
					System.out.print(dan+"*"+multi+"="+(dan*multi)+"\t");
					}else{
					System.out.print(dan+"*"+multi+"="+"9\t");
					}
					dan++;
								  }
				System.out.println();
				multi++;
							    }
			
	}
}
