package com.sgtesting.fileoper;

import java.io.File;

public class FileDemoex5 {

	public static void main(String[] args) {
		Filecreation();

	}
	private static void Filecreation()
	{
		String Path="E:/Example/Test1/Test2/Test3";
		try {
			String folders []=Path.split("/");
			for(String kk:folders)
			{
			    System.out.println(kk);
			}
			String path1="";
			for(String folder:folders)
			{
				path1=path1+folder+"/";
				File fin=new File(path1);
				fin.mkdir();
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
