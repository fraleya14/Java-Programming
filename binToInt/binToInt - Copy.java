import java.util.*;
import java.io.*;


//Description: binToInt takes in binary and returns IPv4 
public class binToInt
{
  public static void main(String [] args)
  {
    int [] [] binToInt = new int[4][8];
    initBin(binToInt);
    inputBin(binToInt);
    outputInt(binToInt);
  }
  
  
//initBin:
//initalizes the [] binToInt
  
  static void initBin(int [] [] binToInt)
  {
    for(int i = 0; i < 4; i++)
    {
		for(int j = 0; j < 8; j++)
		{
			binToInt[i][j] = 0;
		}
    }
  }
  
  
//inputBin:
//Read input from scanner and puts in either 1 or 0 into each
//slot of the binToInt array. It enters the corresponding 2^n into the array  

  static void inputBin(int [] [] binToInt)
  {
    InputStreamReader instr = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(instr);
    StringTokenizer stok;
    String num;
    String value;
	char let;
    try
    {
      System.out.println("Input a 32 digit binary code. ");
      System.out.println();
      value = stdin.readLine();
      System.out.println();
      stok = new StringTokenizer(value);
	  for(int i = 0; i < 4; i++)
	  {
		num = stok.nextToken(.);
		for(int j = 0; j < 8; j++)
		{
			bin[i][j] = Interger.parseInt(num.charAt(j));
		}
		convertBinToInt(binToInt);
      } 
    }catch (IOException ioe)
    {
      System.exit(-1);
    }
  }
  

  static void convertBinToInt(int [] [] binToInt)
  {
  	  for(int i = 0; i < 4; i++)
	  {
		for(int j = 0; j < 8; j++)
		{
		  if (binToInt[i][j] == 0 || binToInt[i][j] == 1)
          {
            if(binToInt[i][j] == 1)
            {
              if(j == 0)
              {
                binToInt[i][j] = 128;
              }
              if(j == 1)
              {
                binToInt[i][j] = 64;
              }
              if(j == 2)
              {
                binToInt[i][j] = 32;
              }
              if(j == 3)
              {
                binToInt[i][j] = 16;
              }
              if(j == 4)
              {
                  binToInt[i][j] = 8;
              }
              if(j == 5)
              {
                binToInt[i][j] = 4;
              }
              if(j == 6)
              {
                binToInt[i][j] = 2;
              }
              if(j == 7)
              {
                binToInt[i][j] = 1;
              }
            }
            if(binToInt[i][j] == 0)
            {
              binToInt[i][j] = 0;
            }
		}
	}
  }

  
//outputInt:
//Returns IPv4 which corresponds with the binary code that was entered.
  
    static void outputInt(int [] [] binToInt)
    {
      int a = 0; int b = 0; int c = 0; int d = 0;
	  for(int i = 0; i < 4; i++)
	  {
		for(int j = 0; j < 8; j++)
		{
			if(i = 0)
			{
				a += binToInt[i][j];
			}
			if(i = 1)
			{
				b += binToInt[i][j];
			}
			if(i = 2)
			{
				c += binToInt[i][j];
			}
			if(i = 3)
			{
				d += binToInt[i][j];
			} 
		}
	  }
      System.out.println(a + "." + b + "." + c + "." + d);
    }
}