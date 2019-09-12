/*
 * Douglas Wendel
 * CSCE 146
 * LabExam01
 */

import java.util.Scanner;
public class SongPlaylistFrontEnd <T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in); //default-scanner
		
		SongPlaylist songPlaylist = new SongPlaylist(); //creates new playlist section
		Song s = new Song(); //new song
		System.out.println("Welcome to the Song Playlist!"); //welcome statement
		boolean quit = false;//default boolean setter
		
		while(quit == false)
		{
			//prompts user
			System.out.println("Enter 1: to Add a Song "
					+ "\nEnter 2: to Start the Playlist "
					+ "\nEnter 9 to Quit");
			int input = key.nextInt(); //allows user to input what they want
			
			
			switch(input)
			{
			case 1: //aloows the user to add a song
				s = new Song();
				key.nextLine();
				System.out.println("Enter the name, the artist, "
						+ "and the total time (seconds)");
				String name = key.nextLine(); //allows user to input name
				String artist = key.nextLine(); //allows user to input artist
				double TotalTime = key.nextDouble();
				double CurrentTime = 0; //sets the current time to 0 since we havent started listening yet
				s = new Song(name, artist, TotalTime, CurrentTime);
				SongPlaylist.addSong(s); //adds song to aray
				break;
			case 2: 
				//starts the playlist. this 
				System.out.println("Starting the playlist");
				//s = new Song(name, artist, TotalTime, CurrentTime);
				//for(int i = 0; i > TotalTime; i++)
				//{
					//do i need a second for loop to see how man y songs there are total?
					//SongPlaylist.PrintAllValues();
				//}
				double CurrentTime1 = 0;
				SongPlaylist.PrintAllValues();
				for(int i = 0; i < TotalTime; i++) //i dont understNd why this wont work
				{
					//total time subtracts one second until it gets to 0 seconds
					CurrentTime1++; //current time adds one second until it reaches TotalTime
					CurrentTime1 = CurrentTime;
					//Song.getTimeRemaining();
					if(CurrentTime == TotalTime)
					{
						GenQueue.dequeue();
					}
				}
				break;
				
			case 9:
				System.out.println("Goodbye");//bye
				quit = true; //boolean = true bye bye
				break; //break
				
			}
		}

	}

}
