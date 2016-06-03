package frames;
import java.awt.*;  
import java.awt.event.ActionEvent;

import javax.swing.*;   

import main.Main;
import buttons.ActionActionListener;
import util.Reference;

public class TitleScreen {     
	
	Image img = Toolkit.getDefaultToolkit().createImage("background.jpg");
	
	static JFrame frame = new JFrame(Reference.GAME_MENU);
	
	static JPanel panel = new JPanel();
	
	static JButton start = new JButton();
	static JButton settings = new JButton();
	static JButton about = new JButton();
	static JButton exit = new JButton();
	
	public static void createTitleScreen() {        
		
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
		
		start.addActionListener( new ActionActionListener()
		
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	 Game.createWindow();
		    	 frame.setVisible(false);
		    	 System.out.println(Main.printoutformat + "Opening Game...");
		    }
		});
		
		settings.addActionListener( new ActionActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Settings.createWindow();
		    	 frame.setVisible(false);
		    	 System.out.println(Main.printoutformat + "Opening Settings...");
		    }
		});
		
		about.addActionListener( new ActionActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	 About.createWindow();
		    	 frame.setVisible(false);
		    	 System.out.println(Main.printoutformat + "Opening About...");
		    }
		});
		    
		exit.addActionListener( new ActionActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.setVisible(false);
				System.out.println(Main.printoutformat + "Closing Game...");
			}
		});
	}   
	
	public void paint(Graphics graphics)
    {
        // Draws the img to the BackgroundPanel.
        graphics.drawImage(img, 0, 0, null);
    }
}