/*
 *    ���� ������
 *    ��������� (+,-,*,/,%)
 *    => �ڹٿ��� �����ϴ� ��� �����ڴ� ����� ��ȯ�Ҽ��ִ�.
 *    => �ڹ����α׷����� ���� ���� ���Ǵ� ������
 *    => ������
 *       1) ����ȯ =
 *       2) / 
 *          = 0���� ������ ������ �߻�
 *          = ����/����=����
 *          
 *       3) %
 *          = ������  ������ =>��ȣ�� ������ ��ȣ�� ���´�
 *             (-5) % (-2) => -1
 *             ==
 *             (5) % (-2) => 1
 *             
 *        4) ��� �������� �켱������
 *        *,/,*�� +,- ���� �켱������ ���
 *        
 *       
 *         5<<2
 *            101
 *            
 */
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int m=a/b;
		int n=a%b;
		
		System.out.printf("%d+%d=%d%n",a,b,c);
		System.out.printf("%d-%d=%d%n",a,b,d);
		System.out.printf("%d*%d=%d%n",a,b,e);
		System.out.printf("%d/%d=%d%n",a,b,m);
		System.out.printf("%d%%%d=%d%n",a,b,n);
		
				
				
				

	}

}
