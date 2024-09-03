package ch3;
import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료됩니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			
			if(text.equals("exit")) {
				break;
			}
		}
		System.out.print("시스템을 종료합니다.");
		
		scanner.close();
	}
}
