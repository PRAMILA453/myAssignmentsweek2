package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDuplicateLead {

	

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
	         driver.findElement(By.linkText("Leads")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.linkText("Create Lead")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Org.Testleaf");
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pramila");
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangaraj");
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pramila");
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_description")).sendKeys("Im a Fresher");
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pramilathangaraj453@gmail.com");
	         Thread.sleep(1000);
	         driver.findElement(By.name("submitButton")).click();
	         String title = driver.getTitle();
	            System.out.println(title); 
	         
	            driver.findElement(By.className("subMenuButton")).click();   
	            
	           driver.findElement(By.id("createLeadForm_companyName")).clear();
	           Thread.sleep(1000);
	           driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leaf");
	           Thread.sleep(1000);
	           driver.findElement(By.id("createLeadForm_firstName")).clear();
	           Thread.sleep(1000);
	           driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PRAMILA");
	           Thread.sleep(1000);
	           driver.findElement(By.name("submitButton")).click();
	           
	           String page = driver.getTitle();
	           System.out.println( page );
	           
	         // driver.close();
	         

	}

}
