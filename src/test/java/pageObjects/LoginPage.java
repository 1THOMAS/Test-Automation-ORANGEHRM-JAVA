package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement campoUserName;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement campoPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement buttonLogin;	
	
	public void informarCampoUsuario(String usuario) {		
		campoUserName.sendKeys(usuario);		
	}
	
	public void informarCampoSenha(String senha) {		
		campoPassword.sendKeys(senha);		
	}
	
	public void acionarBotaoLogin() {		
		buttonLogin.click();		
	}
	
	public void realizarLogin() {
		campoUserName.sendKeys("Admin");
		campoPassword.sendKeys("admin123");
		buttonLogin.click();
	}

}