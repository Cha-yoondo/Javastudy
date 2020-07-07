/*
 * 메소드: 한가지 기능만 수행=> 다음에 다시 사용할수 있게 만든다
 *       목적
 *        => 재사용
 *        => 반복 제거
 * 형식) 
 *       반환형이 없는경우 : void
 *       매개변수가 없는경우 (매개변수=> 주로 사용자가 요청한값)
 *       반환형이 존재 -> 사용자가 요청한 내용의 결과값=> 반드시 한개만 존재
 *                    여러개일경우: 배열,클래스
 *       매개변수가 존재-> 아이디 중복채크(=>id), 우편번호검색(동,길)
 *                     로그인(id,password)
 *       반환형(리턴형) 메소드명(매개변수,매개변수...)
 *       {
 *       
 *       }
 *       void process()
 *       {
 *          if(key==ENTER)
 *          {
 *              return; //강제로종료
 *              System.out.println(); ==>오류
 *          }
 *          
 *            동작
 *            return; =>return 문장 밑에는 소스코딩을 할수없다
 *            제어 
 *            break
 *            continue
 *            return
 *        }    
 * 
 */
import java.util.*; //Scanner
public class 자바메소드 {
	//사용자입력 => 년도
	static int userInput()
	{
		 int year=0;
		 Scanner scan=new Scanner(System.in);
	     System.out.print("년도를 입력:");
		 year=scan.nextInt();
		 return year;
		 
	}
	// 윤년여부를 확인하는 기능==> 재사용
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			bCheck=true;
			
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("년도를 입력:");
		int year=scan.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println(year+"년도는 윤년입니다");
		}
		else
		{
			System.out.println(year+"년도는 윤년이 아닙니다");
		}
		*/
		
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이아닙니다");
		
		
	}

}
