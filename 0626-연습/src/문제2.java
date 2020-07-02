
public class ¹®Á¦2 {

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
		System.out.println("°¹¼ö:"+count);
		System.out.println("ÇÕ:"+sum);
		
		
		
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
		
		System.out.println("°¹¼ö:"+count);
		System.out.println("ÇÕ:"+sum);
		
		}

	}


