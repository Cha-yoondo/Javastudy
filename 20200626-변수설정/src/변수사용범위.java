/*
 *   ����  Scope
 *   =========
 *   ���� ����
 *   =========
 *     = ��������
 *     = �������
 *     = ��������
 *     
 *     public class A
 *     {
 *         int a; ===> ������� ==> Ŭ���� A�� ������ �ɶ����� ����
 *         static int b; ==> �������� ===> JVM class�� �ε��Ҷ�
 *         public static void main(String[] args)
 *         {
 *            int c; //��������
 *         } // c���� => main������ ����̰���
 *     
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int i=1;
		for(i=1;i<=10;i++)
		{
			System.out.println("i="+i);
		}
		System.out.println("i="+i);
		
		
		System.gc();
		int j=1;
		System.out.println("j="+j);
		*/
		
		.+.args.clone().
		int i=1;
		for( i=1;i<=5;i++)
		{
			System.out.println(i+" ");
		}
	System.out.println();
	i=1;
	while(i<=5)
	{
		System.out.println(i+" ");
		i++;
	}
	
	System.out.println();
	i=1;
	do
	{
		System.out.println(i+" ");
		i++;
	}while(i<=5);
	
	}

}
