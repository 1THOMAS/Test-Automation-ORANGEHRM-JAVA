package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class CadastroPage {
	
	Actions acao = new Actions(driver);
	
	@FindBy(xpath = "//button[contains(.,'Add')]")
	private WebElement buttonAdd;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	private WebElement buttonSave;
	
	@FindBy(xpath = "(//div[contains(@clear,'false')])[1]")
	private WebElement testeSelect;
	
	@FindBy(xpath = "//div[@role='option'][contains(.,'Brazilian')]")
	private WebElement brTest;	
	
	@FindBy(xpath = "(//input[contains(@placeholder,'yyyy-mm-dd')])[2]")
	private WebElement birth;
	
	@FindBy(xpath = "//label[contains(.,'Male')]")
	private WebElement gender;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
	private WebElement Save;
	
	public void acionarObutttonAdd() {		
		buttonAdd.click();
	}
	
	public void campoFirstName(String nome) {		
		firstName.sendKeys(nome);
	}
	
	public void campoLastName(String sobrenome) {		
		lastName.sendKeys(sobrenome);
	}
	
	public void acionarButtonSave() {		
		buttonSave.click();
	}

	public void campobirth(String data) {
		birth.sendKeys(data);
	}
	
	public void acionarBrazilian() {
		acao.moveToElement(testeSelect).build().perform();
        testeSelect.click();
        brTest.click();
	}
	
	public void acionarGender() {
		gender.click();
	}
	
	public void acionarSave() {
		Save.click();
	}

}
