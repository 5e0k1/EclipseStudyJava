package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample01 obj = new ForExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
		method10();
	}
	
	public void method10() {
		// 입력한 문자 ~ z 까지 출력 
		
		String str = sc.nextLine();
		
		
		for(char ch = str.charAt(0); ch<='z'; ch++) {
			System.out.print(ch);
		}
		
		
	}
	
	
	public void method9() {
		// a ~ 내가 입력한 문자까지 출력.
		
		// charAt
		
		String str = sc.nextLine();
		
		char ed = str.charAt(0);
		
		for(char ch='a' ;ch<=ed; ch++) {
			System.out.print(ch);
		}
		
		
		
	}
	
	
	public void method8() {
		// a ~ z 까지 출력하기.
		
//		for(int i=65 ;i<65+26; i++) {
//			char ch = (char) i;
//			System.out.println(ch);
//		}
		
//		for(int i='a' ;i<='z'; i++) {
//			char ch = (char) i;
//			System.out.println(ch);
//		}
		
		for(char ch='a' ;ch<='z'; ch++) {
			System.out.println(ch);
		}
		
	}
	
	public void method7() {
		// 1~10 까지 홀수의 합.
		int sum =0; 
		for(int i=1; i<=10; i+=2) {
			sum+=i;
		}
		System.out.println("1~10까지 홀수의 합 : "+sum);
		
	}
	
	public void method6() {
		// 1~ 10까지 짝수의 합
		
		int sum =0; 
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~10까지 짝수의 합 : "+sum);
	}
	
	
	public void method5() {
		// 스캐너를 통해서 시작값과 끝값 지정 후 
		// 합을 구하시오. 5 ~ 10 
		
		int st = sc.nextInt();
		int ed = sc.nextInt();
		
		int sum =0; 
		for(int i=st; i<=ed ; i++) {
			sum+=i;
		}
		System.out.println(st+"~"+ed +"의 합은 : "+sum);
	
		
	}
	
	public void method4() {
		//  5 ~10 까지 합 구하기.
		
		int sum =0; 
		for(int i=5 ;i<=10; i++) {
			sum+=i;
		}
		System.out.println("5~10까지의 합 : "+sum);
		
	}
	
	
	public void method3() {
		// 1~10 출력하기.
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
	}
	
	public void method2() {
		int sum =0; 
		
		for(int i=1; i<=3; i++) {
			sum+=i;
		}
		
		System.out.println("1~5 까지의 합 : "+sum);
		
		
	}
	
	public void method1() {
		// 1~5까지의 합.
		
		int sum =0; 
		sum+=1; 
		sum+=2; 
		sum+=3; 
		sum+=4; 
		sum+=5; 
		
		System.out.println("1~5까지의 합은 : "+sum);
		
		
	}
}
