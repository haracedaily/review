package com.house.review02;

public class GameExample {

	public static void main(String[] args) {
		Keypad game = new RPGgame();
		System.out.println("RPGgame 실행");
		game.leftUpButton();
		game.rightUpButton();
		game.changeMode();
		game.rightUpButton();
		game.rightDownButton();
		game.leftDownButton();
		game.changeMode();
		game.rightDownButton();
		System.out.println("================");
		game=new ArcadeGame();
		System.out.println("ArcadeGame 실행");
		game.leftUpButton();
		game.rightUpButton();
		game.leftDownButton();
		game.changeMode();
		game.rightUpButton();
		game.leftUpButton();
		game.rightDownButton();
		
		
	}

}
