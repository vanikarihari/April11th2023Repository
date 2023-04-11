package com.sgtestingexceldemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyPasteAss1 {

	public static void main(String[] args) {
		ReadWriteExcel();

	}
	private static void ReadWriteExcel()
	{
		FileInputStream fi=null;
		FileOutputStream fo=null;
		Workbook wb=null;
		Sheet s1=null;
		Sheet s2=null;
		Row r1=null;
		Row r2=null;
		Cell c1=null;
		Cell c2=null;
		try {
			fi=new FileInputStream("E:\\Excel\\Sample.xlsx");
			wb=new XSSFWorkbook(fi);
			s1=wb.getSheet("FruitSheet");
			s2=wb.getSheet("Sheet2");
			if(s2==null)
			{
				s2=wb.createSheet("Sheet2");
			}
			int rc=s1.getPhysicalNumberOfRows();
			for(int i=0;i<rc;i++)
			{
				r1=s1.getRow(i);
				r2=s2.getRow(i);
				if(r2==null)
				{
					r2=s2.createRow(i);
				}
				int rr=r1.getPhysicalNumberOfCells();
				for(int j=0;j<rr;j++)
				{
					c1=r1.getCell(j);
					c2=r2.getCell(j);
					if(c2==null)
					{
						c2=r2.createCell(j);
					}
					String data=c1.getStringCellValue();
					c2.setCellValue(data);
				}
			}
			fo=new FileOutputStream("E:\\Excel\\Sample.xlsx");
			wb.write(fo);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				fo.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
