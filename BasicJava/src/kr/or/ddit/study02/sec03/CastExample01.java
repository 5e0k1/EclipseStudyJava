package kr.or.ddit.study02.sec03;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class CastExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CastExample01 obj = new CastExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
	
	public void method7() {
		
		// a 다섯번째 뒤에 문자를 출력하시오.
//		char ch ='a';
//		int i = ch + 5;
//		char ch2 = (char)i;
		
		char ch ='a';
		char ch2 = (char)(ch+5);
		
		System.out.println(ch2); 
		
		
	}
	
	public void method6() {
		
		// 소수점 첫째 자리까지만 출력
		double d = 10.4123;
		int i = (int)(d*10);
		double result = i/10.0;
		System.out.println(result);
	}
	
	public void method5() {
		// 
		int salt = 120; 
		int water = 200;
		
//		int per = (int)((double)salt/(salt+water)*100);
		int per = 100*salt/(salt+water);
		System.out.println(per+"%");
		
	}
	
	public void method4() {
		// 3명중에 2명을 뽑을때 확률을 %로 나타내시오.
		
//c		int per = (int)(2.0/3*100);
		int per = 100*2/3;
		
		System.out.println(per+"%");
		
		
	}
	
	
	public void method3() {
		
		// 1. char - > int 
		char c1 = 'a';
		int i1 = c1;
		
		// 2. int -> char
		int i2 = 100; 
		char c2 = (char)i2;
		
		// 3. char -> byte 
		char c3 = 'a';
		byte b3 = (byte)c3;
		// 4. byte -> char
		byte b4 = 100; 
		char c4 = (char)b4;
		
		// 5. char -> short 
		
		// 6. short -> char 
		
	}
	
	public void method2() {
		
		// 1. int -> long 
		int i1 = 100; 
		long l1 = i1; 
		
		// 2. long -> int 
		long l2 = 100; 
		int i2 = (int)l2;
		
		// 3. double -> int 
		double d3 = 10.4;
		int i3 = (int)d3;
		System.out.println("d3 : "+d3);
		System.out.println("i3 : "+i3);
		
		
		// 4. int -> double 
		int i4 = 10; 
		double d4 = i4;
		
		System.out.println("i4 : "+i4);
		System.out.println("d4 : "+d4);
		
	}
	
	
	public void method1() {
		// byte < short < int< long< float< double 
		//        char  <
		
		
		// 자동 캐스팅 
		// 작은 값을 큰값에 넣을때 자동으로 형 변환됨.
		
		byte b1 = 10; 
		short s1 = b1;
		
		// int -> long 
		int i2 = 1000;
		long l2 = i2;
		
		System.out.println("i2 : "+i2);
		System.out.println("l2 : "+l2);
		
		// 강제 캐스팅
		// 큰 값을 작은 타입에 넣을경우 
		// type1  = (type1)type2
		
		int i3 = 10; 
		short s3 = (short)i3;
		
		System.out.println("i3 : "+i3);
		System.out.println("s3 : "+s3);
		
		
		
	}
	
	
}
