package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CustomPage;


public class CustomSteps {	
	
	@Quando("o usuario clicar na aba my info")
	public void oUsuarioClicarNaAbaMyInfo() {
		Na(CustomPage.class).acionarBUttonMyInfo();
	}
	
	@Quando("informar o tipo sanguineo")
	public void informarOTipoSanguineo() {
		Na(CustomPage.class).acionarButtonBloodType();
	}
	
	@Quando("acioanar o botao save") 
	public void acionarOBotaoSave() {
		Na(CustomPage.class).acionarButtonSave();
	}
	
	@Entao("o usuario vai para pagina Custom Fields")
	public void OUsuarioVaiParaPaginaCustomFields() {
		assertEquals("Custom Fields", driver.findElement(By.xpath("//h6[contains(.,'Custom Fields')]")).getText());
	}

}
