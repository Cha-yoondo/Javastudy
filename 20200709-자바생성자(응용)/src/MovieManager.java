import java.io.*;
import java.util.Scanner;
public class MovieManager {

	static MovieVO[] movies=new MovieVO[1938];
	// 모든 클래스에서 공유를 할 경우 
	// 프로그램이 구동이 되면 자동으로 => 파일을 읽어서 배열에 저장
	// 초기화 블럭
	static StringBuffer data=new StringBuffer();
    static {
    	try
    	{
    		   //File을 읽는 경우에는 반드시 예외처리
    	
    		FileReader fr=new FileReader("C:\\JavaDev\\movie.txt");
    		
    		int i=0;
    		while((i=fr.read())!=-1) //-1 EOF(End Of File)
    			
    		{
    			data.append(String.valueOf((char)i)); //char=>Stirng
    		}
    				fr.close();
    				
    				String[] movieData=data.toString().split("\n");
    				int k=0;		
    				for(String s:movieData)
    				{
    					String[] ss=s.split("\\|");
    					movies[k]=new MovieVO(); //메모리에 저장
    					movies[k].mno=Integer.parseInt(ss[0]);
    					//문자열 ==> 정수로 변환 "1" ==>1
    					movies[k].title=ss[1];
    					movies[k].genre=ss[2];
    					movies[k].poster=ss[3];
    					movies[k].actor=ss[4];
    					movies[k].regdate=ss[5];
    					movies[k].grade=ss[6];
    					movies[k].director=ss[7];
    					k++;
    			    }
    	}catch(Exception ex) {}
    }
    static MovieVO[] movieListData(int page)
    {
    	MovieVO[] m=new MovieVO[10];
    	int i=0; //10개씩 나눠주는 변수 
    	int j=0;//for 횟수 
    	int rowSize=10; // 각 페이지당 몇개
    	int pagecnt=(page*rowSize)-rowSize; // 시작 위치
    	/*
    	 * 1page => 0~9
    	 * 2page => 10~19
    	 * 
    	 */
    	for(MovieVO vo:movies)
    	{
    		if(i<10 && j>=pagecnt)
    		{
    			m[i]=vo;
    			i++;
    		}
    		j++;
    	}
    	return m;
    }
    static MovieVO[] movieFindData(int page)
    {
    	MovieVO[] m=new MovieVO[50];
    	int i=0; //10개씩 나눠주는 변수 
    	int j=0;//for 횟수 
    	int rowSize=50; // 각 페이지당 몇개
    	int pagecnt=(page*rowSize)-rowSize; // 시작 위치
    	/*
    	 * 1page => 0~9
    	 * 2page => 10~19
    	 * 
    	 */
    	for(MovieVO vo:movies)
    	{
    		if(i>50) break;
    		if(i<50 && j>=pagecnt)
    		{
    			m[i]=vo;
    			i++;
    		}
    		j++;
    	}
    	return m;
    }
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("페이지 입력:");
		int page=scan.nextInt();
		MovieVO[] movie=movieListData(page);
		for(MovieVO vo:movie)
		{
			System.out.println("영화번호:"+vo.mno);
			System.out.println("영화명:"+vo.title);
			System.out.println("==================");
		}
			
	}
  /*  public static void main(String[] args) {
		//System.out.println(data);
    	for(MovieVO vo:movies)
    	{
    		System.out.println("영화번호:"+vo.mno);
    		System.out.println("영화명:"+vo.title);
    		System.out.println("장르:"+vo.genre);
    		System.out.println("출연:"+vo.actor);
    		System.out.println("개봉일:"+vo.regdate);
    		System.out.println("등급:"+vo.grade);		
    		System.out.println("감독:"+vo.director);		
    		System.out.println("======================");
    	}
    	*/
	}

