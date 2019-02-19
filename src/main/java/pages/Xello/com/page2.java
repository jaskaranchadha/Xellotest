package pages.Xello.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Xello.com.TestBase;

public class page2 extends TestBase {
	
	@FindBy(xpath = "(//IMG[@_ngcontent-c2=''])[1]")
	WebElement PP_1;
	
	@FindBy(xpath = "(//IMG[@_ngcontent-c2=''])[2]")
	WebElement PP_2;
	
	@FindBy(xpath = "(//IMG[@_ngcontent-c2=''])[3]")
	WebElement PP_3;
	
	@FindBy(xpath = "(//IMG[@_ngcontent-c2=''])[4]")
	WebElement BP_1;
	
	@FindBy(xpath = "(//IMG[@_ngcontent-c2=''])[5]")
	WebElement BP_2;
	
	@FindBy(xpath = "(//IMG[@_ngcontent-c2=''])[6]")
	WebElement BP_3;
	
	@FindBy(xpath = "//DIV[@_ngcontent-c2=''][text()='Cancel']")
	WebElement Cancel_button;
	
	@FindBy(xpath = "//BUTTON[@_ngcontent-c2=''][text()='Save']")
	WebElement Save_Button;
	
	public page2(){
		PageFactory.initElements(driver, this);
	}
	
	public String get_url(){
		return driver.getCurrentUrl();
	}
	
	
	public String get_url_pp1(){
		return PP_1.getAttribute("src");
	}
	
	
	public String get_url_pp2(){
		return PP_2.getAttribute("src");
	}
	
	
	
	public String get_url_pp3(){
		return PP_3.getAttribute("src");
	}
	
	
	public String get_url_bp1(){
		return BP_1.getAttribute("src");
	}
	
	public String get_url_bp2(){
		return BP_2.getAttribute("src");
	}
	
	public String get_url_bp3(){
		return BP_3.getAttribute("src");
	}
		
		public void Click_pp3(){
			PP_3.click();
	}
		
		public void Click_bp3(){
			BP_3.click();
	}
	
		public void Click_Save(){
			Save_Button.click();
	}
		public void Click_Cancel(){
			Cancel_button.click();
	}
}
