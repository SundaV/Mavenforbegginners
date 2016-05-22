package org.treeser;

import java.util.Comparator;

class NameComp implements Comparator<Info>{
	 
    public int compare(Info e1, Info e2) {
        return e1.getName().compareTo(e2.getName());
    }
}  
