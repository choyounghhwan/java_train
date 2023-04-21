package T20230419;

import java.util.Scanner;

public class OctHex1Line {

	public static void main(String[] args) {
		//10진수를 읽어서 8진수, 16진수로 표시(방법1)
		Scanner stdIn = new Scanner(System.in);
     
		System.out.println("정수:");
	    int x = stdIn.nextInt();
	    
	    System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n", x, x);
	
	}

}
