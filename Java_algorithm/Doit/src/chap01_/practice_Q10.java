package chap01_;

import java.util.Scanner;

public class practice_Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		System.out.print("a의 값 : "); 
		a = sc.nextInt();
		
		while(true) {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			
			if (b>a) break; 
			
			System.out.println("a보다 큰 값을 입력하세요.");
		}
		
		int result = b - a;
		System.out.println("b - a는 : " + result + "입니다.");
		
		
		
		
		
	}

}
