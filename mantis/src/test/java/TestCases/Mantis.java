package TestCases;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Utils.GerenciamentoDriver;
import Page.CriarTarefa;
import Page.EnderecoPage;

public class Mantis {
	
	private WebDriver driver;
	GerenciamentoDriver gerenciamentoDriver;
	EnderecoPage enderecoPage;
	CriarTarefa tarefa;
	
	@Before
	public void setup() {
		gerenciamentoDriver = new GerenciamentoDriver();
		driver = GerenciamentoDriver.browser("chrome");
		enderecoPage = new EnderecoPage(driver);
		tarefa = new CriarTarefa(driver);
		
	}

	@Test
	public void mantis() {
		
		driver.get("http://mantis-prova.base2.com.br/");
		enderecoPage.endereco();
		tarefa.tarefa();
		
	}
	
	@After
	public void fim() {
		//driver.quit();
		
	}
	
}
