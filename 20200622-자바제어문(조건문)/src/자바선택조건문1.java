/*
 *  ���� ���ǹ� : if~else
 *  ����) 
 *       => �α��� ó��
 *       => ���̵� �ߺ�üũ
 *       => �۾��� (����/���)
 *       => ¦��/Ȧ��
 *       => �빮��/�ҹ���
 *         
 *  
 *       if(���ǹ�)
 *       {
 *         ==> ������ true �϶� ó���ϴ� ����
 *       }
 *       else 
 *       {
 *         ==> ������ false�϶� ó���ϴ� ����
 *       }
 */

import java.util.Scanner;

public class �ڹټ������ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner�� ���� => Ű������ �Է����� �ִ� ��쿡 ó��
		 Scanner scan=new Scanner(System.in);
		//�ڹ��� ��� Ŭ����, ����� ���� Ŭ����==> ������ �϶�
		//�ݵ�� new �̿��ؼ� ����
		//System.in ==> ����� Ű���� �Է°��� �޴´�
		//System.out ==> ����Ϳ� ����Ҷ� ���
				 System.out.println("������ �Է�(1~100):");
		 //1~100������ ������ �Էµ��� �ʾҴٸ�
		 int a=scan.nextInt();
		 if(!(a<1 || a>100))
		 {
			 System.out.println("�߸��� �Է��Դϴ�\n���α׷��� �����մϴ�");
		 }
		 else
		 {   //1~100������ ������ �Է��� �Ǿ��ٸ� 
			 System.out.println(a+"�� �ԷµǾ����ϴ�~");
		 }

	}

}
