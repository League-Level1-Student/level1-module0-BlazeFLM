package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("button pressed");
		JOptionPane.showMessageDialog(null, "Woohoo");
		int ran = new Random().nextInt(5);
		if(ran == 0) {
			JOptionPane.showMessageDialog(null, "The fortune you seek is in another cookie.");
		} else if (ran == 1) {
			JOptionPane.showMessageDialog(null, "A foolish man listens to his heart. A wise man listens to cookies.");
		} else if (ran == 2) {
			JOptionPane.showMessageDialog(null, "If you look back, you’ll soon be going that way.");
		} else if (ran == 3) {
			JOptionPane.showMessageDialog(null, "You will be hungry again in one hour.");
		} else {
			JOptionPane.showMessageDialog(null, "You can always find happiness at work on Friday.");
		}
	}
}
