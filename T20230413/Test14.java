package T20230413;
//3개의 정수 중 최솟값 구하기 
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		System.out.print("정수 c:"); int c = stdIn.nextInt();
		
		int min = a;
		if (a < min) min = b;
		if (c < min) min = c;
		
		System.out.println("최솟값은 " + min +"입니다.");
		
	}

}
