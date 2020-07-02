/*
 *  이차원 배열
 *  ========
 *  [][]
 *  
 *  *형식
 *  1) 데이터형[][] 배열명; ==> 권장 사항
 *  2) 데이터형 배열명[][];
 *  3) 데이터형[] 배열명[]
 *   => 행/열
 *   
 *    데이터형[행][열]
 *    ==============
 *    
 *    *초기화
 *    예)int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
 *      =>3행 3열
 */
public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5]; //전체=>0으로 초기화
		int k=0;
		
		//초기값
		for(int i=0;i<5;i++) //행
		{
			for(int j=0;j<5;j++) //열
			{
				arr[i][j]=k; //
			    k++;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.printf("arr[%d][%d]=%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		

		
	}

}
