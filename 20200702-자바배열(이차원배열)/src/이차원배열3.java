/*
 *  i  j  0     1      2      3      4
 *  0  ==================================
 *                     1
 *  1  ==================================
 *              2      3      4
 *  2  ==================================
 *        5     6      7      8      9  
 *  3  ==================================
 *              10     11     12
 *  4  ==================================
 *                     13
 *    
 *    
 */
public class 이차원배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5];
		int k=1;
		
		for(int i=0;i<3;i++)
		{
		for(int j=2-i;j<=i+2;j++)
		 	{
			arr[i][j]=k;
			k++;
		     }
		}
		
		for(int i=3;i<=4;i++)
		{
			for(int j=i-2;j<=6-i;j++)
			{
			arr[i][j]=k;
			k++;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		
	}

}
