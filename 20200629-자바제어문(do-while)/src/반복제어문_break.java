/*
 *   �ݺ����
 *   =break ==>�ݺ����� �����Ҷ�
 *   =continue ==> Ư���κ��� �����ϰ�������
 *   =���ǹ��� ���� ����Ѵ�(if)
 *   = *break,continue �� �Ѱ��� �ݺ����� �����Ҽ��ִ�
 *     *break => �ݺ��� ��ü(for,do~while,while),switch
 *     *continue -> �ݺ��������� ����̰���
 *     *return => ����(�޼ҵ�����)
 */
public class �ݺ����_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10���� ��� ==> 5�϶� ����==>break;
		for(int i=1;i<=10;i++)
		{
			//5�϶�
			if(i==6)
				//����
				break;
			System.out.print(i+" ");
		}
		System.out.println("\n=======continue=======");
		//1~10���� Ȧ���� ���
		//���ǹ�
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
		//���� =>2
		System.out.println("\n=======2�� ����========");
		for(int i=1;i<=10;i+=2)
		{
			if(i%2==0)
			System.out.print(i+" ");
			
		}
		System.out.println("\n=======continue========");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;
			System.out.print(i+" ");
			
		}
		//continue ���
	}

}
