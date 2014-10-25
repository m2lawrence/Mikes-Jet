import java.util.Scanner;
import java.util.Date;
import java.util.Random;
public class CCNJetfinalcopy
{   public static void mainMenu()//Main Menu code
    {
        System.out.println ("   ****Welcome to the CCNJet automated seat reservation system.****");
        System.out.println ();    
        System.out.println ("            MAIN MENU               "           );
        System.out.println ();
        System.out.println ();
        System.out.println ("Please choose from the following options.... ");
        System.out.println ();
        System.out.println ("   1.  Reservations");
        System.out.println ();
        System.out.println ("   2.  Availability");
        System.out.println (" ");
        System.out.println ("   3.  Amend a Booking ");
        System.out.println ();
        System.out.println ("   4.  Exit ");
        System.out.println ();
        System.out.println ();
        System.out.print ("   Please enter your choice: ");
    }
        
    public static void reservMenu()//Reservations Menu code
    {
        System.out.println ();
        System.out.println ("             RESERVATIONS");
        System.out.println ();
        System.out.println (" Please choose from the following options.... ");
        System.out.println ();
        System.out.println ("   1.  Executive ");
        System.out.println ();
        System.out.println ("   2.  Luxury ");
        System.out.println ();
        System.out.println ("   3.  Return to Main Menu ");
        System.out.println ();
        System.out.print ("   Please enter your choice: ");
    }
        
        
    public static void amendMenu()//Availability Menu code
    {
        System.out.println ();
        System.out.println ("            AMEND A BOOKING");
        System.out.println ();
        System.out.println (" Please choose from the following options.... ");
        System.out.println ();
        System.out.println ("   1.  Amend an Executive Seat ");
        System.out.println ();
        System.out.println ("   2.  Amend a Luxury Seat ");
        System.out.println ();
        System.out.println ("   3.  Return to Main Menu ");
        System.out.println ();
        System.out.print ("   Please enter your choice: ");
    }
        
        
        
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        String[] luxSeat = new String [4];
        String[] execSeat = new String [6];
        String menuChoice;
        String submenuChoice;
        String newName;
        String answer;
        String menuChoose;
        String exit;
        int execNo = 0;
        int luxNo = 0;
        int count = 0;
        int seatAmend = 0;
        int tempLux = 0;
        int tempExec = 0;
        int n = 99999999;
        int clear;
        Random r = new Random();
        Date d = new Date();
        
//------------------------------------------------------------------------------------------------------------------------------------        
    do
    { 
        for (clear = 0; clear <=30; clear++) {System.out.println (" ");}
        mainMenu();//bring up Main Menu
        menuChoice = input.next();
        
        if (menuChoice.equals ("1"))//Reservations
        {
            luxNo = tempLux;
            execNo = tempExec;
            for (clear = 0; clear <=30; clear++) {System.out.println (" ");}
            reservMenu();//bring up Reservations Menu
            submenuChoice = input.next();
            //--------------------------------------------------
            if (submenuChoice.equals ("1"))// Executive
            {
                for (clear = 0; clear <=30; clear++) {System.out.println (" ");}
                System.out.print("Would you like to book a seat?   Y? or N?     ");
                menuChoose = input.next();
            
                while (menuChoose.equalsIgnoreCase ("y") && execNo < 6)
                {  
                    System.out.print("Please enter your name: ");
                    execSeat[execNo] = input.nextLine();
                    execSeat[execNo] = input.nextLine();//duplicate line to stop reading in next line                               
                    
                    // Print ticket...
                    System.out.println();
                    System.out.println("|CCNJET TICKET--------------------------------"+ d +"|");
                    System.out.println("|                                                                         |");                                                          
                    System.out.println("|     Executive seat number " + "E" + (execNo)  + " is booked by " + execSeat[execNo]);
                    System.out.println("|                                                                         |");
                    System.out.println("|Booking No: " + r.nextInt(n) + "-----------------------------------Enjoy your flight!|");
                    System.out.println();    
                    execSeat[execNo] = execSeat[execNo++];
                    System.out.println("Would you like to book another executive seat?   Y? or N?     ");
                    menuChoose = input.next();    
                
                    if (menuChoose.equalsIgnoreCase ("n"))
                    {
                        System.out.println("Thankyou for your booking");
                    }
                    
                    if (execNo >=6)
                    {
                        System.out.println(" All seats are booked, thankyou.");
                    }
                }
               
            }
    
        //                     -----------------------------------------------
        
        if (submenuChoice.equals ("2"))//Luxury
        {
            for (clear = 0; clear <=30; clear++) {System.out.println (" ");}
            System.out.print("Would you like to book a seat?   Y? or N?     ");
            menuChoose = input.next();
            
            while (menuChoose.equalsIgnoreCase ("y") && luxNo < 4)
            {  
                System.out.print("Please enter your name: ");
                luxSeat[luxNo] = input.nextLine();
                luxSeat[luxNo] = input.nextLine();//duplicate line to stop reading in next line                               
                         
                // Print ticket...
                System.out.println();
                System.out.println("|CCNJET TICKET--------------------------------"+ d +"|");
                System.out.println("|                                                                         |");                                                          
                System.out.println("|       Luxury seat number " + "L" + (luxNo)  + " is booked by " + luxSeat[luxNo]);
                System.out.println("|                                                                         |");
                System.out.println("|Booking No: " + r.nextInt(n) + "-----------------------------------Enjoy your flight!|");
                System.out.println();         
                luxSeat[luxNo] = luxSeat[luxNo++];
                System.out.println("Would you like to book another luxury seat?   Y? or N?     ");
                menuChoose = input.next();    
            
                if (menuChoose.equalsIgnoreCase ("n"))
                {
                    System.out.println("Thankyou for your booking");
                }
                
                if (luxNo >=4)
                {
                    System.out.println(" All seats are booked, thankyou.");
                }
            
            }   
        }
        tempLux = luxNo;
        tempExec = execNo;
    }
//----------------------------------------------------------------------------------------------------------------------------------------                
    else if (menuChoice.equals  ("2"))//Availability                    
    {
        for (clear = 0; clear <=30; clear++) {System.out.println (" ");}
        System.out.println("         PASSENGER MANIFEST          ");
        System.out.println("");                     
        System.out.println("            **Executive**               ");
        
        for (execNo = 0; execNo <=5; execNo++)
        {
            System.out.println("Seat number " + "E" + (execNo)  + " is booked by " + execSeat[execNo]);
        }
        
        System.out.println("");                     
        System.out.println("              **Luxury**               ");
        
        for (luxNo = 0; luxNo <=3; luxNo++)
        {
            System.out.println("Seat number " + "L" + (luxNo)  + " is booked by " + luxSeat[luxNo]);
        }                  
        System.out.println("");
        System.out.println("Press any key to return to Main Menu.");
        exit = input.next();
        if (exit != "")
        {
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------                
    else if (menuChoice.equals ("3"))//Amend a seat
    {
        for (clear = 0; clear <=30; clear++) {System.out.println (" ");}
        amendMenu();// Bring up Amendment Menu
        submenuChoice = input.next();
                
        if (submenuChoice.equals ("1"))//Amend Exec
        {
            for (clear = 0; clear <=30; clear++) {System.out.println (" ");}
            for (execNo = 0; execNo <=5; execNo++)
            {
                System.out.println("Seat number " + "E" + (execNo)  + " is booked by " + execSeat[execNo]);
            }
            System.out.println("                                      **Amend Executive Seats**     ");
            System.out.println("");   
            System.out.println(" Please choose a seat number to amend 0, 1, 2... etc. Please, do not amend a seat that has not been booked. ");
            System.out.println("                                    Or press any other key to exit.");
            
            if (input.hasNextInt()) 
                {
                    seatAmend = input.nextInt();
                    while (seatAmend <6)
                    {   
                        System.out.println(" Please amend name for this seat");
                        newName = input.nextLine();
                        newName = input.nextLine();          
                        
                        
                        execNo = seatAmend;
                            
                        for (seatAmend = 0; seatAmend <=5; seatAmend++)
                        {
                            execSeat[execNo] = newName;
                        }
                        System.out.println();
                        System.out.println("?----------------------------------------------------------------------------------?");
                        System.out.println("Ticket amended: "+(d));
                        System.out.println();
                        System.out.println("         Executive seat number " + "E" + (execNo)  + " is now booked by " + execSeat[execNo]);
                        System.out.println();
                        System.out.println("?CCNJET TICKET AMENDMENT----------------------------------------Enjoy your flight!-?");           
                        System.out.println();
                        System.out.println(" To amend another seat please choose 0, 1, 2... etc.  Or press any other key to exit.");
                            
                        if (input.hasNextInt())
                        {
                            seatAmend = input.nextInt(); 
                        }                   
                    }                    
                }
            }
            
            if (submenuChoice.equals ("2"))//Amend Lux Seat
            {
                for (clear = 0; clear <=30; clear++) {System.out.println (" ");}
                for (luxNo = 0; luxNo <=3; luxNo++)
                {
                    System.out.println("Seat number " + "E" + (luxNo)  + " is booked by " + luxSeat[luxNo]);
                }
                System.out.println("                                         **Amend Luxury Seats**     ");
                System.out.println("");   
                System.out.println(" Please choose a seat number to amend 0, 1, 2... etc. Please, do not amend a seat that has not been booked. ");
                System.out.println("                                    Or press any other key to exit.");
            
                if (input.hasNextInt()) 
                {
                    seatAmend = input.nextInt();
                    while (seatAmend <6)
                    {
                        
                        System.out.println(" Please amend name for this seat");
                        newName = input.nextLine();
                        newName = input.nextLine();          
            
                        
                        luxNo = seatAmend;
                        
                        for (seatAmend = 0; seatAmend <=5; seatAmend++)
                        {
                            luxSeat[luxNo] = newName;
                        }
                        System.out.println();
                        System.out.println("?----------------------------------------------------------------------------------?");
                        System.out.println("Ticket amended: "+(d));
                        System.out.println();
                        System.out.println("           Luxury seat number " + "L" + (luxNo)  + " is now booked by " + luxSeat[luxNo]);
                        System.out.println();
                        System.out.println("?CCNJET TICKET AMENDMENT----------------------------------------Enjoy your flight!-?");           
                        System.out.println();
                        System.out.println(" To amend another seat please choose 0, 1, 2... etc.  Or press any other key to exit.");
                            
                        if (input.hasNextInt())
                        {
                            seatAmend = input.nextInt(); 
                        }                   
                    }                    
                }
            }      
        }
    }
    while (!menuChoice.equals ("4"));
    System.out.println("Thankyou for booking with CCNJet, have a nice day!");
}               
}   
 
