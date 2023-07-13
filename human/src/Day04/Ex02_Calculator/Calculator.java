package Day04.Ex02_Calculator;

/**
 * 계산기 - 피연사자를 2개로 하는 계산기 - 기능 1. 덧셈 : 정수 2개를 덧셈 1. 뺄셈 : 정수 인자1 - 인자2 연산하는 뺄셈 1.
 * 곱셈 : 실수 2개를 곱셈 1. 나눗셈 : 실수 인자1 / 인자2 나눗셈 1. 나머지 : 정수 인자1 % 인자2 나머지 연산 1. 합계 :
 * 배열을 매개변수로 전달받아, 모든 요소의 합을 구함 1. 평균 : 배열을 매개변수로 전달받아, 평균을 구함
 */
public class Calculator {

	// 더셈
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	// minus, multiple, divide, remain, sum, avg
	// 나머지 메소드를 저의해보세요..
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public double multiple(double a, double b) {
		double result = a * b;
		return result;
	}

	public double divide(double a, double b) {
		double result = a / b;
		return result;

	}

	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}

	public int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;

		}
		return sum;
	}

	public double avg(int[] arr) {
		double avg = (double) sum(arr) / arr.length;

		return avg;
		/*
		 * double average = 0.0; int sum = 0; for (int i : arr) { sum += i;
		 * 
		 * } average = (double)sum / arr.length; return average;
		 */
	}
}