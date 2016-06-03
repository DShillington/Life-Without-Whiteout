package frames;
import java.awt.*;  
import java.awt.event.ActionEvent;

import javax.swing.*;   

import main.Main;
import buttons.ActionActionListener;
import util.Reference;

public class About {  
	static JFrame frame = new JFrame(Reference.GAME_ABOUT);
	static JPanel panel = new JPanel();
	static JButton back = new JButton();
	static JButton exit = new JButton();
	
	public static void createWindow() { 
		
		back.setLayout(null);
		exit.setLayout(null);
		
		back.setBackground(new Color(0, 205, 255));
		exit.setBackground(new Color(0, 205, 255));
		
		back.setToolTipText("Back to the menu.");
		exit.setToolTipText("Close the game :(");
		
		back.setBounds(frame.getWidth() / 2 + 20, frame.getHeight() + 140, 50, 30);
		exit.setBounds(frame.getWidth() / 2 + 20, back.getHeight() + 170, 50, 30);
		
		back.setSize(140,50);
		exit.setSize(140,50);
		
		back.setVisible(true);
		exit.setVisible(true);
		
		back.setText("Back");
		exit.setText("exit");
		
		frame.add(back);
		frame.add(exit);
		
		//Game Title
		JLabel sorry = new JLabel();
		sorry.setLayout(null);
		sorry.setBounds(frame.getWidth() / 2 + 50, frame.getHeight() / 2 + 100, 350, 30);
		sorry.setVisible(true);
		sorry.setText("This game was made by papertazer. I may write more here later, idunno.");
		sorry.setForeground(Color.white);
		sorry.setFont(new Font("Serif", Font.PLAIN, 18)); 
		frame.add(sorry);

		//Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().add("Center", panel);
		panel.setBackground(new Color(0,0,0));
		frame.setSize(600, 320);
		frame.setUndecorated(true);
		frame.setVisible(true);   
				
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

	back.addActionListener( new ActionActionListener()
	{
	    public void actionPerformed(ActionEvent e)
	    {
	    	 TitleScreen.frame.setVisible(true);
	    	 frame.dispose();
	    	 System.out.println(Main.printoutformat + "Opening Main menu...");
	    	 
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