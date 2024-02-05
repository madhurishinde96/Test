package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox 
{

	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement ch = d.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));
		
		
		if(ch.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}

	}

}
