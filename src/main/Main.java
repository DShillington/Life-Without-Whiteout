package main;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import menu.TitleScreen;
import util.Reference;


public class Main {

    public static void main(String[] args) {
    	Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        String printoutformat = "[" + sdf.format(cal.getTime()) + "] " + Reference.CONSOLE_PRINTOUT;
        
        
        System.out.println(printoutformat + "Loading Game...");
        TitleScreen.createTitleScreen();
    }
    
}