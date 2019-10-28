package ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout
{
	@FindBy(linkText="Welcome Admin")
    public WebElement welcomeadmin;
    
    @FindBy(linkText="Logout")
    public WebElement logout;
    
   public void checklogout() 
   {
	welcomeadmin.click();
	logout.click();

}
}
