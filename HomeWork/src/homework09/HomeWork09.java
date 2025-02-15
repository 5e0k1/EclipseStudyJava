package homework09;

import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		HomeWork09 obj = new HomeWork09();
		obj.process();
	}

	public void process() {
		// 8번 과제를 클래스로 변경해서 수행할것.
		
		Student[] stuList = new Student[5];
		Student s1 = new Student();
		s1.name = "김석원";
		s1.kor = 90;
		s1.eng = 80;
		s1.math = 70;
		s1.sum = 0;
		s1.avg = 0;
		s1.rank = 1;
		Student s2 = new Student();
		s2.name = "김석투";
		s2.kor = 84;
		s2.eng = 72;
		s2.math = 65;
		s2.sum = 0;
		s2.avg = 0;
		s2.rank = 1;
		Student s3 = new Student();
		s3.name = "김석쓰";
		s3.kor = 87;
		s3.eng = 99;
		s3.math = 42;
		s3.sum = 0;
		s3.avg = 0;
		s3.rank = 1;
		Student s4 = new Student();
		s4.name = "김석포";
		s4.kor = 77;
		s4.eng = 61;
		s4.math = 81;
		s4.sum = 0;
		s4.avg = 0;
		s4.rank = 1;
		Student s5 = new Student();
		s5.name = "김석파";
		s5.kor = 80;
		s5.eng = 77;
		s5.math = 92;
		s5.sum = 0;
		s5.avg = 0;
		s5.rank = 1;
		
		stuList[0] = s1;
		stuList[1] = s2;
		stuList[2] = s3;
		stuList[3] = s4;
		stuList[4] = s5;
		//총점,평균
		for (int i=0;i<stuList.length;i++) {
			 stuList[i].sum = stuList[i].kor + stuList[i].eng + stuList[i].math;
			 stuList[i].avg = (int)((stuList[i].sum/3.0+0.05)*10)/10.0;
			}
		
		//등수
		for (int i=0;i<stuList.length;i++) {
			for(int j=0;j<stuList.length;j++) {
				if(stuList[i].sum>stuList[j].sum) stuList[j].rank++;
			}
		}
		
		//정렬
		for (int i=0;i<stuList.length-1;i++) {
			boolean pass = false;
			for(int j=0;j<stuList.length-1;j++) {
				if(stuList[j].rank>stuList[j+1].rank) {
					Student temp=  stuList[j+1];
					stuList[j+1] = stuList[j];
					stuList[j] = temp;
					pass = true;
				}
				
				if(!pass) break;
			}
		}
		
		
		//출력하기

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================");
		for(int i=0;i<stuList.length;i++) {
			System.out.println(stuList[i]);
		}
		System.out.println("======================================================");
			
		
		}
		
		
		
		
		
		
	
	}


class Student{
	// 국 영 수 총점 평균 등수 이름
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	@Override
	public String toString() {
		return name +"\t"+ kor +"\t"+ eng +"\t"+ math +"\t"+ sum +"\t"+ avg +"\t"+ rank;
	}
	
	
}