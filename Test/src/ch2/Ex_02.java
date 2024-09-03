package ch2;
import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오: ");
		
		int price = scanner.nextInt();
		
		//int m_50000 = price / 50000;
		System.out.println("5만원권 "+price/50000+"매 입니다.");
		price = price % 50000;
		
		//int m_10000 = price / 10000;
		System.out.println("1만원권 "+price/10000+"매 입니다.");
		price = price % 10000;
		
		//int m_5000= price / 5000;
		System.out.println("5천원권 "+price/5000+"매 입니다.");
		price = price % 5000;
		
		//int m_100 = price / 100;
		System.out.println("100원 동전 "+price/100+"개 입니다.");
		price = price % 100;
		
		//int m_50 = price / 50;
		System.out.println("50원 동전 "+price/50+"개 입니다.");
		price = price % 50;
		
		//int m_10 = price / 10;
		System.out.println("10원 동전 "+price/10+"개 입니다.");
		price = price % 10;
		
		//int m_1 = price / 1;
		System.out.println("1원 동전 "+price/1+"개 입니다.");
		price = price % 1;
		
		scanner.close();
	}
}
