package menu;
import java.awt.*;  

import javax.swing.*;   

import util.Reference;

public class TitleScreen {     
	public static void createTitleScreen() {        
		
		//Frame        
		JFrame frame = new JFrame(Reference.GAME_MENU); 
		JPanel panel = new JPanel();
		//Buttons
		JButton start = new JButton();
		JButton settings = new JButton();
		JButton about = new JButton();
		JButton exit = new JButton();
		
		//Button Layout
		start.setLayout(null);
		settings.setLayout(null);
		about.setLayout(null);
		exit.setLayout(null);
		
		//Button Bounds
		start.setBounds(frame.getWidth() / 2 + 10, frame.getHeight() + 70, 50, 30);
		settings.setBounds(frame.getWidth() / 2 + 10, start.getHeight() + 100, 50, 30);
		about.setBounds(frame.getWidth() / 2 + 10, start.getHeight() + 160, 50, 30);
		exit.setBounds(frame.getWidth() / 2 + 10, start.getHeight() + 220, 50, 30);
		
		//Button Sizes   
		start.setSize(150,50);
		settings.setSize(150,50);
		about.setSize(150,50);
		exit.setSize(150,50);
		
		//Button Visibility
		start.setVisible(true);
		settings.setVisible(true);
		about.setVisible(true);
		start.setVisible(true);
		
		//Button Text
		start.setText(Reference.MENU_PLAY);
		settings.setText(Reference.MENU_SETTINGS);
		about.setText(Reference.MENU_ABOUT);
		exit.setText(Reference.MENU_EXIT);
		
		//Adding the buttons
		frame.add(start);
		frame.add(settings);
		frame.add(about);
		frame.add(exit);
		
		JLabel title = new JLabel();
		title.setLayout(null);
		title.setBounds(frame.getWidth() / 2 + 10, frame.getHeight() + 20, 350, 30);
		title.setVisible(true);
		title.setText(Reference.GAME_NAME);
		title.setForeground(Color.white);
		title.setFont(new Font("Serif", Font.PLAIN, 34));
		frame.add(title);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().add("Center", panel);
		panel.setBackground(new Color(0,0,0));
		frame.setSize(600, 350);
		frame.setVisible(true);   
		}    
	

}