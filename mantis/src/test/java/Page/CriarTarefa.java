package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.AcoesSelenium;

public class CriarTarefa extends AcoesSelenium{
	
	private WebDriver driver;
	
	public CriarTarefa(WebDriver driver) {
		this.driver = driver;
	}
	
	public static final By botaoCriarTarefa = By.linkText("Criar Tarefa");
	
	public static final By TarefaCategoria = By.id("category_id");
	public static final By TarefaFrequencia = By.id("reproducibility");
	public static final By TarefaGravidade = By.id("severity");
	public static final By TarefaPrioridade = By.id("priority");
	public static final By TarefaPerfil1 = By.id("profile_id");
	public static final By TarefaPerfil2 = By.id("platform");
	public static final By TarefaPerfil3 = By.id("os");
	public static final By TarefaPerfil4 = By.id("os_build");
	public static final By TarefaResumo = By.id("summary");
	public static final By TarefaDescricao = By.id("description");
	public static final By TarefaPassos = By.id("steps_to_reproduce");
	public static final By TarefaInform = By.id("additional_info");
	public static final By TarefaAplicar = By.id("tag_select");
	public static final By botaoCriarNovaTarefa = By.xpath("//input[@value='Criar Nova Tarefa']");
	
	public void tarefa() {
		
		click(driver, botaoCriarTarefa, 10);
		
		click(driver, TarefaCategoria, 10);
		enviarDados(driver, TarefaFrequencia, "aleatório", 10);
		enviarDados(driver, TarefaGravidade, "mínimo", 10);
		enviarDados(driver, TarefaPrioridade, "alta", 10);
		click(driver, TarefaPerfil1, 10);
		enviarDados(driver, TarefaPerfil2, "Desktop", 10);
		enviarDados(driver, TarefaPerfil3, "Linux", 10);
		enviarDados(driver, TarefaPerfil4, "Ubuntu", 10);
		enviarDados(driver, TarefaResumo, "Teste", 10);
		enviarDados(driver, TarefaDescricao, "Teste de sistema", 10);
		enviarDados(driver, TarefaPassos, "Verificação geral", 10);
		enviarDados(driver, TarefaInform, "Teste", 10);
		enviarDados(driver, TarefaAplicar, "Testando", 10);
		click(driver, botaoCriarNovaTarefa, 10);
		
	}
	
}
