import java.util.*;
public class 반복문_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수==> 사용자 입력
		
		int dan=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("단을 입럭:");
		dan=scan.nextInt();
		
		//요청값 출력
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		

	}

}
