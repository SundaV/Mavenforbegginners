package org.treeser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

import org.hibernate.hql.ast.origin.hql.parse.HQLParser.collectionExpression_return;

public class Treemain {
	public static void main(String[] args) {
		
		
		/*TreeSet<Info>  ts=new TreeSet<Info>();
		ts.add(new Info("a", 1));
		ts.add(new Info("b", 2));
		for (Info info : ts) {
			System.out.println(info);
		}*/
		
		ArrayList<Info> al=new ArrayList<Info>();
		al.add(new Info("a", 22));
		al.add(new Info("b", 2));
		
Collections.sort(al, new NameComp());
Collections.sort(al, new SalComp());
Iterator<Info> itr=al.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}



 	}

}
