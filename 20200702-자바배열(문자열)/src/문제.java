/*
 * 1.10개의 문자를 가지는 배열 C를 생성하는 코드 한줄
 * 2.0에서 5ㄲㅏ지 정수갑으로 초기화된 정수 배ㅕㅇㄹ n 선언
 * 3.'일'~'토' 초기화된 배열 day 선언
 * 4.4개의 논리값을 가진 배열bool을 선언하고 ㅌ루펄스트로로 선언
 */
import java.util.*;
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[] c=new char[10];
		
		int[] n= {0,1,2,3,4,5};
		
		char[] day= {'일','월','화','수','목','금','토'};
		
		boolean[] bool= {true,false,true};
		
	    char[] alpha= {'a','b','c','d'};
	   
	    
	    //양의정수 10개 입력받아 배열을 저장하고 배열에 있는 정수중에서 3의배수만출력하는 프로그램 작성
	    
	    
	    int[] arr={1,2,3,4,5,6,7,8,9,10};
	    
	    for(int i:arr)
	    {
	    	if(i%3==0)
	    		System.out.println(i);
	    }
	    
	    
	    for(int i=1;i<11;i++)
	    {
	    if(i%3==0)
	    	System.out.println();
	    
		
	    
		int[] arr=new int[10]; //10개의 메모리 공간 생성
		for(int i=0;i<10;i++)
		{
			arr[i]=(int)(Math.random()*10)+1; //필요한 값 설정 
		}
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("평균:"+total/10.0);
		*/
		
		
		String course[]={"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int jumsu[]= {95,88,76,62,55};
		
		Scanner scan=new Scanner(System.in);
	
		
		while(true) {
			
			boolean bCheck=false;
			System.out.print("과목입력:");
			String subject=scan.nextLine();
			if(subject.equals("그만"))
			{
				break;
			}
		for(int i=0;i<course.length;i++)
		{
		
			if(subject.equals(course[i]))
			{
				bCheck=true;
				System.out.println(jumsu[i]);
			}
		}
		
		if(bCheck==false)
		{
			System.out.println("없는 과목입니다!!");
		}
		}
		
		
		
		
		
		
		
		}

	}


