/*
 *   A
 *   AB
 *   ABC
 *   ABCD
 *   ABCDE
 *   
 *   =============
 *   
 *   ABCDE
 *   ABCD
 *   ABC
 *   AB
 *   A
 *   
 *   ����
 *   �ټ�(i)  ���ĺ�(j)
 *   1        5       ==> i+j=6    6-i=j
 *   2        4 
 *   3        3
 *   4        2
 *   5        1
 *   
 *   
 *   
 *   1####
 *   #2###
 *   ##3##
 *   ###4#
 *   ####5
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   *****
 *    ****
 *     ***
 *      **
 *       *
 *       
 *       
 *  ================
 *  �ټ�(i)     ����(j)     ��ǥ(k)
 *   1           0         5
 *   2           1         4
 *   3           2         3
 *   4           3         2
 *   5           4         1
 *   
 *   ===========================
 *   
 *            i��j�� ����
 *            j+1=i  => j=i-1
 *            i�� k�ǰ���
 *            i+k=6  =>k=6-i
 *   
 *        
 */
public class �ݺ���_2��for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		for(int i=1;i<=5;i++)
		{
			c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			ch='A';
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
					
			}
			System.out.println();
		}
		
		System.out.println();

	int k=25;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			
				System.out.printf("%2d\t",k);
				k--;
			} System.out.println();
		}

		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		}
		
		
	
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
			System.out.print(" ");
		}
			for(k=1;k<=i;k++)
			{
				System.out.print(i);
				
			}
		System.out.println();
		}
		
		
			
		
		
	}

}
