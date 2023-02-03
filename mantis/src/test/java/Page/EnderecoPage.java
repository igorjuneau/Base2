package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.AcoesSelenium;

public class EnderecoPage extends AcoesSelenium{
	
	private WebDriver driver;
	
	public EnderecoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static final By imputNome1 = By.id("username");
	public static final By imputNome2 = By.id("username");
	public static final By botaoEntrar = By.xpath("//input[@value='Entrar']");
	public static final By imputSenha = By.id("password");
	
	public void endereco() {
		
		click(driver, imputNome1, 5);
		enviarDados(driver, imputNome2, "igor.juneau", 10);
		click(driver, botaoEntrar, 5);
		
		enviarDados(driver, imputSenha, "Igor10203050", 10);
		click(driver, botaoEntrar, 5);
		
		
	}
	
}
