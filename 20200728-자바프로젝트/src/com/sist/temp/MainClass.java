package com.sist.temp;
import java.io.*;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �б�
		FileReader fr=null; //���� �б�
		//���� ���� : FileWriter ==> ���ڽ�Ʈ��(�ѱ� ����) => 2byte
		/*
		 *   FileinputStream
		 *   FileOutputStream
		 */
		try
		{
			fr=new FileReader("C:\\JavaDev\\daum.movie1.txt");
			int i=0; //�ѱ��ھ� �б� -> ������ ��ȣ
			StringBuffer sb=new StringBuffer(); //���ڿ� ����
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			System.out.println(sb.toString());
					
		}
		catch (Exception ex) 
		{
			//����ó�� => �����
			/*
			 *  ���� �޼��� Ȯ�� getMasseage()
			 *  Trace => ������� => �ش���ġ ã�� printStackTrace()
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
