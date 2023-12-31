package Day03;

import java.util.Scanner;

public class Ex07_ZigZag {

	public static void main(String[] args) {
		// 배열의 크기 N을입력 받아,
		// NxN 구조의 배열에 1부터 시작하여 1씩 증가하는 값을 대입하는데,
		// 1행부터는 왼쪽에서 오른쪽 순서로 값을 대입하고
		// 행이 바뀔 때마다 순서를 반대로 대입하는 2차원배열을 만들고 출력하시오.

		// 1. N을 입력받는다
		// 2. NxN 구조의 배열을 생성한다
		// 3. 초기값이 1인 변수 k 를 선언
		// 4. 배열을 반복하여,
		// i) 정방향으로 값을 대입
		// ii) 역방향으로 값을 대입
		// 5. 배열을 반복하여 출력한다
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int k = 1;
		int sw = 1;

		for (int i = 0; i < arr.length; i++) {
			// 안쪽 반복문 : j - 열
			if (sw == 1) {
				for (int j = 0; j < N; j += sw) {
					arr[i][j] = k++;
				}
				// sw = -1;
			} else {
				for (int j = N - 1; j >= 0; j += sw) {
					arr[i][j] = k++;
				}
				// sw = 1;
			}
			// 방향 전환
			sw = sw * (-1);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		sc.close();
	}
}

