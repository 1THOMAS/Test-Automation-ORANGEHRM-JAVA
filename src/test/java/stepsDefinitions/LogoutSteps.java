package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LogoutPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LogoutSteps {
	
	@Quando("o usuario clicar no perfil")
	public void oUsuarioClicarNoPerfil() {
		Na(LogoutPage.class).acionarButtonPerfil();
		
	}
	
	@Quando("clicar no botao logout")
	public void clicarNoBotaoLogout() {
		Na(LogoutPage.class).acionarButtonLogout();
	}


	@Entao("o sistema ira para tela inicial de login")
	public void oSistemaIraParaTelaInicialDeLogin() {
		assertEquals("Login", driver.findElement(By.xpath("//h5[contains(.,'Login')]")).getText());
	
	}

}