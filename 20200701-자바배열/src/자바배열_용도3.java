import java.util.Scanner;

//����ڰ� �Է�(����)==>2���� ���
//bit=>16bit==>32767

public class �ڹٹ迭_�뵵3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		//0,1�� ����
		//����ڰ� ��û�� ����
		int user=0;
		int index=15;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է�(0~32767):");
		user=scan.nextInt();
		System.out.println("=====Lib�̿�=====");
		System.out.println(Integer.toBinaryString(user));
		
		while(true)
		{
			binary[index]=user%2;
			user=user/2;
			if(user==0)break; 
			index--;
		}
		//������
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
		    	System.out.print(binary[i]);
			
		}

	}

}
