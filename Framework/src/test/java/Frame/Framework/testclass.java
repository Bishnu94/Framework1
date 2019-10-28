package Frame.Framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic.Baseclass;
import Generic.Excelib;
import ObjRepo.Addemployee;
import ObjRepo.Empdetails;
import ObjRepo.Employeelist;
import ObjRepo.Homepage;

public class testclass extends Baseclass 
{
	@Test
	public void Run() throws Throwable
	{
	       Homepage hm=PageFactory.initElements(driver, Homepage.class);
		         hm.pimclick();
	    Employeelist em=PageFactory.initElements(driver, Employeelist.class);
	                 em.clickrediobutton();
	     Addemployee add=PageFactory.initElements(driver, Addemployee.class);
	     add.Addemp();
		 Empdetails emp=PageFactory.initElements(driver, Empdetails.class);  
		 emp.detail_Add();

		//String Password=ex.getExceldata("SheetName", 1, 1);
		/*Homepage hm=PageFactory.initElements(driver,Homepage.class);
         hm.pimclick();
         Employeelist em=PageFactory.initElements(driver, Employeelist.class);
         em.emplistclick();
         JavascriptExecutor js = (JavascriptExecutor) driver;		
         js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
         em.clickrediobutton();*/
		
	}
	
	

}
