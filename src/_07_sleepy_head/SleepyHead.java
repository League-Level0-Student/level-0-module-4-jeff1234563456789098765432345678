package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        
        
          //Ask the user for these values using a confirm dialog like the one below
         int r=JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
          System.out.println(r);
          


    
         // Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         if (r == 0){
        	  
        	 isWeekday=true;
          
          }
         else { 
        	 isWeekday=false;
         }
         int a=JOptionPane.showConfirmDialog(null, "Is it a vacation?","Sleepy Head", JOptionPane.YES_NO_OPTION);
         System.out.println(a);
         //print “get up lazybones!�? If it is a weekday, and we are on vacation,
         if (a == 0){
       	  
        	 System.out.println("sleep in�?"); 
        	 
          }
         
         
         // print “sleep in�?.
         else { isVacation=false;
   
         
    } if (a == 1) {
    	
    	System.out.println("Wake up you sleepy head");
    }
    }

}
    
