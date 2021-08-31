package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://inm-test-app.herokuapp.com/accounts/login/");
			driver.manage().window().maximize();
			System.out.println("----* Teste iniciado com Sucesso *----");
		} catch (Exception e) {
			System.err.println("----- Erro ao abrir navegdor ------" + e.getMessage());

		}
	}

	public void escrever(By elemento, String texto) {

		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println(" ----- Erro ao digitar ------");
		}

	}

	public void click(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println(" ---- Erro ao Cliar -----");
		}
	}
	
	public void submit (By elemento) {
		
		driver.findElement(elemento).submit();
	}
	
	public void fechar() {
		
		driver.quit();
		System.out.println("--- Teste realizado com sucesso ---");
	}
}
