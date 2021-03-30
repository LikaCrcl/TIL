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
	
	int i = 0;
	
	public void ConfirmLabelSet(ArrayList<JLabel> a, JLabel b) {
		a.get(i).setText(b.getText());
		i++;
	}
	
	public void ConfirmLabelClear() {
		i = 0;
	}
	
	public void Clear(ArrayList<JLabel> a, JLabel b, ArrayList<JLabel> c) {
		for (int i = 0; i < a.size(); i++) {
			a.get(i).setText("");
		}
		ConfirmLabelClear();
		b.setText("");
		for (int i = 0; i < c.size(); i++) {
			c.get(i).setText("");
		}
	}
	
	public void FinishClear(ArrayList<JLabel> a, JLabel b, ArrayList<JLabel> c, JLabel d) {
		for (int i = 0; i < a.size(); i++) {
			a.get(i).setText("");
		}
		ConfirmLabelClear();
		b.setText("");
		for (int i = 0; i < c.size(); i++) {
			c.get(i).setText("");
		}
		d.setText("0");
	}
	
}

