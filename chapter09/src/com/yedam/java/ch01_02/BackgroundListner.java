package com.yedam.java.ch01_02;

import com.yedam.java.ch01_02.CheckBox.OnSelectListner;

public class BackgroundListner implements OnSelectListner {
	
	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}

}
