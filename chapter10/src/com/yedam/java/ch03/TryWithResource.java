package com.yedam.java.ch03;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		// try-with-resources문

		// 파일정보 불러올 때 사용하는 클래스
		/*
		 * FileInputStream fis = null; try { fis = new FileInputStream("a.txt"); } catch
		 * (FileNotFoundException e) { System.out.println(e); e.printStackTrace();
		 * return; } finally { if(fis != null) { try { fis.close(); } catch (IOException
		 * e) { e.printStackTrace(); } } System.out.println("항상 수행됩니다."); }
		 * System.out.println("여기도 수행됩니다.");
		 */

		try (AutoCloseObj ojb = new AutoCloseObj()) {
			// 리소스를 사용하는 실행문
			
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}

		try (FileInputStream is = new FileInputStream("a.txt")) {
			
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println();
		}
		System.out.println();
	}
}
