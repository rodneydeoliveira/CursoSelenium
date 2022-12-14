import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAlert {
	private WebDriver driver;
	
	
	@Before
	public void setUp() {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\NoT\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("file:///C:/Users/NoT/Downloads/campo_treinamento/componentes.html");
	}
	
	@Test
	public void DeveInteragirComAlertSimples ( ) {
		driver.findElement(By.id("alert")).click();
		Alert alert = driver.switchTo().alert();
		assertEquals("Alert Simples", alert.getText());
		alert.accept();

		
		
	}
	
	@Test
	public void DeveInteragirComConfirm ( ) {
		driver.findElement(By.id("confirm")).click();
		Alert alerta = driver.switchTo().alert();
		assertEquals("Confirm Simples", alerta.getText());
		// alert.accept();
		alerta.dismiss();
		alerta.accept();
	
	}
	@Test
	public void DeveInteragirComAlertPrompt ( ) {
		driver.findElement(By.id("confirm")).click();
		Alert alerta = driver.switchTo().alert();
	}
	
	@After
	
	public void tearDown () {
		driver.quit();
		
		
	}
}

