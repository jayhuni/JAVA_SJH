package Day02;

import java.util.Scanner;

public class Ex21_Star2 {

	public static void main(String[] args) {
		// 입력 : 5
		// *****
		// ****
		// ***
		// **
		// *

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int N = sc.nextInt();
			

	for (int i = 1; i <= N ; i++) {
		for (int j = 1; j <= N - i + 1; j++) {
			//(int j = N; j >= i; j--)
			System.out.print("*");
		}
		System.out.println();
		
	}
	sc.close();
}


}


