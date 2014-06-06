package com;

import java.util.List;

public class Answer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Read read = new Read();
		String Path = "D:\\ddd\\demo.txt";
		int all = getAll(read.readfromFile(Path));

		System.out.println("总工资为：" + all);

	}

	public static int getAll(List<Emp> list) {

		int sum = 0;
		for (Emp emp : list) {

		
			if (!emp.getSal().equals("")) {
				System.out.println(emp.getSal());
				sum += Integer.parseInt(emp.getSal());

			}
			
			if (!emp.getComm().equals("") ) {//判断非空 不能用！= null 或者 ""

				System.out.println(emp.getComm());
				sum += Integer.parseInt(emp.getComm());
			}

		}

		return sum;
	}
}
