import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		Assert.assertEquals("Oliveira", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
	
		}
		
		@Test
		public void deveInteragirComTextArea( ) {
			driver.get("file:///C:/Users/NoT/Downloads/campo_treinamento/componentes.html");
			driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("ola");
			Assert.assertEquals("ola",driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));

		}
		
		@Test
		public void deveInteragirComRadioButton( ) {	
			driver.findElement(By.id("elementosForm:sexo:0")).click();
			Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());

			
			
		}
		@Test
		public void deveInteragirComCheckbox( ) {		
			driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
			driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected();
			Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());

			
		}
		
		@After
		public void tearDown() {
		driver.quit();
			
		
		}
	}
