package teamproject_kiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logic {
	
	int sum = 0;
	int count2 = 1;
	
	int[] price =	{2500,3000,3500,4000,4500,4000,3500,3000,2500,3500,4800,4200,4000,3800,3500,4800,4200,4000,3800,4500,5000,2500,
					3000,3500,4000,4500,4000,3500,3000,2500,3500,4800,4200,4000,3800,3500,4800,4200,4000,3800,4500,5000,4800,5400,5500};
	
	public void LabelSetText(int i, ArrayList<JButton> a, JPanel b, JPanel c, JLabel d) {
				b.setVisible(false);
				c.setVisible(true);
				d.setText(a.get(i).getText());
	}
	
	int i = 0;
	int c = 0;
	int d = 0;
	
	public void ConfirmLabelSet(ArrayList<JLabel> a, JLabel b) {
		a.get(i).setText(b.getText());
		i++;
	}
	
	
	public void ConfirmLabelSet2(ArrayList<JLabel> a, JLabel b) {
		a.get(c).setText(b.getText());
		c++;
	}
	
	public void ConfirmLabelSet3(ArrayList<JLabel> a, JLabel b) {
		a.get(d).setText(b.getText());
		d++;
	}
	
	public void ConfirmLabelClear() {
		i = 0;
	}
	
	public void ConfirmLabelClear2() {
		c = 0;
	}
	
	public void ConfirmLabelClear3() {
		d = 0;
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
	
	public void ClickMenu(int i, JLabel a, JLabel b) {
		sum += price[i];
		a.setText(sum+"¿ø");
		b.setText(count2+"");
		count2++;
	}
	
	public void MenuClear() {
		sum = 0;
		count2 = 1;
	}
	
	public void Sum(JLabel a) {
		a.setText(sum+"¿ø");
	}
	
	public void SelectMenuPriceSet(int i, JLabel a) {
		a.setText(price[i]+"");
	}
	
	public void ListSizeSet(ArrayList<String> a) {
		for (int i = 0; i < 14; i++) {
			a.add("");
		}
		
	}
	
}

