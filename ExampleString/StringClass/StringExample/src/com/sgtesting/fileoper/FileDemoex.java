package com.sgtesting.fileoper;

import java.io.File;

public class FileDemoex {

	public static void main(String[] args) {
		//createfile();
		//renamefile();
		//deletefile();
		filecollection();
	}
	private static void createfile()
	{
		try
		{
			String path="E:\\Example\\Test\\Sample.txt";
			File f1=null;
			f1=new File(path);
			f1.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void renamefile()
	{
		try
		{
			File f1=new File("E:\\Example\\Test\\Sample.txt");
			File f2=new File("E:\\Example\\Test\\Sample1.txt");
			f1.renameTo(f2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletefile()
	{
			File f2=new File("E:\\Example\\Test\\Sample1.txt");
			boolean b=f2.delete();
			System.out.println("is File deleted?: "+b);
	}
	private static void filecollection()
	{
		try
		{
			File f1=new File("E:\\Example\\Test");
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isFile()==true)
				{
					String path=f2[i].getPath();
					System.out.println(path);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
