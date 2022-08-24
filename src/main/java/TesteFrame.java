import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v102.page.model.Frame;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.netty.handler.codec.http.DefaultHttpContent;

public class TesteFrame {
private WebDriver driver;
	
	
	@Before
	public void setUp() {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\NoT\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("file:///C:/Users/NoT/Downloads/campo_treinamento/componentes.html");
	}
	
	@Test
	public void DeveInteragirComFrame ( ) {
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("frameButton")).click();
		Alert alerta = driver.switchTo().alert(); // mudando o foco para o alert
		String alert_text = alerta.getText();
		alerta.accept();
		driver.switchTo().defaultContent(); // mudando o foco para o driver
		driver.findElement(By.id("elementosForm:nome")).sendKeys(alert_text);
	}
	@Test
	public void DeveInteragirComPopup ( ) {
		driver.findElement(By.id("buttonPopUpEasy")).click();
		driver.switchTo().window("Popup");
		driver.findElement(By.tagName("textarea")).sendKeys("Deu certo?");
		//driver.close();
		driver.switchTo().window("");
		driver.findElement(By.tagName("textarea")).sendKeys("Deu certo?");
	}

}

