import java.util.*;
import java.io.*;


//Description: binToInt takes in binary and returns IPv4 
public class binToInt
{
  public static void main(String [] args)
  {
    int [] binToInt = new int[32];
    initBin(binToInt);
    inputBin(binToInt);
    outputInt(binToInt);
  }
  
  
//initBin:
//initalizes the [] binToInt
  
  static void initBin(int[] binToInt)
  {
    for(int i = 0; i < 32; i++)
    {
      binToInt[i] = 0;
    }
  }
  
  
//inputBin:
//Read input from scanner and puts in either 1 or 0 into each
//slot of the binToInt array. It enters the corresponding 2^n into the array  

  static void inputBin(int [] binToInt)
  {
    InputStreamReader instr = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(instr);
    StringTokenizer stok;
    int num;
    String value;
    try
    {
      System.out.println("Input a 32 digit binary code. ");
      System.out.println();
      value = stdin.readLine();
      System.out.println();
      stok = new StringTokenizer(value);
      while (stok.hasMoreTokens())
      {
        for(int i = 0; i < 32; i++)
        {
          num = Integer.parseInt(stok.nextToken());
          int z = num;
          if (z == 0 || z == 1)
          {
            binToInt[i] = z;
            if(z == 1)
            {
              if(i == 0 || i == 8 || i == 16 || i == 24)
              {
                binToInt[i] = 128;
              }
              if(i == 1 || i == 9 || i == 17 || i == 25)
              {
                binToInt[i] = 64;
              }
              if(i == 2 || i == 10 || i == 18 || i == 26)
              {
                binToInt[i] = 32;
              }
              if(i == 3 || i == 11 || i == 19 || i == 27)
              {
                binToInt[i] = 16;
              }
              if(i == 4 || i == 12 || i == 20 || i == 28)
              {
                  binToInt[i] = 8;
              }
              if(i == 5 || i == 13 || i == 21 || i == 29)
              {
                binToInt[i] = 4;
              }
              if(i == 6 || i == 14 || i == 22 || i == 30)
              {
                binToInt[i] = 2;
              }
              if(i == 7 || i == 15 || i == 23 || i == 31)
              {
                binToInt[i] = 1;
              }
            }
            if(z == 0)
            {
              binToInt[i] = 0;
            }
          }
          if(z > 1)
          {
            System.out.println("*Error only input 1's and 0's* Restart Program.");
          }
        }
      } 
    }catch (IOException ioe)
    {
      System.exit(-1);
    }
  }
  
  
//outputInt:
//Returns IPv4 which corresponds with the binary code that was entered.
  
    static void outputInt(int [] binToInt)
    {
      int a = 0; int b = 0; int c = 0; int d = 0;
      for(int i = 0; i < 8; i++)
      {
        a += binToInt[i];
      }
      for(int i = 8; i < 16; i++)
      {
        b += binToInt[i];
      }
      for(int i = 16; i < 24; i++)
      {
        c += binToInt[i];
      }
      for(int i = 24; i < 32; i++)
      {
        d += binToInt[i];
      }
      System.out.println(a + "." + b + "." + c + "." + d);
    }
}