/*
 * �޼ҵ�: �Ѱ��� ��ɸ� ����=> ������ �ٽ� ����Ҽ� �ְ� �����
 *       ����
 *        => ����
 *        => �ݺ� ����
 * ����) 
 *       ��ȯ���� ���°�� : void
 *       �Ű������� ���°�� (�Ű�����=> �ַ� ����ڰ� ��û�Ѱ�)
 *       ��ȯ���� ���� -> ����ڰ� ��û�� ������ �����=> �ݵ�� �Ѱ��� ����
 *                    �������ϰ��: �迭,Ŭ����
 *       �Ű������� ����-> ���̵� �ߺ�äũ(=>id), �����ȣ�˻�(��,��)
 *                     �α���(id,password)
 *       ��ȯ��(������) �޼ҵ��(�Ű�����,�Ű�����...)
 *       {
 *       
 *       }
 *       void process()
 *       {
 *          if(key==ENTER)
 *          {
 *              return; //����������
 *              System.out.println(); ==>����
 *          }
 *          
 *            ����
 *            return; =>return ���� �ؿ��� �ҽ��ڵ��� �Ҽ�����
 *            ���� 
 *            break
 *            continue
 *            return
 *        }    
 * 
 */
import java.util.*; //Scanner
public class �ڹٸ޼ҵ� {
	//������Է� => �⵵
	static int userInput()
	{
		 int year=0;
		 Scanner scan=new Scanner(System.in);
	     System.out.print("�⵵�� �Է�:");
		 year=scan.nextInt();
		 return year;
		 
	}
	// ���⿩�θ� Ȯ���ϴ� ���==> ����
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			bCheck=true;
			
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("�⵵�� �Է�:");
		int year=scan.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println(year+"�⵵�� �����Դϴ�");
		}
		else
		{
			System.out.println(year+"�⵵�� ������ �ƴմϴ�");
		}
		*/
		
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println("�����Դϴ�");
		else
			System.out.println("�����̾ƴմϴ�");
		
		
	}

}
