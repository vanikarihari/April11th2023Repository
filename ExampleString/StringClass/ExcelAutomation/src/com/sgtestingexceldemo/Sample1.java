package com.sgtestingexceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample1 {

	public static void main(String[] args) {
		FlowerNmaes();
	}
	private static void FlowerNmaes()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row r=null;
		Cell c=null;
		{
			try {
				wb=new XSSFWorkbook();
				sh=wb.createSheet("Flowers");
				String s[]= {"Flower Names","Flower1","Flower2","Flower3","Flower4","Flower5","Flower6","Flower7","Flower8","Flower9","Flower10","Flower11","Flower12","Flower13","Flower14","Flower15","Flower16","Flower17","Flower18","Flower19","Flower20"};
				for(int i=0;i<s.length;i++)
				{
					r=sh.createRow(i);
					c=r.createCell(4);
					c.setCellValue(s[i]);
				}
				fout=new FileOutputStream("E:\\Excel\\Sample1.xlsx");
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
