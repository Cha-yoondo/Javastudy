/*
 * 
 * 
 * string : Ŭ����
 * ���(����)
 * => ���ڰ���
 * String s="ABCDEF";
 * s.length() =>6
 * string s="ABCDEF";
 * s.charAt(0) ==> 'A'
 * 
 * 
 */
//����� ���ڿ����Է�
//�빮�� ����, �ҹ��ڰ���
import java.util.*;
public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=""; //���� ������ ����
		//System.out.println(s);
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���>>");
		s=scan.next(); //String ���� �������� ����
		//s=scan.nextLine(); ������� ���� 
		System.out.println(s);
		//System.out.println("����"+s.length());
		
		int a=0,b=0;
		//a=>�ҹ��� ����
		//b=>�빮�� ����
		
		int i=0; //������ ������ŭ �����ϴ� ����=>��������20
		/*
		 *     ABCDEFG  => 7
		 *     =======
		 *     0123456
		 */
		//AbCdEf
		while(i<s.length())
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
				b++; // ����Ȯ�� ==> ��+=
			if(c>='a' && c<='z')
				a++;
				
				i++;
				
		}
			System.out.println("�빮�� ����:"+b);
			System.out.println("�ҹ��� ����:"+a);
	
		
		
		
	}

}
