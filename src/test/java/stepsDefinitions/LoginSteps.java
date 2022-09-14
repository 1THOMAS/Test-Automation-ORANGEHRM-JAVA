package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
	LoginPage lp = new LoginPage();
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);

	}
	
	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);

	}
	
	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		Na(LoginPage.class).acionarBotaoLogin();

	}
	
	@Entao("o sistema exibe a mensagem de credenciais invalidas")
	public void oSistemaExibeAMensagemDeCredenciaisInvalidas() {
		assertEquals("Invalid credentials", driver.findElement(By.xpath("//p[contains(.,'Invalid credentials')]")).getText());
	}	

	
	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
		assertEquals("PIM", driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module'][contains(.,'PIM')]")).getText());		
		
	}
	
	@Entao("o sistema exibe a mensagem requerir a senha")
	public void oSistemaExibeAMensagemRequerirASenha() {
		assertEquals("Required", driver.findElement(By.xpath("//span[contains(.,'Required')]")).getText());
	}
	
	@Entao("o sistema exibe a mensagem requerir o usuario")
	public void oSistemaExibeAMensagemRequerirOUsuario() {
		assertEquals("Required", driver.findElement(By.xpath("//span[contains(.,'Required')]")).getText());
	}
	
}
