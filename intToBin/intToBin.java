import java.util.*;
import java.io.*;

public class intToBin
{
  public static void main(String [] args)
  {
    int [] [] bin = new int[4][8];
    initbin(bin);
    inputInt(bin);
    outputBin(bin);
  }
  
  
//initbin
//initializes the bin and nums array setting everything to zero
  
  static void initbin(int [] [] bin)
  {
    for(int n = 0; n < 4; n++)
    {
      for(int i = 0; i < 8 ; i++)
      {
        bin[n][i] = 0;
      }
    }
  }
  

//inputInt:
//Int gets subtracted until it equals 0 and each time
//it is subtracted from a number a 1 is placed there 
//in the bin array  
  
  static void inputInt(int [] [] bin)
  {
    InputStreamReader instr = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(instr);
    StringTokenizer stok;
    int num;
    String value;
    try
    {
      System.out.println("Enter the IPv4 address: ");
      System.out.println();
      value = stdin.readLine();
      System.out.println();
      stok = new StringTokenizer(value);
      int n = 0;
      while(n < 4)
      {
        while (stok.hasMoreTokens())
        {
          num = Integer.parseInt(stok.nextToken());
          int z = num;
          while( z > 0 && z <= 255)
          {
            if(z >= 128 )
            {
              z = z - 128;
              bin[n][0] = 1;
            }
            if(z >= 64)
            {
              z = z - 64;
              bin[n][1] = 1;
            }
            if(z >= 32)
            {
              z = z - 32;
              bin[n][2] = 1;
            }
            if(z >= 16)
            {
              z = z - 16;
              bin[n][3] = 1;
            }
            if(z >= 8)
            {
              z = z -8;
              bin[n][4] = 1;
            }
            if(z >= 4)
            {
              z = z - 4;
              bin[n][5] = 1;
            }
            if(z >= 2)
            {
              z = z - 2;
              bin[n][6] = 1;
            }
            if(z >= 1)
            {
              z = z -1;
              bin[n][7] = 1;
            }
          }
          n++;
        }
      }
    }catch (IOException ioe)
    {
      System.exit(-1);
    }
  }


//outputBin
//Prints out the binary of the int
  
  static void outputBin(int [] [] bin)
  {
    for(int n = 0; n < 4; n++)
    {
      int z = 0;
      for(int i = 0; i < 8; i++)
      {
        z = bin[n][i];
        System.out.print(z);
      }
      System.out.print(" ");
    }
    System.out.println("");
  }
}