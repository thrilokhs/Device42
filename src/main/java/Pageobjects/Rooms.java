package Pageobjects;

import org.openqa.selenium.By;
//import helper.Base;
//import helper.Generic;
import Resources.*;

public class Rooms extends Base {
	Generic gen = new Generic();
	
	By btnAddRoom = By.xpath("//a[contains(text(),'Add Room')]");
	By txtName = By.id("id_name");
	By txtBuilding = By.id("id_bldg");
	By drpUOM = By.id("id_height_units");
	By txtUnitOfMeasure = By.id("id_height_units");
	By txtHeight = By.id("id_height");
	By txtGridSize = By.id("id_grid_size");
	By txtRaisedFloorht = By.id("id_raised_floor_height");
	By txtTags = By.id("id_tags");
	By txtNotes = By.id("id_notes");
	By linkAddAnotherRack = By.xpath("//a[contains(text(),'Add another Rack')]");
	By linkAddAttachment = By.xpath("//a[contains(text(),'Add another File Attachment')]");
	By drpOrientation = By.id("id_rack_set-0-orientation");
	By btnSave = By.xpath("//input[@value='Save']");
	By btnSaveContinue = By.xpath("//input[@value='Save and continue editing']");
	By btnSaveAddAnother = By.xpath("//input[@value='Save and add another']");
	
	public void clickOnAddRoom() throws Exception {
		gen.clickElement(btnAddRoom);
	}
	
	public void enterName(String name) throws Exception {
		gen.inputText(txtName, name);
	}
	
	public void enterBuildingId(int rmBuilding) throws Exception {
		gen.inputText(txtBuilding, rmBuilding);
	}
	
	public void enterHeight(int rmHeight) throws Exception {
		gen.inputText(txtHeight, rmHeight);
	}
	
	public void enterGridSize(int gridSize) throws Exception {
		gen.inputText(txtGridSize, gridSize);
	}
	
	public void enterRaisedFloorHeight(int height) throws Exception {
		gen.inputText(txtRaisedFloorht, height);
	}
	
	public void enterTags(String name) throws Exception {
		gen.inputText(txtTags, name);
	}
	
	public void enterNotes(String name) throws Exception {
		gen.inputText(txtNotes, name);
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
	
	public void selectUOM(String value) throws Exception
	{
		gen.selectDropdown(drpUOM, value);	
	}
	
	public void selectOrientation(String value) throws Exception
	{
		gen.selectDropdown(drpOrientation, value);	
	}
	
}
