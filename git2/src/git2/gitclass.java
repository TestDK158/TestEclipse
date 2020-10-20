package git2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium_JarFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.southalltravel.co.uk/");
		driver.manage().window().maximize();
	    //WebElement dFlights= driver.findElement(By.id("directFlight1"));//for name and checked
	    //1.System.out.println(dFlights.getAttribute("name"));//name of checkbox
        //System.out.println(dFlights.getAttribute("checked"));//checked/ticked or not
      //goto southall,click on checkbox,find out if its checked
     driver.findElement(By.xpath("//span[@class='checkmark']")).click();
     WebElement dFlights=driver.findElement(By.id("directFlight1"));
      if(dFlights.isSelected())
     {
    	System.out.println("dflights is selected"); 
     }
      else 
      {
    	System.out.println("dFlights not selected");  
      }  
	}



	}


