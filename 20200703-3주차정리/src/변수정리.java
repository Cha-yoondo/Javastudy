/*
 * 변수의 종류
 * ========
 * 1)한개의 데이터 공간 => 변수
 * 2)같은 타입 여러개를 저장하는 공간 ==> 배열(연속적으로 메모리에 저장=>인덱스)
 * 3)다른 타입 여러개를 저장하는 공간 ==> 클래스
 * 
 * ***변수 => 메모리에 저장=> 프로그램이 종료하면 자동으로 메모리에서 사라진다
 * 
 * 변수 => 기본형(자바에서 제공하는 메모리크기)
 *     => 정수저장(int =>일반프로그램, long=>빅데이터)
 *     => 실수저장(double)
 *     => trug,false =>boolean=>존재여부확인(while안에서 종료)
 *     => 문자 여러개를 저장 =>String
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10개의 데이터(정수) =>배열
		// 두개의 정수 => 일반int
		// 문자 여러개 저장 => char[], String
		// true,false ==> boolean
		
		int[] com=new int[10];// 숫자를 저장 1~10 => 중복 (임의로 추출)
		
		//10개 데이터에 초기값 주입
		for(int i=0;i<10;i++)
		{
			com[i]=(int)(Math.random()*10)+1;
		}
		//확인
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int su=0;//난수값 저장
		//중복이 없으면 => 저장(false),중복(True)이 되면 난수를 다시 발생
		boolean bCheck=false;
		
		//경우의 수 
		//로그인 => 3개 => String,int,char
		
		for(int i=0;i<10;i++)
		{
			bCheck=true;
		
		while(bCheck)
		{
			//난수
			su=(int)(Math.random()*10)+1;
			//종료확인
			bCheck=false;
			//비교=>같은수가 저장되었는지 확인
			for(int j=0;j<i;j++)
			{
				if(com[j]==su)
				{
					bCheck=true;
					break;
				}
			}
			}
		//while end
		com[i]=su;
		}
	for(int i:com)
	{
		System.out.print(i+" ");
	}
}

}
