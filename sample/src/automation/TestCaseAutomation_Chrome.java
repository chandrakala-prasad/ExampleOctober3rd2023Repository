package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAutomation_Chrome {
	public static void main(String[] args) {
		automation_TC101_Chrome();
	}
	
	//Test case ID: TC_101
	public static void automation_TC101_Chrome() {
		ChromeDriver ch = null;
		String strText = null;
		try {
			//1. Open browser
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Library\\drivers\\chromedriver.exe");
			//to load exc file in  crome
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			
			
			//2. navigate the URL (http://localhost/login.do)
			ch.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			
			//3. Enter username and password
			ch.findElement(By.name("username")).sendKeys("admin");
			ch.findElement(By.name("pwd")).sendKeys("manager");
			
			
			//4. click on Login button
			ch.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			
			//5. Verify login is successful
			strText = ch.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(strText.equalsIgnoreCase("Enter Time-Track")) {
				System.out.println("Login to ActiTime is successful");
			}else {
				System.out.println("Failed to login to ActiTime");
			}
			
			
			//6. logout from actiTime
			ch.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
			
			//7. Close the browser
			ch.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			ch = null;
		}
	}
}