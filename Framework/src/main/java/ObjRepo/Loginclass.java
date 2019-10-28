package ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Baseclass;
import Generic.Constant;
import Generic.Excelib;

public class Loginclass 
{
		@FindBy(name = "txtUsername")
		public WebElement username;
		
		@FindBy(id="txtPassword")
		public WebElement passowerd;
		
		@FindBy(id="btnLogin")
		public WebElement login;
		
		public void adminlogin() throws Throwable 
		{
			Baseclass.driver.get(Constant.URL);
			Excelib exec=new Excelib();
		    username.sendKeys(exec.getExceldata("sheet2", 0, 0));
		    passowerd.sendKeys(exec.getExceldata("Sheet2", 0, 1));
			login.click();
		}


	}



