package com.sist.data;

import java.util.*;

import java.io.FileWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sun.org.apache.bcel.internal.generic.Select;

public class BugsManager {
	public void BugsAllData()
	{
		
		ArrayList<BugsVO> list=
				new ArrayList<BugsVO>();
		String[] site= {
				"https://music.bugs.co.kr/chart/track/realtime/total",
				"https://music.bugs.co.kr/chart/track/day/total",
				"https://music.bugs.co.kr/chart/track/week/total"
				
		};
		int mno=1;
		int cno=3;
	
		   try {
			Document doc=Jsoup.connect("https://music.bugs.co.kr/chart/track/week/total").get();
			Elements link=doc.select("a.thumbnail");
			
			for(int j=0;j<link.size();j++)
			{
				//System.out.println(link.get(j).attr("href"));
				//System.out.println(link.get(j).text());
				//System.out.println(link.get(j).text());\
				try {
					String url=link.get(j).attr("href");
					Document doc2=Jsoup.connect(url).get();
					
					//Element number=doc2.selectFirst("th scope");
					//System.out.println("순위:"+number.text());
					Element poster=doc2.selectFirst("div.photos img");
					System.out.println("포스터:"+poster.attr("src"));   
					Element title=doc2.selectFirst("div.innerContainer h1");
					System.out.println("곡:"+title.text());
					Element artist=doc2.select("td a").get(0);
					System.out.println("아티스트:"+artist.text());
					/*
					 * Element albumtitle=doc2.selectFirst("a.albumtitle");
					 * System.out.println("앨범명"+albumtitle.text());
					 */
					Element genre=doc2.select("td a").get(3);
					System.out.println("장르:"+genre.text());
					//Element albumtitle=doc2.selectFirst("a.albumtitle ellipsis");
					//System.out.println("앨범명:"+albumtitle.text());+poster.attr("src")
					
					String msg=mno+"|"+cno+"|"+poster.attr("src")+"|"+title.text()+"|"
							+ artist.text()+"|"+genre.text()+"\r\n";
							//artist.text()+"|"+"\r\n";/* albumtitle.text()+"|"+ */
					
					FileWriter fw=new FileWriter("C:\\JavaDev\\bugs_Music.txt",true);
					fw.write(msg);
					fw.close();
					
					mno++;
					

				}catch(Exception ex) {}
			}
			
			
		   }catch(Exception e) { }
		
		}	
		   
	
	
	/*public void DaumNewsData()
	{
		try {
			for(int i=1;i<11;i++)
			{
			Document doc=Jsoup.connect("https://Music.daum.net/magazine/new?tab=nws&regdate=20200727&page="+i).get();
			Elements title=doc.select("strong.tit_line a.link_txt");
			Elements poster=doc.select("a.thumb_line span.thumb_img");
			Elements content=doc.select("a.desc_line");
			Elements author=doc.select("span.state_line");
			Elements link=doc.select("strong.tit_line a.link_txt");
			
			for(int j=0;j<title.size();j++)
			{
				System.out.println(title.get(j).text());
				System.out.println(poster.get(j).attr("style"));
				System.out.println(content.get(j).text());
				System.out.println(author.get(j).text());
				System.out.println(link.get(j).attr("href"));
				FileWriter fw=new FileWriter("c:\\JavaDev\\daum_news.txt",true);
				String img=poster.get(j).attr("style");
				img=img.substring(img.indexOf("(")+1,img.lastIndexOf(")"));
				String data=title.get(j).text()+"|"
						   +content.get(j).text().replace("|", " ")+"|"
						   +author.get(j).text()+"|"
						   +link.get(j).attr("href")+"|"
						   +"https:"+img+"\r\n";
				fw.write(data);
				fw.close();
				
			}
			
		}
		}catch(Exception ex)
		{
			
		}
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugsManager m=new BugsManager();
		m.BugsAllData();
		//m.DaumNewsData();

	}

}
