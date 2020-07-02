/*
 *  주의점
 *  1)while은 조건이 없는 경우 error => for(;;)
 *    while() => 조건식이 없다
 *    {
 *    } ======> 오류발생
 *  2) while 에서 무한루프
 *     => for(;;) => while(true) : 가장 많이 등장
 *     
 *      for(int i=0;i<10;i++)
 *      
 *      int i=0;
 *      while(i<10)
 *      {
 *         i++
 *      }
 *      
 *      int i=5;
 *      while (--i!=0) ==> i>=0
 *      {
 *         System.out.println(i); ==>
 *      }
 */

import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; //사용자 요청한 변수
		int i=1; // 사용자 요청한 변수까지 증가(루프변수)
		int sum=0; // 누적(합)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		user=scan.nextInt();
		
		while (i<=user)
		{
			sum+=i;
			i--;
		}
		System.out.println("sum="+sum);
		
for (int j=1;j<=10;j++) {
	
}//j는 메모리에서 사라진다

System.out.println(j);
	}

}
