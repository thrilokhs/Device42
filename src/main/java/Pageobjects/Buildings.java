package Pageobjects;

import org.openqa.selenium.By;
import Resources.*;

public class Buildings extends Base {
	Generic gen = new Generic();

	By btnAddBuilding = By.xpath("//a[contains(text(),'Add Building')]");
	By txtName = By.id("id_name");
	By txtAddress = By.id("id_address");
	By txtLatitude = By.id("id_latitude");
	By txtLongitude = By.id("id_longitude");
	By txtContactName = By.id("id_Contact_Name");
	By txtPhone = By.id("id_Contact_Phone");
	By txtTags = By.id("id_tags");
	By txtNotes = By.id("id_notes");
	By txtCustomName = By.id("id_room_set-0-name");
	By linkAddRoom = By.xpath("//a[contains(text(),'Add another Room')]");
	By linkAddAttachment = By.xpath("//a[contains(text(),'Add another File Attachment')]");
	By btnSave = By.xpath("//input[@value='Save']");
	By btnSaveContinue = By.xpath("//input[@value='Save and continue editing']");
	By btnSaveAddAnother = By.xpath("//input[@value='Save and add another']");

	public void clickOnAddBuilding() throws Exception {
		gen.clickElement(btnAddBuilding);
	}

	public void enterName(String name) throws Exception {
		gen.inputText(txtName, name);
	}

	public void enterAddress(String name) throws Exception {
		gen.inputText(txtAddress, name);
	}

	public void enterLatitude(double bldLatitude) throws Exception {
		gen.inputText(txtLatitude, bldLatitude);
	}

	public void enterLongitude(double name) throws Exception {
		gen.inputText(txtLongitude, name);
	}

	public void enterContactName(String name) throws Exception {
		gen.inputText(txtContactName, name);
	}

	public void enterPhoneNum(String name) throws Exception {
		gen.inputText(txtPhone, name);
	}

	public void enterTags(String name) throws Exception {
		gen.inputText(txtTags, name);
	}

	public void enterNotes(String name) throws Exception {
		gen.inputText(txtNotes, name);
	}

	public void enterCustomName(String name) throws Exception {
		gen.inputText(txtCustomName, name);
	}

	public void clickAddRoom() throws Exception {
		gen.clickElement(linkAddRoom);
	}

	public void clickAddAttchment() throws Exception {
		gen.clickElement(linkAddAttachment);
	}

	public void clickSave() throws Exception {
		gen.clickElement(btnSave);
	}

	public void clickSaveContinue() throws Exception {
		gen.clickElement(btnSaveContinue);
	}

	public void clickSaveAddAnother() throws Exception {
		gen.clickElement(btnSaveAddAnother);
	}

}
