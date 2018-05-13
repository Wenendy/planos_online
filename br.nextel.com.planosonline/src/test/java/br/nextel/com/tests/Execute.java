package br.nextel.com.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.nextel.com.pages.PosPago5GB;


public class Execute {
	
	static WebDriver driver;
	static PosPago5GB pospagocincogigas;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/wenendysilva/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://planos.nextel.com.br/");
		pospagocincogigas = new PosPago5GB();
	}

	@Test
	public void test() {
		pospagocincogigas.boxplanop();
	}

}
