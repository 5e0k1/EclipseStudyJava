package homework05;

import java.util.Iterator;
import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		HomeWork05 obj = new HomeWork05();
		obj.process();
	}

	public void process() {
//		method0();
//		method1();
//		method2();
		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method7_0();
	}
	public void method0() {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void method1() {
		/*	row = 4
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 */
		int row= sc.nextInt();
		
		for(int line =0; line<row; line++) {
			for(int star=0; star<line+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		}
	public void method2() {
		/*	row = 4
		 * 			*
		 * 		   **
		 * 		  ***
		 * 		 ****
		 */
		int row = sc.nextInt();
		
		for(int line =0; line<row; line++) {
			for(int space=0; space<row-(line+1);space++) {
				System.out.print(" ");
			}
			for(int star=0; star<line+1; star++) {
				System.out.print("*");
			}
					
			System.out.println();
		}
	}
	public void method3() {
		/*	row = 4
		 * 		****
		 * 		***
		 * 		**
		 * 		*
		 */
		int row = sc.nextInt();
		
		for (int line =row; line>0; line--) {
			
			for(int star =line; star>0; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method4() {
		/*	row = 4
		 * 		****
		 * 		 ***
		 * 		  **
		 * 		   *
		 */
		int row = sc.nextInt();
		
		for(int line =0;line<row;line++) {
			for(int space=0;space<line;space++) {
				System.out.print(" ");
			}
			for(int star=row-line;star>0;star-- ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public void method5() {
		/*	row = 4
		 * 		*
		 * 	   ***
		 * 	  *****
		 * 	 *******
		 */
		int row = sc.nextInt();
		
		for(int line =0;line<row;line++) {
			for(int space =0;space<row-(line+1);space++) {
				System.out.print(" ");
			}
			for(int star =0;star<line*2+1;star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	public void method6() {
		/*	row = 4
		 * 	*******
		 *   *****
		 * 	  ***
		 * 	   *
		 */
		int row = sc.nextInt();
		for(int line =0;line<row;line++) {
			for(int space =0;space<line;space++) {
				System.out.print(" ");
			}
			for(int star =(row-line)*2-1;star>0;star--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	public void method7() {
		/*	row = 4
		 * 	****
		 *  *  *
		 * 	*  *
		 * 	****
		 */
		int row = sc.nextInt();
		for(int line =0;line<row;line++) {
			if(line==0||line==row-1) {
				for(int i=0;i<row;i++) {
					System.out.print("*");
				}	
			}
			else {
				System.out.print("*");
				for(int i=0;i<row-2;i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	
	}
	public void method7_0() {
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if((0<j)&&(j<=(row-2))&&(0<i)&&(i<=(row-2))) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}