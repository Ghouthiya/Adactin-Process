package com.Maven_Concept_Task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Task {
	public static void main(String[] args) throws IOException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAS = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Dell\\eclipse-workspace\\Maven_Concept_Task\\ScreenShot_Image\\facebook.png");
		FileUtils.copyFile(screenshotAS, f);	
	
		
	}

}
