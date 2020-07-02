/*
 * 'A'+'B'
 * === == 66
 * 정수변환 =>65
 * 65 + 66 =>131 (int) char,short,byte => 연산 => 결과값 int
 * 
 *  '홍'+'홍'
 *  
 *  ***주의점: 데이터형을 초과하면  error가 아니라 오버플로워를 발생
 *  
 *  예) int ==> 1~10   11=>
 *  
 *  byte b1=64;
		byte b2=65;
		byte b3=(byte)(b1+b2);
		System.out.println("b3="+b3);
				
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=2;
		
		System.out.println(a%b);
		System.out.println(-a%b);
		System.out.println(a%-b);
		System.out.println(-a%-b);
		
		System.out.println((int)(10.5+10.5));
		System.out.println((int)10.5+(int)10.5);
	}

}
