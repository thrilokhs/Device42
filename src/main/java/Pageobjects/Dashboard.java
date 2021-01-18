package Pageobjects;

import org.openqa.selenium.By;
import Resources.*;

public class Dashboard extends Base {
	Generic gen = new Generic();

	// This is a dynamic page object which selects any of the Main Menu
	// items(Variant) available on the landing page
	public void selectVariant(String MenuName) throws Exception {
		By linkDBVariant = By.xpath("//span[contains(text(),'" + MenuName + "')]");
		gen.clickElement(linkDBVariant);
	}

	// This is a dynamic page object which selects any of the Sub variants under the
	// Main Variant
	public void selectSubVariant(String SubVariant) throws Exception {
		By linkDashboardMenu = By.xpath("//span[contains(text(),'" + SubVariant + "')]");
		gen.clickElement(linkDashboardMenu);
	}

}
