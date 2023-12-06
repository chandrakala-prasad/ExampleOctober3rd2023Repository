package childWindow;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindow {
      public static void main(String[] args) {
	ChromeDriver ch = null;
	String sParent = null;
	Set<String> oChildWnd = null;
	String url = null;
	String title = null;
	try {
		//1. Open chrome browser and navigate the url 
		ch = new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("file:///C:/Users/tanee/OneDrive/Desktop/CK%20Web%20Pages/SampleWebPage.html");
		Thread.sleep(2000);
		
		//2. click on the google india link
		ch.findElement(By.id("link_id2")).click();
		Thread.sleep(2000);
		
		
		//3. Switch to child browser and perform some operations viz., 
		//  (a) read the URL
		//  (b) read the title
		
		//Reading the parent window id
		sParent = ch.getWindowHandle();
		System.out.println("Parent WindowID: " + sParent);
		
		oChildWnd = ch.getWindowHandles();
		for(String child: oChildWnd) {
			if(!child.equals(sParent)) {
				ch.switchTo().window(child);
				url = ch.getCurrentUrl();
				System.out.println("Child Window URL: " + url);
				
				title = ch.getTitle();
				System.out.println("Child Window Title: " +title);
				
				//4. close the child browser
				ch.close();
				Thread.sleep(2000);
			}
		}	
		//5. Go back to parent browser and perform some operations viz., 
		//  (a) read the URL
		//  (b) read the title
		
		ch.switchTo().window(sParent);
		url = ch.getCurrentUrl();
		System.out.println("Parent Window URL: " + url);
		
		title = ch.getTitle();
		System.out.println("Parent Window Title: " +title);
		
		
		//6. Close the parent browser
		ch.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		sParent = null;
		oChildWnd = null;
		url = null;
		title = null;
		ch = null;
	}
	
	}
      }
      
		
		
		


