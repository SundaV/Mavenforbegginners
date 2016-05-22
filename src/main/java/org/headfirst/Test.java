package org.headfirst;

import java.util.*;  
import java.io.*;  
public class Test {  
public static void main(String[] args)throws Exception{  
  
Properties p=System.getProperties();  
Set set=p.entrySet();  
  
for (Object object : set) {

	System.out.println(object);
	
}

  
}  
}  