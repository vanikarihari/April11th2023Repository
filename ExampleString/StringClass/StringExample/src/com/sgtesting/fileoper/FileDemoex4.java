package com.sgtesting.fileoper;

import java.io.File;

public class FileDemoex4 {

	public static void main(String[] args) {
		//createfolder();
		//createnestedfolder();
		//reanamefolder();
		//deletefolder();
		foldercollection();

	}
	private static void createfolder()
	{
		File f1=new File("E:\\Example\\Test\\HarishLokare");
		boolean b=f1.mkdir();
		System.out.println("if file created: "+b);
	}
	private static void createnestedfolder()
	{
		File f1=new File("E:\\Example\\Test\\d1\\d2\\d3\\d4\\d5");
		boolean b=f1.mkdirs();
		System.out.println("if files created: "+b);
	}
	private static void reanamefolder()
	{
		File f1=new File("E:\\Example\\Test\\HarishLokare");
		File f2=new File("E:\\Example\\Test\\Demo1");
		boolean b=f1.renameTo(f2);
		System.out.println("if file rename: "+b);
	}
	private static void deletefolder()
	{
		File f2=new File("E:\\Example\\Test\\Demo1");
		boolean b=f2.delete();
		System.out.println("if file deleted: "+b);
	}
	private static void foldercollection()
	{
		try {
		File f2=new File("E:\\Example\\Test");
		File f3[]=f2.listFiles();
		for(int i=0;i<f3.length;i++)
		{
			if(f3[i].isDirectory()==true)
			{
			   	String path=f3[i].getPath();
			   	System.out.println(path);
			}
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
