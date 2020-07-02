/*
 * 배열:
 * 1) 같은 타입의 여러개의 변수를 묶어서 관리하는 프로그램
 *    ======
 *    //double[] a=(100.10.5....}
 *    숫자(정수,실수,문자) , 문자열
 *  2) 한개의 변수명을 이용해서 =>여러개의 변수를 제어
 *  =============== 구분자: 번호로 구분을 한다
 *                        ======= 인덱스 번호
 *                        인덱스 번호 =>0부터시작
 *   예) int[] arr={10,20,30,40,50}
 *   
 *   메모리 주소 이용해 접근하는 변수 ==> 참조변수(배열,클ㄹ스)
 *   ** 인덱스 번호는 중간에 없는 번호는 없다 (순라적)=> for
 *   ==>배열 선언 방식
 *   ============
 *   데이터형[] 배열명;
 *            === 변수의 명칭법
 *   데이터형 배열명[];
 *   
 *   예) 영화제목을 10개 모아서 관리
 *   String[] title=new String[10];
 *   
 *   10명의 학생의 학점을 관리
 *   char[] hakjum=new char[10];
 *   10명의 학생의 총정믈 관리       
 *   int[] total=new int[10];   
 *   ==>new를 사용하면 메모리 공간이 생성==> 0값으로 초기화 된다 
 *   
 *   => 주의점
 *   1.배열의 크기를 초과하면 error : ArraIndexOutOfBoundsException
 *   ==========
 *   n개 ==> 0~n-1 ==> 만약에 갯수를 모르는 경우 : length
 *   2. 제어문을 이용시에는=>주로 for문을 이용해서 처리                           
 */
public class 배열선언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명에 대한 점수 => 저장, 총점, 평균
		int a=80;
		int b=90;
		int c=75;
		int d=90;
		int e=85;
		
		int total=a+b+c+d+e;
		double avg=total/3.0;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		
		
		//배열
		int[] score= {80,90,75,90,85};
		int total2=0;
		double avg2=0.0;
		for(int i=0;i<score.length;i++)
		{
			total2+=score[i]
					;
			
		}
		
		avg2=total2/3.0;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}

}
