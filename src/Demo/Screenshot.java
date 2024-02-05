package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		
		TakesScreenshot ts = (TakesScreenshot)d;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		

		File trg = new File("C:\\Users\\Nikhil S\\Pictures\\test.png");
		
		FileUtils.copyFile(src, trg);
	

	}

}
