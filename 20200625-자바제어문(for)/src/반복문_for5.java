// => 1~100까지의 짝수,홀수의합 
//1~100까지 ==> 3의배수의 합, 5의 배수의합 , 7의 배수의 합 
//100~999 까지 7의 배수의 갯수
// 1-2+3-4+5-6...
public class 반복문_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a=0,b=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				b+=i;
			else
				a+=i;
		}
			System.out.println("짝수의 합:"+b);
			System.out.println("홀수의 합:"+a);
			
		
		int a=0,b=0,c=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				a+=i;
			if(i%5==0)
				b+=i;
			if(i%7==0)
			    c+=i;
		}
		
		System.out.println("3의배수의 합:"+a);
		System.out.println("5의배수의 합:"+b);	
		System.out.println("7의배수의 합:"+c);
			
		
		int a=0;
		
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
				a++;
				
				
		}
		System.out.println("7의배수의 갯수:"+a);
		
		
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10:"+sum);
		*/	
		
		for(int i=1;i<=12;i++)
		{
			if(i%3==0)
				System.out.print("☆");
			else
				System.out.print("★");
			
		}
		
		
		
		
		}

	}
