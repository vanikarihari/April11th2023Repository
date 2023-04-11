package com.sgtesting.fileoper;

import java.io.File;

public class NestedFolders {

	public static void main(String[] args) {
		nestedFolderex();

	}
private static void nestedFolderex()
{
	try {
	File o2=new File("E:\\Example\\Test\\Hari8\\DustBin.xlsx");
	boolean k=o2.delete();
	System.out.println(k);
	}catch(Exception e)
	{
        e.printStackTrace();
	}
}
}
