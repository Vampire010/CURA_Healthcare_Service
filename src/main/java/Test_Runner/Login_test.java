package Test_Runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Pages.Login_Page;
import Browser_Factory.Launch_Browsers;

public class Login_test 
{
	String URL = "https://katalon-demo-cura.herokuapp.com/";
	String Browser = "chrome";
	Launch_Browsers br = new Launch_Browsers();

	@BeforeMethod
	public void open_Browser()
	{
		br.browsers("chrome", URL);		
	}
	
	@Test
	public void run_login_test() throws IOException
	{
		Login_Page lp = new Login_Page(br.driver);
		lp.menu_toggles();
		lp.Login_btn_toggles();
		lp.setusernames();
		lp.setpasswords();
		lp.ClicklogBtn();
	}	
	
	@AfterMethod
	public void get_page_title()
	{
		System.out.println(br.driver.getTitle());	
		br.driver.close();
	}
}
