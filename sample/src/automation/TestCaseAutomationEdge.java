package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseAutomationEdge {
	
		public static void main(String[] args) {
			automation_TC101_Edge();
		}
		
		//Test case ID: TC_101
		public static void automation_TC101_Edge() {
			EdgeDriver ed = null;
			String strText = null;
			try {
				//1. Open browser
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Library\\drivers\\msedgedriver.exe");
				//to load exc file in  crome
				ed = new EdgeDriver();
				ed.manage().window().maximize();
				
				
				//2. navigate the URL (http://localhost/login.do)
				ed.get("http://localhost/login.do");
				Thread.sleep(2000);
				
				
				//3. Enter username and password
				ed.findElement(By.name("username")).sendKeys("admin");
				ed.findElement(By.name("pwd")).sendKeys("manager");
				
				
				//4. click on Login button
				ed.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				
				
				//5. Verify login is successful
				strText = ed.findElement(By.xpath("//td[@class='pagetitle']")).getText();
				if(strText.equalsIgnoreCase("Enter Time-Track")) {
					System.out.println("Login to ActiTime is successful");
				}else {
					System.out.println("Failed to login to ActiTime");
				}
				
				
				//6. logout from actiTime
				ed.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
				
				
				//7. Close the browser
				ed.close();
				ed.quit();
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally{
				ed = null;
			}
		}
}
