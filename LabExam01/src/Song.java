/*
 * Douglas Wendel
 * CSCE 146
 * LabExam01
 */
public class Song {
	
//VARIABLES
	private String name; //name of the song
	private String Artist; //name of the author of the song
	private double TotalLength; //total length of the song
	private double CurrentTime; //current time stamp you are on in the song
	
//CONSTRUCTOR
	public Song()
	{
		this.name = "none"; //no song title
		this.Artist = "none"; //no author name
		this.TotalLength = 0.0; //0 seconds
		this.CurrentTime = 0.0; //0 seconds
	}
	
//ACCESSORS
	public Song(String xName, String xArtist, 
			double xTotalLength, double xCurrentTime)
	{
		this.setName(xName);
		this.setArtist(xArtist);
		this.setTotalLength(xTotalLength);
		this.setCurrentTime(xCurrentTime);
	}

//GET&SET NAME
	public void setName(String xName) //name of the song
	{
		this.name = xName;
	}
	
	public String getName() //name of the song
	{
		return name;
	}
	
//GET&SET ARTIST
	public void setArtist(String xArtist) //name of whom sings/performs the song
	{
		this.Artist = xArtist;
	}
	
	public String getArtist() //name of whom sings/performs the song
	{
		return Artist;
	}
	
//GET&SET TOTALLENGTH
	public void setTotalLength(double xTotalLength)
	{
		if(xTotalLength <= 0)
		{
			this.TotalLength = xTotalLength;
		}
	}
	
	public double TotalLength()
	{
		return TotalLength;
	}

//GET&SET CURRENTTIME
	public void setCurrentTime(double xCurrentTime)
	{
		this.CurrentTime = xCurrentTime;
	}
	
	public static double getCurrentTime()
	{
		return getCurrentTime();
	}
	
	public String toString()
	{
		return "Song: " +this.name + "\nArtist: "+
				this.Artist+"\nTotal Length: "+
				this.TotalLength + "\nCurrent Time: " +this.CurrentTime;		
	}
	
	public double getTimeRemaining() //this subtracts the current time from the total length of the song so you know how much time is remaining
	{
		return this.TotalLength - this.CurrentTime;
	}

}
