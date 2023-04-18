package T20230418;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// 피라미드 표시 
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("피라미드를 표시합니다");
		System.out.println("단수는?:");
		int n = stdIn.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-1; j++) 
		    System.out.println(' ');
			for (int j=1; j<=2*i-1; j++)
		  System.out.println('*');
		System.out.println();
		
		}		
	}

}
