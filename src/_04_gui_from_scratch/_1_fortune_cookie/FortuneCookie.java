package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
	
		button.addActionListener((ActionListener) this);
		
	}
}
