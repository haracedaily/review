package com.house.review02;

public class RPGgame implements Keypad{
	int nowmode;
	
	public RPGgame() {
		this.nowmode=0;
	}
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");		
	}

	@Override
	public void rightUpButton() {
		if(nowmode==0) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}
		if(nowmode==1) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if(nowmode==0) {
			System.out.println("캐릭터가 일반 공격.");
		}
		if(nowmode==1) {
			System.out.println("캐릭터가 HIT 공격.");
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
