

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCampoTreinamento {
	private WebDriver driver;
	
	
	@Before
	public void setUp() {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\NoT\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("file:///C:/Users/NoT/Downloads/campo_treinamento/componentes.html");
	}
		
	
		@Test
		public void teste() {
		driver.findElement(By.name("elementosForm:nome")).sendKeys("Rodney");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Oliveira");
		assertEquals("Oliveira", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
	
		}
		
		@Test
		public void deveInteragirComTextArea( ) {
			driver.get("file:///C:/Users/NoT/Downloads/campo_treinamento/componentes.html");
			driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("ola");
			assertEquals("ola",driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));

		}
		
		@Test
		public void deveInteragirComRadioButton( ) {	
			driver.findElement(By.id("elementosForm:sexo:0")).click();
			assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());

			
			
		}
		@Test
		public void deveInteragirComCheckbox( ) {		
			driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
			driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected();
			assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());

			
		}
		
		
		@Test
		public void deveInteragirComCombo( ) {		
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select index = new Select(element);
		index.selectByVisibleText("2o grau incompleto"); 
		// index.selectByVisibleText("2o grau incompleto"); seleciona o campo com o valor do texto
	//	index.selectByIndex("2"); seleciona o campo pelo índice
		assertEquals("2o grau incompleto", index.getFirstSelectedOption().getText());

			
			
		}
		
		@Test
		public void deveSelecionarComboMultiplo( ) {		
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select index = new Select(element);
		index.selectByVisibleText("Natacao"); 
		index.selectByVisibleText("Corrida"); 
		index.selectByVisibleText("Karate"); 

		}
		@Test
		public void deveIndetagirComBotao() {		
		WebElement botao = driver.findElement(By.id("buttonSimple"));
		botao.click();
		assertEquals("Obrigado!", botao.getAttribute("value"));
			
		}
		
		@Test
		public void deveIndetagirComLink() {		
		driver.findElement(By.linkText("Voltar")).click();
		assertEquals("Voltou!", driver.findElement(By.id("resultado")).getText());
		}

		@After
		public void tearDown() {
		driver.quit();
			
		
		}
	}
