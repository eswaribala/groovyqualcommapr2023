package day3

import io.github.bonigarcia.wdm.WebDriverManager

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

import java.time.Duration

class TestCanadaPhone {
    WebDriver driver

    @BeforeTest
    def setUp(){
        WebDriverManager.firefoxdriver().setup()
        driver = new FirefoxDriver()

      //  def driverPath="chromedriver.exe"

        //System.setProperty("webdriver.chrome.driver",driverPath);
       // driver=new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.canada411.ca/");
    }

   @Test
    def searchPhoneNoTest(){
        driver.findElement(By.id("c411PeopleReverseWhat")).sendKeys("905-841-0191")
         driver.findElement(By.id("c411PeopleReverseFind")).click()
        def message=driver.findElement(By.className("merchantInfo-title merchant__title only-title")).getText()
        Assert.assertEquals(message,"Golf Town");
    }
}
