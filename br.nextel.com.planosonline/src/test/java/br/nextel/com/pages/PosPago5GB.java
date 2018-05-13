package br.nextel.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PosPago5GB {

	static WebDriver driver;
	static PosPago5GB preencher;
	
	public void Checkout(WebDriver driver) {
		PosPago5GB.driver = driver;
	}
	
	public void boxplanop() {
		
		//Preencher campos do checkout Plano P 5 GB
		
		WebElement btnComprar = driver.findElement(By.xpath(".//section[2]/ul[1]/li[1]/ul/li[4]/a[1]"));
		btnComprar.click();
		
		WebElement iptFirstName2 = driver.findElement(By.id("iptFirstName2"));
		iptFirstName2.sendKeys("Chip");
		
		WebElement iptLastName2 = driver.findElement(By.id("iptLastName2"));
		iptLastName2.sendKeys("Plano P 5GB");
		
		WebElement iptEmail = driver.findElement(By.id("iptEmail"));
		iptEmail.sendKeys("wenendy.silva@nextel.com.br");
		
		WebElement CellOptional = driver.findElement(By.id("CellOptional"));
		CellOptional.sendKeys("11912341234");
		
		WebElement btnNextPass0 = driver.findElement(By.id("btnNextPass0"));
		btnNextPass0.click();
		
	}

}
