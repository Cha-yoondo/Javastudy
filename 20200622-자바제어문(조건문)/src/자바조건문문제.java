/*
 *  1. ������ �Է��޾Ƽ�
 *     ¦������ Ȧ������ Ȯ�� => 10�� ¦����,11�� Ȧ����
 *                      ======== ========= if ~ else
 *  2. ���� 3���� �Է��� �޾Ƽ�
 *     ����, ���
 *     ����=> ���ǹ�
 *       60���̻� =>D
 *       70    =>C
 *       80    =>B
 *       90    => A
 *       �������� F
 *       
 *       �������� :80
 *       �������� :80
 *       �������� : 80
 *       
 *       ����:240
 *       ���80.0
 *       ����:B
 *      
 *      Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int a=scan.nextInt();
		
		if(a%2==0)
			System.out.println(a+"�� ¦����");
		
		else {
			System.out.println(a+"�� Ȧ����");
		}
			            
 *
 */
import java.util.*;

public class �ڹ����ǹ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�������� �������� �������� �Է�:");
		//Ű����� �Էµ� ������ �ޱ�
		
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		char score='A';
				
		
		if(avg>=60 && avg<70)
		{ 
			score='D';
		}
		
		if(avg>=70 && avg<80)
		{ 
			score='C';
		}
		if(avg>=80 && avg<90)
		{
			score='B';
		}

		if(avg>=90 && avg<=100)
		{
			score='A';
		}
		if(avg<60)
		{
			score='F';
		}
		
	   System.out.println("����:"+total);
	   System.out.printf("���:%.f%n",avg);
	   System.out.println("����:"+score);

	  
		
		
			
		}
		
		
		
		
		

	}

}
