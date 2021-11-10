package com.yedam.app;

import java.util.Scanner;

import com.yedam.app.common.Frame;

public class BoardMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===================");
			System.out.println("== 1.회원 2.게시글 3.댓글 9.종료 ==");
			System.out.println("===================");
			System.out.print("선택>>");
			int selected = sc.nextInt();

			Frame frame = null;

			if (selected == 1) {
				frame = new UserFrame();
			} else if (selected == 2) {
				frame = new BoardFrame();
			} else if (selected == 3) {
				frame = new CommentFrame();
			} else if (selected == 9) {
				System.out.println("종료");
				break;
			}
			frame.run();
		}

	}

}
