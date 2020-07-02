/*
 *  �迭
 *       => ������ ������ �ϳ��� ��� ����
 *          (���� �̸��� �Ѱ��� ������ ���=>�迭��)
 *          ������ ������ �̱� ������  ====> �ε���(÷��)
 *          *** ������: �ε��� ��ȣ�� 0���ͽ���
 *          
 *       => �迭�� ������ ������ �ö� => �迭��.length   new�� ����ϸ� => int�� 0���� �ʱ�ȭ
 *       => �迭 ����
 *           int[] �����=new int[��������]
 *           int[] arr=new int[5];
 *           double[] arr=new double[5]       new�� ����ϸ� => double=> 0.0
 *           =======
 *           ��������
 *           ���ڿ� ������
 *           String[] arr=new Stirng[10]      new�� ����ϸ� => String => null�� �ʱ�ȭ
 *           **��� Ŭ����==> �ּҸ� ������ �ִ� (�ּҾ��°��:null)
 *           
 *       => �迭 �ʱ�ȭ
 *          1) new �� �̿�ּ� �ڵ� �ʱ�ȭ
 *          2) ���α׷��Ӱ� ���� �Է�
 *             int[] arr={10,20,30,40,50}
 *          3) ����ڰ� �Է�, ���� ....
 *       => �迭 �� ����
 *          �迭��[���ϴºκ�]=��
 *               ======= �ε���
 *               10�� ==>7��°�� ���� ����
 *                      ====
 *                      �迭��[6]=100 ====> �Ϲ� ������ ������ ����� �Ѵ�             
 *       => �迭 �� ���
 *          0���� ~~ ==> for�� ����� ���� => while�� ����� ����
 *          => �Ϲ� for : ==> �ε��� �̿�
 *          ============================= �迭���� ����, ����
 *          => for-each ==> ���� ����� ���� �о�´�
 *          ============================= ��¿����� �ַ� ���
 *          
 *          
 *          
 */
// ����ڰ� ��,��,���� �Է��ϸ� ==> ������ ���

import java.util.*;
public class �ڹٹ迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⵵,��,���� �޴� ������ �ʿ�
		int year=0,month=0,day=0;
		//����ڷκ��� ��û���� �޴´�
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		year=scan.nextInt();
		//scan.nextInt() ==> Ű����� �Էµ� �������� �о���� ����
		System.out.print("�� �Է�:");
		month=scan.nextInt();
		System.out.print("�� �Է�:");
		day=scan.nextInt();
		
		System.out.println(year+"�⵵"+month+"��"+day+"��");
		//����
		/* 
		 *  ���� ���ϱ�
		 *  1) ���⵵������ �� �� ��  1�⵵ 1�� 1�� ~ 2019�� 12�� 31�ϱ��� ���
		 *  2) ���ޱ����� �� ����  ==> 2020�� 1�� 1�� ~ 2020�� 6�� 30�� ���
		 *  3) �Էµ� day���� �� ���� 
		 *  =================== +
		 *  => ��ü�ѳ��� % 7 ==> ������ ���� �� �ִ� 
		 *     ==========
		 *     0(��) 1(��) 2(ȭ) 3(��) 4(��) 5(��) 6(��)
		 *     => 1�⵵ 1�� 1�� -> �����Ϸ� ����
		 */
		//���⵵������ �� �� �� 
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//���� ==> 366 =>4�⸶�� ,100�⸶��(����),400�⸶��
		//���ޱ����� �� 
		int[] lastDay= {31,28,31,30,31,30,
				        31,31,30,31,30,31};
		
		//1�� =0
		//2��=total+31..
		//2���ϰ�� => 28.29
		
		if((year%4==0 && year%100!=0)||(year%400==0)) //��������
		{
			lastDay[1]=29;
		}
		else
		{
			lastDay[1]=28;
		}
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
        //�Է��� DAY
		
		total+=day;
		
		//���ϱ��ϱ�
		int week=total%7;
		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
		 System.out.println(strWeek[week]+"�����Դϴ�");
		
		/*switch(week)
		{
		case 0:
			System.out.println("�Ͽ����Դϴ�");
			break;
		case 1:
			System.out.println("�������Դϴ�");
			break;
		case 2:
			System.out.println("ȭ�����Դϴ�");
			break;
		case 3:
			System.out.println("�������Դϴ�");
			break;
		case 4:
			System.out.println("������Դϴ�");
			break;
		case 5:
			System.out.println("�ݿ����Դϴ�");
			break;
		case 6:
			System.out.println("������Դϴ�");
			break;
		}
		*/
		
		
	}

}
