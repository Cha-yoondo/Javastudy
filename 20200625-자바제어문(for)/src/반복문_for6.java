// A-Z까지 출력

public class 반복문_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.print(ch);
		}//ch는 메모리에서 사라진다
		System.out.println();
		for(char ch='a';ch<='z';ch++)
		{
			System.out.print(ch);
		}
		*/
		for(int i=10;i>=1;i++)
		{
			System.out.print(i);
		}
			
			System.out.println("==============");
			
			
			for(int i=1,j=10;i<=10;i++,j--)	
				{
				System.out.println("i="+i+",j="+j);
				}
	}

}
