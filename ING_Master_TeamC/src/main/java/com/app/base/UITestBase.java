package com.app.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.app.listners.WebEventListener;

public class UITestBase {

	public static WebDriver wdriver;
	public static EventFiringWebDriver driver;
	public static Properties prop;

	static Logger log = Logger.getLogger(UITestBase.class);

	public UITestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/com/app/config/UIConfig.properties");
			prop.load(ip);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("Browser");

		if ("chrome".equalsIgnoreCase(browserName)) {

			System.setProperty(prop.getProperty("DriverKeyChrome"), prop.getProperty("chromedriver"));
			wdriver = new ChromeDriver();
			driver = new EventFiringWebDriver(wdriver);
			WebEventListener even = new WebEventListener();
			driver.register(even);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("URL"));
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		} else {
			log.info("Please specify proper key word to launch the browser");
		}

	}
}
