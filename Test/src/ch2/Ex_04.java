package ch2;
import java.util.Scanner;
public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x, y)의 좌표를 입력하시오");
		
		int i_1 = sc.nextInt();
		int i_2 = sc.nextInt();
		
		if ((i_1 >= 100 && i_1 <= 200) && (i_2 >= 100 && i_2 <= 200))
		{
			System.out.println("("+i_1+","+i_2+")"+"은 사각형 안에 있습니다.");
		}
		else {
			System.out.println("("+i_1+","+i_2+")"+"은 사각형 안에 없습니다.");
		}
		sc.close();
	}
}
