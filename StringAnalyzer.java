package practice2;

import java.util.Scanner;

public class StringAnalyzer {

	public static void main(String[] args) {
		// practice stringAnalyzer
		
		Scanner sc = new Scanner(System.in);
		String str = "가나다 Hello World 123 456";
		
		//전체 길이 출력
		System.out.println("전체 길이 : " + str.length());
		
		
		//공백 제외 길이 출력
		//(1)
		int withoutSpace1 = str.replace(" ", "").length();
		System.out.println("공백 제외 길이 : " + withoutSpace1);
		
		//(2)
		int withoutSpace2 = str.replaceAll("\s", "").length();
		System.out.println("공백 제외 길이 : " + withoutSpace2);
		
		//(3)
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("공백 제외 길이 : " + count);

		
		//알파벳 개수
		//(1)
		int count2 = 0;
		for(int i = 0; i<str.length(); i++) {
			if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				count2++;
			}
		}
		System.out.println("알파벳 개수 : " + count2);
		
		//(2)
		String english = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("알파벳 개수 : " + english.length());
		
		
		//숫자 개수
		//(1)
		int count3 = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count3++;
			}
		}
		System.out.println("숫자 개수 : " + count3);
		
		//(2)
		int count4 = 0;
		for(int i = 0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				count4++;
			}
		}
		System.out.println("숫자 개수 : " + count4);
		
		//(3)
		String number = str.replaceAll("[^0-9]", "");
		System.out.println("숫자 개수 : " + number.length());
		
		
		//소문자, 대문자 개수
		int count5 = 0;
		for(int i = 0; i<str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				count5++;
			}
		}
		System.out.println("소문자 개수 : " + count5);
		
		int count6 = 0;
		for(int i = 0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				count6++;
			}
		}
		System.out.println("대문자 개수 : " + count6);
		
		
		//토큰화
		String[] word = str.split(" ");
		int count7 = word.length;
		System.out.println("토큰 개수 : " + count7);
	}

}
