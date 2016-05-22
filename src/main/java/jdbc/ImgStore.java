package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImgStore {
	public static void main(String[] args) {
		Connection con;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@10.68.193.34:1521: localoesqara", "dnbtest1",
					"dnbtest1");
			PreparedStatement ps = con.prepareStatement("insert into IMGTABLE values(?,?)");

			ps.setString(1, "vvvv");

			FileInputStream fin = new FileInputStream("C:/Users/SundarV/Desktop/DNB.png");
			ps.setBinaryStream(2, fin, fin.available());

			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
			// ps.setBinaryStream(2, x)

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
