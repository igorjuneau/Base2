package TestCases;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Utils.GerenciamentoDriver;
import Page.EnderecoPage;

public class Mantis {
	
	private WebDriver driver;
	GerenciamentoDriver gerenciamentoDriver;
	EnderecoPage enderecoPage;
	
	@Before
	public void setup() {
		gerenciamentoDriver = new GerenciamentoDriver();
		driver = GerenciamentoDriver.browser("chrome");
		enderecoPage = new EnderecoPage(driver);
		
	}

	@Test
	public void mantis() {
		
		driver.get("http://mantis-prova.base2.com.br/");
		enderecoPage.endereco();
		
	}
	
	@After
	public void fim() {
		//driver.quit();
		
	}
	
}
