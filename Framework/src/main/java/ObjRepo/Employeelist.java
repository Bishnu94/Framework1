package ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employeelist 
{
	@FindBy(linkText = "Employee List")
	public WebElement emplist;
//	@FindBy(id="empsearch_employee_name_empName")
//	public WebElement fastname;
//	@FindBy(id="empsearch_id")
//	public WebElement id;
	/*@FindBy(id="btnAdd")
	public WebElement add;
	@FindBy(id="ohrmList_chkSelectRecord_8")
	public WebElement clickred;*/
	public void clickrediobutton()
	{
		emplist.click();
		//fastname.click();
		//fastname.sendKeys("");
		//id.click();
		//id.sendKeys("");
		
	}
	/*public void emplistclick() 
	{
		emplist.click();
	}*/
	

}
