/*
 *      1 1 1 1 1
 *      2 2 2 2 2 
 *      3 3 3 3 3
 *      4 4 4 4 4 
 *      5 5 5 5 5 
 *      
 *      1 2 3 4 5 
 *      6 7 8 9 10
 *      11 12 13 14 15
 *      16 17 18 19 20
 *      21 22 23 24 25
 *      
 *      25 24 23 22 21
 *      20 19 18 17 16
 *      15 14 13 12 11
 *      10 9 8 7 6
 *      5 4 3 2 1 
 *      
 *      
 *       
 *      
 * 
 */
public class 반복문_2차for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			//출력
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%2d\t",i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			//출력
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%2c\t",i+64);
			}
			System.out.println();
		}

	}

}
