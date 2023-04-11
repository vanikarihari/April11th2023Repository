package com.sgtesting.reflectionmethod;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Case5Example2 {

	public static void main(String[] args) {
		SelectedMethod2();
	}
	private static void SelectedMethod2()
	{
		FileInputStream f=null;
		Workbook w=null;
		Sheet s=null;
		Row r=null;
		Cell c=null;
		try {
			f=new FileInputStream("E:\\ReflectionaAssignments\\Assignment2.xlsx");
			w=new XSSFWorkbook(f);
			String sname=w.getSheetName(0);
			s=w.getSheet(sname);
			int rr=s.getPhysicalNumberOfRows();
			for(int i=1;i<rr;i++)
			{
				r=s.getRow(i);
				c=r.getCell(0);
				String Methodname=c.getStringCellValue();
				c=r.getCell(1);
				String pkgclass=c.getStringCellValue();
				System.out.println(Methodname+" ------> "+pkgclass);
				Class Clsobj=Class.forName(pkgclass);
				Object obj=Clsobj.getConstructor().newInstance();
				Method m=obj.getClass().getMethod(Methodname, null);
				m.invoke(obj, null);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		finally {
			try {
				f.close();
				w.close();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
