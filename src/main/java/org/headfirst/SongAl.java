package org.headfirst;

import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.hibernate.annotations.Entity;
import org.hibernate.hql.ast.origin.hql.parse.HQLParser.new_key_return;
import org.hibernate.hql.internal.ast.tree.MapEntryNode;

public class SongAl {

	// static Song s=new Song("A", "Z" +
	// "");\

	// static Song s1=new Song("c", "d");

	/*
	 * static int s=1000; static Integer in=new Integer(s);
	 */

	Calendar cal = Calendar.getInstance();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// System.out.println(in);

		Calendar cal = Calendar.getInstance();

		Date date = new Date();
		long ms = date.getTime();

		long ms1 = cal.getTimeInMillis();
		// System.out.println(ms+""+ms1);
		/*
		 * List<Song> al=new ArrayList<Song>(); al.add(new Song("a", "c" + ""));
		 * al.add(new Song("b" ,"d"));
		 */
		// System.out.println(date+"" +ms+"" +cal);

		//

		TreeSet<Song> ts = new TreeSet<Song>();
		ts.add(new Song("a", "c"));
		ts.add(new Song("c", "d"));

		// Collections.sort(al, new songcomparator());

		/*
		 * HashMap<String, Integer> hm=new HashMap<String, Integer>();
		 * hm.put("a", 1); hm.put("b", 2);
		 * 
		 * 
		 * for(Map.Entry m:hm.entrySet()){
		 * System.out.println(m.getKey()+""+m.getValue()); }
		 * 
		 * HashSet<Integer > hs=new HashSet<Integer>(); hs.add(10); hs.add(20);
		 * hs.add(10); System.out.println(hs);
		 */

		Iterator<Song> itr = ts.iterator();
		while (itr.hasNext()) {

			/*
			 * Song st=(Song)itr.next(); System.out.println(st.getArtist()+"" +
			 * st.getTitle());
			 */
			System.out.println(itr.next());
		}

		/*
		 * for (Song song : al) { System.out.println(song);
		 * 
		 * }
		 */
		// System.out.println(al);

		/*
		 * int a=10; int b ; b=a>10?-a:a; System.out.println(b);
		 */
		int i, j;
		i = 10;
		j = i >= 10 ? -i : i;
		System.out.println(j);

	}

}
