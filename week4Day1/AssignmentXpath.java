package week4Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentXpath {
	

    //main method
public static void main (String[] args) throws InterruptedException {
	
	// launch a browser
	ChromeDriver driver =new ChromeDriver();
		
	//load a url
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//maximizing a window
	driver.manage().window().maximize();
	
	//relative Xpath
	//basic Xpath
	//attribute based xpath
	//find a locator using attribute based xpath and sending a input
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	
	//index based xpath
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	
	//finding the element by using attribute xpath and click a button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	//text based xpath
	//contains->text method
	driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	
	//text based xpath
  //using text
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	
	//text based xpath
  //contains->attributes method
	driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_companyNam')]")).sendKeys("Testleaf");
	
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("pradeep");
	
	//contains->attributes and index
  driver.findElement(By.xpath("(//input[contains(@id,'createLeadForm_lastName')])[1]")).sendKeys("s");
	
  
  //Locate the dropdown element
  //XPath selector to find the element with 'select' tag and an 'id' attribute of 'createLeadForm_dataSourceId'
	WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
	//Create a Select object
	// Store the located element in source
	Select obj = new Select(source);
	// Select an option by visible text
	obj.selectByVisibleText("Employee");
	
	
	//Locate the dropdown element
	WebElement source2 = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
	Select obj1 = new Select(source2);
	//select an option by value
	obj1.selectByValue("9001");
	
	//Locate the dropdown element
	WebElement source3 = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
  Select obj3 = new Select(source3);
  //select an option by index
	obj3.selectByIndex(5); 		
	
	WebElement source4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select obj4 = new Select(source4);
	obj4.selectByVisibleText("India");
	
	//finding the element with attribute based xpath
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	
	//wait time
	Thread.sleep(5000);
	
	//use XPath to identify the element with text "Find Leads" and click
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("pradeep");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

}
}