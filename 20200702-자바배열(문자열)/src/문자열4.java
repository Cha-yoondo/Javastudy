/*
 *  split() : =>String[]
 *  ���ڸ� �����ؼ� �ڸ��� ����
 *  �ع���,���ι���,��/��,�,����Ʈ,��/����,��/��/��,ǻ��,��ġ/����,���,���/�ҽ�/��,���,������,����,��,����,��/����/��,��Ÿ
 */
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="�ع���,���ι���,��/��,�,����Ʈ,��/����,��/��/��,ǻ��,��ġ/����,���,���/�ҽ�/��,���,������,����,��,����,��/����/��,��Ÿ";
		
		String[] arr=msg.split("\\?"); //�Ϲݹ��ڿ�=>�迭�� ����
		//�����϶��� ����� ����
		//msg.sp =>regex
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}
