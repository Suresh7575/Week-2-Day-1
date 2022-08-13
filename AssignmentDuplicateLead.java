package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("username")).sendKeys("demosalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sureshkumar");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandrasekar");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suresh");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("As a fresher, I don't have any work experience, but I am very passionate to work as a Software Tester. My goal is to build a successful career as a Software Tester.");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("c.sureshsk@gmail.com");
		 driver.findElement(By.className("smallSubmit")).click();
	            String title=driver.getTitle();
	            System.out.println(title);
	            driver.findElement(By.linkText("Duplicate Lead")).click();
	            driver.findElement(By.id("createLeadForm_companyName")).clear();
	            driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Digimarget");
	            driver.findElement(By.id("createLeadForm_firstName")).clear();
	            driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nareshkumar");
	   		 driver.findElement(By.className("smallSubmit")).click();
	            String title2=driver.getTitle();
	            System.out.println(title);	            

	}

}
