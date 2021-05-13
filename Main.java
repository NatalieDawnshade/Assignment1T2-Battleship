/* Term 2 Assignment 7 - Battleship */

/* Main Battleship class -
 * requires Board class to be written 
 */
import java.util.Scanner;
//Battleship
public class Main
{
  Board b = new Board();
  /*public static void main(String[] args)
  {
    System.out.println(b + "\n");
    boolean addNew = true;
    
    while(addNew)
    {
      // Ask for new ship
      System.out.println("Add a new ship? (yes/no)");
      String ans = scan.nextLine();
      if(ans.toLowerCase().equals("yes"))
      {
        // Get parameters for new ship
        System.out.println("Starting in which row?");
        int r = scan.nextInt();
        System.out.println("Starting in which column?");
        int c = scan.nextInt();
        System.out.println("How long?");
        int l = scan.nextInt();
        scan.nextLine();
        System.out.println("Horizontal (h) or vertical (v)?");
        String d = scan.nextLine();
        boolean h = (d.toLowerCase().equals("h"));
        
        // Call addShip method and return message based on true/false value
        if(b.addShip(r, c, l, h))
        {
          System.out.println("\nNew ship added!\n\n" + b + "\n");
        }
        else
          System.out.println("\nCan't put a ship there!\n");
      }
      else
      {
        addNew = false;
        System.out.println("\nOk, let's play!\n");
      }
    }
    
    // As long as ships remain, play game
    while(!b.gameOver())
    {
      // Get row and column to shoot
      System.out.println("Input row");
      int r = scan.nextInt();
      System.out.println("Input column");
      int c = scan.nextInt();
      
      // Perform shot and store result
      int result = b.shoot(r,c);
      
      // Choose message based on result
      if(result == 1)
        System.out.println("\nHit!\n\n" + b + "\n");
      else if(result == 0)
        System.out.println("\nMiss!\n\n" + b + "\n");
      else if(result == 2)
        System.out.println("\nYou already tried that\n"); 
      else
        System.out.println("\nInvalid coordinates\n");      
    }
    System.out.println("Game over!");
  }*/
  //colors
      public static final String ANSI_RESET = "\u001B[0m";
      // Background
      public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
      public static final String RED_BACKGROUND = "\033[41m";    // RED
      public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
      public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
      public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
      public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
      public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
      public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE
      
      // Regular Colors
      public static final String WHITE = "\033[0;37m";   // WHITE

      //Underline
      public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

      //Bold
      public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
      public static final String RED_BOLD = "\033[1;31m";    // RED
      public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
      public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
      public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
      public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
      public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
      public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
      // High Intensity
      public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
      public static final String RED_BRIGHT = "\033[0;91m";    // RED
      public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
      public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
      public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
      public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
      public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
      public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

      // Bold High Intensity
      public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
      public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
      public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
      public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
      public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
      public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
      public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
      public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

