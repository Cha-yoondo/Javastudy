import java.util.Scanner;

import javafx.scene.transform.Scale;

/*
 * ���ڿ� ��:equals()
 * ================ (==)
 * ����ã��:contains()
 * ���۹��ڿ�:startsWidth()
 * �����¹��ڿ�:endsWidth()
 * ��������:charAt()
 * �����ǰ���:length()
 * ���鹮������:trim()
 * ������ ��ġ ã��:indexOf(),lastIndexOf()
 *    aaa.java
 * ����ȯ:valueOf   
 */
// �α���ó��
public class ���ڿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//id, pwd
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID�� �Է�:");
		String id=scan.nextLine();
		System.out.print("��й�ȣ �Է�:");
		String pwd=scan.nextLine();
		
		//���
		if(id.equalsIgnoreCase(ID) && pwd.equalsIgnoreCase(PWD))
		{
			System.out.println("�α��εǾ����ϴ�!!");
		}
		else
		{
			System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�!!");
		}
		
		
		

	}

}
