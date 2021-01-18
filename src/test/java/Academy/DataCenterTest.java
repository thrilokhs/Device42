package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import Pageobjects.*;
import Resources.*;

public class DataCenterTest extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	Dashboard DB = new Dashboard();
	Buildings buildings = new Buildings();
	Rooms rooms = new Rooms();
	Racks racks = new Racks();
	
	//Create Building Form Values
	String BldName = "Canada Trade Center";
	String BldAdd = "CTC, Camelscade";
	final double BldLatitude = 43.653225;
	final double BldLongitude = -79.383186;
	String BldContName = "Test";
	String BldPhone = "+14168630000";
	String BldTags = "16 Market Street";
	String BldNotes = "Toronto";
	
	//Create Room Form Values
	String RmName = "Test Room";
	final int RmBuilding = 157;
	String RmUOM = "in";
	final int RmHeight = 8;
	final int RmGridSize = 6;
	final int RmRaiseFloorHt= 5;
	
	//Create Rack Form Values
	String RkName = "Test Value";
	final int RkSize =57;
	String RkOrientation = "Up";
	final int RkFirstNo = 5;
	final int RkRow = 20;
	final int RkRoom = 180;
	final int RkAsset = 109;
	final int RkMaker = 48;
	
	@Test(description= "This creates a New Building in Datacenter")
	public void create_building() throws Exception
	{
		log.info("Driver is initialized");
		DB.selectVariant("DataCenter");
		DB.selectSubVariant("Buildings");
		buildings.clickOnAddBuilding();
		buildings.enterName(BldName);
		buildings.enterAddress(BldAdd);
		buildings.enterLatitude(BldLatitude);
		buildings.enterLongitude(BldLongitude);
		buildings.enterContactName(BldContName);
		buildings.enterPhoneNum(BldPhone);
		buildings.enterTags(BldTags);
		buildings.enterNotes(BldNotes);
		buildings.clickSave();
		log.info("Building is created and saved");
	}
	
	@Test(description= "This creates a New Room in Datacenter")
	public void create_room() throws Exception
	{
		DB.selectVariant("DataCenter");
		DB.selectSubVariant("Rooms");
		rooms.clickOnAddRoom();
		rooms.enterName(RmName);
		rooms.enterBuildingId(RmBuilding);
		rooms.selectUOM(RmUOM);
		rooms.enterHeight(RmHeight);
		rooms.enterGridSize(RmGridSize);
		rooms.enterRaisedFloorHeight(RmRaiseFloorHt);
		rooms.clickSave();
		log.error("Room is created and it is a test error message");
	}
	
	@Test(description= "This creates a New Rack in Datacenter")
	public void create_rack() throws Exception
	{
		DB.selectVariant("DataCenter");
		DB.selectSubVariant("Racks");
		racks.clickOnAddRack();
		racks.enterName(RkName);
		racks.enterSize(RkSize);
		racks.SelectOrientation(RkOrientation);
		racks.enterFirstNumber(RkFirstNo);
		racks.enterRow(RkRow);
		racks.enterRoom(RkRoom);
		racks.enterAssetNo(RkAsset);
		racks.enterManufacturer(RkMaker);
		racks.clickSave();
		log.fatal("Room is created and it is a test fatal message");
		
	}

}
