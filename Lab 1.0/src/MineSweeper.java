/*
 * Douglas Wendel
 * CSCE 146
 * Lab 1.0
 * 1/23/2019
 */
import java.util.Scanner;
import java.util.Random;
public class MineSweeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int m = 10;
		
		char[][] mcBoard = new char [10][10]; //creates the board matrix
		
		System.out.println("Creating Empty Board!"); //output statement
		
		for(int i = 0; i <10; i++)
		{
			for(int j = 0; j <10; j++)
			{
				mcBoard[i][j] = '_';
				System.out.print(mcBoard[i][j]); //outputs empty board
			}
			System.out.println(); 
		}
		System.out.println(); 
		
		while(m > 0) //while m is less than 0
		{
			int j = rand.nextInt(10); //calls random
			int i = rand.nextInt(10); //calls random
			if(mcBoard[i][j] != '*')
			{
				mcBoard[i][j] = '*';
				m--; //m going down by interval (instead of ++ --)
				continue; 
			}
		}
		
		
		System.out.println("Placing Mines!");
		for(int i = 0; i <10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.print(mcBoard[i][j]); //outputs board matrix with mines shown
			}
			System.out.println(); 
		}
		System.out.println(); 
		
		System.out.println("Perforing Mine Count!"); //output statement
		
		int[][] mineCounter = new int [10][10]; //mine counter matrix
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if(mcBoard[i][j] == '_')
				{
					int m1 = 0;
					
					
					
					/*
					 * 8 if statements i OR j +1, -1, i+1 & j+1, i-1 & j-1,
					 * cound also do a double nested for loop??
					 * TODO remove continues lines are skipped
					 */
										
					if(j +1 < 10 
							&& mcBoard[i][j+1] == '*')
					{
						m1++; //adds to current m1 not default 0
						//continue;
					}
					
					if(i + 1 < 10 
							&& mcBoard[i+1][j] == '*') 
					{
						m1++; //adds to current m1 not default 0
						//continue
					}
					
					if (j - 1 >= 0 
							&& mcBoard[i][j - 1] == '*')
					{
						m1++; //adds to current m1 not default 0
						//continue;
					}
					
					if (i - 1 >= 0 
							&& mcBoard[i - 1][j] == '*')
					{
						m1++; //adds to current m1 not default 0
						//continue;
					}
					
					if (j + 1 < 10 && i + 1 < 10 
							&& mcBoard[i + 1][j + 1] == '*')
					{
						m1++; //adds to current m1 not default 0
						//continue;
					}
					
					if (j + 1 < 10 && i - 1 >= 0 
							&& mcBoard[i - 1][j + 1] == '*')
					{
						m1++; //adds to current m1 not default 0
						//continue;
					}
					
					if (j - 1 >= 0 && i - 1 >= 0 
							&& mcBoard[i - 1][j - 1] == '*')
					{
						m1++; //adds to current m1 not default 0
						//continue;
					}
					
					if (i + 1 < 10 && j - 1 >= 0 
							&& mcBoard[i + 1][j - 1] == '*')
					{
						m1++; //adds to current m1 not default 0
						//continue;
					}
					
					mcBoard[i][j] = Integer.toString(m1).charAt(0);
				}
				
			}
		}
	
			for(int i = 0; i < 10; i++) 
			{
				for(int j = 0; j < 10; j++) 
				{
					System.out.print(mcBoard[i][j]); //prints final mine count board.
				}
				System.out.println();
			}

		}
	
		
		
		
		

}


