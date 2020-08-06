package com.sist.client;
//������ =>JFrame
//������� ���õ� Ŭ������ �о�´�
import javax.swing.*;

import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import com.sist.common.Function;


/*
 * 1.����ڰ� ������ ��û
 * 2.�������� ������ ������ �޾Ƽ� ��� (������)=> �ڵ�ȭ 
 */
import java.awt.color.*;

import java.awt.*; // color,Layout
import java.awt.event.*; //interface
/*
 *   ����
 *    = ��� : ������ Ŭ������ �����ؼ� ���
 *    public class ClientMainFrame extends JFrame
 *                 ===============
 *                 JFrame �� ����� ��ü �����힪��
 *    = ���� : ������ Ŭ������ ������� ���
 *    
 */
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable{
	//������ ũ�� ���� => �����ڿ��� ���
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	BugsDetailForm dbf=new BugsDetailForm();
	BugsListForm blf=new BugsListForm();
	ListForm lf=new ListForm();
	Login login=new Login();
	ControllPanel cp;
	
	int curpage=1;
	int totalpage=16;
	//��Ʈ��ũ ���� ���α׷�
	Socket s; //���� ���
	OutputStream out; //������ ��û�� ����
	BufferedReader in; // �����κ��� ���� �޾ƿ��� Ŭ���� 
	private int color;
	public ClientMainFrame() {
		
		cp=new ControllPanel(this);
		/*
		 * Ŭ�������� ������ ��� => ������ �ƴ϶� �����Ҷ�
		 * ��) 
		 *     �����͹�Ƽ�: ����Ŭ ����
		 *     ��Ʈ��ũ: ���� => IP,PORT => �ڵ��� (����)
		 
		 */
		title.setFont(new Font("����ü",Font.BOLD,55));
		title.setOpaque(true);
		//title.setBackground(Color.gray);
		setLayout(null);
		title.setBounds(10, 15, 1570, 70);
		//�߰� ==>add
		add(title);
		//�޴� ��ġ
		mf.setBounds(10, 120, 100, 400);
		add(mf);
		//ä����
		cf.setBounds(115, 760, 1465,200);
		add(cf);
		//���ȭ��
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		setSize(1600,1000);
		//setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //x��ư Ŭ���� ����
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b5.addActionListener(this);
		
		cp.ff.b1.addActionListener(this); //����
		cp.ff.b2.addActionListener(this); //����
		cp.df.b2.addActionListener(this); //���
		
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		cp.blf.b1.addActionListener(this);
		cp.blf.b2.addActionListener(this);
		cp.blf.b3.addActionListener(this);
		cp.blf.b4.addActionListener(this);
		cp.blf.tf.addActionListener(this);
		
		
		
		//�α��� ó��
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		//����
		mf.b7.addActionListener(this);
		
		//ä��
		cf.tf.addActionListener(this);
		
		/*for(int i=0;i<10;i++)
		{
			cp.ff.mc[i].addMouseListener(this);
		}
		*/
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�����ڴ� ȣ��ÿ� �ݵ�� => new ������ ()
		UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
		new ClientMainFrame();
	}
		public static Image getImage(ImageIcon ii,int w,int h)
	    {
	    	Image dimg = ii.getImage().getScaledInstance(w, h,
	    	        Image.SCALE_SMOOTH);
	    	return dimg;

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==cp.df.b2)
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b3)
		{
			cp.card.show(cp, "BLF");
		}
		else if(e.getSource()==cp.ff.b1) //������ư
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll();// JPanel ��� ����� ����
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate(); //JPanel �� ���� ����� ���ġ 
			}
		}
		else if(e.getSource()==cp.ff.b2) //������ư 
		{
			if(curpage<totalpage)
			{
				curpage++;
			
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
			
			
		}
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==mf.b3)
		{
			cp.blf.BugsAllData(1);
		}
		else if(e.getSource()==cp.blf.b1)
		{
			cp.blf.BugsAllData(1);
		}
		else if(e.getSource()==cp.blf.b2)
		{
			cp.blf.BugsAllData(2);
		}
		else if(e.getSource()==cp.blf.b3)
		{
			cp.blf.BugsAllData(3);
		}
		else if(e.getSource()==mf.b3)
		{
			cp.blf.BugsAllData(1);
		}
		
		else if(e.getSource()==mf.b5)
		{
			cp.card.show(cp, "NF");
		}
		
		
		
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.movieAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.movieAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			String ss=cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "�˻�� �Է��ϼ���");
				cp.lf.tf.requestFocus();
				return; // �޼ҵ� ����
				
			}
			cp.lf.movieFindData(ss);
		}
		
		else if(e.getSource()==cp.blf.b4 || e.getSource()==cp.blf.tf)
		{
			String ss=cp.blf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "�˻�� �Է��ϼ���");
				cp.blf.tf.requestFocus();
				return; // �޼ҵ� ����
				
			}
			cp.blf.BugsFindData(ss);
		}
		
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1) //ID�� �Է����� ���� ���
			{
				JOptionPane.showMessageDialog(this, "ID�� �Է��ϼ���");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "��ȭ���� �Է��ϼ���");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="����";
			else
				sex="����";
			
			//������ �Է¹��� ������ ����
			try
			{
				//����
				s=new Socket("localhost",6543);
				//�ۼ��� ��ġ Ȯ��
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				//�α��� ��û
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
				
			}catch(Exception ex) {}
			
			//�������� �����ϴ� �����͸� �о ���
			new Thread(this).start();
			// run()�� ��ġ Ȯ�� ==> �ڽ��� Ŭ�����ȿ� ���� => (this)
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)//ä��
		{
			String color=cf.box.getSelectedItem().toString();
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			//�����͸� ������ ����
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
				
			}catch(Exception ex){}
			
			    cf.tf.setText("");
		}
		else if(e.getSource()==mf.b7)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				if(e.getClickCount()==2)
				{
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF");
					
					break;
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//�������� ������ �����͸� �޾Ƽ� ó��
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=
						new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				case Function.MYLOG:
				{
					setTitle(st.nextToken());
					login.setVisible(false); //�α���â 
					setVisible(true); //��ȭâ (Main)
					
				}break;
				case Function.LOGIN:
				{
					//���̺� ���
					String[] data= {
							st.nextToken(), //id
							st.nextToken(), //name
							st.nextToken() //sex
					};
					
					cf.model.addRow(data);
					
				}break;
				case Function.CHAT:
				{
					 initStyle();
					 append(st.nextToken(),st.nextToken());
				}
				break;
				case Function.EXIT:
				{
					String id=st.nextToken();
					for(int i=0;i<cf.model.getRowCount();i++)
					{
						String mid=cf.model.getValueAt(i, 0).toString();
						if(id.equals(mid))
						{
							cf.model.removeRow(i);
							break;
						}
					}
				}
				break;
				case Function.MYEXIT:
				{
					dispose(); //������ ���α׷� ����
					System.exit(0); // ���α׷� ����
				}
				break;
				}
			}
				
		}catch(Exception ex) {}
	}
		 public void initStyle()
		    {
		    	Style def=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
		    	Style red=cf.ta.addStyle("red", def);
		    	StyleConstants.setForeground(red, Color.red);
		    	
		    	Style blue=cf.ta.addStyle("blue", def);
		    	StyleConstants.setForeground(blue, Color.blue);
		    	
		    	Style green=cf.ta.addStyle("green", def);
		    	StyleConstants.setForeground(green, Color.green);
		    	
		    	Style yellow=cf.ta.addStyle("yellow", def);
		    	StyleConstants.setForeground(yellow, Color.yellow);
		    	
		    	Style gray=cf.ta.addStyle("gray", def);
		    	StyleConstants.setForeground(gray, Color.gray);
		    	
		    	Style cyan=cf.ta.addStyle("cyan", def);
		    	StyleConstants.setForeground(cyan, Color.cyan);
		    }
		    public void append(String msg,String color)
		    {
		    	try
		    	{
		    		Document doc=cf.ta.getDocument();
		    		doc.insertString(doc.getLength(), msg+"\n", cf.ta.getStyle(color));
		    	}catch(Exception ex) {}
	
	}

}
