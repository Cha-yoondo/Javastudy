/*
 *  �ݺ��� => �ݵ�� �ѹ� �̻��� ��������Ҷ� (do~while)
 *  ����)
 *        �ʱⰪ===> int i=1;
 *        do{
 *              �ݺ� ���๮�� ���
 *              system.out.print(i+" ");  
 *              ������
 *              i++;
 *        }while(���ǽ�); ==> i<=5;
 *        
 *        i=1
 *          1 => i++ (i=2) ==> i<=5 �� true => do ������ �̵�
 *        i=2
 *          1 2 i=3 ==> i<=5 �� true => do������ �̵�
 *        i=3
 *          1 2 3 i=4 ==> i <=5 �� true =>do������ �̵�    
 *        i=4
 *          1 2 3 4 i=5 ==> i <=5 �� true =>do������ �̵�    
 *        i=5
 *          1 2 3 4 5 i=6 ==> i <=5 �� false => ����
 *      
 *        
 */
public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ʱⰪ 
		int i=1; //�������� => Ƚ�� ����
		do
		{
			System.out.print(i+" ");//�ݺ� ���๮��(�������� ������ ����)
			i++; //5�� �ɋ����� ����=>Ƚ������
		}while(i<=5);
		
		System.out.println("\n========while========");
		//�ʱⰪ
		i=1; // int j=1;
		while(i<=5)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n========for=========");
		for(i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}

	}

}
