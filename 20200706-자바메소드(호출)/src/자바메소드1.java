/*
 * 
 *  �޼ҵ�
 *    = ����� ���� �޼ҵ�
 *     = ����)
 *              ��ȯ�� �޼ҵ��(�ŰԺ���...)
 *              {
 *                 return ��; => ��=��ȯ��
 *                 ��ȯ���� ���� ��쿡�� => void,return �� ������ ����
 *               }
 *    = ���̺귯�� �޼ҵ�
 *    ==================
 *                 
 *  �޼ҵ�: Ư�� �۾��� �����ϱ� ���� ��ǻ���� ��ɹ��� ����
 *         ***�Ѱ��� �ϸ� ����
 *         ***����ȭ �۾�
 *         
 *         ��) ���� �߱� ����
 *             = 3�ڸ� ������ ����
 *             = ����ڿ��� �Է��� ��û
 *             = ������ ����� �Է°��� ��
 *             = ��Ʈ
 *             = ������ ��쿡 ����
 *             = �ٽ� ������ ���� ���� Ȯ��
 *             
 */
public class �ڹٸ޼ҵ�1 {
	static void aaa()
	{
		System.out.println("aaa() ȣ�� ����...");//1
		bbb(); //bbb()�̵�
		System.out.println("aaa() ȣ�� ����...");//8
	}
	static void bbb()
	{
		System.out.println("bbb() ȣ�� ����...");//2
		ccc(); //ccc()�̵�
		System.out.println("bbb() ȣ�� ����...");//7
	}
	static void ccc()
	{
		System.out.println("ccc() ȣ�� ����...");//3
		ddd(); //ddd()�̵�
		System.out.println("ccc() ȣ�� ����...");//6
	}
	static void ddd()
	{
		System.out.println("ddd() ȣ�� ����...");//4
		System.out.println("ddd() ȣ�� ����...");//5
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa();

	}

}
