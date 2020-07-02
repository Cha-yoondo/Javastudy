import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
	
	Image back,air;
	int x=15,y=15;
	public GameView()
	{
		//이미지를 가지고온다
		back=Toolkit.
				getDefaultToolkit().
				getImage("C:\\JavaDev\\back.jpg");
		air=Toolkit.getDefaultToolkit().
				getImage("C:\\JavaDev\\air.jpg");
	}
public void paint(Graphics g)

{
	g.drawImage(back, 0,0,getWidth(),getHeight(),this);
	g.drawImage(air, x,y,80,50,this);
	
	}

}
