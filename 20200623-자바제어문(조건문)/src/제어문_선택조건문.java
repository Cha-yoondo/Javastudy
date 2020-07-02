/*
 * 선택 조건문
 * if(조건문)
 * {
 *    조건문이 true면 수행하는 문장 구현
 * }
 * else
 * {
 *    조건문이 flase일때 수행하는 문장 구현
 *  }
 *  ㅍ
 * 
 */
import java.util.*;

public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자 한개를 입력 받아서 => 알파벳인지 여부 확인
		//변수 설정
		
		char ch='A'; //변수 =>초기호ㅏ
		/*
		 * int => 0
		 * double => 0.0
		 * long=> 0L
		 * boolean => false
		 * ch>='0' && ch<='9')||(ch>='a' && ch<='z'
		 */
		 //문자 한개 이비력
		Scanner scan=new Scanner(System.in);
		System.out.print("문자입력:");
		//"ABC" ==>자바는 모든 시작 번호 0부터 시작한다
		
		ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+"는(은) 숫자입니다!!");
		}
		else
		{
			System.out.println(ch+"는(은) 문자입니다!!");
		
		}

	}

}
