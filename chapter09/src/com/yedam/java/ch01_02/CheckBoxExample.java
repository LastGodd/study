package com.yedam.java.ch01_02;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListner(new BackgroundListner());
		checkBox.select();
	}
}
