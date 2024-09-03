package ch2;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12): ");
		
		int month = sc.nextInt();
		
		if ( month > 2 && month < 6) {
			System.out.println("봄");
		}
		else if ( month > 5 && month < 9) {
			System.out.println("여름");
		}
		else if ( month > 8 && month < 12) {
			System.out.println("가을");
		}
		else if ( month == 12 || month == 1 || month == 2 ) {
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못입력했데이");
		}
		sc.close();
	}
}
