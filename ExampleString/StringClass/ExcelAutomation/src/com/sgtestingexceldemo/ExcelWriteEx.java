package com.sgtestingexceldemo;

import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWriteEx {

	public static void main(String[] args) {
		writecontent();

	}
	private static void writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try 
		{
		wb=new XSSFWorkbook();
		sh=wb.createSheet("Information");
		row=sh.createRow(0);
		cell=row.createCell(0);
		cell.setCellValue("First Name");
		cell=row.createCell(1);
		cell.setCellValue("Last Name");
		row=sh.createRow(1);
		cell=row.createCell(0);
		cell.setCellValue("Harsish");
		cell=row.createCell(1);
		cell.setCellValue("Lokare");
		fout=new FileOutputStream("E:\\Example\\Test1\\Sample.xlsx");
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
