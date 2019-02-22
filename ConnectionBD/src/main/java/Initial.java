import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

class Initial {
	

	private static BufferedReader br;

	public static void main(String[] args) {
		ReadBD BD = new ReadBD();
		File data = new File("Queries.txt");
		FileReader fr;
		
        
		try {
			
			fr = new FileReader(data);
			br = new BufferedReader(fr);
			String linea = "";
			while ((linea = br.readLine()) != null) {
				try {
					String[] datos = linea.split(";");
					String li = datos[0];
					//System.out.println("MSISDN"+"    ||"+"CHARGE_ACTION"+"||"+"EVENT_SERIAL");
					BD.read(li);
					//line2 = datos[1];
					//BD.read(line2);
					//JOptionPane.showMessageDialog(null, line);
				}
				
				catch (Exception e) {
					System.out.println("eRROR");
				}
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	
}
