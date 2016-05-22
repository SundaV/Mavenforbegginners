package mypack;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FileReadandWrite {

	public static void main(String[] args) throws Exception {

		String fileDirectory = "C:\\Users\\SundarV\\Desktop\\karr.txt";
		
		File file = new File(fileDirectory);
		
		if (file.isDirectory()) {
			
			File[] filesList = file.listFiles();
			String filesContent[] = new String[filesList.length];
			
			System.out.println("Total No of Files : "+ filesList.length);
			
			
			// Reading All files Content
			/*
			 * 1. Reading File Content 
			 * 2. File Content as String and Stored in Files Content 
			 * 
			 */
			int fl = 0;
			
			for (File f : filesList) {
				
				if (f.isFile()) {
					
					System.out.println("File Name : "+ f.getName());
					
					StringBuffer buffer = new StringBuffer();
					FileReader reader = new FileReader(f);
					BufferedReader buf = new BufferedReader(reader);
					String line = null;
					
					while ((line = buf.readLine()) != null) {
						buffer.append(line).append("#");
					}
					buf.close();
					filesContent[fl] = buffer.toString();
					fl++;
					
					System.out.println("File Name : "+ f.getName()+"Reading Completed");
				}
			}
			
			System.out.println("Total No of Files Readed : "+ filesContent.length);
			
			// Making Content uniq format
			/*
			 * 1. File Content as String Array 
			 * 2. Store in List
			 * 
			 */
			ArrayList<String> ts = new ArrayList<String>();
			System.out.println("UNIQ AL Size : " + ts.size()+""+ts.hashCode());
			
			for (String str : filesContent) {
				
				System.out.println("Content Added To List Start");
				
				String data[] = str.split("#");
				for (String d : data) {
					ts.add(d.replace("#", ""));
				}
				
				System.out.println("Content Added To List END");
			}
			System.out.println("UNIQ AL Size : " + ts.size());
			
			// Uniq Data to String []
			/*
			 * 1. Removing Duplicate data from file content.  
			 * 
			 */
			ts = new ArrayList<String>(new TreeSet<String>(ts));
			System.out.println("UNIQ2 AL Size After Filetering : "+ ts.size());
			String[] uniqData = new String[ts.size()];
			int i=0;
			for(String str : ts){
				uniqData[i] = str;
				i++;
			}
			System.out.println("UNIQ2 AL Size After Filetering UNIQ : "+ uniqData.length);
			
			// Removing and Adding Blank lines in Files
			/*
			 * 1. Reading Each File Data and Matching content with Uniq Data
			 * 2. Adding some symbol to missed lines
			 * 3. Writing missed jars in separate file.
			 */
			
			for (File f : filesList) {
				if (f.isFile()) {
					
					System.out.println("File Name : "+ f.getName()+""+f.getClass());
					
					StringBuffer buffer = new StringBuffer();
					// Reading file data
					FileReader reader = new FileReader(f);
					BufferedReader buf = new BufferedReader(reader);
					String line = null;
					while ((line = buf.readLine()) != null) {
						buffer.append(line).append("#");
					}
					buf.close();
					
					String content = buffer.toString();
					String fileData[] = content.split("#");
					String finalFileData[] = new String[uniqData.length];
					System.out.println("File Data Beferore filter : "+ fileData.length);
					ArrayList<String> al2 = new ArrayList<String>();
					for(String h2:fileData){
						al2.add(h2);
					}
					al2 = new ArrayList<String>(new TreeSet<String>(al2));
					fileData = new String[al2.size()];
					int inc = 0;
					for(String h2: al2){
						fileData[inc] = h2;
						inc++;
					}
					System.out.println("File Data After filter : "+ fileData.length);
					
					ArrayList<String> matched = new ArrayList<String>();
					ArrayList<String> unmatched = new ArrayList<String>();
					
					for(int j=0; j<uniqData.length; j++){
						for(int k=0; k<fileData.length; k++){
							String tmp = fileData[k];
							if(tmp!=null){
								tmp = tmp.replace("#", "");
								if(uniqData[j].equals(tmp)){
									//System.out.println(" == > " + uniqData[j] + "--" + tmp);
									finalFileData[j] = fileData[k];
									break;
									
								}else{
									finalFileData[j] = "#";
								}
							}else{
								System.out.println("Null");
							}
						}
					}
					
					for(int k=0; k<uniqData.length; k++){
						if(uniqData[k].equals(finalFileData[k])){
							matched.add(uniqData[k]);
						}else{
							unmatched.add(uniqData[k]);
						}
					}
					
					System.out.println("Matched : "+ matched.size());
					System.out.println("UNMatched : "+ unmatched.size());
					
					FileOutputStream fos = new FileOutputStream(new File("E:\\Test\\"+f.getName()+"_OUTPUT.txt"));
					/*
					 * Common Jar List With Check Sum
					 */
					for(String wr : finalFileData){
						if(wr.equals("#")){
							wr = "  \t  ";
							fos.write(wr.getBytes());
							fos.write("\n".getBytes());
						}else{
							wr = wr.replace("  ","\t");
							fos.write(wr.getBytes());
							fos.write("\n".getBytes());
						}
						
					}
					fos.close();
					
					/*
					 * Only Missed Jar's 
					 * 
					 */
					fos = new FileOutputStream(new File("E:\\Test\\"+f.getName()+"_MissedJars.txt"));
					for(String wr : unmatched){
						if(wr.equals("#")){
							wr = "  \t  ";
							fos.write(wr.getBytes());
							fos.write("\n".getBytes());
						}else{
							wr = wr.replace("  ","\t");
							
							fos.write(wr.getBytes());
							fos.write("\n".getBytes());
						}
					}
					fos.close();
					
					/*
					 * Only ContextPath
					 */
					fos = new FileOutputStream(new File("E:\\Test\\"+f.getName()+"_ConextPath.txt"));
					for(String wr : finalFileData){
						if(wr.equals("#")){
							fos.write("\n".getBytes());
						}else{
							fos.write(pathGenerator(wr).getBytes());
							fos.write("\n".getBytes());
						}
					}
					fos.close();
					matched = null;
					unmatched = null;
					finalFileData = null;
					System.out.println("File Name : "+ f.getName()+"Reading Completed");
				}
			}
			
			FileOutputStream fos = new FileOutputStream(new File("E:\\Test\\OUTPUT.txt"));
			for(String wr : uniqData){
				if(wr.equals("#")){
					wr = "  \t  ";
					fos.write(wr.getBytes());
					fos.write("\n".getBytes());
				}else{
					wr = wr.replace("  ","\t");
					fos.write(wr.getBytes());
					fos.write("\n".getBytes());
				}
			}
			fos.close();
		}
	}
	private static String pathGenerator(String path){
		StringTokenizer tokens = new StringTokenizer(path);
		String[] tok = new String[tokens.countTokens()];
		for(int i=0;tokens.hasMoreElements();i++){
			tok[i] = tokens.nextToken();
		}
		int index = tok[1].lastIndexOf("/");
		path = tok[1].substring(0,index);
		return path;
	}
	
	
	
	
	
	
	
	
	
}
