
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int count=0;
		
		for(int i=100;i<=999;i++)
		{
			if(i%7==0) {
				sum+=i;
				count++;
			}
			
		}	
			System.out.println("7�� ��� ��:"+sum);
			System.out.println("7�� ��� ����:"+count);
			
			
			
		int i=100;
		sum=0;
		count=0;
		
		while(i<=999)
			{
				if(i%7==0) {
					sum+=i;
					count++;
				}
			  i++;
			}
		System.out.println("7�� ��� ��:"+sum);
		System.out.println("7�� ���  ����:"+count);
		

	}

}
