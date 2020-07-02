/*
 * 배열에 값 주입
 * =========
 * 1. 직접주입
 * 2. 사용자가 입력한 값 -> Scanner
 * 3. 난수이용
 * ===========================
 * 4. File 읽기
 * 5. Web 에서 읽어서 주입
 * 6. 오라클 
 */
//3명의 학생=> 성적관리=> 국어,영어,수학 ==> 1.총점 2.평균 3.학점. 4.등수
import java.util.*;
public class 배열의값주입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; // kor1,kor2,kor3
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hakjum=new char[3];
		int[] rank=new int[3];
		
		/*
		 *  for(int i=1;i<3;i++)
		 *  {
		 *  Scanner scan=new Scanner(System.in);
		 *  new => 새로운 공간이 생성 ==>
		 */
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("%d번째 국어점수 입력:",i+1);
			kor[i]=scan.nextInt();
			
			System.out.printf("%d번째 영어점수 입력:",i+1);
			eng[i]=scan.nextInt();
			
			System.out.printf("%d번째 수학점수 입력:",i+1);
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
		}
		//등록된 점수를 출력
		//학점계산
		for(int i=0;i<3;i++)
		{
			char c='A';
			switch(total[i]/30) // 평균avg[i]
			{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
				default:
					c='F';
					break;
			}
			hakjum[i]=c;
		}
		/*
		 * 
		 * 
		 * 
		 * %-5d
		 * 80000  ==>왼쪽
		 * %5d
		 * 00080 ==> 오른쪽
		 * 
		 * %7d
		 * 0000240
		 * 
		 * 한글==> 1글자(2Byte)
		 * 
		 * 000000
		 * ==
		 * 국
		 * 
		 * 
		 */
		//등수계산
		/*
		 *    240 230 250
		 *    
		 */
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{if(total[i]<total[j])
			{
				rank[i]++;
			}
			}
		}
		
		
		/*
		 *   %c =>char
		 *   %s =>String
		 *   %d =>int
		 *   %f =>double
		 */
		System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s%-6s\n",
				"국어","영어","수학","총점","평균","학점","등수");
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],hakjum[i],rank[i]);
			
		}
	    
	}

}
