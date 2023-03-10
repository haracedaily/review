package com.house.review02;

public class ArcadeGame implements Keypad{
	int nowmode;
	
	public ArcadeGame() {
		this.nowmode=0;
	}
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if(nowmode==0) {
			System.out.println("캐릭터가 일반공격");
		}
		if(nowmode==1) {
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		if(nowmode==0) {
			System.out.println("캐릭터가 HIT 공격.");
		}
		if(nowmode==1) {
			System.out.println("캐릭터가 Double HIT 공격.");
		}
	}

	@Override
	public void changeMode() {
		if(nowmode==HARD_MODE) {
			System.out.println("Normal mode로 변경합니다.");
			nowmode=NORMAL_MODE;
		}
		else if(nowmode==NORMAL_MODE) {
			System.out.println("Harde mode로 변경합니다.");
			nowmode=HARD_MODE;
		}
		
	}
	
}
