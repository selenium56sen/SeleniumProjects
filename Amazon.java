package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void amazonApp() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName("firefox");
		desiredCapabilities.setPlatform(Platform.WINDOWS);

		String nodeURL = "http://localhost:4444/wd/hub";
		WebDriver driver = null;

		try {
			driver = new RemoteWebDriver(new URL(nodeURL), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	}
}
