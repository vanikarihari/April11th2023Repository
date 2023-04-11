package com.sgtesting.reflectionmethod;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Case5Example {

	public static void main(String[] args) {
		SelectedMethods();
	}
	private static void SelectedMethods()
	{
		FileInputStream f=null;
		Workbook w=null;
		Sheet s=null;
		Row r =null;
		Cell c=null;
		try {
			f=new FileInputStream("E:\\ReflectionaAssignments\\Assignment1.xlsx");
			w=new XSSFWorkbook(f);
			String k=w.getSheetName(0);
			s=w.getSheet(k);
			int rn=s.getPhysicalNumberOfRows();
			for(int i=1;i<rn;i++)
			{
				r=s.getRow(i);
				c=r.getCell(0);
				String methodnames=c.getStringCellValue();
				
				
				c=r.getCell(1);
				String pkgclass=c.getStringCellValue();
				System.out.println(methodnames+ " ---> "+pkgclass);
				Class Classobj=Class.forName(pkgclass);
				Object obj=Classobj.getConstructor().newInstance();
				Method m=obj.getClass().getMethod(methodnames, null);
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


