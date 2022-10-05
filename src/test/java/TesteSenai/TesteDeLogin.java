package TesteSenai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteDeLogin {

	private	 WebDriver driver;
	
	@Before
	public void ConfigurarTeste () {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
		driver.manage().window().maximize();
		//*[@id="menu"]/a[2]
		
		
		
	}
	
	
	@Test
	public void TesteLogin () {
		
		WebElement campoEmail = driver.findElement(By.id("email"));
		WebElement campoSenha = driver.findElement(By.id("senha"));
		
		campoEmail.sendKeys("carlosOI@email");
		campoSenha.sendKeys("senhadoadriano");
		driver.findElement(By.id("botao-enviar")).click();
		
	}
	
	@After
	public void EncerrarTeste () {
		
	}
	
}
