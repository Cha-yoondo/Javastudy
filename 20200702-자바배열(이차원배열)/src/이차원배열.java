/*
 *  ������ �迭
 *  ========
 *  [][]
 *  
 *  *����
 *  1) ��������[][] �迭��; ==> ���� ����
 *  2) �������� �迭��[][];
 *  3) ��������[] �迭��[]
 *   => ��/��
 *   
 *    ��������[��][��]
 *    ==============
 *    
 *    *�ʱ�ȭ
 *    ��)int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
 *      =>3�� 3��
 */
public class �������迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5]; //��ü=>0���� �ʱ�ȭ
		int k=0;
		
		//�ʱⰪ
		for(int i=0;i<5;i++) //��
		{
			for(int j=0;j<5;j++) //��
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
