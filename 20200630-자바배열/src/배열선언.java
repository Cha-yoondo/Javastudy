/*
 * �迭:
 * 1) ���� Ÿ���� �������� ������ ��� �����ϴ� ���α׷�
 *    ======
 *    //double[] a=(100.10.5....}
 *    ����(����,�Ǽ�,����) , ���ڿ�
 *  2) �Ѱ��� �������� �̿��ؼ� =>�������� ������ ����
 *  =============== ������: ��ȣ�� ������ �Ѵ�
 *                        ======= �ε��� ��ȣ
 *                        �ε��� ��ȣ =>0���ͽ���
 *   ��) int[] arr={10,20,30,40,50}
 *   
 *   �޸� �ּ� �̿��� �����ϴ� ���� ==> ��������(�迭,Ŭ����)
 *   ** �ε��� ��ȣ�� �߰��� ���� ��ȣ�� ���� (������)=> for
 *   ==>�迭 ���� ���
 *   ============
 *   ��������[] �迭��;
 *            === ������ ��Ī��
 *   �������� �迭��[];
 *   
 *   ��) ��ȭ������ 10�� ��Ƽ� ����
 *   String[] title=new String[10];
 *   
 *   10���� �л��� ������ ����
 *   char[] hakjum=new char[10];
 *   10���� �л��� ������ ����       
 *   int[] total=new int[10];   
 *   ==>new�� ����ϸ� �޸� ������ ����==> 0������ �ʱ�ȭ �ȴ� 
 *   
 *   => ������
 *   1.�迭�� ũ�⸦ �ʰ��ϸ� error : ArraIndexOutOfBoundsException
 *   ==========
 *   n�� ==> 0~n-1 ==> ���࿡ ������ �𸣴� ��� : length
 *   2. ����� �̿�ÿ���=>�ַ� for���� �̿��ؼ� ó��                           
 */
public class �迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5�� ���� ���� => ����, ����, ���
		int a=80;
		int b=90;
		int c=75;
		int d=90;
		int e=85;
		
		int total=a+b+c+d+e;
		double avg=total/3.0;
		
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
		
		
		//�迭
		int[] score= {80,90,75,90,85};
		int total2=0;
		double avg2=0.0;
		for(int i=0;i<score.length;i++)
		{
			total2+=score[i]
					;
			
		}
		
		avg2=total2/3.0;
		
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
	}

}
