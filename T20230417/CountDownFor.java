package T20230417;

import java.util.Scanner;

public class CountDownFor {

	public static void main(String[] args) {
		// 양의 정숫값은 0까지 카운트다운 (for문)

		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다");
		
		int x;
		do {
			System.out.println("양의 정숫값:");
			x = stdIn.nextInt();
		} while ( x <=0);
		
		for (; x >=0 ; x--)
		 System.out.println(x);     //x값을 표시
		
			
	}

}
