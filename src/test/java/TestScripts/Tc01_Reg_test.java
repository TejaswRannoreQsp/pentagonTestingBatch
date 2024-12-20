package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import GenericPackage.ExcelFile;
import POM.RegisterPage;
import POM.WelcomePage;
@Listeners(GenericPackage.ListenersClass.class)
public class Tc01_Reg_test extends BaseClass{
	@Test
	public void register() throws EncryptedDocumentException, IOException {
	
	WelcomePage w=new WelcomePage(driver);
	RegisterPage r=new RegisterPage(driver);
	ExcelFile e=new ExcelFile();
	
	w.getRegisterlink().click();
	r.getFirstNameTextfield().sendKeys(e.toreadFromExcelFile("Register", 0, 1));
	r.getLastNameTextfield().sendKeys(e.toreadFromExcelFile("Register", 1, 1));
	r.getEmailTextfield().sendKeys(e.toreadFromExcelFile("Register", 2, 1));
	r.getPasswordTextfield().sendKeys(e.toreadFromExcelFile("Register", 3, 1));
	r.getConfirmpasswordTextfield().sendKeys(e.toreadFromExcelFile("Register", 4, 1));
    Assert.fail();
	r.getRegisterButton().click();
	
	
	
	}
	

}
