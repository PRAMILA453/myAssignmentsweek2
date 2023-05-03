package week2.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3CreateContacts {

	

	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver=new ChromeDriver();
	      
	        driver.get("http://leaftaps.com/opentaps/control/login");
	        driver.manage().window().maximize();
	        
	         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	         Thread.sleep(1000);
	         
	         driver.findElement(By.id("password")).sendKeys("crmsfa");
	         Thread.sleep(1000);
	         
	         driver.findElement(By.className("decorativeSubmit")).click();
	         Thread.sleep(1000);
	         
	         driver.findElement(By.linkText("CRM/SFA")).click();
	         Thread.sleep(1000);
	         
            driver.findElement(By.linkText("Contacts")).click();
            
            driver.findElement(By.linkText("Create Contact")).click();
           
          driver.findElement(By.id("firstNameField")).sendKeys("pramila"); 
         
          driver.findElement(By.id("lastNameField")).sendKeys("Thangaraj");
       
          driver.findElement(By.name("submitButton")).click();
          
          String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
	        System.out.println(text);
	        
	         String title =  driver.getTitle();
		     System.out.println("Title of the page is :"+title);
		
	      
	}  

}
