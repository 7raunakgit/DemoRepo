package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchSpecificWindow {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindowId=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> set =driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		if(switchToRightWindow("Facebook", list)) {
			System.out.println(driver.getCurrentUrl()+" -----> "+driver.getTitle());
		}
		switchToParent(parentWindowId);
		
		closeAllWindowsExceptParent(parentWindowId, list);

	}
	
	public static void closeAllWindowsExceptParent(String id,List<String> list) {
		for(String s : list) {
			if(!id.equals(s)) {
				driver.switchTo().window(s).close();
				
			}
		}
	}
	
	public static void switchToParent(String id) {
		driver.switchTo().window(id);
	}
	
	public static boolean switchToRightWindow(String windowName,List<String> list) {
		for(String s : list) {
			String title=driver.switchTo().window(s).getTitle();
			if(title.contains(windowName)) {
				System.out.println("Switch to right window ---> "+windowName);
				return true;
				
			}
		}
		return false;
	}

}
