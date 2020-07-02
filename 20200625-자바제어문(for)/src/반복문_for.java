/*
 * 반복문 - for, while, do~while
 *     for : 반복 횟수가 있는 경우에 주로 사용
 *     while: 반복 횟수가 없는 경우에 주로 사용
 *       ===> for <=> while , 다중조건문<=>선택문
 *     do~while: 조건을 나중에 검색 => 한번 이상은 반드시 수행
 *     
 *     1) for
 *        형식) 
 *                 
 *                 1.=>1부터 시작 =>i=1
 *                 2.=>10이 될때까지
 *                 3.=>증가==> i++
 *                 
 *                 
 *                 ======   =====  ===
 *             for(int i=1; i<=10; i++)
 *             {
 *                 반복 수행문장 : 10번을 수행하는 문장
 *             }
 *             
 *             ==> 초기값, 조건식, 수행문장,증가식
 *                       ==== ======= ===
 *                       = true => 반복
 *                       = false => 종료
 *             ==> 실제 형식
 *                 for(초기값 (변수) ; 조건(비교연산자,논리연산자,부정연산자)
 *                                 ===
 *                                 반드시 (true/false)
 *                                           
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// !~10까지 ==> 출력
		
		System.out.println("===반복문===");
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
		}

	}

}
