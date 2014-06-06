package csvFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class CSVread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	}
	/**
	 * 使用流的形式读取文件的内容
	 * @param file 待读取的文件
	 */
	public static void readStream(String file)
	{
		try{
			//新建缓冲流
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = br.readLine()) != null){
				String item[] = line.split(",");
				for (String cell : item) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			
		}  catch (FileNotFoundException e) {  
			   e.printStackTrace();  
		  } catch (IOException e) {  
		   e.printStackTrace();  
		  }  
	}
	

}
