package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample01 obj = new IfExample01();
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
		method8();
	}
	
	public void method8() {
		
		int hour = 0;
		int min  = 0; 
		int sec  = 0; 

		while(true) {
			sec++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 초에따라 시간 분 변경하기.
			if(sec == 60) {
				min++;
				sec-=60;
			}
			if(min == 60) {
				hour++;
				min-=60;
			}
			if(hour == 13) {
				hour-=12;
			}
			System.out.println(hour +" : "+min+": "+sec);
		}
		
	}
	
	
	public void method7() {
		// 시 분을 입력 받고 30분전에 시간을 출력하시오.
		
		System.out.print("시 : ");
		int hour = sc.nextInt(); 
		
		System.out.print("분 : ");
		int min = sc.nextInt();
		
		min -=30;
		
		if(min <0) {
			hour--;
			min +=60;
		}
		
		if(hour<0) {
			hour+=12;
		}
		System.out.println(hour+" : "+min);
		
	}
	
	public void method6() {
		// 시 분을 입력 받고 30분뒤에 시간을 출력하시오.
		
		System.out.print("시 : ");
		int hour = sc.nextInt(); 
		
		System.out.print("분 : ");
		int min = sc.nextInt();
		
		min +=30;
		
		if(min >=60) {
			hour++;
			min -=60;
		}
		
		if(hour>12) {
			hour-=12;
		}
		System.out.println(hour+" : "+min);
		
	}
	
	
	public void method5() {
		// 월을 입력 받아 계절을 출력하시오.
		// 12~2 겨울
		// 3~5 봄 
		// 6~8 여름
		// 9~11 가을
		
		int month = sc.nextInt();
		
//		if(month ==12 || month ==1 || month ==2) {
//			System.out.println();
//		}
		
		if(month>=3 && month<=5) {
			System.out.println("봄");
		}
		else if(month>=6 && month<=8) {
			System.out.println("여름");
		}
		else if(month>=9 && month<=11) {
			System.out.println("가을");
		}
		else {
			System.out.println("겨울");
		}
		
		
		
		
	}
	
	
	
	public void method4() {
		
		// 5과목의 점수를 입력 받고 
		
		// 1과목이라도 40점 보다 적다면 불합격 
		// 평균이 60점 미만이라면 불합격.
		
		System.out.print("소프트웨어 설계 : ");
		int score1 = sc.nextInt();
		
		System.out.print("소프트웨어 개발 : ");
		int score2 = sc.nextInt();
		
		System.out.print("데이터베이스 구축 : ");
		int score3 = sc.nextInt();
		
		System.out.print("프로그래밍언어 활용 : ");
		int score4 = sc.nextInt();
		
		System.out.print("정보시스템 구축 : ");
		int score5 = sc.nextInt();
		
		double avg = (score1 + score2+ score3+score4+score5)/5;
		
		
//		if(score1>=40 && score2>=40 && score3>=40 && score4>=40 && score5>=40 
//				&& avg>=60) {
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
		
		if(score1<40 || score2<40 ||score3<40 ||score4<40 ||score5<40 || avg<60) {
			System.out.println("불합격");
		}
		else {
			System.out.println("합격");
		}
		
		
		
		
		
	}
	
	
	public void method3() {
		// 점수를 입력 받고 학점을 출력하시오.
		
		// 90 이상 A
		// 80 이상 B
		// 70 이상 C
		// 60 이상 D
		//    미만 F
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else if(score>=60 ) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
		
		
	}
	
	
	public void method2() {
		//점수를 입력 받고 합격인지 불합격인지 출력하시오.
		//60점 이상 합격.
		
		System.out.println("점수 :");
		int score = sc.nextInt();
		
		if(score>=60) {
			System.out.println("합격");
		}
//		if(score<60) {
		else {
			System.out.println("불합격");
		}
		
	}
	
	
	public void method1() {
		
		System.out.println("실행문1");
		if(false) {
			System.out.println("실행문2");
			
		}
		System.out.println("실행문3");
		
	}
	
	
	
}
