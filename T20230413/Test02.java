package T20230413;

import java.util.Scanner;

class Absolute1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
	    System.out.print("정숫값:");
		int n = stdIn.nextInt();
		
		// if (조건식) 실행문 else 실행문 
		if (n >=0)
			// n >=0이 true일 때 실행한다.
			System.out.println("절댓값은"+ n + "입니다.");
		else 
			// n>0이 false 일 때 실행한다.
			System.out.println("절댓값은 "+ -n +"입니다.");
	
	}

}
