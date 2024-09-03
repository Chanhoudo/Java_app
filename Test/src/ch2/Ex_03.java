package ch2;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수 3개를 입력하시오");
		
		Scanner s = new Scanner(System.in);
		
		int n_1 = s.nextInt();
		int n_2 = s.nextInt();
		int n_3 = s.nextInt();
		int temp = 0;
		
		if (n_3 < n_1) {
			temp = n_1;
			n_1 = n_3;
			n_3 = temp;
		}
		if (n_3 < n_2) {
			temp = n_2;
			n_2 = n_3;
			n_3 = temp;
		}
		if (n_1*n_1 + n_2*n_2 >= n_3*n_3) {
			System.out.println("삼각형이 됩니다."); 	
		}
		else {
			System.out.println("삼각형이 될 수 없습니다");
		}
		s.close();
	}
}
