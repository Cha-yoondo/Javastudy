/*
 * ���ڿ��� �����Ҽ� �ִ� ���� : String
 * String : �Ϲݺ����� ����
 *          Ŭ������ ���� -> ���(�޼ҵ�)
 *          
 *          
 *          �ֿ���
 *          =���ڿ� �� : equals()
 *          =���� ����: contains()
 *          =���ڿ��߿� �Ѱ�����: charAt()
 *          =����� ������ ����:length()
 *          =�����ڸ���:substring()
 *          =ã�� ������ ��ġ:indexOf(),lastIndex()
 *          =��絥�����������ڿ��κ�ȯ=>valueOf()
 *          =���鹮������:trin() =>�¿츸����
 *          " Hello Java " =>"Hello Java"
 *          =���ڿ�=>char[]=>toCharArray()
 *          =startsWith,endswith=>�˻���
 *          
 *         
 */
//substring:�ʿ��� ���ڸ� ����=> ���¼� �м� (���,�λ�,Ȱ���)
/*
 *     "Hello Java" ==> String => char[]
 *     
 *     
 *     substring(int start)
 *     substring(int start, ine end
 */
public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="100-010";
		System.out.println(msg.substring(0,3));
		System.out.println(msg.substring(4,7));


	}

}
