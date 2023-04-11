package com.sgtesting.fileoper;

import java.io.File;

public class FileOpAss1 {

	public static void main(String[] args) {
		subfolder();

	}
	private static void subfolder() 
	{
		String s[]= {"H11","H12","H13","H14","H15","H16","H17","H18","H19","H20"};
		try {
		File f1=new File("E:\\Example\\Test\\HarishLL");
		f1.mkdir();
		for(String kk:s)
		{
			File f2=new File(f1,kk);
			f2.mkdirs();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
