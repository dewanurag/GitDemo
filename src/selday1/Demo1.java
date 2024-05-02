package selday1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is Beforeclass m/d");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dewan\\OneDrive\\Desktop\\SeleniumFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is AfterClass m/d");
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before m/d");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is after m/d");
	}

	@Test
	public void test() {
		System.out.println("hello");
		String title  = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getPageSource());
	}
	
	 

}
