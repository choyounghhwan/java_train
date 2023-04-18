package T20230418;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		// 정숫값의 제곱 표시(방법1)
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정숫값:");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++)
	
		System.out.println(i + "의 재곱은" + i * i+ "입니다.");
	
	}

}
