/*
 * 'A'+'B'
 * === == 66
 * ������ȯ =>65
 * 65 + 66 =>131 (int) char,short,byte => ���� => ����� int
 * 
 *  'ȫ'+'ȫ'
 *  
 *  ***������: ���������� �ʰ��ϸ�  error�� �ƴ϶� �����÷ο��� �߻�
 *  
 *  ��) int ==> 1~10   11=>
 *  
 *  byte b1=64;
		byte b2=65;
		byte b3=(byte)(b1+b2);
		System.out.println("b3="+b3);
				
 */
public class ���׿�����_���������2 {

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