      // High Intensity backgrounds
      public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
      public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
      public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
      public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
      public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
      public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
      public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
      public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
  public static String menu()//prnts reg menu
  {
    Scanner scan = new Scanner(System.in);
    Boolean flag = true;
    while (flag == true)
    {
      System.out.println("|----------------------------------------------|");
      System.out.println(("|")+(GREEN_BACKGROUND + BLACK_BOLD + "                  MAIN MENU                   ") + (ANSI_RESET +"|"));
      System.out.println("|----------------------------------------------|");
      System.out.println("1) Today's Assignment: Coding Activity 08.04");
      //System.out.println("2) Option 2");
      //System.out.println("3) Option 3");
      //System.out.println("4) Option 4");
      //System.out.println("5) Option 5");
      //System.out.println("2) ???");
      System.out.println("|----------------------------------------------|");
      System.out.println(" : ");
      //scan.nextLine();
      flag = false;
    }
    //while (scanner.hasnextLine())
    {
      String num = scan.nextLine();
      //scan.close();
      num = num.replaceAll("\\s", "");
      return num;
    }
  }
  public static String menu2()//prnts game menu
  {
    Scanner scan = new Scanner(System.in);
    Boolean flag = true;
    while (flag == true)
    {
      System.out.println("|--------------------------------------------|");
      System.out.println(("|")+(PURPLE_BACKGROUND + WHITE_BOLD + "            BATTLESHIP: GAME MENU           ") + (ANSI_RESET +"|"));
      System.out.println("|--------------------------------------------|");
      System.out.println("1) ✨  Programmer's Notes (read me)  ✨");
      System.out.println("2) Rules (read me)");
      System.out.println("3) Create New 1-Player Game (User v. Computer");
      System.out.println("4) Create New 2-Player Game (User1 v. User2)");
      System.out.println("5) Exit Game- Back to Main Menu");
      //System.out.println("6) Prints List  ");
      System.out.println("|--------------------------------------------|");
      System.out.println(" : ");
      //scan.nextLine();
      flag = false;
    }
    {
      String num = scan.nextLine();
      //scan.close();
      num = num.replaceAll("\\s", "");
      return num;
    }
  }
  public static String menu3()//prnts p-1 menu 
  {
    Scanner scan = new Scanner(System.in);
    Boolean flag = true;
    while (flag == true)
    {
      System.out.println("|-------------------------------------------|");
      System.out.println(("|")+(CYAN_BACKGROUND_BRIGHT + BLACK_BOLD + "        BATTLESHIP: 1-PLAYER MODE          ") + (ANSI_RESET +"|"));
      System.out.println("|-------------------------------------------|");
      System.out.println("1) Set New Board: Add Ships");
      System.out.println("2) Play!");
      System.out.println("3)Exit Game- Back to Assignment/Code Menu");
      //System.out.println("4) Option 4");
      //System.out.println("5) Option 5");
      //System.out.println("2) ???");
      System.out.println("|-------------------------------------------|");
      System.out.println(" : ");
      //scan.nextLine();
      flag = false;
    }
    {
      String num = scan.nextLine();
      //scan.close();
      num = num.replaceAll("\\s", "");
      return num;
    }
  }
  public static String menu4()//prnts p-2 menu
  {
    Scanner scan = new Scanner(System.in);
    Boolean flag = true;
    while (flag == true)
    {
      System.out.println("|---------------------------------------------|");
      System.out.println(("|")+(CYAN_BACKGROUND_BRIGHT + BLACK_BOLD + "         BATTLESHIP: 2-PLAYER MODE           ") + (ANSI_RESET +"|"));
      System.out.println("|---------------------------------------------|");
      System.out.println("1) Set New Board for Player #1: Add Ships");
      System.out.println("2) Set New Board for Player #2: Add Ships");
      System.out.println("3) Play!");
      System.out.println("4) Exit Game- Back to Assignment/Code Menu");
      //System.out.println("5) Option 5");
      //System.out.println("2) ???");
      System.out.println("|---------------------------------------------|");
      System.out.println(" : ");
      //scan.nextLine();
      flag = false;
    }
    {
      String num = scan.nextLine();
      //scan.close();
      num = num.replaceAll("\\s", "");
      return num;
    }
  }
  public static void choices()//real main, into assign.
  {  //choices method
    Boolean flag = false;
    while(flag == false)
    {
      String num = menu();
      //#os.system("clear")
      if(num.equals("1"))
      {
        today();//our assignment
        //option 1
        flag = true;
      }
      else
      {
        System.out.println("What part of 1 options don't you get? Pick a number, just 1. Proof the American school system is failing.../s");
      }
    } 
  }
  public static void choices2()//assignment main
  {  //choices2 method
    Boolean flag = false;
    while(flag == false)
    {
      String num = menu2();//MENU CALL
      if(num.equals("1"))
      {//option 1- NOTES
        notas();
        choices2();
        flag = true;
      } 
      else if(num.equals("2"))
      {//option 2- RULES
        reglas();//rules
        choices2();
        flag = true;
      }
      else if(num.equals("3"))
      {//option 3- New Game 1-P
        choices3();
        flag=true;
      }
      else if(num.equals("4"))
      {//option 4- New Game 2-P
        choices4();
        flag = true;
      }
      else if(num.equals("5"))
      {//option 5- EXIT GAME
        choices();
        flag = true;
      }
      else
      {
        System.out.println("What part of 5 options don't you get? Pick a number, 1-5. Proof the American school system is failing.../s");
      }
    } 
  }
  public static void choices3()//p-1  main
  {  //choices2 method
    Boolean flag = false;
    while(flag == false)
    {
      String num = menu3();//MENU CALL
      if(num.equals("1"))
      {//option 1- MAKE BOARD W/ SHIPS
        choices3();//BACK
        flag = true;
      } 
      else if(num.equals("2"))
      {//option 2- PLAY
        //playMe();
        choices3();//BACK
        flag = true;
      }
      else if(num.equals("3"))
      {//option 3- EXIT GAME
        choices2();//UP
        flag = true;
      }
      else
      {
        System.out.println("What part of 3 options don't you get? Pick a number, 1-3. Proof the American school system is failing.../s");
      }
    } 
  }
  public static void choices4()//p-2  main
  {  //choices2 method
    Boolean flag = false;
    while(flag == false)
    {
      String num = menu4();//MENU CALL
      if(num.equals("1"))
      {//option 1- addShips- P1
        choices4();//BACK
        flag = true;
      } 
      else if(num.equals("2"))
      {//option 2- addShips- P2
        choices4();//BACK
        flag = true;
      }
      else if(num.equals("3"))
      {//option 3- PLAY
        //playMe();
        choices3();//BACK
        flag = true;
      }
      else if(num.equals("4"))
      {//option 4- EXIT
        choices2();//UP
        flag = true;
      }
      else
      {
        System.out.println("What part of 4 options don't you get? Pick a number, 1-4. Proof the American school system is failing.../s");
      }
    } 
  }
	public static void today()// assignment: choices2 call
	{
    choices2();
	}
  public static void notas()// notes call
  {
    System.out.println("Notes");
    System.out.println("?????");
  }
  public static void reglas()// rules call
  {
    System.out.println("Rules");
    System.out.println("?????");
  }
  public static void main(String[] args) 
  {
    choices();
  }
}