package comparableAndComparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MP4 {

	public static void main(String[] args) {

		Song song1 = new Song("Romantic Song","Arjit Singh",2020);
		Song song2 = new Song("Punjabi Song","Mankirt Aulakh",2021);
		Song song3 = new Song("Korean Song","Jubin Nautiyal",2022);
		Song song4 = new Song("English Song","Salena Gomez",2023);
		Song song5 = new Song("Hindi Song","Atif Aslam",2025);
		
		ArrayList<Song> musicList = new ArrayList<>();
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		musicList.add(song5);
	
		

		for(Song s:musicList) {
		System.out.println(s);	
		}

	//	Collections.sort(musicList);
	//Sort by Comparator
		
	//	Collections.sort(musicList, new SortByArtistComparator());
		Collections.sort(musicList, new SortByYearCompartor());
		
		System.out.println("After Sorting");
		
		for(Song s:musicList) {
			System.out.println(s);	
			}

	}
}
