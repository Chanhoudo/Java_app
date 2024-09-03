package ch2;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요: ");
		int price = scanner.nextInt();
		
		double trance = price/1200.0;
		System.out.print(price + "원은 $"+ trance+ "입니다.");
		
		scanner.close();
	}
}
