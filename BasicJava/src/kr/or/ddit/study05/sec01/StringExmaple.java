package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class StringExmaple {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringExmaple obj = new StringExmaple();
		obj.process();
	}

	public void process() {
		
		
//		String a = "강감찬";
//		String b = "강감찬";
//		String c = "이순신";
//		String d = new String("이순신");
//		String e = new String("이순신");
//		
//		System.out.println(a==b);
////		System.out.println(c==d);
////		System.out.println(d==e);
//		
//		System.out.println(c.equals(d));
//		System.out.println(d.equals(e));
		
		
		String a = null;
		
		if(a==null || a.equals("")) {
			System.out.println("값이 비었음");
		}
		
//		if(a.equals("") || a==null) {
//			System.out.println("값이 비었음");
//		}
		
		
		
	}
}
