/*
 *  문자열=> 저장하는 공간 (String)
 *  기본형=> 정수,실수,논리,문자
 *  =======================================
 *  참조형=> 실제저장장소 다른곳에 있고=>저장은주소
 *  ====
 *   =배열, 클래스, 사용자 정의 클래스
 *      =>웨, 모바일 => 문자열
 *   1) 저장 방법
 *     String s="문자저장"; ==> 많이 사용된다
 *     String s=new String("")
 *   2) 주요 기능
 *     문자를 제어할수 있는 기능(메소드) => 라이브러리 핵심(메소드)
 *     ***** 주의점
 *     원본 변경되지 않는다
 *     => length() : 문자갯수
 *     => substring() : 문자를 자를때
 *        substring(int start)
 *        substring(int start, int end) => end는 제외
 *                      start ~~ end-1
 *     예)
 *         Stirng s="Hello Java!!";
 *         s.substring(0,5) ==> Hello    s="Hello Java!!"
 *         
 *        => s= s.substring(0,5)         s="Hello"
 *        
 *        int a=10;
 *        int b=20;
 *        
 *        a+10=>20 // a값 변경x
 *        a=a+10   // a값 변경o
 *     => contains() => 문자열중에 포함된 단어가 있는 지 확인
 *        =>단어를 찾는 경우 => 오라클 (LIKE)
 *        
 *     => startsWith,endsWith : 서제스트 (자동완성기) :검색기
 *        ====================
 *          포털: 검색한 유저의 데이터를 모아서 처리
 *          쿠키, 세션
 *        =============
 *        
 *     => trim() => 좌우의 공백 제거
 *        String s="Hello Java ";
 *        s.trim=() ==> "Hello Java" =>s.replace(" ","")
 *        => 사용자 입력창(로그인=>ID,PWD,회원가입)
 *           "admin" "admin" "admin"
 *           
 *     => equals() => 문자열 비교할때 사용 : 단점 (대소문구분)      
 *     
 *     => split() => 문자를 구분해서 배열로 만들어준다.
 *             ===  구분문자를 포함한다
 *     => replace, raplaceAll ==> 문자를 변경할경우
 *        ======   =========
 *          일반            페탄 
 *          
 *     => valueOf() : 모든 데이터형을 문자열로 변경
 *     
 *     => toLowerCase() :  소문자 변환
 *     => toUpperCase() : 대문자 변환     
 *        
 *        
 *    
 *   
 *   
 */
import javax.swing.*;
import java.awt.event.*;
public class 문자열 extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public 문자열()
	{
		add("North",tf);
		add("South",tf1);
		//tf.setText(String.valueOf(20));
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this);//tf에서 엔터=> actionPerformed 호출
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)
		{
			
			tf1.setText(tf.getText().toLowerCase());
			//tf1.setText(tf.getText().toUpperCase());
		}
		
	}

}
