package comparableAndComparator;

public class Song implements Comparable<Song> {
	
	public String title;
	public String artist;
	public Integer year;
	
	public Song() {
	}
	
	public Song(String title, String artist, int year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Song o) {
		
		return -this.getYear().compareTo(o.getYear());
	}
	
	
	
	

}
