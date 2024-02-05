package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{

	public static void main(String[] args) 
	{
	
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement src = d.findElement(By.id("dropdown"));
		
		Select s = new Select(src);
		s.selectByIndex(1);
		
		if(s.isMultiple())
		{
			System.out.println("Dropdown is Multiple");
		}
		else
		{
			System.out.println("Dropdown is not Multiple");
		}
		
	}

}
