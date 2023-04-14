package T20230413;

import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
		// 두 정수값 중 작은 값과 큰 값을 구해서 표시 
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		
		if (a==b) 
			System.out.println("두 값이 같습니다.");
		else {
			int min, max;
			if (a < b) {
				min=a;
				max=b;
				
			} else {
				min=a;
				max=b;		
				
		}
		
			System.out.print("작은 값은"+ min +" 입니다.");
			System.out.print("큰 값은"+ max +" 입니다.");
	
	}
	}
}
