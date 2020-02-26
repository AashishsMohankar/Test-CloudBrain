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
