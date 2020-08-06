package com.sist.temp;
import java.io.*;
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//파일읽기
			FileReader fr=new FileReader("C:\\JavaDev\\daum.movie1.txt");
			int i=0;
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=String.valueOf((char)i);
			}
			fr.close();
			System.out.println(data);
			/*String[] movies=data.split("\n");
			for(String s:movies)
			{
				System.out.println(s);
				System.out.println("=========================");
			}
			*/
			StringTokenizer st=new StringTokenizer(data,"\n");
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());
				System.out.println("==========================");
			}
		}
		catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}

	}

}
