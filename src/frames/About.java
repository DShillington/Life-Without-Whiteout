package frames;
import java.awt.*;  

import javax.swing.*;   
// Create a simple GUI window 

import util.Reference;

public class About {     
	public static void createWindow() { 
		
		//Create and set up the window.        
		JFrame frame = new JFrame(Reference.GAME_ABOUT); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
		JLabel textLabel = new JLabel("Life Without Whiteout is made by papertazer. I may write more later. Idunno.",SwingConstants.CENTER);        
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