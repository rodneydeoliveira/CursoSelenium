import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCadastrarUsuario {
private WebDriver driver;
	
	
	@Before
	public void setUp() {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\NoT\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("file:///C:/Users/NoT/Downloads/campo_treinamento/componentes.html");

}
	@Test
	public void cadastrarUsuario() {
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Rodney");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Oliveira");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		// outra opção new Select(driver.findElement(By.id("elementosForm:escolaridade")))
		// .selectByVisibleText("mestrado");
		WebElement escolaridade = driver.findElement(By.id("elementosForm:escolaridade"));
		Select select = new Select (escolaridade);
		select.selectByValue("superior");
		WebElement esportes = driver.findElement(By.id("elementosForm:esportes"));
		Select esporte = new Select (esportes);
		esporte.selectByVisibleText("Corrida");
		esporte.selectByVisibleText("Futebol");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		assertEquals("Cadastrado!", driver.findElement(By.xpath("/html/body/center/div[2]/span")).getText());
		
	}
	
}
