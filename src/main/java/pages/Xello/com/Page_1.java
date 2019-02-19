package pages.Xello.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Xello.com.TestBase;

public class Page_1 extends TestBase {
	@FindBy(xpath = "//A[@_ngcontent-c0=''][text()=' About Me ']")
	WebElement AboutMe_Tab;
	
	@FindBy(xpath = "//IMG[@_ngcontent-c1='']")
	WebElement Profile_picture;
	
	@FindBy(xpath = "/html/body/app-root/app-profile/div[1]")
	WebElement Bacground_picture;
	
	@FindBy(xpath = "//IMG[@_ngcontent-c0='']")
	WebElement Profile_icon;
	
	@FindBy(xpath = "//DIV[@_ngcontent-c1=''][text()='Change Pictures']")
	WebElement Change_picture_button;
	
	@FindBy(xpath = "//B[@_ngcontent-c1=''][text()='Jane Doe']")
	WebElement Profile_Name;
	
	@FindBy(xpath = "//DIV[@_ngcontent-c1=''][text()=' ON ']")
	WebElement Profile_Province;
	
	@FindBy(xpath = "//DIV[@_ngcontent-c1=''][text()=' Grade 9 ']")
	WebElement Profile_Grade;
	
	@FindBy(xpath = "//DIV[@_ngcontent-c1=''][text()=' Northern High School ']")
	WebElement Profile_School;
	
	public Page_1(){
		PageFactory.initElements(driver, this);
	}
	
	public void wait(int i){
		try {
			Thread.sleep(i);//wait for 5 seconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String get_url(){
		return driver.getCurrentUrl();
	}

	
public boolean Validate_the_focous(){
	return AboutMe_Tab.isEnabled();
}

public String get_url_Profile_p(){
	return Profile_picture.getAttribute("src");
}

public String get_url_Background_p(){
	return Bacground_picture.getCssValue("background-image");
}

public String get_url_Profile_icon(){
	return Profile_icon.getAttribute("src");
	}

public boolean Display_Changepicturebutton(){
	Change_picture_button.click();
	return Change_picture_button.isEnabled();
}

public void click_Changepicturebutton(){
	Change_picture_button.click();
}
	
public String Display_Name(){
	return Profile_Name.getText();
}

public String Display_Province(){
	return Profile_Province.getText();
}

public String Display_School(){
	return Profile_School.getText();
}

public String Display_Grade(){
	return Profile_Grade.getText();
}

}
