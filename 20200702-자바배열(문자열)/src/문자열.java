/*
 *   1.배열
 *     => 같은 타입을 여러개 묶어서 관리
 *     => 배열생성=> 연속적인 메모리구조 (인덱스)
 *     => 일차원 배열  [], [][], [][][]
 *                =====
 *                  1)문자열 배열
 *                    String[] arr
 *                             === 배열명
 *                  2) 정수 배열
 *                     int[] arr ===== int arr[]
 *                     
 *                  3) 논리 배열
 *                     boolean[] arr =====boolaen arr[]           
 *     => 선언 방식
 *        문자열 10개
 *        =========
 *        String[] arr;
 *        정수 10개
 *        int[] arr;
 *     => 초기값
 *        1)String[] arr;
 *          arr=new String[10];
 *          
 *        2)int[] arr      =======> 선언과 동시에 초기값
 *        ***int[] arr=new int[10]
 *          arr=new int[10];  
 *          
 *          int[] arr=(10,20,30,40,50} ==> 등록된 갯수 (5개배정)
 *          
 *          ==> 선언시에 메모리 저장 갯수를 등록=> 고정적이다
 *     => 인덱스 사용
 *     => 출력 => 번호 (0~~~~) => 연속적으로 인덱스번호
 *        === 
 *           => for,whilea문을 이용햇 출력
 *              === 횟수가 지정된 상태
 *              
 *              =for
 *               1) 일반 for문 =========> 인덱스를 사용한다 (제어)
 *                    ==> 값을 변경, 값을 삭제
 *                    ==> Back-end
 *               2) 향상된 for문 (for-each) ====>실제 저장된 값 (출력용)
 *                    ==> 값 변경이 불가능      
 *                    ==> Front-end
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수==> 5개 저장 => 평균
		// 1. 정수 5개를 저장하는 메모리공간을 설정
		int[] arr= {30,50,70,90,10};
		/*
		int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		double avg=total/5.0;
		System.out.println("저장된 정수의 평균:"+avg);
		*/
		int total=0;
		for(int i=0;i<5;i++)
		{
			total+=arr[i]; //arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		}
		
		System.out.println("저장된 정수의 평균:"+total/5.0);
		
		total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("저장된 정수의 평균:"+total/5.0);
		
		
		

	}

}
