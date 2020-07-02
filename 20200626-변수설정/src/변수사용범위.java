/*
 *   변수  Scope
 *   =========
 *   변수 종류
 *   =========
 *     = 지역변수
 *     = 멤버변수
 *     = 공유변수
 *     
 *     public class A
 *     {
 *         int a; ===> 멤버변수 ==> 클래스 A가 저장이 될때마다 생성
 *         static int b; ==> 공유변수 ===> JVM class를 로드할때
 *         public static void main(String[] args)
 *         {
 *            int c; //지역변수
 *         } // c변수 => main에서만 사용이가능
 *     
 */
public class 변수사용범위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int i=1;
		for(i=1;i<=10;i++)
		{
			System.out.println("i="+i);
		}
		System.out.println("i="+i);
		
		
		System.gc();
		int j=1;
		System.out.println("j="+j);
		*/
		
		.+.args.clone().
		int i=1;
		for( i=1;i<=5;i++)
		{
			System.out.println(i+" ");
		}
	System.out.println();
	i=1;
	while(i<=5)
	{
		System.out.println(i+" ");
		i++;
	}
	
	System.out.println();
	i=1;
	do
	{
		System.out.println(i+" ");
		i++;
	}while(i<=5);
	
	}

}
