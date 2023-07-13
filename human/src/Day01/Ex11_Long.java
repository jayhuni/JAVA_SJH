package Day01;

public class Ex11_Long {
	
	public static void main(String[] args) {
	
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000l;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println("int 최댓값 : " + max);
		System.out.println("int 최솟값 : " + min);
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}
}
