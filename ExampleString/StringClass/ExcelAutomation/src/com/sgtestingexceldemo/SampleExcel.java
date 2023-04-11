package com.sgtestingexceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {

	public static void main(String[] args) {
		FruitNames();

	}
	private static void FruitNames()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row r=null;
		Cell c=null;
		try{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("FruitSheet");
			String s[]= {"20 Fruit Names","Fruit1","Fruit2","Fruit3","Fruit4","Fruit5","Fruit6","Fruit7","Fruit8","Fruit9","Fruit10","Fruit11","Fruit12","Fruit13","Fruit14","Fruit15","Fruit16","Fruit17","Fruit18","Fruit19","Fruit20"};
			for(int i=0;i<s.length;i++)
			{
				r=sh.createRow(i);
				c=r.createCell(0);
				c.setCellValue(s[i]);
			}
			fout=new FileOutputStream("E:\\Excel\\Sample.xlsx");
			wb.write(fout);

		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}



	}

}
