/*
 * ������ ����
 * ========
 * 1)�Ѱ��� ������ ���� => ����
 * 2)���� Ÿ�� �������� �����ϴ� ���� ==> �迭(���������� �޸𸮿� ����=>�ε���)
 * 3)�ٸ� Ÿ�� �������� �����ϴ� ���� ==> Ŭ����
 * 
 * ***���� => �޸𸮿� ����=> ���α׷��� �����ϸ� �ڵ����� �޸𸮿��� �������
 * 
 * ���� => �⺻��(�ڹٿ��� �����ϴ� �޸�ũ��)
 *     => ��������(int =>�Ϲ����α׷�, long=>������)
 *     => �Ǽ�����(double)
 *     => trug,false =>boolean=>���翩��Ȯ��(while�ȿ��� ����)
 *     => ���� �������� ���� =>String
 */
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10���� ������(����) =>�迭
		// �ΰ��� ���� => �Ϲ�int
		// ���� ������ ���� => char[], String
		// true,false ==> boolean
		
		int[] com=new int[10];// ���ڸ� ���� 1~10 => �ߺ� (���Ƿ� ����)
		
		//10�� �����Ϳ� �ʱⰪ ����
		for(int i=0;i<10;i++)
		{
			com[i]=(int)(Math.random()*10)+1;
		}
		//Ȯ��
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int su=0;//������ ����
		//�ߺ��� ������ => ����(false),�ߺ�(True)�� �Ǹ� ������ �ٽ� �߻�
		boolean bCheck=false;
		
		//����� �� 
		//�α��� => 3�� => String,int,char
		
		for(int i=0;i<10;i++)
		{
			bCheck=true;
		
		while(bCheck)
		{
			//����
			su=(int)(Math.random()*10)+1;
			//����Ȯ��
			bCheck=false;
			//��=>�������� ����Ǿ����� Ȯ��
			for(int j=0;j<i;j++)
			{
				if(com[j]==su)
				{
					bCheck=true;
					break;
				}
			}
			}
		//while end
		com[i]=su;
		}
	for(int i:com)
	{
		System.out.print(i+" ");
	}
}

}
