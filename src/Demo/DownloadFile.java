package Demo;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile 
{

	public static void main(String[] args)
	{
	
		
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/Download");
		
		d.findElement(By.linkText("spectrum-logo.png")).click();
		
		

	}

}
