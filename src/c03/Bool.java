package c03;

import java.util.Random;

public class Bool {

	static void prt(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int i = rand.nextInt();
		int j = rand.nextInt();
		prt("i = "+ i);
		prt("j ="+ j);
		prt("i > j is " + (i > j));
		prt("i < j is " + (i < j));
		prt("i >= j is " + (i >= j));
		prt("i <= j is " + (i <= j));
		prt("i == j is "+ (i == j));
		prt("i != j is "+ (i != j));
		
		//thradting an int as a boolena is not legal java
		//prt("i && j is " + ( i && j));
		//prt("i || j is " + ( i || j));
		//prt("!i is " + ( !i ));
		
		prt("(i<10) && (i>10) is " + ((i<10) && (i>10)));
		prt("(i<10) || (i>10) is " + ((i<10) || (i>10)));
	}
}
