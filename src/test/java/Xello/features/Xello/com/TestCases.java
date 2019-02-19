package Xello.features.Xello.com;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Xello.com.TestBase;
import pages.Xello.com.Page_1;
import pages.Xello.com.page2;

public class TestCases extends TestBase {
	Page_1 page_1;
	page2 Page_2;
	public static boolean a;
	public static String b,c,d,e;
	public TestCases(){
		super();
	}
	
	@BeforeMethod
	public void setup(){    
		initialization();
		page_1 =new Page_1();
		Page_2 = new page2();
		}
	
	@Test
	public void TC01()   //VerifyHomepage is "About me"//
	{
		page_1.wait(5000);
		System.out.println("1");
		a = page_1.Validate_the_focous();
		b = page_1.get_url();
		String default_URL = "http://localhost:4200/about-me";
		Assert.assertEquals(default_URL, b);
		Assert.assertTrue(a);
//		driver.quit();
		
		}
	
	
	@Test
	public void TC02() //Verify default Profile image displayed 
	{
		page_1.wait(5000);
		b = page_1.get_url_Profile_p();
		System.out.println(b);
		String picture_default = "http://localhost:4200/assets/images/avatar-1.png";
		Assert.assertEquals(picture_default, b);
		driver.quit();
		}
	
	@Test
	public void TC03() //Verify default  image displayed 
	{
		page_1.wait(5000);
		b = page_1.get_url_Background_p();
		System.out.println(b);
		String picture_default = "http://localhost:4200/assets/images/cover-1.png";
		if(b.contains("http://localhost:4200/assets/images/cover-1.png")){
			System.out.println("pass");
		}
		else
		{
			Assert.assertEquals(picture_default, b);
		}
		}
	
	
	@Test
	public void TC04() //Verify default Profile image displayed 
	{
		page_1.wait(5000);
		b = page_1.get_url_Profile_p();
		System.out.println(b);
		c = page_1.get_url_Profile_icon();
		Assert.assertEquals(c, b);
		
		}
	

	@Test
	public void TC05() //Verify default Change Picture button is displayed and is functional
	{
		page_1.wait(5000);
		page_1.click_Changepicturebutton();
		page_1.wait(5000);
		
		}
	
		
	@Test
	public void TC06 () //Verify information about the user is visible 
	{
		page_1.wait(5000);
		b = page_1.Display_Name();
		Assert.assertEquals(b, "Jane Doe");
		c = page_1.Display_Province();
		Assert.assertEquals(c, "ON");
		d = page_1.Display_School();
		Assert.assertEquals(d, "Northern High School");
		e = page_1.Display_Grade();
		Assert.assertEquals(e, "Grade 9");
		}
	
	
	@Test
	public void TC07() //Verify default Change Picture button is displayed and is functional
	{
		page_1.wait(5000);
		
		page_1.click_Changepicturebutton();
		b = Page_2.get_url();
		
		System.out.println(b);
		Assert.assertEquals(b, "http://localhost:4200/change-pictures");
		page_1.wait(5000);
		
		}
	
	
	
	@Test
	public void TC08() //Verify "Save" button is functional by selecting Profile Picture
	{
		page_1.wait(5000);
		page_1.click_Changepicturebutton();
		page_1.wait(5000);
		b = Page_2.get_url_pp3();
		Page_2.Click_pp3();
		Page_2.Click_Save();
		page_1.wait(5000);
		c= page_1.get_url_Profile_p();
		
		Assert.assertEquals(b, c);
		page_1.wait(5000);
		
		}
	
	@Test
	public void TC09() //Verify "Save" button is functional by selecting Profile Picture
	{
		page_1.wait(5000);
		page_1.click_Changepicturebutton();
		page_1.wait(5000);
		b = Page_2.get_url_bp3();
		Page_2.Click_bp3();
		Page_2.Click_Save();
		page_1.wait(5000);
		c= page_1.get_url_Background_p();
		
		if(c.contains(b)){
			System.out.println("pass");
		}
		else
		{
			Assert.assertEquals(c, b);
		}
		}
		
		@Test
		public void TC10() //Verify "Save" button is functional by selecting Profile Picture
		{
			page_1.wait(5000);
			b = page_1.get_url_Profile_p();
			c = page_1.get_url_Background_p();
			page_1.click_Changepicturebutton();
			page_1.wait(5000);
			Page_2.Click_pp3();
			page_1.wait(1000);
			Page_2.Click_bp3();
			page_1.wait(1000);
			Page_2.Click_Cancel();
			page_1.wait(5000);
			d = page_1.get_url_Profile_p();
			e = page_1.get_url_Background_p();
			Assert.assertEquals(d, b);
			Assert.assertEquals(c, e);
			
		}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
