package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CustomPage{
	
	Actions acao = new Actions(driver);
	
	@FindBy(xpath = "//a[@class='oxd-main-menu-item'][contains(.,'My Info')]")
	private WebElement buttonMyInfo;
	
	@FindBy(xpath = "(//div[@tabindex='0'])[3]")
	private WebElement selectType;
	
	@FindBy(xpath = "//div[@role='option'][contains(.,'O+')]")
	private WebElement buttonBloodType;
	
	@FindBy(xpath = "(//button[@type='submit'][contains(.,'Save')])[2]")
	private WebElement buttonSave;
		
	public void acionarBUttonMyInfo() {
		buttonMyInfo.click();
	}
	
	public void acionarButtonBloodType() {
		acao.moveToElement(selectType).build().perform();
		selectType.click();
		buttonBloodType.click();
		
	}

	public void acionarButtonSave() {
		buttonSave.click();
		
	}
	
}