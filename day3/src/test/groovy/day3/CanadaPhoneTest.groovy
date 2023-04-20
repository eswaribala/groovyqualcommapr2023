package day3

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

import java.time.Duration

class CanadaPhoneTest {
    WebDriver driver

    @BeforeMethod
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.canada411.ca/");
    }

    @Test
    void searchPhoneNo(){
        driver.findElement(By.Id("c411PeopleReverseWhat")).sendKeys("905-841-0191")
         driver.findElement(By.Id("c411PeopleReverseFind")).click()
        def message=driver.findElement(By.className("merchantInfo-title merchant__title only-title")).getText()
        Assert.assertEquals(message,"Golf Town");
    }
}
