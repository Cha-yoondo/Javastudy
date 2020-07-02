import java.util.*;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.print("세개의 정수 입력:");
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		System.out.println(a*b+c);
		*/
		
		
		int a;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("(10~99):89>");
		
		a=scan.nextInt();
		
		
		if(a%11==0)
		{
			System.out.println("10의 자리와 1의 자리가 같습니다.");
			
		}
		else
		{
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
		
		

	}

}
