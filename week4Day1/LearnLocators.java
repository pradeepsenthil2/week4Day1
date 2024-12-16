package week4Day1;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class LearnLocators {

		public static void main(String[] args) throws InterruptedException {

//			// to Launch the chrome Browser in selenium 3
	//	
//			System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");		
//			
//			ChromeDriver driver = new ChromeDriver();

			// to Launch the chrome Browser in selenium 4

			ChromeDriver driver = new ChromeDriver();

			driver.get("http://leaftaps.com/opentaps/control/main");

			driver.manage().window().maximize();

			driver.findElement(By.id("username")).sendKeys("demosalesmanager");

			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

			driver.findElement(By.className("decorativeSubmit")).click();

			driver.findElement(By.partialLinkText("CRM/S")).click();

			driver.findElement(By.linkText("Leads")).click();
			String title1 = driver.getTitle();

			System.out.println(title1);

			driver.findElement(By.linkText("Create Lead")).click();

			String title = driver.getTitle();

			System.out.println(title);

			String currentUrl = driver.getCurrentUrl();

			System.out.println(currentUrl);

			// driver.findElement(By.tagName("a")).click();

			// to print the all links

			List<WebElement> var = driver.findElements(By.tagName("a"));

			for (int i = 0; i < var.size(); i++) {
				String text = var.get(i).getText();
				System.out.println(text);
			}

			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vinoth");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");

			WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));

			Select obj = new Select(source);

			obj.selectByIndex(2);
			obj.selectByVisibleText("Employee");
			Thread.sleep(3000);
			obj.selectByValue("LEAD_DIRECTMAIL");
			
			obj.deselectByValue("LEAD_DIRECTMAIL");

			// select by index
			// select by value
			// select by Visible text

		}
	}

