package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	
//	Actions acao = new Actions(driver);
	
	@FindBy(xpath = "//span[contains(.,'Paul Collings')]")
	private WebElement clickPerfil;
	
	@FindBy(xpath = "//a[contains(.,'Logout')]")
	private WebElement clickLogout;
	
	public void acionarButtonPerfil() {
		clickPerfil.click();
	}
	
	public void acionarButtonLogout() {
		clickLogout.click();
	}

}