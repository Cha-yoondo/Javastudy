/*
 * ���� ���ǹ�
 * if(���ǹ�)
 * {
 *    ���ǹ��� true�� �����ϴ� ���� ����
 * }
 * else
 * {
 *    ���ǹ��� flase�϶� �����ϴ� ���� ����
 *  }
 *  ��
 * 
 */
import java.util.*;

public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �Ѱ��� �Է� �޾Ƽ� => ���ĺ����� ���� Ȯ��
		//���� ����
		
		char ch='A'; //���� =>�ʱ�ȣ��
		/*
		 * int => 0
		 * double => 0.0
		 * long=> 0L
		 * boolean => false
		 * ch>='0' && ch<='9')||(ch>='a' && ch<='z'
		 */
		 //���� �Ѱ� �̺��
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�:");
		//"ABC" ==>�ڹٴ� ��� ���� ��ȣ 0���� �����Ѵ�
		
		ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+"��(��) �����Դϴ�!!");
		}
		else
		{
			System.out.println(ch+"��(��) �����Դϴ�!!");
		
		}

	}

}
