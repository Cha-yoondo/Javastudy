/*
 * �迭= �뵵���� ��� ����Ѵ�
 * === ����  ������[] �迭��;
 *         ====�⺻��
 *         byte[] b=> File ����
 *         String[] s=>���ڿ��� �������(�̸�,�ּ�,��ȭ��ȣ)
 *         int[] i=>�������,���
 *         double[] d=>���,�󵵼�,������
 *         boolean[] b=> ���翩��
 */
public class �ڹٹ迭_�뵵4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s= {
				"cherry",
				"strawberry",
				"fig",
				"melon",
				"grapefruit",
				"mango",
				"lemon"
				
		};
		
		//���ϸ��߿� ���� �� ������?
		//��ü ���� ���
		System.out.println("==== ��ü���ϸ� ====");
		for(String ss:s) //index�� ���������ʴ´�,���� �����Ҽ�����
		{
			System.out.println(ss);
		}
		System.out.println("=================");
		System.out.println("���ϸ��߿� ���� �� ������?");
		int max=0;
		for(String ss:s)
		{
			int len=ss.length(); //���ڿ�=>������ ����(length())
			if(max<len)
				max=len;
		}
		
		//���
		for(String ss:s)
		{ 
			if(ss.length()==max)
			{
				System.out.println(ss);
			}
		}
		
		//���� ª�� ����
		
		System.out.println("=================");
		System.out.println("���ϸ��߿� ���� ª�� ������?");
		int min=100;
		for(String ss:s)
		{
			int len=ss.length(); //���ڿ�=>������ ����(length())
			if(min>len)
				min=len;
		}
		
		//���
		for(String ss:s)
		{ 
			if(ss.length()==min)
			{
				System.out.println(ss);
			}
		}
		
		//���ڰ���Ȯ�� ==>��й�ȣ
		/*
		 * ���ڿ�==>
		 * String ---> char[] ==> ���۹�ȣ�� 0
		 * "Hello Java"
		 * 0123456789
		 */
		String msg="Hello Java";//charAt()=>���ڿ����� ���ϴ� ��������
		//���۹�ȣ�� 0���ͽ���
		System.out.println("5��° ���ڰ�?");
	
		for(int i=0;i<msg.length();i++)
		{
			System.out.println(msg.charAt(i));
		}
	
		

	}

}
