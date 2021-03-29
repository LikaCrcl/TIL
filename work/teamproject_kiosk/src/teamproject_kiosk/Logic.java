package teamproject_kiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logic {
	
	public void LabelSetText(int i, ArrayList<JButton> a, JPanel b, JPanel c, JLabel d, JLabel f) {
		a.get(i).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setVisible(false);
				c.setVisible(true);
				d.setText(a.get(i).getText());
				f.setText(a.get(i).getText());
			}
		});
	}
}

