
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a=0,b=0;
		
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
				a+=i;
			if(i%9==0)
				b+=i;
		}
		
		System.out.println("7�� ���:"+a);
		System.out.println("9�ǹ��:"+b);
		System.out.println("7�� ���+9�ǹ��:"+(a+b));
		
		
		a=0;
		b=0;
		
		int i=1;
		while(i<=1000)
		{
			if(i%7==0)
				a+=i;
			if(i%9==0)
				b+=i;
			i++;
					
		}
		System.out.println("7�� ���:"+a);
		System.out.println("9�ǹ��:"+b);
		System.out.println("7�� ���+9�ǹ��:"+(a+b));
		
	}

}
