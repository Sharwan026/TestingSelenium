import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test(priority=2)
	  public void TC_001() {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		  //getting the title
		  String title=driver.getTitle();
		  System.out.println(title);
		  Assert.assertEquals(title, title);
  }
}
