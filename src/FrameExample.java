import java.awt.Point;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
public class FrameExample
{
		public static void main(String[] args)
		{
			JFrame myFrame = new JFrame("My First Frame");
			myFrame.setBounds(300, 200, 500, 250);
			myFrame.setLayout(null);
			
			JLabel lbl1 = new JLabel("Welcome to GUI!");
			lbl1.setBounds(35, 55, 200, 30);
			myFrame.add(lbl1);
			
			JButton button1 = new JButton("1st button");
			button1.setSize(new Dimension(100,30));
			button1.setLocation(new Point(180, 30));
			button1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							lbl1.setText("Not gonna lie Mr. Ellis, this is a little cool. Way cooler than BC Calc. Tell Mrs. Crabb");
							button1.setLocation((int) (Math.random()*500+100), (int)(Math.random()*200+100));
						}
					}
			);
			
			myFrame.add(button1);
			
			//lbl1.setFont()
			myFrame.setVisible(true);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
   