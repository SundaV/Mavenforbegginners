package org.treeser;

import java.util.Comparator;

class SalComp implements Comparator<Info>{
	 
    public int compare(Info e1, Info e2) {
        if(e1.getSal() > e2.getSal()){
            return 1;
        } else {
            return -1;
        }
    }


}
 