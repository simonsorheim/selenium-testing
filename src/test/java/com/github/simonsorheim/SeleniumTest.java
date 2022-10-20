package com.github.simonsorheim;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * SeleniumTest
 * Created 2022-10-20
 *
 * @author simon
 */
public class SeleniumTest {

	@Test
	public void seleniumTest() {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver webDriver = new ChromeDriver(options);
		webDriver.get("https://dev.mediaconnect.no/");
		String title = webDriver.getTitle();
		assertEquals("Mediaconnect AS", title);
		webDriver.close();
	}
}
