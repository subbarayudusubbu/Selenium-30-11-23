package encapsulation;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	 // highlight(driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr)[last()]")));
		

	}

	}


