package com.sgtestingexceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample3 {

	public static void main(String[] args) {
		CityNmaes();
	}
	private static void CityNmaes()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row r=null;
		Cell c=null;
		{
			try {
				wb=new XSSFWorkbook();
				sh=wb.createSheet("City");
				String s[]= {"City Names","City1","City2","City3","City4","City5","City6","City7","City8","City9","City10","City11","City12","City13","City14","City15","City16","City17","City18","City19","City20"};
				for(int i=0;i<s.length;i++)
				{
					r=sh.createRow(i);
					c=r.createCell(i);
					c.setCellValue(s[i]);
				}
				fout=new FileOutputStream("E:\\Excel\\Sample3.xlsx");
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
