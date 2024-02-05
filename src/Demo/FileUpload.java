package Demo;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{

	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/upload");
		
		//File src = new File("C:\\Users\\Nikhil S\\Desktop\\abc.txt");
		WebElement upButton = d.findElement(By.id("file-upload"));
		
//		upButton.sendKeys("C:\\Users\\Nikhil S\\Desktop\\abc.txt");
				
		String path = System.getProperty("user.dir");
		upButton.sendKeys(path+"\\Files\\abc.txt");
		
		d.findElement(By.xpath("//input[@id='file-submit']")).click();

		
		
	}

}
