package T20230417;

import java.util.Scanner;

public class SumUpFor {

	public static void main(String[] args) {
		// 1부터 n까지의 합 구하기

		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		int n;
		do {
			System.out.println("n의 값:");
			n = stdIn.nextInt();
		} while(n <=0);
		
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += i;                       // sum에 i를 더한다
		System.out.println("1부터" + n + "까지의 합은"+ sum+"입니다.");
				
		
	}

}
