//imports
import java.util.Scanner;

public class Board
{
  //global vars
    Scanner scan = new Scanner(System.in);
    String [] a0 = new String [11];
    String [] a1 = new String [11];
    String [] a2 = new String [11];
    String [] a3 = new String [11];
    String [] a4 = new String [11];
    String [] a5 = new String [11];
    String [] a6 = new String [11];
    String [] a7 = new String [11];
    String [] a8 = new String [11];
    String [] a9 = new String [11];
    String [] a10 = new String [11];
    String [] a11 = new String [11];
    String[][] b = new String[11][12];//[12Y][11X]
    int len = 0;
    int x = 0;
    int y = 0;
    String typ = "";
    boolean d = true;
  public Board()
  {
    String[][] b = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11};
    String [] a0 = {"  " ,"  " ,"  " ,"  " ,"  " ,"  " ,"  " ,"  " ,"  ","  " ,"  "};
    String [] a1 = {"A " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a2 = {"B " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a3 = {"C " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a4 = {"D " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a5 = {"E " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a6 = {"F " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a7 = {"G " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a8 = {"H " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a9 = {"I " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a10 = {"J " ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊" ,"🌊","🌊" ,"🌊"};
    String [] a11 = {"  " ,"1 " ,"2 " ,"3 " ,"4 " ,"5 " ,"6 " ,"7 " ,"8" ,"9 " ,"10 "};
  }
  public void pickY()
  { //Conversion of number input
    Boolean point = false;
    String num = "";
    while(point == false)
    {
      System.out.println("What column do you want to aim at? (Choose a number.)");
      //num = scan.nextInt();
      num = scan.nextLine();
      if (num.equals("1"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("2"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("3"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("4"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("5"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("6"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("7"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("8"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("9"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else if(num.equals("10"))
      {
        y = Integer.parseInt(num);
        point = true;
      }
      else
      {
       System.out.println("Plese enter a number between 1-10(inclusive).");
       point = false;
      }
    }
  }
  public void pickX()
  { //Coversion of letter input
    boolean point = false;
    String letra = "";
    while(point == false)
    {
      System.out.println("What row do you want to aim at? (Choose a letter.)");
      letra = scan.nextLine();
      if (letra.toUpperCase().equals("A"))
      {//1
        letra = "1";
        int x = Integer.parseInt(letra);
        point = true;
      }
      else if(letra.toUpperCase().equals("B"))
      {//2
        letra = "2";
        int x = Integer.parseInt(letra);
        point = true;

      }
      else if(letra.toUpperCase().equals("C"))
      {//3
        letra = "3";
        int x = Integer.parseInt(letra);
        point = true;

      }
      else if(letra.toUpperCase().equals("D"))
      {//4
        letra = "4";
        int x = Integer.parseInt(letra);
        point = true;

      }
      else if(letra.toUpperCase().equals("E"))
      {//5
        letra = "5";
        int x = Integer.parseInt(letra);
        point = true;

      }
      else if(letra.toUpperCase().equals("F"))
      {//6
        letra = "6";
        int x = Integer.parseInt(letra);
        point = true;
      }
      else if(letra.toUpperCase().equals("G"))
      {//7
        letra = "7";
        int x = Integer.parseInt(letra);
        point = true;
      }
      else if(letra.toUpperCase().equals("H"))
      {//8
        letra = "8";
        int x = Integer.parseInt(letra);
        point = true;
      }
      else if(letra.toUpperCase().equals("I"))
      {//9
        letra = "9";
        int x = Integer.parseInt(letra);
        point = true;
      }
      else if(letra.toUpperCase().equals("J"))
      {//10
        letra = "10";
        int x = Integer.parseInt(letra);
        point = true;
      }
      else
      {
       System.out.println("Plese enter a letter between A-J(inclusive).");
       point = false;
      }
    }
  }
  public void pickD()//if ANY ELSE VERTICAL, ADD TO NOTES
  {//Conversion of direction input
    boolean point = false;
    String v = "";
    while(point == false)
    {
      System.out.println("Do you want your ship to be placed horizontal or vertical?");
      v = scan.nextLine();
      if (v.toLowerCase().equals("horizontal") || v.toLowerCase().equals("h"))
      {//true
        d = true;
        point = true;
      }
      else
      {//false
        d = false;
        point = true;
      }
    }
  }
  public void pickTypLen()
  {//Conversion of Ship Image and Length
    boolean point = false;
    while(point == false)
    {
      String num = "";
      System.out.println("What type of ship would you like to place?");
      //ADD LIST
      num = scan.nextLine();
      if (num.equals("1"))
      {//carrier- 5🛳
        typ = "🛳";
        len = 5;
        point = true;
      }
      else if (num.equals("2"))
      {//battleship- 4🚢
        len = 4;
        typ = "🚢";
        point = true;
      }
      else if (num.equals("3"))
      {//submarine- 3🛶
        len = 3;
        typ = "🛶";
        point = true;
      }
      else if (num.equals("4"))
      {//cruiser- 3⛴
        len = 4;
        typ = "⛴";
        point = true;
      }
      else if (num.equals("5"))
      {//destroyer- 2🛥
        len = 4;
        typ = "🛥";
        point = true;
      }
      else
      {
       System.out.println("Plese enter a number between 1-5(inclusive).");
      }
    }
  }
  public boolean addShip()
  {
    if(d == false && ((x + (len-1) > 0) && (x + (len-1) <= 10)))
    {
      for(int i = x;i < len;i++) 
      {
        b [i][x] = typ;
      }
      return true;
    }
    else if (d == true && ((y + (len-1) > 0) && (y + (len-1) <= 10)))
    {
      for(int i = y;i < len;i++) 
      {
        b [y][i] = typ;
      } 
      return true;
    }
    else
    {
      System.out.println("Either this ship cannot be placced due to one of these spots already having a ship or the direction it would be placed in going out of bounds. Please Try Again. ");
      return false;
    }
  }
  public void toStringy()
  {
    for (int i = 0; i < 2; i++) 
    {
      for (int j = 0; j < 2; j++) 
      {
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }
  }
  public String shootP1(int x, int y)
  {
    if (b [y][x] == "🌊")
    {//MISS🔘
      //b [y][x] = "🔘";
      //flag = true;
      return "🔘";
    }
    else if (b [y][x] != "🌊" && b [y][x] == "🛳")
    {//carrier- 5🛳
      //b [y][x] = "❌";
      //flag = true;
      return "🛳";
    }
    else if (b [y][x] != "🌊" && b [y][x] == "🚢")
    {//battleship- 4🚢
      //b [y][x] = "❌";
      //flag = true;
      return "🚢";
    }
    else if (b [y][x] != "🌊" && b [y][x] == "🛶")
    {//submarine- 3🛶
      //b [y][x] = "❌";
      //flag = true;
      return "🛶";
    }
    else if (b [y][x] != "🌊" && b [y][x] == "⛴")
    {//cruiser- 3⛴
      //b [y][x] = "❌";
      //flag = true;
      return "⛴";
    }
    else if (b [y][x] != "🌊" && b [y][x] == "🛥")
    {//destroyer- 2🛥
      //b [y][x] = "❌";
      //flag = true;
      return "🛥";
    }
    else
    {//REPEAT🔄
      return "🔄";
    }
  }
  public void setVis(String xo)
  {
    b [y][x] = xo;
  }
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
}