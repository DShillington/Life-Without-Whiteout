package main;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import frames.TitleScreen;
import util.Reference;

public class Main {
	
	static Calendar cal = Calendar.getInstance();
	static SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
	
	public static String printoutformat = "[" + sdf.format(cal.getTime()) + "] " + Reference.CONSOLE_PRINTOUT;
	
	 
	public static void main(String[] args) {
        System.out.println(printoutformat + "Loading Game...");
        TitleScreen.createTitleScreen();
    }
    
}