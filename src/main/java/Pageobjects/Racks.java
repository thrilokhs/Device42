package Pageobjects;

import org.openqa.selenium.By;
//import helper.Base;
//import helper.Generic;
import Resources.*;

public class Racks extends Base {
	Generic gen = new Generic();

	By btnAddRack = By.xpath("//a[contains(text(),'Add Rack')]");
	By txtName = By.id("id_name");
	By txtSize = By.id("id_size");
	By drpOrientation = By.id("id_orientation");
	By txtFirstNumber = By.id("id_first_number");
	By txtRow = By.id("id_row");
	By txtRoom = By.id("id_room");
	By txtAsset = By.id("id_asset_no");
	By txtManufacturer = By.id("id_maker");
	By txtTags = By.id("id_tags");
	By txtNotes = By.id("id_notes");
	By linkAddAnotherRack = By.xpath("//a[contains(text(),'Add another Racked Device')]");
	By linkAddAttachment = By.xpath("//a[contains(text(),'Add another File Attachment')]");
	By btnSave = By.xpath("//input[@value='Save']");
	By btnSaveContinue = By.xpath("//input[@value='Save and continue editing']");
	By btnSaveAddAnother = By.xpath("//input[@value='Save and add another']");

	public void clickOnAddRack() throws Exception {
		gen.clickElement(btnAddRack);
	}

	public void enterName(String name) throws Exception {
		gen.inputText(txtName, name);
	}

	public void enterSize(int name) throws Exception {
		gen.inputText(txtSize, name);
	}

	public void enterFirstNumber(int number) throws Exception {
		gen.inputText(txtFirstNumber, number);
	}

	public void enterRow(int rkRow) throws Exception {
		gen.inputText(txtRow, rkRow);
	}

	public void enterRoom(int room) throws Exception {
		gen.inputText(txtRoom, room);
	}

	public void enterAssetNo(int number) throws Exception {
		gen.inputText(txtAsset, number);
	}

	public void enterManufacturer(int manufacturer) throws Exception {
		gen.inputText(txtManufacturer, manufacturer);
	}

	public void enterTags(String name) throws Exception {
		gen.inputText(txtTags, name);
	}

	public void enterNotes(String notes) throws Exception {
		gen.inputText(txtNotes, notes);
	}

	public void clickAnotherRack() throws Exception {
		gen.clickElement(linkAddAnotherRack);
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

	public void SelectOrientation(String value) throws Exception {
		gen.selectDropdown(drpOrientation, value);
	}

}
