/*
 *  ���ڿ�=> �����ϴ� ���� (String)
 *  �⺻��=> ����,�Ǽ�,��,����
 *  =======================================
 *  ������=> ����������� �ٸ����� �ְ�=>�������ּ�
 *  ====
 *   =�迭, Ŭ����, ����� ���� Ŭ����
 *      =>��, ����� => ���ڿ�
 *   1) ���� ���
 *     String s="��������"; ==> ���� ���ȴ�
 *     String s=new String("")
 *   2) �ֿ� ���
 *     ���ڸ� �����Ҽ� �ִ� ���(�޼ҵ�) => ���̺귯�� �ٽ�(�޼ҵ�)
 *     ***** ������
 *     ���� ������� �ʴ´�
 *     => length() : ���ڰ���
 *     => substring() : ���ڸ� �ڸ���
 *        substring(int start)
 *        substring(int start, int end) => end�� ����
 *                      start ~~ end-1
 *     ��)
 *         Stirng s="Hello Java!!";
 *         s.substring(0,5) ==> Hello    s="Hello Java!!"
 *         
 *        => s= s.substring(0,5)         s="Hello"
 *        
 *        int a=10;
 *        int b=20;
 *        
 *        a+10=>20 // a�� ����x
 *        a=a+10   // a�� ����o
 *     => contains() => ���ڿ��߿� ���Ե� �ܾ �ִ� �� Ȯ��
 *        =>�ܾ ã�� ��� => ����Ŭ (LIKE)
 *        
 *     => startsWith,endsWith : ������Ʈ (�ڵ��ϼ���) :�˻���
 *        ====================
 *          ����: �˻��� ������ �����͸� ��Ƽ� ó��
 *          ��Ű, ����
 *        =============
 *        
 *     => trim() => �¿��� ���� ����
 *        String s="Hello Java ";
 *        s.trim=() ==> "Hello Java" =>s.replace(" ","")
 *        => ����� �Է�â(�α���=>ID,PWD,ȸ������)
 *           "admin" "admin" "admin"
 *           
 *     => equals() => ���ڿ� ���Ҷ� ��� : ���� (��ҹ�����)      
 *     
 *     => split() => ���ڸ� �����ؼ� �迭�� ������ش�.
 *             ===  ���й��ڸ� �����Ѵ�
 *     => replace, raplaceAll ==> ���ڸ� �����Ұ��
 *        ======   =========
 *          �Ϲ�            ��ź 
 *          
 *     => valueOf() : ��� ���������� ���ڿ��� ����
 *     
 *     => toLowerCase() :  �ҹ��� ��ȯ
 *     => toUpperCase() : �빮�� ��ȯ     
 *        
 *        
 *    
 *   
 *   
 */
import javax.swing.*;
import java.awt.event.*;
public class ���ڿ� extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public ���ڿ�()
	{
		add("North",tf);
		add("South",tf1);
		//tf.setText(String.valueOf(20));
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this);//tf���� ����=> actionPerformed ȣ��
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ���ڿ�();

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
