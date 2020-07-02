
public class 자바단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;// 3배수,5배수,7배수
		if(a%3==0)//if문장이 종료
		{
			System.out.println(a+"는 3의 배수입니다"); //단독실행문장
			System.out.println("if(a%3==0) 수행문장");
		}
		/// 한문장
		if(a%5==0)
			System.out.println(a+"는 5의 배수입니다");
		/// 한문장
		if(a%7==0)
			System.out.println(a+"는 7의 배수입니다");
		///한문장

	}

}
