package T20230413;
// 읽은 2개의 실숫값 중에서 큰 쪽을 표시(방법1 : if문) 
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("실수 a:"); int a = stdIn.nextInt();
		System.out.print("실수 b:"); int b = stdIn.nextInt();
		
		double max; // 큰 값을 저장
	    if (a > b)
	    	max = a;
	    else
	    	max = b;
	    System.out.println("큰 쪽의 값은 " + max + "입니다.");

	}

}
