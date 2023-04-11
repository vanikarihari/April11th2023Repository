package com.sgtesting.fileoper;

import java.io.File;

public class CreateFolders {

	public static void main(String[] args) {
		weekdayfolder();

	}
	private static void weekdayfolder() 
	{
        String h="E:\\Example\\Test\\Weekaday";
        String k[]= {"Sunday","monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        File f=new File(h);
        f.mkdir();
        {
        	for(String kk:k)
        	{
        		File f1=new File(f,kk);
        		f1.mkdirs();
        	}
        }

	}
}
