package com.qvision.capa.keys;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class KeyWords {

	public void ScreenShot(WebDriver driver) {
		try {
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File("C:\\Users\\ASUS\\Documents\\Automatizacion\\Capacitacion\\POMCapa\\Evidencia"+System.currentTimeMillis()+".png");
	FileUtils.copyFile(SrcFile, DestFile);
		}
		catch (Exception e) {
			System.out.println("ERROR EN SS!");
		}
	}
	
	
}
