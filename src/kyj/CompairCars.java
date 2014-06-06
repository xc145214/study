package kyj;

import java.util.List;

public class CompairCars {

	ReadText rt = new ReadText();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CompairCars cc = new CompairCars();
		cc.compareCars();
	 
	}

	public void compareCars(){
		
		String fileName1 =  "D:\\ddd\\69cars.txt";
		String fileName2 = "D:\\ddd\\128cars.txt";
		
		List<String> cars1 = rt.getCars(fileName1);
		List<String> cars2 = rt.getCars(fileName2);
		
		int sum = 0;
		for (String str1 : cars1) {
			
			if(!this.beIn(str1, cars2)){
				System.out.println(str1);
				sum +=1;
			}
		}
		
		System.out.println(sum);
	}
	
	public boolean beIn(String str1,List<String> strs){
		boolean beIn =false;
		
		for (String string : strs) {
			if(str1.equals(string.substring(1, 8))){
				beIn =true;
			}
		}		
		return beIn;
	}
}
