import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
i
public class TesteAlert {
	private WebDriver driver;
	
	
	@Before
	public void setUp() {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\NoT\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("file:///C:/Users/NoT/Downloads/campo_treinamento/componentes.html");
	}
	
	@Test
	public void DeveIntegarirComAlertSmples ( ) {
		driver.findElement(By.id("alert")).click();
		Alert alert = driver.switchTo().alert();
		assertEquals("Alert Simples", alert.getText());
		alert.accept();

		
		
	}
		
	

}
