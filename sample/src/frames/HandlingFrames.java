package frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFrames {
	public static void main(String[] args) {
		ChromeDriver ch = null;
		String strText = null;
		WebElement oEle = null;
		try {
			//1. Open chrome browser and navigate the url 
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.navigate().to("file:///C:/Users/tanee/OneDrive/Desktop/CK%20Web%20Pages/Frames/MainPage.html");
			Thread.sleep(2000);
			
			
			//2. Select "Selenium IDE" checkbox
			oEle = ch.findElement(By.id("chk_id1"));
			oEle.click();
			if(oEle.isSelected()==true) {
				System.out.println("The 'Selenium IDE' checkbox is selected");
			}else {
				System.out.println("Failed to select the 'Selenium IDE' checkbox");
			}
			Thread.sleep(2000);
			
			
			//3. go to Page1 section and enter username & password
			//ch.switchTo().frame(0);
			//ch.switchTo().frame("page1");
			ch.switchTo().frame(ch.findElement(By.id("page1")));
			ch.findElement(By.id("frm1_un_id1")).sendKeys("userName");
			ch.findElement(By.id("frm1_pwd_id1")).sendKeys("passwordddddd");
			Thread.sleep(2000);
			
			
			//4. Go to Page2 and select the city Raichur
			ch.switchTo().frame("page2");
			ch.findElement(By.id("list1")).sendKeys("rcr");
			Thread.sleep(2000);
			
			
			//5. Go back to parent/main browser & read the header
			ch.switchTo().defaultContent();
			strText = ch.findElement(By.tagName("h1")).getText();
			System.out.println(strText);
			Thread.sleep(2000);
			
			
			
			//6. Directly go to Page2 & read the page 2 header.
			ch.switchTo().frame("page1").switchTo().frame("page2");
			strText = ch.findElement(By.tagName("h1")).getText();
			System.out.println(strText);
			
			
			//7. From page2, go to its parent frame Page1 & clear both username & password.
			ch.switchTo().parentFrame();
			ch.findElement(By.id("frm1_un_id1")).clear();
			ch.findElement(By.id("frm1_pwd_id1")).clear();
			Thread.sleep(2000);
			
			
			//8. Go back to parent browser & uncheck the "Selenium IDE" checkbox
			ch.switchTo().defaultContent();
			oEle = ch.findElement(By.id("chk_id1"));
			oEle.click();
			if(oEle.isSelected() == false) {
				System.out.println("The 'Selenium IDE' checkbox is un-selected");
			}else {
				System.out.println("Failed to un-select the 'Selenium IDE' checkbox");
			}
			Thread.sleep(2000);
			
			
			//9. close the browser
			ch.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			ch = null;
			strText = null;
			oEle = null;
		}
	}
}
