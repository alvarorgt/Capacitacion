import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadBD {
	
	
	
	public void read (String line) {
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        String XQ,XQ2,XQ3;
		try {
			fichero = new FileWriter("Files\\Result.txt");
	        pw = new PrintWriter(fichero);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.69.37.58:1521:RGDWH", "PRUEBAS", "TigoUne.2017");

			Statement stmt = con.createStatement();
			

			ResultSet rs = stmt.executeQuery(line);
			
			while (rs.next()) {
				XQ = (rs.getString(1));
				XQ2 = (rs.getString(2));
				XQ3 = (rs.getString(3));
				System.out.println( XQ + "||" + XQ2 + "||" + XQ3);
				pw.println( XQ + "||" + XQ2 + "||" + XQ3);
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
		
	}

	}
}
