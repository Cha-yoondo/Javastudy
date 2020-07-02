/*
 *   비트연산자 => 비트와 비트를 연산
 *      8
 *      =========
 *      1 0 0 0 
 *      =========
 *      6
 *      =========
 *      0 1 1 0
 *      =========
 *           &  |  ^  ==> 회로,암호화/복호화
 *          (*) (+)
 *          
 *          ===========
 *          00 0 0 0
 *          01 0 1 1
 *          10 0 1 1
 *          11 1 1 0
 *          ===========
 *          
 *          10 & 5
 *          
 *          1010
 *          0101
 *          ===== &
 *          0000 ===> 0
 *          
 *          1010
 *          0101
 *          ===== |
 *          1111 ====> 15
 *          
 *          1010
 *          0101
 *          ====== ^
 *          1111 ===> 15
 *          
 *          27 & 13
 *          
 *          
 *          27 | 13
 *          27 ^ 13
 *   	System.out.println(10&5);
		System.out.println(10|5);
		System.out.println(10^5);
		
		& => *를한다
		| => +를한다
		^ => 다른비트 찾는다
 * 
 */
public class 이항연산자_비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(27&13);
		System.out.println(27|13);
		System.out.println(27^13);
		

	}

}
