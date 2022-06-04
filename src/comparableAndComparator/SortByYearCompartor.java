package comparableAndComparator;

import java.util.Comparator;

public class SortByYearCompartor implements Comparator<Song>{

	@Override
	public int compare(Song song1, Song song2) {

		if(song1.getYear()>song2.getYear()) {
			return -1;
		}else if (song1.getYear()<song2.getYear()){
			return +1;
		}
		
		return 0;
	}

}
