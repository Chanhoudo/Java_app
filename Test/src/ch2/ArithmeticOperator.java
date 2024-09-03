package ch2;
import java.util.Scanner;


public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt();
		int scond = time % 60;
		int minute = (time % 60) % 60;
		int hour = (time % 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(scond + ", 분은 ");
		System.out.print(minute + ", 시는 ");
		System.out.print(hour + "입니다.");
		
		scanner.close();
	}
}
