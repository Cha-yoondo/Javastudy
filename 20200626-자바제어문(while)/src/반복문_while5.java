/*
 *  ������
 *  1)while�� ������ ���� ��� error => for(;;)
 *    while() => ���ǽ��� ����
 *    {
 *    } ======> �����߻�
 *  2) while ���� ���ѷ���
 *     => for(;;) => while(true) : ���� ���� ����
 *     
 *      for(int i=0;i<10;i++)
 *      
 *      int i=0;
 *      while(i<10)
 *      {
 *         i++
 *      }
 *      
 *      int i=5;
 *      while (--i!=0) ==> i>=0
 *      {
 *         System.out.println(i); ==>
 *      }
 */

import java.util.*;
public class �ݺ���_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; //����� ��û�� ����
		int i=1; // ����� ��û�� �������� ����(��������)
		int sum=0; // ����(��)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		user=scan.nextInt();
		
		while (i<=user)
		{
			sum+=i;
			i--;
		}
		System.out.println("sum="+sum);
		
for (int j=1;j<=10;j++) {
	
}//j�� �޸𸮿��� �������

System.out.println(j);
	}

}
