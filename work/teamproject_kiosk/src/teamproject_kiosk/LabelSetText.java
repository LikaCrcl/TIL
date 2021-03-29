package teamproject_kiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelSetText extends Kiosk { {
	
	for (int i = 0; i < menu_list.size(); i++) {
		menu_list.get(i).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					panelMenuDummy.setVisible(false);
					panelSelectMenu.setVisible(true);
					lblMenuNameMsg.setText(menu_list.get(i).getText());
			}
		});
	}

}
}
