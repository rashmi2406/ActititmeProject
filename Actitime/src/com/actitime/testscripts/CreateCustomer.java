package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.Genericlibraries.BaseClass;
import com.actitime.Genericlibraries.FileLibrary;
import com.actitime.Genericlibraries.ListenerImplementation;
import com.actitime.objectrepository.Homepage;
import com.actitime.objectrepository.Taskpage;
@Listeners (ListenerImplementation.class)
public class CreateCustomer extends BaseClass{
	       @Test
	       public void createcustomer () throws EncryptedDocumentException, IOException {
	           Homepage hp = new Homepage(driver);
	           hp.getTasktab().click();
	           Taskpage tp = new Taskpage(driver);
	           tp.getAddnewbtn().click();
	           tp.getNewcust().click();
	           FileLibrary f = new FileLibrary();
	           String name =f.readdatafromexcel("wantedlist", 1, 1);
	           tp.getCustname().sendKeys(name);
	           String desp= f.readdatafromexcel("wantedlist", 1, 2);
	           tp.getCustdesp().sendKeys(desp);
	           tp.getCreatebtn().click();
	           String expectedresult = name ;
	           String actualresult = driver.findElement(By.xpath("(//div[.='"+name+"'])[2]")).getText();
	           SoftAssert s= new SoftAssert();
	           s.assertEquals(actualresult, expectedresult);
	           s.assertAll();
	        		   
	           
               	           
	           
	           

	       }
	       
           
}
