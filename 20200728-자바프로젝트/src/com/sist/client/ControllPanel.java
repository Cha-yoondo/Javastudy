package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControllPanel extends JPanel{
	CardLayout card=new CardLayout();
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();
	MovieForm ff;
	ClientMainFrame c;
	NewsForm nf=new NewsForm();
	BugsDetailForm bdf=new BugsDetailForm();
	BugsListForm blf=new BugsListForm();
	
	public ControllPanel(ClientMainFrame c)
	{
		this.c=c;
		ff=new MovieForm(c);
		setLayout(card);
		add("FF",ff);
		//add("DF",df);
		
		add("NF",nf);
		add("LF",lf);
		add("BLF",blf);
		
	
		
	}

}
