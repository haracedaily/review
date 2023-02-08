package com.house.review04;

import java.util.Scanner;

public class GameExample {

	public static void main(String[] args) {
		/*
		 문제) Orange, Game, Phone, Smart 중 랜덤으로 선택한 단어를 맞추는 프로그램을 구현하세요.
		 메뉴 구성은 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 로
		 각 메뉴의 기능은 아래와 같습니다. 
		 1. 문자하나 : 문자 단위로 입력을 받으며 정답에 포함된 문자인지 확인
		 2. 단어    : 단어 단위로 입력을 받으며 정답인지 확인
		 3. 입력내역 : 게임이 진행되는 동안 입력된 문자를 입력 순으로 출력
		 4. 새 게임  : 기존에 선택한 단어 대신 랜덤으로 새 단어를 선택하며 입력내역을 초기화
		 5. 종료     : 프로그램을 종료
		 
		 현재 실행코드와 실행결과를 참고하여 StringGame 클래스를 완성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		StringGame game = new StringGame();
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println(" 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("---------------------------------------------");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				game.setCharData();
				break;
			case 2:
				game.setStrData();
				break;
			case 3:
				game.showCharData();
				break;
			case 4:
				game.init();
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴를 입력하셨습니다.");
			
			}
		}
	}
	}

}
