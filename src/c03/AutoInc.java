package c03;

/*
 * autoInc.java
 * demonstrates the ++ and --oprators
 */
public class AutoInc extends MathOps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 1;
		prt("i: "+ i);
		
		prt("++i :"+ ++i);
		prt("i++ : "+ i++);
		
		prt("i :"+i);
		
		prt("--i :"+ --i);
		prt("i-- :" + i--);
		
		prt("i :"+ i);

	}

}
