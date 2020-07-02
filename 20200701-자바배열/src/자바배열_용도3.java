import java.util.Scanner;

//사용자가 입력(정수)==>2진법 출력
//bit=>16bit==>32767

public class 자바배열_용도3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		//0,1만 저장
		//사용자가 요청한 정수
		int user=0;
		int index=15;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력(0~32767):");
		user=scan.nextInt();
		System.out.println("=====Lib이용=====");
		System.out.println(Integer.toBinaryString(user));
		
		while(true)
		{
			binary[index]=user%2;
			user=user/2;
			if(user==0)break; 
			index--;
		}
		//결과출력
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
		    	System.out.print(binary[i]);
			
		}

	}

}
