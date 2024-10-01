package org.web;

import org.openqa.selenium.WebDriver;

public class Web {
	public static void main(String[] args) {
		//set the property of the browser
		System.setProperty("webdrive.Chrome.drive","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Library\\selenium-server-4.25.0.jar");
		//Initialize the webdrive interface
		WebDriver driver = new ChromeDriver();
		//Launch the Url
		driver.get("https://kalaimagalkalvinilayam.com/");
		
	
		
	}


}
