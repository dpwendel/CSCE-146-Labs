/*
 * Douglas Wendel
 * CSCE 146
 * LabExam01
 */
import java.util.Scanner;
public class SongPlaylist {
	private static GenQueue<Song> songz; 
	/*
	 * I dont know why it is static but thats the only way i could get
	 * multiple weird and unknown errors to dissapear. 
	 */
	
	public SongPlaylist()
	{
		songz = new GenQueue<Song>();
	}
	
	public static void addSong(Song xSong) //adds a song to the playlist 
	{
		songz.enqueue(xSong);
	}
	
	public void getCurrentSong(Song xSong) //gets current song
	{
		System.out.println(songz.peek());
	}
	
	public void advanceOneSecond(Song xSong, double xCurrentTime)
	{
		//current time in song + 1 and print new time. 
		return;
		
	}
	
	public static void PrintAllValues()
	{
		songz.print();
	}

}
