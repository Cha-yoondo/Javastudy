
/*
 *  1~100까지 합
 */
// => 1~100까지의 짝수,홀수의합 
public class 반복문_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 => 1~100까지 더한 값 => 누적
		
		int sum=0; //누적변수
		// i ==> 루프변수 
		for(int i=1;i<=100;i++)
		{
			sum+=i; // sum=sum+i
			/*
			 * sum=sum+i (sum=0,i=1) ==> sum=1
			 * sum=sum+i (sum=1,i=2) ==> sum=3
			 */
			System.out.printf("1부터 %d까지의 합:%d\n",i,sum);
		}

	}

}
