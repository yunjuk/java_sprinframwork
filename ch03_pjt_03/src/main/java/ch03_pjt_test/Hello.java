package ch03_pjt_test;

import java.util.Scanner;

public class Hello {

	
	public void sayHello() {
		System.out.println("Hello maven Project");
	}
	
	public void selectHello() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("언어를 선택하세요. 1. 한국어 2. English");
		String str = sc.nextLine();
		int num = sc.nextInt();
		
		if(str.equals("한국어")) {
		  System.out.println("안녕하세요");
		}else if (num == 1){
			System.out.println("안녕하세요");
		}else {
			System.out.println("Hello ");
		}
		sc.close();
		
	}
}
