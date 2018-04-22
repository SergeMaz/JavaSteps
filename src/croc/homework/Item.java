package croc.homework;

import java.math.BigDecimal;
import java.util.Date;

public class Item {
	
	public String name;
	
	public String description;
	
	public BigDecimal initialPrice;
	
	public BigDecimal reservePrice;
	
	public Date startDate;
	
	public Date endDate;
	
	public ItemState state;
	
	public Date approvalDatetime;
	
	public Category category[];
	
	public Bid successful;
	
	public Bid bids[];
	
	public User soldBy[];
	
	public User user;
	
	public Item() {
	}

}
