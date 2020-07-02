/*
 * 
 * 
 * string : 클래스
 * 기능(제공)
 * => 문자갯수
 * String s="ABCDEF";
 * s.length() =>6
 * string s="ABCDEF";
 * s.charAt(0) ==> 'A'
 * 
 * 
 */
//사용자 문자열을입력
//대문자 갯수, 소문자갯수
import java.util.*;
public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=""; //문자 여러개 저장
		//System.out.println(s);
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열을 입력하세요>>");
		s=scan.next(); //String 으로 받은값을 저장
		//s=scan.nextLine(); 공백까지 포함 
		System.out.println(s);
		//System.out.println("갯수"+s.length());
		
		int a=0,b=0;
		//a=>소문자 갯수
		//b=>대문자 갯수
		
		int i=0; //문자의 갯수만큼 증가하는 변수=>루프변수20
		/*
		 *     ABCDEFG  => 7
		 *     =======
		 *     0123456
		 */
		//AbCdEf
		while(i<s.length())
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
				b++; // 갯수확인 ==> 합+=
			if(c>='a' && c<='z')
				a++;
				
				i++;
				
		}
			System.out.println("대문자 갯수:"+b);
			System.out.println("소문자 갯수:"+a);
	
		
		
		
	}

}
