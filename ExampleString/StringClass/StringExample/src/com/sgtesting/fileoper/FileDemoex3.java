package com.sgtesting.fileoper;

import java.io.File;

public class FileDemoex3 {

	public static void main(String[] args) {
		createfile();
		//renamefile();
		//deletefile();
		listfiles();
	}
	private static void createfile()
	{
		try {
			File f1=new File("E:\\Example\\Test\\Welcome1.txt");
			f1.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void renamefile()
	{
		try {
			File f1=new File("E:\\Example\\Test\\Welcome1.txt");
			File f2=new File("E:\\Example\\Test\\Welcome2.txt");
			f1.renameTo(f2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletefile()
	{
		File f1=new File("E:\\Example\\Test\\Welcome2.txt");
		boolean status = f1.delete();
		System.out.println("If Deleted show true: "+status);
	}
	private static void listfiles()
	{
		File f1=new File("E:\\Example\\Test");
		File[] f2=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isFile()==true)
			{
			String path=f2[i].getPath();
			System.out.println(path);
			}
		}
		
	}
}
