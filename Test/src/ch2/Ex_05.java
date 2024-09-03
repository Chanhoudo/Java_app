package ch2;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름을 입력하시오");
		
		int cp_1 = sc.nextInt();
		int cp_2 = sc.nextInt();
		double d = sc.nextDouble();
		
		System.out.print("점을 입력하시오(예 3 3)");
		double sp_1 = sc.nextDouble();
		double sp_2 = sc.nextDouble();
		double c1 = cp_1 - sp_1; 
		double c2 = cp_2 - sp_2;
		// 바뀐부분
		double d2 = d * d;
		c1 = c1 * c1;
		c2 = c2 * c2;
		// 거리를 구할때는 제곱해서 구해줘야 합니다.
		if (c1+c2 <= d2) {
			System.out.println("점 ("+sp_1+","+ sp_2+")"+"는 원 안에 있습니다.");
		}
		else {
			System.out.print("원에 없다~!!!!!!!");
		}
		sc.close();
		
		
	}
}
