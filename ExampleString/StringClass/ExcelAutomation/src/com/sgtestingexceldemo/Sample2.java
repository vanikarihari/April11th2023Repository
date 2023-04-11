package com.sgtestingexceldemo;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample2 {

	public static void main(String[] args) {
		VegetableNmaes();
	}
	private static void VegetableNmaes()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row r=null;
		Cell c=null;
		{
			try {
				wb=new XSSFWorkbook();
				sh=wb.createSheet("Vegetables");
				String s[]= {"Vegetable Names","Vegetable1","Vegetable2","Vegetable3","Vegetable4","Vegetable5","Vegetable6","Vegetable7","Vegetable8","Vegetable9","Vegetable10","Vegetable11","Vegetable12","Vegetable13","Vegetable14","Vegetable15","Vegetable16","Vegetable17","Vegetable18","Vegetable19","Vegetable20"};
				for(int i=0;i<s.length;i++)
				{
					r=sh.createRow(9);
					for(int j=0;j<s.length;j++)
					{
						c=r.createCell(j);
						c.setCellValue(s[j]);
					}
				}
				fout=new FileOutputStream("E:\\Excel\\Sample2.xlsx");
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
	

}
