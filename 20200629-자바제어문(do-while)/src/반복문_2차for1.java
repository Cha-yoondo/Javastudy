/*
 *   ��ø for��
 *   =======
 *   ����)
 *        for(�ʱⰪ;���ǽ�;������)
 *        {
 *           for(�ʱⰪ;���ǽ�;������)
 *           {
 *              �ݺ� ���๮��
 *           }
 *        }
 *   �������)
 *          1   2   4
 *    for(�ʱⰪ;���ǽ�;������)
 *        {
 *                   3
 *             ================
 *                1   2   4
 *           for(�ʱⰪ;���ǽ�;������)
 *           {
 *                  3
 *              �ݺ� ���๮��
 *           }
 *           
 *           ==================
 *        }
 *        
 *        ��) 
 *            for(int i-1;i<=3;i++)
 *            {
 *               for(int j=1;j<=3;j++)
 *                  {
 *                     System.out.println("i="+i+",j="+j);
 *                   }
 *             }
 *             
 */
public class �ݺ���_2��for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)//�ټ� ==>���
		{
			for(int j=2;j<=9;j++)//������ ��� ��ġ
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}

	}

}
