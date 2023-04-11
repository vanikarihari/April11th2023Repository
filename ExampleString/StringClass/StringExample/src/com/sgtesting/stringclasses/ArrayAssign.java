package com.sgtesting.stringclasses;

public class ArrayAssign {

	public static void main(String[] args) {
		int k[][]= {{1,2,3},{0,1,2},{1,2,3}};
		int f=0;
		int g[]=new int[k.length*k[0].length];
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k[i].length;j++)
			{
				g[f]=k[i][j];
				f++;
			}
		}
	    int num=0;
		for(int y=0;y<g.length;y++)
		{
			
			num=num+g[y];
		}
		System.out.println(num);
		}
		
	}


