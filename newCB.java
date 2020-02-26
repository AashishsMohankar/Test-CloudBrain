package CloudBrain_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_New_CB {
public static String Error_Message;	
public static WebDriver driver;

@BeforeTest
public static void method1() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aashish.mohankar\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Launch Chrome browser");
		driver.manage().window().maximize();
		driver.get("http://192.168.1.34:3000/");	
	}
@Test(priority = 0)
public static void method2() throws InterruptedException//Invalid User Name
	{
		Reporter.log("=============login with Invalid Usrname and Password==============", true);
		driver.findElement(By.xpath("//i")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user_name")).clear();
		driver.findElement(By.id("user_name")).sendKeys("Click2cloud-abcd");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("Click2cloud");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		if(! url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/"))
			{
				Error_Message =driver.findElement(By.xpath("//*[@id='flash_msg_div']")).getText();
			}
		if(url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/"))
			{
				System.out.println("User login Succesful - Passed");
			}
		else if((! url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/")) && (Error_Message.contains("Sorry, the username or password you entered is incorrect.")))
			{
				System.out.println("User login Unsuccesful and showing correct error message - Passed");
			}
		else
			{
				System.out.println("User login unsuccesful and not showing correct error message - Failed");
			}
		Thread.sleep(2000);
	}
@Test(priority = 2)
public static void method4() throws InterruptedException//blank User_Name
	{
		Reporter.log("==============login with Blank Usrname and Password===============", true);
		driver.findElement(By.xpath("//i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user_name")).clear();
		driver.findElement(By.id("user_name")).sendKeys("");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("Click2cloud1111");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		if(! url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/"))
			{
				Error_Message =driver.findElement(By.xpath("//*[@id='flash_msg_div']")).getText();
			}
		if(url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/"))
			{
				System.out.println("User login Succesful - Passed");
			}
		else if((! url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/")) && (Error_Message.contains("Error: Name is required")))
			{
				System.out.println("User login Unsuccesful and showing correct error message - Passed");
			}
		else
			{
				System.out.println("User login unsuccesful and not showing correct error message - Failed");
			}
	}
@Test(priority = 3)
public static void method5() throws InterruptedException//blank Password
	{
		Reporter.log("===========login with Valid Usrname and blank Password============", true);
		driver.findElement(By.xpath("//i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user_name")).clear();
		driver.findElement(By.id("user_name")).sendKeys("Click2cloud-Tester");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		if(! url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/"))
			{
				Error_Message =driver.findElement(By.xpath("//*[@id='flash_msg_div']")).getText();
			}
		if(url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/"))
			{
				System.out.println("User login Succesful - Passed");
			}
		else if((! url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/")) && (Error_Message.contains("Sorry, the username or password you entered is incorrect.")))
			{
				System.out.println("User login Unsuccesful and showing correct error message - Passed");
			}
		else
			{
				System.out.println("User login unsuccesful and not showing correct error message - Failed");
			}
	}
@Test(priority = 4)
public static void method6() throws InterruptedException//blank User_name and Password
	{
		Reporter.log("===========login with blank Usrname and blank Password============", true);
		driver.findElement(By.xpath("//i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user_name")).clear();
		driver.findElement(By.id("user_name")).sendKeys("");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		if(! url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/"))
			{
				Error_Message =driver.findElement(By.xpath("//*[@id='flash_msg_div']")).getText();
			}
		if(url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/"))
			{
				System.out.println("User login Succesful - Passed");
			}
		else if((! url.equals("https://click2cloud.thecloudsbrain.com/dashboard/show#/")) && (Error_Message.contains("Error: Name is required")))
			{
				System.out.println("User login Unsuccesful and showing correct error message - Passed");
			}
		else
			{
				System.out.println("User login unsuccesful and not showing correct error message - Failed");
			}
	}
@Test(priority = 5)
public static void method7() throws InterruptedException //Valid Username and Password
	{
		Reporter.log("==============login with valid Usrname and Password===============", true);
		driver.findElement(By.xpath("//i")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//i")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user_name")).clear();
		driver.findElement(By.id("user_name")).sendKeys("Tester");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("Click2cloud");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		String url = driver.getCurrentUrl();
		if(! url.equals("http://192.168.1.34:3000/dashboard/show#!#%2F"))
			{
				Error_Message =driver.findElement(By.xpath("//*[@id='flash_msg_div']")).getText();
			}
		if(url.equals("http://192.168.1.34:3000/dashboard/show#!#%2F"))
			{
				System.out.println("User login Succesful - Passed");
			}
		else if((! url.equals("http://192.168.1.34:3000/dashboard/show#!#%2F")) && (Error_Message.contains("Invalid user login Attempted")))
			{
				System.out.println("User login Unsuccesful and showing correct error message - Passed");
			}
		else
			{
				System.out.println("User login unsuccesful and not showing correct error message - Failed");
			}
		
	}
@Test(priority = 6)
	public static void Dashboard1() throws InterruptedException 
	{
		Reporter.log("==============Aws Cloud Details ===============", true);
		driver.findElement(By.xpath("//*[@id='awsCount']")).click();
		System.out.println("Click on AWS cloud");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='heading0']/h4/a")).click();
		System.out.println("Click on AWS account to see details");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='heading0']/h4/a")).click();
		System.out.println("Click on AWS account to close details");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='popheader']/h4/button")).click();
		System.out.println("Close AWS cloud details tab");
		Thread.sleep(2000);
		
		Reporter.log("==============GCP Cloud Details ===============", true);	
		driver.findElement(By.xpath("//*[@id='gcpCount']")).click();
		System.out.println("Click on GCP account count");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='heading0']/h4/a")).click();
		System.out.println("Click on GCP cloud account details");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='heading0']/h4/a")).click();
		System.out.println("Click on AWS account to close details");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='popheader']/h4/button")).click();
		System.out.println("Close AWS cloud details tab");
		
	}
@Test(priority = 7)
	public static void Dashboard2() throws InterruptedException 
	{
		Reporter.log("==============Remove weidget of TCO===============", true);
		driver.findElement(By.xpath("//*[@id='all_tco_graph']/div[1]/div[1]/a")).click();
		System.out.println("Click on wefget option");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='tcodrop1']/a[1]")).click();
		System.out.println("Remove TCO Wedget from dashboard");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
		
		driver.findElement(By.xpath("//*[@id='drop1']")).click();
		System.out.println("Click on Add wedget button");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='drop1']/ul/li[2]")).click();
		System.out.println("Add TCO wedget on dashboard");
		Reporter.log("==============Add weidget of TCO on dashboard===============", true);
	}
@AfterTest
	public static void end() throws InterruptedException {
		Thread.sleep(8000);
		driver.close();
		driver.quit();
		
	}
}
