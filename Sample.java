package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumdrivers\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver div=new ChromeDriver();
		div.get("https://www.google.com");
		div.manage().window().maximize();

	}

}
