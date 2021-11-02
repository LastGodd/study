package com.yedam.java.ch01_02;

public class CheckBox {
	OnSelectListner listner;

	void setOnSelectListner(OnSelectListner listner) {
		this.listner = listner;
	}

	void select() {
		listner.onSelect();
	}

	static interface OnSelectListner {
		void onSelect();
	}
}
