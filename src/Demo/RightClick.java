package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{

	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/context_menu");
		
		WebElement box = d.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions a = new Actions(d);
		a.contextClick(box).build().perform();
	
		
		
	}

}
