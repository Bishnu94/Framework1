package ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage
{
    
   @FindBy(linkText="PIM")
   public WebElement pim;
   public void pimclick() 
   {
	pim.click();
   }
  
}
