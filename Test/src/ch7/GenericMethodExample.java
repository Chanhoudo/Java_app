package ch7;

public class GenericMethodExample {

	public static <T> GStack<T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>();
		while(true) {
			T tmp;
			tmp = a.pop();
			if(tmp==null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<Double> gs = new GStack<Double>();
		GStack<Integer> ig = new GStack<Integer>();
		
		for(int i=0; i < 5; i++) {
			gs.push(new Double(i));
			ig.push(new Integer(i));
		}
		gs = reverse(gs);
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
			System.out.println(ig.pop());
		}
	}

}
