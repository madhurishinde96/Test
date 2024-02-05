package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop
{

	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement drag = d.findElement(By.xpath("//div[@id='column-a']"));
		WebElement drop = d.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions a = new Actions(d);
		a.dragAndDrop(drag, drop).perform();
		
		System.out.println("Drag and Drop performed");
		
		
	}

	
}
