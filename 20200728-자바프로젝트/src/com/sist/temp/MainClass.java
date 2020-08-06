package com.sist.temp;
import java.io.*;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 읽기
		FileReader fr=null; //파일 읽기
		//파일 저장 : FileWriter ==> 문자스트링(한그 포함) => 2byte
		/*
		 *   FileinputStream
		 *   FileOutputStream
		 */
		try
		{
			fr=new FileReader("C:\\JavaDev\\daum.movie1.txt");
			int i=0; //한글자씩 읽기 -> 문자의 번호
			StringBuffer sb=new StringBuffer(); //문자열 결합
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			System.out.println(sb.toString());
					
		}
		catch (Exception ex) 
		{
			//에러처리 => 디버깅
			/*
			 *  에러 메세지 확인 getMasseage()
			 *  Trace => 실행과정 => 해당위치 찾기 printStackTrace()
			 */
			 ex.printStackTrace();

		}
	    finally
	    {
	    	try
	    	{
	    		 fr.close();
	    	}
	    	catch(Exception ex) 
	    	{
			  
			}
	    }

	}

}
