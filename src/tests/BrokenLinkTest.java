package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.core5.http.io.HttpClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No. of links : " + links.size());

		List<String> list = new ArrayList<String>();

		for (WebElement e : links) {
			String url = e.getAttribute("href");
			list.add(url);

		}
		long stTime = System.currentTimeMillis();
		list.parallelStream().forEach(e -> checkBrokenLink(e));
		long endTime = System.currentTimeMillis();

		System.out.println("time taken : " + (endTime - stTime));
		driver.quit();

	}

	public static void checkBrokenLink(String link) {

		try {
			URL url = new URL(link);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() >= 400) {
				System.out.println(link + " -----> " + httpURLConnection.getResponseMessage() + " is a Broken link");
			} else {
				System.out.println(link + " -----> " + httpURLConnection.getResponseMessage());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
