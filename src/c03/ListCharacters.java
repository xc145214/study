package c03;

public class ListCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(char c = 0; c < 128; c++){
			if(c != 26)
				System.out.println(" value " + (int)c + " character: "+ c);
		}
	}

}
