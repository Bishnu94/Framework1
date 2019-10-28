package Generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Webclib 
{
	public void PageToLoad()
	{
		Baseclass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void name() 
	{
	Baseclass.driver.getWindowHandles();
	Set<String>st=new HashSet<String>();

	}

}
