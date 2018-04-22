package croc.homework;

import java.util.Date;

public class Shipment {
	
	public int inspectionPeriodDays;
	
	public ShipmentState state;
	
	public Date created;
	
	public Item item;
	
	public User buyer;
	
	public User seller;
	
	public Address delivery;
}
