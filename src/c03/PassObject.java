package c03;

public class PassObject {

	static void f(Letter y){
		y.c = 'z';
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1: x.c: "+ x.c);
		
		f(x);
		System.out.println("2: x.c: "+ x.c);
	}

}
