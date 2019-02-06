/*
 * Douglas Wendel

 * CSCE 146
 * January 16, 2019
 */

import java.util.Random;
import java.util.Scanner;
public class AverageOfFours {

	public static final int MAX_NUMBER = 9;
	public static final int BOARD_SIZE1 = 4;

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Initial matrix"); //output statement
		
		//establishes double variables
		double quad1 = 0.0; 		
		double quad2 = 0.0;
		double quad3 = 0.0;
		double quad4 = 0.0;
		
		//randomizer
		Random r = new Random(); //RNG		
		
		//matrix creator
		int [][] board = new int [4][4];
		
		for(int i=0; i < board.length; i++)
		{
			for(int j=0; j < board[i].length; j++)
			{
				
			}
		}
		
		
		for(int i=0; i < board.length; i++)
		{
			for(int j = 0; j < board.length; j++)
			{
				board[i][j] = r.nextInt(MAX_NUMBER);
				System.out.print(board[i][j]+" ");//output statement
				
			}
			System.out.println();

		}
		
		
		System.out.println("Result Matrix"); //output statement
		
		
		
		 
		for(int i = 0; i < 2; i++) //correct
		{
			for(int j=0; j < 2; j++)
			{
				quad1 += board[i][j]; //assigns the numbers to quadrant 1 in the matrix			
			}	
		}
		
		System.out.print(quad1 / 4 + " "); //prints and calculates quadrant 1's average
		
		
		for(int i = 0; i < 2; i++ ) //correct
		{
			for(int j = 2; j < 4; j++)
			{
				quad2 += board[i][j];//assigns the numbers to quadrant 2 in the matrix		
			}
		}

		
		
		
		System.out.print(quad2 / 4 + " "); //prints and calculates quadrant 2's average
		System.out.println();
		
		for(int i = 2; i < 4; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				quad3 += board[i][j]; //assigns the numbers to quadrant 3 in the matrix	
			}
		}
		
		System.out.print(quad3 / 4 + " "); //prints and divides quad3 numbers by 4 to find the average
	
		for(int i = 2; i < 4; i++) //i is equiv to rows 
		{
			for (int j = 2; j < 4; j++) //j is equiv to colums 2 and 4 is cordinates 
			{
				quad4 += board[i][j]; //assigns the numbers to quadrant 4 in the matrix	
			}
		}
		System.out.print(quad4/4); //prints and divides quad 4 numbers by 4 to find the average

	}
}


