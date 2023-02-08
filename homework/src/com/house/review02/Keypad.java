package com.house.review02;

public interface Keypad {
	public int NORMAL_MODE = 0;
	public int HARD_MODE = 1;
	
	public abstract void leftUpButton();
	public abstract void leftDownButton();
	public abstract void rightUpButton();
	public abstract void rightDownButton();
	public abstract void changeMode();
}
