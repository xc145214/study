package c04;

public class SimpleConstructor {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			new Rock();
		
		for (int i = 0; i < 10; i++)
			new Rock(i);
	}
}
