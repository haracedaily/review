package com.house.review;

public class review {

	public static void main(String[] args) {
		
		//문제1
		int Ival = 37;
		int Ival2 = 91;
		System.out.println("Ival : "+Ival);
		System.out.println("Ival2 : "+Ival2);
		
		//문제2
		int Iresult=Ival+Ival2;
		int Iresult2=Ival-Ival2;
		int Iresult3=Ival*Ival2;
		int Iresult4=Ival/Ival2;
		System.out.println(Iresult);
		System.out.println(Iresult2);
		System.out.println(Iresult3);
		System.out.println(Iresult4);
		
		//문제3		
		/*byte var1=128;
		char var2="B";
		String Var3 = 44032;
		int var4 = 100000000000;
		float var5 = 43.93106;
		long var6 = 301.3; */
		short var1 = 128;
		char var2 = 'B';
		char var3=44032;
		Long var4 = 100000000000L;
		double var5 = 43.93106;
		float var6 = 301.3f;
		
		System.out.printf("%d, %s\n",var1, "short");
		System.out.printf("%s, %2$s\n",var2, "char");
		System.out.printf("%s, %2$s\n",var3, "char");
		System.out.printf("%d, %s\n",var4, "Long");
		System.out.printf("%.5f, %s\n",var5, "double");
		System.out.printf("%.1f, %s\n",var6, "float");
		
		int var3_1=var3;
		System.out.printf("%s, %2$s\n",var3_1, "int");

		
		//문제4
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		
		// 4-1)
		int result1 = a+c+(int)d;
		System.out.println(result1);
		
		
		// 4-2 )
		int result2 = a + b + c;
		System.out.println(result2);
		

		// 4-3 )
		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);	
		
		  
		/* 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
		    출력예시) A278번지10.0 */
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		
		int intresult=intValue1+intValue2;
		float fValue4=intValue4;
		String Resultpre=String.valueOf(charValue)+(int)(intValue1+intValue2)+intValue3+strValue+(float)intValue4;
		System.out.println(Resultpre);
		   	System.out.printf("%1$s%2$d%3$s%4$s%5$.1f\n",charValue,intresult,intValue3,strValue,fValue4);
		   	//valueof 와 toString으로 문자열
		  
			//System.out.printf("%1$s%2$s%3$.1f\n",charValue,strValue,fValue4);

	    /* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요.
		    예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
		    힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
		int value = 485;
		int intval=value/100;
		int intval2=(value/10)%10;
		int intval3=value%10;
		int Intresult=(value/100+(value/10)%10+value%10);		
		System.out.println(value/100+(value-405)/10+(value-480));
		System.out.printf("%1$d 일 경우 %2$d + %3$d + %4$d = %5$d 으로 결과는 %5$d입니다.",value,intval,intval2,intval3,Intresult);
	}

}
