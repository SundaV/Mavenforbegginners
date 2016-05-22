package jdbc;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageRetrive {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.68.193.34:1521: localoesqara",
					"dnbtest1", "dnbtest1");
			PreparedStatement ps = con.prepareStatement("select Name,Photo from IMGTABLE");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// now on 1st row

				Blob b = rs.getBlob("Photo");// 2 means 2nd column data
				byte barr[] = b.getBytes(1
						, (int) b.length());// 1 means first
																// image

				FileOutputStream fout = new FileOutputStream("C:/Users/SundarV/Desktop/DNB1.png");
				fout.write(barr);
				System.out.println("ok");

				fout.close();
			}// end of if
			

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	
	
	}
}
