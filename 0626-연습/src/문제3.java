
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0;
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				b+=i;
			else
				a+=i;
			
		}
		System.out.println("¦���� ��:"+b);
		System.out.println("Ȧ���� ��:"+a);
		
		
		a=0;
		b=0;
		
		int i=1;
				while(i<=30)
				{
					if(i%2==0)
						b+=i;
					else
						a+=i;
					
					i++;
				}
		
				System.out.println("¦���� ��:"+b);
				System.out.println("Ȧ���� ��:"+a);
	}

}
