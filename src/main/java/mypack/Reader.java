
package mypack;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

 
 
/**
 * This program demonstrates how to read characters from a text file.
 * @author www.codejava.net
 *
 */
public class Reader {
 
    public static void main(String[] args)  {
    	/*Vector<Integer> vv=new Vector<Integer>();
    	vv.add(10);
    	for (Integer integer : vv) {
			System.out.println(integer);
		}
    	*/
    	
    	/*try {
    		 
  	      File file = new File("C:/Users/SundarV/Desktop/assesm.txt");
   
  	      if (file.createNewFile()){
  	        System.out.println("File is created!");
  	      }else{
  	        System.out.println("File already exists.");
  	      }
   
      	} catch (IOException e) {
      	
  	      
  	}*/


    	
    	
    	try {
   		 
    	      File file = new File("C:/Users/SundarV/Desktop/karr.txt"); 
    	      		
    	      
    	      FileOutputStream f=new FileOutputStream(file);
     BufferedOutputStream obj=new BufferedOutputStream(f);
     
     
     String a="what is java";
     String c="it is programming language";
     
     
     byte[] b=a.getBytes();
     byte[] d=c.getBytes();
     
     
     
     
     
  
     
     obj.write(b);
     obj.write(d);
     obj.flush();
     obj.close();
     f.close();
     
     
    	}
    	catch (IOException e) {
			// TODO: handle exception
		}
    }
}
 
 
     
     
    
    
   
    /*if(obj.toString().contains("b")){
    	obj.toString().replace("b", "a");
    	
    }
    FileWriter fw=new FileWriter(file);
    
    
    BufferedWriter bw=new BufferedWriter(fw);
    String Line=null;
    
    
    	}catch (IOException	 e) {
			// TODO: handle exception
    		System.err.println("i am in exception" +
    				"" +
    				"");
		}*/
      
    	
    	
    	
    	/*
        try {
            FileReader reader = new FileReader("C:/Users/SundarV/Desktop/assesment.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    */
        
    	
    
    	
/*try {
	

	File file = new File("C:/Users/SundarV/Desktop/kar" +
      		"" +
      		".txt");
	
	
	
FileReader r=new FileReader(file);


BufferedReader b=new BufferedReader(r);
	String a="b";
	System.out.println("started");

		
	
	r.close();
	b.close();
	
	
	
	FileOutputStream ss=new FileOutputStream(file);
	BufferedOutputStream bb=new BufferedOutputStream(ss);
	
	byte[] q=a.getBytes();
	bb.write(q);
	
				
		
	
	
	
} catch (FileNotFoundException e) {
	// TODO: handle exception
}
    catch (IOException
    		e) {
		// TODO: handle exception
	}	
    	
    	
    }  	*/
 