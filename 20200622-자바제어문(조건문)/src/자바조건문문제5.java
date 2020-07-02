/*
 *  char 변수 선언==> 값을 대입
 *  
 *  
 *  => char alpha='A';
 *  
 *  => alpha 가 대문자면 ==> 소문자 출력
 *     System.out.prinln((char)(alpha+32))
 *  =< alpha 가 소문자면 ==> 대문자 출력
 *  System.out.prinln((char)(alpha-32))
 *  
 */
/*
 *  1.제어문
 *    연산자 (비교연산자,논리연산자,부정연산자)\
 *      = 비교연산자
 *      = 논리연산자
 *      = 부정연산자
 *      
 *    단독처리=> 산술연산자,증감연산자,대입연산자
 *            ======================
 *            응용 => 제어문
 *    연산처리=> 형변환 (강제 형변환)
 *             double => int ====> (int)double
 *             int    => char ===> (char)int        
 */
public class 자바조건문문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alpha='c';
		
		if(alpha>='A' && alpha<='Z')
		{
			System.out.println((char)(alpha+32));
		}
		else
		{
			System.out.println((char)(alpha-32));
		}

	}

}
