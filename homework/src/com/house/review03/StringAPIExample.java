package com.house.review03;

import java.util.Scanner;

public class StringAPIExample {

	public static void main(String[] args) {
		// 1)문자열 뒤집기
		// String str = "abcdefg" -> "gfedcba"
		String str = "abcdefg";
		String str1 = "";
		for (int i = 6; i >= 0; i--) {
			str1 += str.charAt(i);
		}
		System.out.println(str1);

		// 1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
//		예시 )  입력> tiger
//		          입력> lion
//		          입력> rabbit
//		          출력> 가장 짧은 단어는 lion이며, 길이는 4 입니다.
		Scanner sc = new Scanner(System.in);
		String[] str2 = new String[3];
		String ans = "";
		int min = 10;
		for (int i = 0; i < 3; i++) {
			System.out.println("세개의 단어를 입력>");
			str2[i] = sc.nextLine();
		}

		for (int i = 0; i < 3; i++) {
			if (str2[i].length() < min) {
				min = str2[i].length();
				ans = str2[i];
			}
		}
		System.out.println("가장 짧은 단어는 " + ans + "이며, 길이는 " + min + " 입니다.");
		// 2) 문자열 개수 세기
//		-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
//		예시) 
//		-> 입력 : 1a2b3c4d 5e
//		-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개
		
		String str3 = "1a2b3c4d 5e";
		byte[] bit = str3.getBytes();
		//Keycode[]=str3[];
		int res = 0;
		int res1 = 0;
		int res2 = 0;
		for (int i = 0; i < str3.length(); i++) {
			if (bit[i] > 47 && bit[i] < 58) {
				res++;
			} else if (bit[i] > 96 && bit[i] < 123) {
				res1++;
			} else if (bit[i] == 32) {
				res2++;
			}
		}
		System.out.println("문자 : " + res1 + "개, 숫자 : " + res + "개, 공백 : " + res2 + "개");
		// 3) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
//		조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
//		예시)
//		-> 입력 : "abcdefghijklmnopqrstuvwxyz"
//		-----------------------------------
//		-> 입력 : 첫번째 문자 : c
//		-> 입력 : 두번째 문자 : f
//		-> 출력 : 두 문자간의 거리 : 2
//		------------------------------------
//		-> 입력 : 첫번째 문자 : e
//		-> 입력 : 두번째 문자 : a
//		-> 출력 : 두 문자간의 거리 : 3
		String str4 = "abcdefghijklmnopqrstuvwxyz";
		int c;
		int d;
		int result;
		int choice;
		boolean run = true;
		String a;
		String b;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.print("입력 : 첫번째 문자 : ");
			a = sc.nextLine();
			System.out.print("입력 : 두번째 문자 : ");
			b = sc.nextLine();
			c = str4.indexOf(a);
			d = str4.indexOf(b);
			//풀이1
			System.out.println("출력 : 두 문자간의 거리 : " + (Math.abs(c - d)));// 절대값 API사용
			//풀이2
			result = (c > d) ? c - d : d - c;
			System.out.println("출력 : 두 문자간의 거리 : " + result);// 비교해서 사용
			//종료문
			System.out.println("여기서 종료를 원한다면 1, 이어서 더 하려면 2를 입력하세요");
			choice = Integer.parseInt(sc.nextLine());
			run = (choice == 1) ? false : true;
		}
		// 4) 중복문자 제거
//		입력 : aaabbccceedddd
//		출력 : abcd
		String q = "aaabbccceedddd";
		String w = "";
		// 풀이1
		for (int i = 0; i < q.length(); i++) {
			if (q.indexOf(q.charAt(i)) == i) {
				w += q.charAt(i);
			}
		}
		System.out.println(w);
		// 풀이2
		w = "";
		int e = q.indexOf("a");
		int r = q.indexOf("b");
		int t = q.indexOf("c");
		int y = q.indexOf("d");
		for (int i = 0; i < q.length(); i++) {
			if (q.indexOf(q.charAt(i)) == e) {
				w += q.charAt(i);
				e++;
			} else if (q.indexOf(q.charAt(i)) == r) {
				w += q.charAt(i);
				r++;
			} else if (q.indexOf(q.charAt(i)) == t) {
				w += q.charAt(i);
				t++;
			} else if (q.indexOf(q.charAt(i)) == y) {
				w += q.charAt(i);
				y++;
			}
		}
		System.out.println(w);
		// 풀이3<-혼합
		w = "";
		int u = q.indexOf("e");
		String o = "";
		for (int i = 0; i < q.length(); i++) {
			if (q.indexOf(q.charAt(i)) != u) {
				o += q.charAt(i);
			}

		}
		for (int i = 0; i < o.length(); i++) {
			if (o.indexOf(o.charAt(i)) == i) {
				w += o.charAt(i);
			}

		}
		System.out.println(w);
		
	}
}
