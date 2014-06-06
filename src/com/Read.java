package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;

public class Read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String Path = "D:\\ddd\\demo.txt";

		Read read = new Read();
		read.readfromFile(Path);

	}

	public List<Emp> readfromFile(String Path) {

		List<Emp> list = new ArrayList<Emp>();

		try {
			String enconding = "GBK";
			File file = new File(Path);

			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), enconding); // 添加编码格式
				BufferedReader buffread = new BufferedReader(read);

				String lineText = null;
				int length = 0;

				while ((lineText = buffread.readLine()) != null) {				

					length = lineText.length();

					Emp emp = new Emp();

					if (length == 89) {
						String empno = lineText.substring(6, 10);
						String ename = lineText.substring(10, 20).trim();
						String job = lineText.substring(20, 32).trim();
						String mgr = lineText.substring(35, 43).trim();
						String hireDate = lineText.substring(43, 55).trim();
						String sal = lineText.substring(60, 70).trim();
						String comm = lineText.substring(70, 80).trim();
						String deptno = lineText.substring(85, 89).trim();
						
						emp.setEmpno(empno);
						emp.setEname(ename);
						emp.setJob(job);
						emp.setMgr(mgr);
						emp.setHireDate(hireDate);
						emp.setSal(sal);
						emp.setComm(comm);
						emp.setDeptno(deptno);

						//System.out.println(emp);
						list.add(emp);
					}

				}
				buffread.close();
				read.close();
			} else {
				System.out.println("找不到文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}

		return list;

	}
}
