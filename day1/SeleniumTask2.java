package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask2 {

	public static void main(String[] args) {
		  ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.leafground.com/input.xhtml");
	      driver.manage().window().maximize();
	      driver.findElement(By.name("j_idt88:name")).sendKeys("pramila");
	      	

	}

}
