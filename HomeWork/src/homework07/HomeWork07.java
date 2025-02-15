package homework07;

import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
		obj.process();
	}

	public void process() {
		// 문자 맞추기 게임 
		String[] words = {"airplane", "apple", "bicycle", "cloud", "fruits"};
		
		
		int wordSel = (int)(Math.random()*words.length);
		
		String word = words[wordSel];
//		System.out.println(word);
		
		// 문자열 -> 문자 배열 
		// toCharArray
		char[] wordChars = word.toCharArray();
		
//		for(int i=0; i<wordChars.length; i++) {
//			System.out.print(wordChars[i]);
//		}
		
		for(int i=0; i<10000; i++) {
			int ran = (int)(Math.random()*wordChars.length);
			// f
			char temp      = wordChars[0];
			// f              u
			wordChars[0]   = wordChars[ran];
			// u              f
			wordChars[ran] = temp;
		}
		
		// 섞인 문자열을 출력 하고 
		// 정답을 맞추세요 
		//      정답이 틀린경우 계속 진행 
		//      정답을 맞춘경우 반복문 종료 후 몇번 시행 했는지 출력 
		//
		int cnt =0;
		
		while(true) {
			cnt++;
			
			System.out.println(wordChars);
			System.out.print("답 : ");
			String answer = sc.next();
			if(answer.equals(word)) {
				System.out.println("정답입니다");
				break;
			}
			System.out.println("재도전 하세요!");
			
		}
		System.out.println(cnt+" 번 만에 맞추셨습니다.");

	}
}
