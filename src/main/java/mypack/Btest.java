
package mypack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Btest {
	public static void main(String args[]) {
		try {
			File file = new File("C:/Users/SundarV/Desktop/karr.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "", oldtext = "ss" + "";
if(file.isDirectory()){
			StringBuffer buffer = new StringBuffer();

			while ((line = reader.readLine()) != null) {
				buffer.append(line).append("\n");
				
			}

			reader.close();
			line = buffer.toString();
}			
//			java.util.Date vv=new java.util.Date();
//			System.out.println(vv);
				
			if (line.contains("f")) {

				line = line.replaceAll("java", "Response2");

				System.out.println("executed");

			} else {
				System.out.println("not" + "");
			}

			FileOutputStream fw = new FileOutputStream(file);
			
			byte[] z=line.getBytes();
			fw.write(z);
			fw.close();
			 
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
