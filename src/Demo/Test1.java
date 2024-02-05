package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{

	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/upload");
		
		WebElement upButton = d.findElement(By.xpath("//input[@id='file-upload']"));	
		
		String path = System.getProperty("user.dir");
		upButton.sendKeys(path+"//Files//abc.txt");
		
	}

}
