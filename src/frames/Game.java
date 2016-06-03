package frames;
import java.awt.*;  

import javax.swing.*;   

import util.Reference;

public class Game {     
	public static void createWindow() { 
		
		//Create and set up the window.        
		JFrame frame = new JFrame(Reference.GAME_NAME); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
		JLabel textLabel = new JLabel("Game Shit Goes Here",SwingConstants.CENTER);        
		textLabel.setPreferredSize(new Dimension(1000, 600));        
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);         
		//Display the window.        
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2 - 500);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2 - 350);
		frame.getMenuBar();
		frame.setLocation(x, y);
		frame.pack();       
		frame.setVisible(true);   
		
		}     

}