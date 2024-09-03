package ch2;

public class NestedLoop {
	public static void main(String[] args) {
		for (int i=2; i < 10; i++) {
			System.out.println(i + "단 시작");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + i*j);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
}
