import java.util.*;
public class �ݺ���_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����==> ����� �Է�
		
		int dan=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		dan=scan.nextInt();
		
		//��û�� ���
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		

	}

}
