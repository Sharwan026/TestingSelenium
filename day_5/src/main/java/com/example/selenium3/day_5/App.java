package com.example.selenium3.day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
    	//launching the url
	    driver.get("https://demoqa.com/droppable/");
	    //drag me
	    WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    //drop here
	    WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    //Actions 
	    Actions act= new Actions(driver);
	    act.dragAndDrop(drag, drop).build().perform();
	    driver.quit();
    }
}
