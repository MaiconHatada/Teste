import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAcesso {
	private static final String URL_LOGIN = "https://advantageonlineshopping.com/#/";
	protected WebDriver browser;

	@BeforeAll
	public void beforeAll() {
		System.setProperty("wedriver.chromedriver", "drivers./chromedriver.exe");
	}
	
	@BeforeEach
	public void beforeEach() {
		this.browser = new ChromeDriver();
		this.browser.navigate().to(URL_LOGIN);
	}
	@AfterAll
	public void afterAll() {
		this.browser.quit();
	}
	

	@Test
	public void deveAcessarOferta() {
		this.browser.findElement(By.id("see_offer_btn")).submit();
		
	}
}
