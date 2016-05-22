package com.enm;

import java.util.HashMap;
import java.util.Map;

public class Has {
	static  volatile int b=20;
	 public static  void main(String[] args) {
	
	String s="abcd";
	StringBuffer sb=new StringBuffer(s);
	//sb.append("b");
	sb.replace(0, 4, "x");
	System.out.println(sb.toString());
	HashMap<Object , Integer> hm=new HashMap<Object, Integer>();
	hm.put("aa", 1);
	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey());
	}
	 int b=20;
	
	
	
	
}
	 
	

static{
	
	System.out.println(b);
}
}
