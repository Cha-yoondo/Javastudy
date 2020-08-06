package com.sist.data;
import java.util.*;
import java.io.*;
public class NewsManager {
	private static ArrayList<NewsVO> List=
			new ArrayList<NewsVO>();
	//프로그램 => 시작 => 데이터 읽엇 => ArrayList에 저장
	static
	{
		try
		{
			FileInputStream fis=
					new FileInputStream("c:\\JavaDev\\daum_news.txt");
			BufferedReader in=
					new BufferedReader(new InputStreamReader(fis));
			while(true)
			{
				String data=in.readLine();
				if(data==null) break;
				
				StringTokenizer st=new StringTokenizer(data,"|");
				NewsVO vo=new NewsVO();
				vo.setTitle(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAuthor(st.nextToken());
				vo.setLink(st.nextToken());
				vo.setPoster(st.nextToken());
				List.add(vo);
				
			}
			fis.close();
		}catch (Exception ex) 
		{
			
		}
	}
	public ArrayList<NewsVO> newsListData(int page)
	{
		ArrayList<NewsVO> news=new ArrayList<NewsVO>();
		int i=0; // i=> 5개씩 나눠주는 변수
		int j=0; // ㅓ=> for이 수행되는 횟수
		int pagecnt=(page*5)-5; //출력할 시작 위치
			//if(i<5 && J=pagecnt)
		for(NewsVO vo:List)
		{
			if(i<5 && j>=pagecnt)
			{
				news.add(vo);
				i++;
			}
			j++;
		}
		return news;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsManager m=new NewsManager();
		ArrayList<NewsVO> list=m.newsListData(1);
		int i=1;
		for(NewsVO vo:list)
		{
			System.out.println(i+"."+vo.getTitle());
			i++;
		}
		

	}

}
