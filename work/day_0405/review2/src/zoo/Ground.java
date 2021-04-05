package zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ground {
	public static void main(String[] args) {
//		Animal dog = new Animal();
//		dog.sleep();
		Animal dog = new Dog();
		
		Animal cat = new Animal() {
			
			@Override
			void makeSomeNoise() {
				System.out.println("�Ŀ�");
			}
			
			@Override
			void sleep() {
				System.out.println("�׸��� �׸���");
			}
			
		};
		
		cat.sleep();
		
		//Animal bird = new Bird();
		Animal bird = new Animal() {
			int leg = 2;
			
			@Override
			void sleep() {
				System.out.println("�k�l");
			}
			
			@Override
			void makeSomeNoise() {
				System.out.println("±±");
			}
		};
		
		bird.sleep();
		System.out.println(bird);
		
		new JButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}






