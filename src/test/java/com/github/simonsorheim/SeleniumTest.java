package com.github.simonsorheim;

import static org.junit.Assert.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * SeleniumTest
 * Created 2022-10-20
 *
 * @author simon
 */
public class SeleniumTest {

	@Test
	public void seleniumTest() {

		// Use manager to handle installing drivers
		WebDriverManager manager = WebDriverManager
				.chromedriver()
				.browserInDocker();

		// Create manager
		WebDriver webDriver = manager.create();

		webDriver.get("https://dev.mediaconnect.no/");
		String title = webDriver.getTitle();
		assertEquals("Mediaconnect AS", title);
		webDriver.close();
	}
}
