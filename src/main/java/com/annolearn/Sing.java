package com.annolearn;

import javax.inject.Singleton;

public class Sing {
	private static Sing singleton = new Sing( );
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private Sing(){ }
	   
	   /* Static 'instance' method */
	   public static Singleton getInstance( ) {
	      return (Singleton) singleton;
	   }
	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton"); 
	   }
	   public static void main(String[] args) {
		Sing s=new Sing();
		s.demoMethod();
	}
}
