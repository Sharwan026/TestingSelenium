package sharwan.day__4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Q5 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		String str=driver.getCurrentUrl();
		if(str.equals("https://j2store.net/free/")) {
			System.out.println(true);
		}
		else
			System.out.println(false);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		String str2=driver.getCurrentUrl();
		if(str2.equals("https://j2store.net/free/index.php/shop?filter_catid=11")) {
			System.out.println(true);
		}
		else
			System.out.println(false);
		driver.close();
    }
}