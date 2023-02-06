package com.house.review02;

import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Keypad game = new RPGgame();
		boolean run=true;

		int randGame=(int)(Math.random()*2)+1;
		if(randGame==1) {
			System.out.println("RPGgame 실행");
			game = new RPGgame();
		}else if(randGame==2) {
			System.out.println("ArcadeGame");
			game = new ArcadeGame();
		}
		while(run) {
			System.out.println("============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("============================================================================================");
			System.out.println("choice>>");
			int key=Integer.parseInt(sc.nextLine());
			switch(key) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightUpButton();
				break;
			case 4:
				game.rightDownButton();
				break;
			case 5:
				game.changeMode(1);
				break;
			case 0:
				System.out.println("게임변경>>1.RPGgame\t2.ArcadeGame");
				int choice=Integer.parseInt(sc.nextLine());
				randGame=choice;
				if(randGame==1) {
					System.out.println("RPGgame 실행");
					game = new RPGgame();
				}else if(randGame==2) {
					System.out.println("ArcadeGame");
					game = new ArcadeGame();
				}
				break;
			case 9:
				System.out.println("게임을 종료합니다.");
				run=false;
			}
		}

	}

}
