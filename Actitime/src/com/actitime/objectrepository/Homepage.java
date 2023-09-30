package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
        @FindBy (xpath="//div[.='Tasks']")
        private WebElement tasktab;
        
        @FindBy (xpath="//div[.='Reports']")
        private WebElement reportstab;
        
        @FindBy (xpath="//div[.='Users']")
        private WebElement userstab;
        
        @FindBy (id="logoutLink")
        private WebElement logoutlink;
        
        public Homepage(WebDriver driver){
        	PageFactory.initElements(driver, this);
        }

		public WebElement getTasktab() {
			return tasktab;
		}

		public void setTasktab(WebElement tasktab) {
			this.tasktab = tasktab;
		}

		public WebElement getReportstab() {
			return reportstab;
		}

		public void setReportstab(WebElement reportstab) {
			this.reportstab = reportstab;
		}

		public WebElement getUserstab() {
			return userstab;
		}

		public void setUserstab(WebElement userstab) {
			this.userstab = userstab;
		}

		public WebElement getLogoutlink() {
			return logoutlink;
		}

		public void setLogoutlink(WebElement logoutlink) {
			this.logoutlink = logoutlink;
		}
        
        
}
