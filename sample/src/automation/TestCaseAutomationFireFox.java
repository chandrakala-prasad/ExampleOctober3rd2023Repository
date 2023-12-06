package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;

public class TestCaseAutomationFireFox {
	public static void main(String[] args) {
		automation_TC101_Firefox();
	}
	
	//Test case ID: TC_101
	public static void automation_TC101_Firefox() {
		FirefoxDriver ff = null;
		String strText = null;
		try {
			//1. Open browser
			System.setProperty("webdriver.geckodriver.driver", System.getProperty("user.dir") + "\\Library\\drivers\\geckodriver.exe");
			//to load exc file in  crome
			ff = new FirefoxDriver  ();
			ff.manage().window().maximize();
			
			
			//2. navigate the URL (http://localhost/login.do)
			ff.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			
			//3. Enter username and password
			ff.findElement(By.name("username")).sendKeys("admin");
			ff.findElement(By.name("pwd")).sendKeys("manager");
			
			
			//4. click on Login button
			ff.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			
			//5. Verify login is successful
			strText = ff.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(strText.equalsIgnoreCase("Enter Time-Track")) {
				System.out.println("Login to ActiTime is successful");
			}else {
				System.out.println("Failed to login to ActiTime");
			}
			
			
			//6. logout from actiTime
			ff.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
			
			//7. Close the browser
			ff.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			ff = null;
		}
	}
}
