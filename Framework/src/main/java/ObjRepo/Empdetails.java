package ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Excelib;

public class Empdetails {
	@FindBy(id = "firstName")
	public WebElement fiarstname;
	@FindBy(id = "middleName")
	public WebElement midelname;
	@FindBy(id = "lastName")
	public WebElement lastname;
	@FindBy(id = "employeeId")
	public WebElement value;
	@FindBy(id = "btnSave")
	public WebElement save;
	
	public void detail_Add() throws Throwable
	{
		Excelib elib= new Excelib();
		
		fiarstname.sendKeys(elib.getExceldata("sheet1", 0, 0));
		midelname.sendKeys(elib.getExceldata("sheet1", 0, 1));
		lastname.sendKeys(elib.getExceldata("sheet1", 0, 2));
		value.getAttribute(elib.getExceldata("sheet1", 0, 3));
		save.click();
	}
	}


