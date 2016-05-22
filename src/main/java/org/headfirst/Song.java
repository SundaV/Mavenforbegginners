package org.headfirst;

import java.util.Comparator;
import java.util.StringTokenizer;

import org.apache.lucene.search.FieldComparator.IntComparator;

public class Song implements Comparable<Song> {

	private String title;
	private String artist;
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
	
	Song(String t,String a){
		
		
		title=t;
		artist=a;
		
		
	}
	
public  String toString()	{
	
	return artist+""+title;
	
	
}


public int compare(Song o1, Song o2) {
	// TODO Auto-generated method stub
	return o1.title.compareTo(o2.title);
}


public int compare1(Song o1, Song o2) {
	// TODO Auto-generated method stub
	return o1.artist.compareTo(o2.artist);
}

/*public int compare1(Song o3, Song o4) {
	// TODO Auto-generated method stub
	return o3.artist.compareTo(o4.artist);
}*/
public int compareTo(Song o) {
	// TODO Auto-generated method stub
	return 0;
}


}
