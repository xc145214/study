package lesson1;

import java.util.Date;
import java.util.Properties;

public class Property {

	/**
	 * the first thinking in java example program
	 * @author hadoop
	 * @version 1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Thread.currentThread().sleep(5*1000);
		} catch(InterruptedException e){
			
		}
		
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		
		System.out.println("--- Memory Usage:");
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory ="
				+ rt.totalMemory()
				+ "Free Memory : " 
				+ rt.freeMemory());
	}

}
