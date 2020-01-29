package myJenkinsIntegrationGroupID.myJenkinsIntegrationArttifactID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;


@Test
public class firstTestNGClass {	  
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\Users\\itsmy\\Desktop\\_AllSelenium\\_browserDivers\\chromedriver.exe";
	    public WebDriver driver ;  
		//ChromeOptions options = new ChromeOptions();
		
	    @BeforeTest
	    public void launchBrowser() {
	        System.out.println("launching Chome browser"); 
	        System.setProperty("webdriver.chrome.driver", driverPath);
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	    }
	    @Test
	    public void verifyHomepageTitle() {
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
	   }
	    @AfterTest
	    public void terminateBrowser(){
	        driver.close();
	    }
	  
	  
  }

