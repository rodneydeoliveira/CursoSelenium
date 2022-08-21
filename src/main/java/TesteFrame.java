import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		
	}

}
