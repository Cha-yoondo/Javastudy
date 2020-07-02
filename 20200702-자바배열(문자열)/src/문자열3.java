
/*
 *  indexOf, lastIndexOf => 문자의 위치찾기 => 정수
 *  // 문자 자르기 =>  substringp()
 *  
 */
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="rava.sss.asss.java";
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("확장자:"+msg.substring(msg.lastIndexOf(".")+1));
	}

}
