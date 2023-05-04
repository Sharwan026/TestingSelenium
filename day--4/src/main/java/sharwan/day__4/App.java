package sharwan.day__4;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
//        JavascriptExecutor js =  (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,800)", args);
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Sharwan");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Krishnan");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727721euai051@skcet.ac.in");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("coffee");
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}