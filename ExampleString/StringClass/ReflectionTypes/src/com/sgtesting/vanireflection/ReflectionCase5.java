package com.sgtesting.vanireflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReflectionCase5 {
	public static void main(String[] args) {
		PoiRunner();
	}
	private static void PoiRunner()
	{
		FileInputStream fi=null;
		Workbook wb=null;
		Sheet sh=null;
		Row ro=null;
		Cell ce=null;
		try {
			fi=new FileInputStream("E:\\ReflectionaAssignments\\Assignment1.xlsx");
			wb=new XSSFWorkbook(fi);
			String a=wb.getSheetName(1);
			sh=wb.getSheet(a);
			int pr=sh.getPhysicalNumberOfRows();
			for(int i=1;i<pr;i++)
			{
				ro=sh.getRow(i);
				ce=ro.getCell(0);
				String methodnamestore=ce.getStringCellValue();
				ce=ro.getCell(1);
				String packagenamestore=ce.getStringCellValue();
				System.out.println(methodnamestore+ " -------------------->" +    packagenamestore);
				Class Classobj=Class.forName(packagenamestore);
				Object Obj=Classobj.getConstructor().newInstance();
				Method m=Obj.getClass().getMethod(methodnamestore, null);
				m.invoke(Obj, null);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try{
				fi.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}