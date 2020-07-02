/*
 *   반복제어문
 *   =break ==>반복문을 종료할때
 *   =continue ==> 특정부분을 제외하고싶은경우
 *   =조건문과 같이 사용한다(if)
 *   = *break,continue 는 한개의 반복문만 제어할수있다
 *     *break => 반복문 전체(for,do~while,while),switch
 *     *continue -> 반복문에서만 사용이가능
 *     *return => 보류(메소드종료)
 */
public class 반복제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력 ==> 5일때 종료==>break;
		for(int i=1;i<=10;i++)
		{
			//5일때
			if(i==6)
				//종료
				break;
			System.out.print(i+" ");
		}
		System.out.println("\n=======continue=======");
		//1~10까지 홀수만 출력
		//조건문
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
		//증가 =>2
		System.out.println("\n=======2씩 증가========");
		for(int i=1;i<=10;i+=2)
		{
			if(i%2==0)
			System.out.print(i+" ");
			
		}
		System.out.println("\n=======continue========");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;
			System.out.print(i+" ");
			
		}
		//continue 사용
	}

}
