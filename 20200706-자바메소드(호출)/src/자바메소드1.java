/*
 * 
 *  메소드
 *    = 사용자 정의 메소드
 *     = 형식)
 *              반환형 메소드명(매게변수...)
 *              {
 *                 return 값; => 값=반환형
 *                 반환형이 없는 경우에는 => void,return 은 생략이 가능
 *               }
 *    = 라이브러리 메소드
 *    ==================
 *                 
 *  메소드: 특정 작업을 수행하기 위한 컴퓨터의 명령문의 집합
 *         ***한가지 일만 수행
 *         ***세분화 작업
 *         
 *         예) 숫자 야구 게임
 *             = 3자리 정수의 난수
 *             = 사용자에게 입력을 요청
 *             = 난수와 사용자 입력값을 비교
 *             = 힌트
 *             = 정답일 경우에 종료
 *             = 다시 게임을 할지 여부 확인
 *             
 */
public class 자바메소드1 {
	static void aaa()
	{
		System.out.println("aaa() 호출 시작...");//1
		bbb(); //bbb()이동
		System.out.println("aaa() 호출 종료...");//8
	}
	static void bbb()
	{
		System.out.println("bbb() 호출 시작...");//2
		ccc(); //ccc()이동
		System.out.println("bbb() 호출 종료...");//7
	}
	static void ccc()
	{
		System.out.println("ccc() 호출 시작...");//3
		ddd(); //ddd()이동
		System.out.println("ccc() 호출 종료...");//6
	}
	static void ddd()
	{
		System.out.println("ddd() 호출 시작...");//4
		System.out.println("ddd() 호출 종료...");//5
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa();

	}

}
