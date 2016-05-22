package org.headfirst;

import java.util.Comparator;

public class songcomparator implements Comparator{
	
	/*public int compare(Object o1,Object o2){
		Song s=(Song)o1;
		Song s1=(Song)o2;
		
//		Song s=new Song("t", "a");
//		Song s1=new Song("a", "a");
		return s.getArtist().compareTo(s1.getArtist());
	
			
		
		
	}*/

	public int compare(Song o1,Song o2){
		//Song s=(Song)o1;
		//Song s1=(Song)o2;
		
//		Song s=new Song("t", "a");
//		Song s1=new Song("a", "a");
		return o1.getArtist().compareTo(o2.getArtist());
	
			
		
		
	}

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*public int compare1(Object o3,Object o4){
		
		
		Song s2=(Song)o3;
		Song s3=(Song)o4;
		return s2.getTitle().compareTo(s3.getTitle());
		
	}
	*/
	
	
	
}
