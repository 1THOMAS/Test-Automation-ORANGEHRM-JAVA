package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastroPage;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastroSteps {
	
	@Dado("que o usuario esteja logado")
	public void queOUsuarioEstejaLogado() {
		Na(LoginPage.class).realizarLogin();
	}
	
	@Quando("o usuario acionar o botao add")
	public void oUsuarioAcionarOBotaoAdd() {
		Na(CadastroPage.class).acionarObutttonAdd();
	}
	
	@Quando("informar nome {string}")
	public void informarNome(String string) {
		Na(CadastroPage.class).campoFirstName("Lucas");
	}
	
	@Quando("informar sobrenome {string}")
	public void informarSobrenome(String string) {
		Na(CadastroPage.class).campoLastName("Guerra");
	}
	
	@Quando("acionar o botao save")
	public void acionarOBotaoSave() {
		Na(CadastroPage.class).acionarButtonSave();
	}
	
	@Entao("o usuario vai para pagina de detalhes")
	public void oUsuarioVaiParaPaginaDeDetalhes() {
		assertEquals("Personal Details", driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]")));
	}
	
	@Entao("o sistema informa o requerimento")
	public void oSistemaInformaORequerimento() {
		assertEquals("Required", driver.findElement(By.xpath("//span[contains(.,'Required')]")));
	}	

	@Quando("informar a nacionalidade")
	public void acionarANacionalidadeBrazilian() {
		Na(CadastroPage.class).acionarBrazilian();
	}
	
	@Quando("informar a data de nascimento {string}")
	public void informarADataDeNascimento(String String) {
		Na(CadastroPage.class).campobirth("1992-03-26");
	}
	
	@Quando("informar o genero")
	public void informarOGenero() {
		Na(CadastroPage.class).acionarGender();
	}
	
}