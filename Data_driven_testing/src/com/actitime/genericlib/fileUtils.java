package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileUtils {
public Properties getpropertyfileobject() throws Throwable {
	FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
	Properties pobj = new Properties();
	pobj.load(fis);
	return pobj;
}

public String getexceldata(String sheetname,int rownum,int colnum) throws Throwable {
	FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh =wb.getSheet(sheetname);
	Row row =sh.getRow(rownum);
	String data =row.getCell(colnum).getStringCellValue();
	wb.close();
	return data;
		
}
public void setexceldata(String sheetname,int rownum,int colnum,String data) throws Throwable {
	FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
	Workbook wb =WorkbookFactory.create(fis);
	Sheet sh =wb.getSheet(sheetname);
	Row row =sh.getRow(rownum);
	Cell cel =row.createCell(rownum);
	cel.setCellValue(data);
	FileOutputStream fos = new FileOutputStream("./testdata/testscript.xlsx");
	wb.write(fos);
	wb.close();
	
	
}

}
