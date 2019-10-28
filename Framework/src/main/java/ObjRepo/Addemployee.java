package ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addemployee
{
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addemployee;
	
	public void Addemp() 
	{
		addemployee.click();
	}

}
