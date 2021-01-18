package Pageobjects;

import org.openqa.selenium.By;
//import helper.Base;
//import helper.Generic;
import Resources.*;

public class D42Login extends Base {

	Generic generic = new Generic();

	By advanced = By.id("details-button");
	By proceed = By.id("proceed-link");
	By txtUsername = By.id("id_username");
	By txtPass = By.id("id_password");
	By btnSignIn = By.xpath("//i[@class='fas fa-sign-in-alt']");
	By btnDropdn = By.xpath("//i[@class='fas fa-chevron-down']");
	By btnLogout = By.xpath("//li[@href='/admin/logout/']");

	// This clicks on the advanced button on the security warning page
	public void clickAdvanced() throws Exception {
		generic.clickElement(advanced);
	}

	// This clicks on the proceed button on the security warning page
	public void clickproceed() throws Exception {
		generic.clickElement(proceed);
	}

	// This enters the username to be logged in
	public void enterUsername(String username) throws Exception {
		generic.inputText(txtUsername, username);
	}

	// This enters the password on the login page
	public void enterPwd(String password) throws Exception {
		generic.inputText(txtPass, password);
	}

	// This clicks on the signin button
	public void clickSignin() throws Exception {
		generic.clickElement(btnSignIn);
	}

	// This clicks on the dropdown to bring logout button
	public void clickDropdn() throws Exception {
		generic.clickElement(btnDropdn);
	}

	// This clicks on the logout button
	public void clickLogout() throws Exception {
		generic.clickElement(btnLogout);
	}

	// This creates D42 login session
	public void login(String emailid, String password) throws Exception {
		driver.navigate().to("https://151.181.77.108");
		this.clickAdvanced();
		this.clickproceed();
		this.enterUsername(emailid);
		this.enterPwd(password);
		this.clickSignin();

	}

	// This logs out the user from D42
	public void signout() throws Exception {
		this.clickDropdn();
		this.clickLogout();
	}

}
