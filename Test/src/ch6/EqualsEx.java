package ch6;



public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if (a == b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a in equal to b");
		if(a.equals(c))
			System.out.println("a in equal to c");
	}

}
