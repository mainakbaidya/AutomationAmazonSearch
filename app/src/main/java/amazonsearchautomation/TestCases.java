package amazonsearchautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class TestCases {
    

    public void endTest(FirefoxDriver driver)
    {
        System.out.println("End Test: TestCases");
        driver.quit();

    }

    
    public  void testCase01(FirefoxDriver driver) throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        driver.get("http://google.com/");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("amazon");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ENTER).perform();
        Thread.sleep(2000);
        boolean status = driver.findElement(By.xpath("//span[text()='Amazon.in']")).isDisplayed() && driver.findElement(By.xpath("//span[text()='Amazon.com']")).isDisplayed();
        System.out.println("Amazon.in or Amazon.com is found "+status);
        System.out.println("End Test case: testCase01");
    }


}
