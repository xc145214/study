package kyj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class ReadText {

	public List<String> getCars(String fileName) {

		List list = new ArrayList<String>();

		try {
			String encoding = "utf-8";// 编码格式

			File file = new File(fileName);

			if (file.isFile() && file.exists()) {

				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到汉子编码格式

				BufferedReader bufferedReader = new BufferedReader(read);// 缓冲流

				String lineTxt = null;

				while ((lineTxt = bufferedReader.readLine()) != null) {

					
					//System.out.println(lineTxt);
					
					list.add(lineTxt); // 一般字符
				}
				read.close();

			}

		} catch (UnsupportedEncodingException e) {

			System.out.println("编码错误");//
		} catch (FileNotFoundException e) {

			System.out.println("文件未找到");
		} catch (IOException e) {

			System.out.println("IO异常");
		}

		return list;
	}

	
	
	public static void main(String[] args) {
		
		ReadText rt = new ReadText();
		
		String name = "D:\\ddd\\128cars.txt";
		
		List<String> cars = rt.getCars(name);
		
		for (String string : cars) {
			System.out.println(string);
		}
	
	}
}
