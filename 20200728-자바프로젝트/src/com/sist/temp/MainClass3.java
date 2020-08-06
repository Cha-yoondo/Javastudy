package com.sist.temp;
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("C:\\JavaDev\\daum.movie1.txt");
			BufferedReader br=
					new BufferedReader(new InputStreamReader(fis));
			// inputStreamreader => 1 byte => 2byte 로 변환 
			// 네트워크 ,메모리,파일 
			while(true)
			{
				String data=br.readLine();
				if(data==null) break;
				System.out.println(data);
			}
			fis.close();
		}
		catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}

	}

}
