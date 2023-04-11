package com.sgtestingexceldemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) {
		RWExcel();
	}
	private static void RWExcel()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row row1=null;
		Row row2=null;
		Cell cell1=null;
		Cell cell2=null;
		try {
			fin=new FileInputStream("E:\\Excel\\ForPoi.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("sheet2");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			for(int i=0;i<rc;i++)
			{
				row1=sh1.getRow(i);
				row2=sh2.getRow(i);
				if(row2==null)
				{
					row2=sh2.createRow(i);
				}
				int rr=row1.getPhysicalNumberOfCells();
				for(int j=0;j<rr;j++)
				{
					cell1=row1.getCell(j);
					cell2=row2.getCell(j);
					if(cell2==null)
					{
						cell2=row2.createCell(j);
					}
					String data=cell1.getStringCellValue();
					cell2.setCellValue(data);
				}
			}
			fout=new FileOutputStream("E:\\Excel\\ForPoi.xlsx");
			wb.write(fout);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fin.close();
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
