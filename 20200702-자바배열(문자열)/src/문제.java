/*
 * 1.10���� ���ڸ� ������ �迭 C�� �����ϴ� �ڵ� ����
 * 2.0���� 5������ ���������� �ʱ�ȭ�� ���� ��Ť��� n ����
 * 3.'��'~'��' �ʱ�ȭ�� �迭 day ����
 * 4.4���� ������ ���� �迭bool�� �����ϰ� �����޽�Ʈ�η� ����
 */
import java.util.*;
public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[] c=new char[10];
		
		int[] n= {0,1,2,3,4,5};
		
		char[] day= {'��','��','ȭ','��','��','��','��'};
		
		boolean[] bool= {true,false,true};
		
	    char[] alpha= {'a','b','c','d'};
	   
	    
	    //�������� 10�� �Է¹޾� �迭�� �����ϰ� �迭�� �ִ� �����߿��� 3�ǹ��������ϴ� ���α׷� �ۼ�
	    
	    
	    int[] arr={1,2,3,4,5,6,7,8,9,10};
	    
	    for(int i:arr)
	    {
	    	if(i%3==0)
	    		System.out.println(i);
	    }
	    
	    
	    for(int i=1;i<11;i++)
	    {
	    if(i%3==0)
	    	System.out.println();
	    
		
	    
		int[] arr=new int[10]; //10���� �޸� ���� ����
		for(int i=0;i<10;i++)
		{
			arr[i]=(int)(Math.random()*10)+1; //�ʿ��� �� ���� 
		}
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("���:"+total/10.0);
		*/
		
		
		String course[]={"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int jumsu[]= {95,88,76,62,55};
		
		Scanner scan=new Scanner(System.in);
	
		
		while(true) {
			
			boolean bCheck=false;
			System.out.print("�����Է�:");
			String subject=scan.nextLine();
			if(subject.equals("�׸�"))
			{
				break;
			}
		for(int i=0;i<course.length;i++)
		{
		
			if(subject.equals(course[i]))
			{
				bCheck=true;
				System.out.println(jumsu[i]);
			}
		}
		
		if(bCheck==false)
		{
			System.out.println("���� �����Դϴ�!!");
		}
		}
		
		
		
		
		
		
		
		}

	}


