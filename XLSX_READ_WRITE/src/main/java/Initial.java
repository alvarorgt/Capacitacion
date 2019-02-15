import java.io.IOException;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Initial {
	
	public static void main(String...strings) throws IOException{

	    //Create an object of ReadGuru99ExcelFile class

	    ReadExcelFilesE objExcelFile = new ReadExcelFilesE();

	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+"\\";

	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"Test.xlsx","TestData");

	    }
}