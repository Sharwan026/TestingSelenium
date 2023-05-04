package sharwan.day__4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Q2 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
	       WebDriver driver = new EdgeDriver();
	       driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Sharwan");
	       driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("sharwan@gmail.com");
	       driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("praveen");
	       driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("praveen@gmail.com");
	       driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Hello");
	       driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("7000");
	       driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
	       driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	       driver.close();
    }
}