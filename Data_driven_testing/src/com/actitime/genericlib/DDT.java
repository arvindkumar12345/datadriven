package com.actitime.genericlib;

public class DDT {

	public static void main(String[] args) throws Throwable   {
		fileUtils flib = new fileUtils();
		//flib.getpropertyfileobject();
		String data =flib.getexceldata("sheet1", 2, 3);
		System.out.println(data);
	//	flib.setexceldata("sheet1", 2, 6, "arvind");

	}

}
