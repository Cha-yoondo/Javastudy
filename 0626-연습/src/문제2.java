
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int sum=0;
		
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
				{count++;
				sum+=i;
				}
		}
		System.out.println("����:"+count);
		System.out.println("��:"+sum);
		
		
		
		int i=100;
		
		sum=0;
		count=0;
		
		while(i<=999)
		{ 
			if(i%4!=0)
			{ count++;
			  sum+=i;
			}
			i++;
		}
		
		System.out.println("����:"+count);
		System.out.println("��:"+sum);
		
		}

	}


