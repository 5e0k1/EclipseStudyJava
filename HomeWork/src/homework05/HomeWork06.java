package homework05;

import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
	public void method1() {
		// 스캐너를 이용해서 구구단 한단만 출력하시오 .
		// ex )  2 
		//       2*1 =2
		//       2*2 =4 
		//       .
		//       .
		//       2*9 = 18
		System.out.print("원하는 단을 입력해주세요(2~9) : ");
		int dan = sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d =%d\n",dan,i,dan*i);
		}
		
		
	}
	
	public void method2() {
		// 구구단 
		// 2*1=2  3*1=3  4*1=4 ....  9*1=9
		// 2*2=2  3*2=3  4*2=4 ....  9*2=18
		// 2*3=2  3*3=3  4*3=4 ....  9*3=27
		//
		//
		// 2*9=2  3*9=3  4*9=4 ....  9*9=81
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.printf("%d*%d=%d\t",dan,i,dan*i);
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		// 스캐너를 이용해서 특정 단을 뺀 구구단을 출력하시오.
		// ex ) 3
		// 2*1=2   4*1=4 ....  9*1=9
		// 2*2=2   4*2=4 ....  9*2=18
		// 2*3=2   4*3=4 ....  9*3=27
		//
		//
		// 2*9=2   4*9=4 ....  9*9=81
		System.out.print("뺄 단을 입력하세요(2~9) : ");
		int skip = sc.nextInt();
		
		 for(int i=1;i<=9;i++) {
				for(int dan=2;dan<=9;dan++) { 
					if(dan==skip){
						System.out.print("\t");
						continue;
					}
					System.out.printf("%d*%d=%d\t",dan,i,dan*i);
			}
			System.out.println();
		}
			
		
		
	}
	
	public void method4() {
		// 홀수를 입력하면 홀수의 합 
		// 짝수를 입력하면 짝수제곱의 합을 구하시오.
		// ex) 5 -> 1+3+5 
		//     6 -> 2*2 +4*4+6*6
		System.out.print("숫자를 입력해주세요 : ");
		int num =sc.nextInt();
		int sum =0;
		if(num%2==1){
			for(int i=1;i<=num;i+=2) {
				sum +=i;
			}
			System.out.println("입력하신 숫자는 홀수 입니다.");
			System.out.println("홀수의 합 : "+sum);
		}
		else {
			for(int i=2;i<=num;i+=2) {
				sum +=i*i;
			}
			System.out.println("입력하신 숫자는 짝수 입니다.");
			System.out.println("짝수 제곱의 합 : "+sum);
		}
		
	}
	
	
}
