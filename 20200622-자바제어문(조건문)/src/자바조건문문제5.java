/*
 *  char ���� ����==> ���� ����
 *  
 *  
 *  => char alpha='A';
 *  
 *  => alpha �� �빮�ڸ� ==> �ҹ��� ���
 *     System.out.prinln((char)(alpha+32))
 *  =< alpha �� �ҹ��ڸ� ==> �빮�� ���
 *  System.out.prinln((char)(alpha-32))
 *  
 */
/*
 *  1.���
 *    ������ (�񱳿�����,��������,����������)\
 *      = �񱳿�����
 *      = ��������
 *      = ����������
 *      
 *    �ܵ�ó��=> ���������,����������,���Կ�����
 *            ======================
 *            ���� => ���
 *    ����ó��=> ����ȯ (���� ����ȯ)
 *             double => int ====> (int)double
 *             int    => char ===> (char)int        
 */
public class �ڹ����ǹ�����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alpha='c';
		
		if(alpha>='A' && alpha<='Z')
		{
			System.out.println((char)(alpha+32));
		}
		else
		{
			System.out.println((char)(alpha-32));
		}

	}

}
