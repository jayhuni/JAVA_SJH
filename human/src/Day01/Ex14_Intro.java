package Day01;

import java.util.Scanner;

public class Ex14_Intro {
	public static void main(String[] args) {
		System.out.println("이름, 나이, 키, 주소를 공백으로 두고 입력하세요~!");
		
		Scanner sc = new Scanner(System.in);
		
		//String : 문자열을 표현하는 참조 자료형
		//String 변수 ="문자열";
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		double height = sc.nextDouble();
		System.out.println("키 : " + height);
		
		String address = sc.nextLine();
		System.out.println("주소 : "+ address);
		
		sc.close();
	}

}
