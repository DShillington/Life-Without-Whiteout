package frames;
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;   

import main.Main;
import buttons.ActionActionListener;
import util.Reference;

public class TitleScreen {     

	static JFrame frame = new JFrame(Reference.GAME_MENU);
	static JPanel panel = new JPanel();
	static JButton start = new JButton();
	static JButton settings = new JButton();
	static JButton about = new JButton();
	static JButton exit = new JButton();
	
	public static void createWindow() {        
		try {
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("resources/menu/Background.png")))));
			} catch (IOException e) {
	    		e.printStackTrace();
	    	}
		
		//Button Layout
		start.setLayout(null);
		settings.setLayout(null);
		about.setLayout(null);
		exit.setLayout(null);
		
		//Button Background
		start.setBackground(new Color(0, 205, 255));
		settings.setBackground(new Color(0, 205, 255));
		about.setBackground(new Color(0, 205, 255));
		exit.setBackground(new Color(0, 205, 255));
		
		//Button ToolTip
		start.setToolTipText("Play!!!");
		settings.setToolTipText("Change your settings");
		about.setToolTipText("Read about this game and stuff");
		exit.setToolTipText("Close the game :(");
		
		//start.setIcon(new ImageIcon("resources/menu/Button.png"));
		
		//Button Bounds
		start.setBounds(frame.getWidth() / 2 + 20, frame.getHeight() + 70, 50, 30);
		settings.setBounds(frame.getWidth() / 2 + 20, start.getHeight() + 100, 50, 30);
		about.setBounds(frame.getWidth() / 2 + 20, start.getHeight() + 160, 50, 30);
		exit.setBounds(frame.getWidth() / 2 + 20, start.getHeight() + 220, 50, 30);
		
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
		
		//Game Title
		JLabel title = new JLabel();
		title.setLayout(null);
		title.setBounds(frame.getWidth() / 2 + 20, frame.getHeight() + 20, 350, 30);
		title.setVisible(true);
		title.setText(Reference.GAME_NAME);
		title.setForeground(Color.white);
		title.setFont(new Font("Serif", Font.PLAIN, 34));
		title.setToolTipText("Papertazers first java game.");
		frame.add(title);
		
		//Game Version
		JLabel version = new JLabel();
		version.setLayout(null);
		version.setBounds(frame.getWidth() / 2 + 440, frame.getHeight() + 280, 350, 30);
		version.setVisible(true);
		version.setText(Reference.GAME_VERSION);
		version.setForeground(Color.RED);
		version.setFont(new Font("Serif", Font.PLAIN, 20));
		frame.add(version);
		
		//Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().add("Center", panel);
		panel.setBackground(new Color(0,0,0));
		frame.setSize(600, 320);
		frame.setUndecorated(true);
		frame.setVisible(true);   
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		//Buttons
		start.addActionListener( new ActionActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	 Game.createWindow();
		    	 frame.setVisible(false);
		    	 System.out.println(Main.printoutformat + "Loading Game...");
		    }});
		
		settings.addActionListener( new ActionActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Settings.createWindow();
		    	frame.dispose();
		    	System.out.println(Main.printoutformat + "Opening Settings...");
		    }});
		
		about.addActionListener( new ActionActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	 About.createWindow();
		    	 frame.setVisible(false);
		    	 System.out.println(Main.printoutformat + "Opening About...");
		    }});
		    
		exit.addActionListener( new ActionActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.setVisible(false);
				System.out.println(Main.printoutformat + "Closing Game...");
			}});
	}   
	
	
}