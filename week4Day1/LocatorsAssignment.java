package week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsAssignment {
	public static void main (String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/S")).click();
		
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pradeep");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj = new Select(source);
		obj.selectByVisibleText("Employee");
		
		WebElement source2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select obj1 = new Select(source2);
		obj1.selectByValue("9001");
		
		WebElement source3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select obj3 = new Select(source3);
		obj3.selectByIndex(5); 		
		
		WebElement source4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select obj4 = new Select(source4);
		obj4.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name);
		
		if(name.contains("pradeep")) {
			System.out.println("verified");
		}
			else {
				System.out.println("Not verified");
			}
		}
				
	}


