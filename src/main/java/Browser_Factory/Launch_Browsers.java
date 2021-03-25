package Browser_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browsers 
{
	public static  WebDriver driver;
	

	public String browsers(String browser_Type , String Url)
	{
	
		if(browser_Type.equals("chrome"))
		{				
			System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(Url);				
		}
		
		else if(browser_Type.equals("firefox"))
		{				
			System.setProperty("webdriver.gecko.driver", "G:\\Kids_Bank_Pom\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(Url);			
		}
		
		else if(browser_Type.equals("edge"))
		{				
			System.setProperty("webdriver.edge.driver", "G:\\Kids_Bank_Pom\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(Url);			
		}
			
		else 
		{				
			System.out.println("Specified browser type is not found");			
		}		
		return Url;	
	}


}
