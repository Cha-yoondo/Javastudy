/*
 * 문자열을 저장할수 있는 공간 : String
 * String : 일반변수의 역할
 *          클래스의 역할 -> 기능(메소드)
 *          
 *          
 *          주요기능
 *          =문자열 비교 : equals()
 *          =포함 문자: contains()
 *          =문자열중에 한개문자: charAt()
 *          =저장된 문자의 갯수:length()
 *          =문자자르기:substring()
 *          =찾는 문자의 위치:indexOf(),lastIndex()
 *          =모든데이터형을문자열로변환=>valueOf()
 *          =공백문자제거:trin() =>좌우만제거
 *          " Hello Java " =>"Hello Java"
 *          =문자열=>char[]=>toCharArray()
 *          =startsWith,endswith=>검색기
 *          
 *         
 */
//substring:필요한 문자만 추출=> 형태소 분석 (명사,부사,활용사)
/*
 *     "Hello Java" ==> String => char[]
 *     
 *     
 *     substring(int start)
 *     substring(int start, ine end
 */
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="100-010";
		System.out.println(msg.substring(0,3));
		System.out.println(msg.substring(4,7));


	}

}
