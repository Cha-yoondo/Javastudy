
/*
 *  indexOf, lastIndexOf => ������ ��ġã�� => ����
 *  // ���� �ڸ��� =>  substringp()
 *  
 */
public class ���ڿ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="rava.sss.asss.java";
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("Ȯ����:"+msg.substring(msg.lastIndexOf(".")+1));
	}

}
