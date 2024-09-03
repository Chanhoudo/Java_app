package ch6;

class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x==p.x && y == p.y) return true;
		else return false;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "입니다.");
	}

}
