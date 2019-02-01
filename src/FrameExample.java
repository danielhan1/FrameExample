import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameExample
{
		public static void main(String[] args)
		{
			JFrame myFrame = new JFrame();
			myFrame.setBounds(300, 200, 500, 250);
			myFrame.setLayout(null);
			JLabel lbl1 = new JLabel("Welcome to GUI!");
			lbl1.setBounds(35, 55, 200, 30);
			myFrame.add(lbl1);
			lbl1.setFont()
			myFrame.setVisible(true);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
