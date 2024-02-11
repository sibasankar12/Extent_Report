package report;

import base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRun extends BaseClass {

    @Test
    public void loginTest(){
        test = reports.createTest("loginTest")
                .assignAuthor("Nithesh");
        test.log(Status.INFO,"click on organization link");
        driver.findElement(By.linkText("Organizations")).click();

    }

    @Test
    public void test2(){
        test=reports.createTest("test2").assignAuthor("Pradeep");
        test.info("Dry Run code");
    }

}
