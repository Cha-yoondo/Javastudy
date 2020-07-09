import sun.applet.Main;

/*
 * 클래스
 * =====
 * 1) 구성요소
 *    변수====> 기본형(String : 참조형)
 *    메소드====> 기능처리 (연산자,제어문)
 *    ==================================================
 *    생성자 =====> 선언한 변수에 대한 초기값=>존재하지 않을 수 있다
 *    =====
 *        =특징
 *        1.클래스명과 동일
 *        2.리턴형이없다
 *        3.생성자는 여러개 있을수 있다 -> 오버로딩
 *          ****오버로딩
 *          1) 같은 이름의 메소드
 *          2) 한개의 클래스 안에서 제작
 *          3) 매개변수의 갯수나 데이터형이 다르다
 *          4) 리턴형은 상관없다
 *        4. 생성자가 하는 역할
 *           1)클래스를 메모리에 저장할 경우에 반드시 호출되야 한다
 *           2)멤버변수의 초기값 담당
 *             = 윈도우, 네트워크, 쓰레드,데이터베이스 연결
 *          ***클래스영역
 *             public class MainClass 
 *             {
 *                    => 제어문,연산처리=> 기능을 수행 할 수 없다
 *                       =>{}안에서 작업이 가능
 *                    => 변수 선언만 가능
 *                       ======
 *                        1) 기본형
 *                        2) 클래스
 *                        3) 배열
 *             }
 *             
 *             ==> 구현 ==> 연산,제어문,라이브러리 ==> 메소드안에서만 사용이가능
 *                                              =====
 *                                              선언 => 지역변수
 *             ==> 선언 ==> 클래스 영역안에서는 선언만 가능 
 *                        int a=10;
 *                        String s="";
 *                 변수: 저장, 변경, 읽기
 *                 ===
 *                   1개,여러개 저장(배열,클래스) ==> 변수의 일종
 *                   
 *            =============================================================
 *            class 에 변수 선언
 *             1) 따로 저장해서 사용하는 변ㅅ ==> 멤버변수,인스턴스 변수
 *             2) 한개만 저장해서 => 공통사용 변수 ==> 정적변수, 클래스 변수, 공유변수
 *             ======================================
 *             static
 *             class 에서 만드는 메소드
 *             1) 따로 저장되는 메소드 ==> 인스턴스 메소드
 *             2) 공통으로사용된ㄴ 메소드===> 정적메소드
 *             3) 저장에 필요한 메소드 ==> 생성자메소드 ==> 생성자는 static 이 없다 
 *             class A
 *                => A()  => default 생성자
 *                => A (int a)
 *                => A (double a)
 *                => A (int a, int b)
 *                
 *              class A
 *              {
 *                  //생성자 없는 경우에 가상머신이 자동으로 Default생성자를 추가한다
 *              }
 *              
 *                 ===> A a=new A();
 *                
 *              class A
 *              { 
 *                 A()
 *                 {
 *                 }
 *              }
 *                 ===> A a=new A();
 *                 
 *              class A
 *              {
 *                    A(int a){
 *                    }
 *               }   
 *                ====> A a=n
 *                ew A(10);
  
 *                
 */
//초기값 설정
 /*
  * 
  *  
  */

public class MainClass {
	String book="Java의 정석";
	 String author="남궁성";
	 static String publisher="도우출판";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    MainClass m=new MainClass(); //book,author ==> .
	    System.out.println("책이름:"+m.book);
	    System.out.println("저자:"+m.author);
	    System.out.println("출판사:"+MainClass.publisher); //권장
	    System.out.println("출판사:"+publisher);
	    /*
	     *    static => 객체를 통해서 접근이 가능 m.publisher
	     *           => 클래스명ㅇㄹ 통해 접근이 가능 m.publisher
	     *           => 같은 클래스에 있는 경우에는 publisher
	     *           
	     *    class A
	     *    {
	     *       static int a;
	     *    }
	     *    
	     *    class B
	     *    {
	     *    
	     *       B()
	     *       {
	     *          system.out.println(a)   ==>B가 a를 가지고 있다 -> error
	     *          system.out.println(A.a)
	     *          다른 클래스 안에서는 클래스명.변수명
	     *        }
	     *     }
	     *     =====> 인스턴스 변수 VS 공유변수
	     *     ==> 공유변수 (static) => 자동으로 메모리에 저장
	     *     ==> 인스턴스 변수-> new를 이용해서 메모리공간을 만들고 저장
	     *         ==>반드시 new를 사용해야 저장이 가능
	     *    
	     *           
	     */
	    
	    

	}

}
