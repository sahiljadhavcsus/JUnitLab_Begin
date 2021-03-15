package csc131.junit;

import static org.junit.Assert.assertEquals;


import org.junit.Test; 
import org.junit.rules.ExpectedException;


 

public class GiftCardTest 
{    
	@Test     
	public void getIssuingStore()     
	{ 
		double       balance;
		GiftCard     card; 
		int issuingStore; 
		
		issuingStore  = 1337; 
		balance      = 100.00; 
		card = new GiftCard(issuingStore   , balance);
		
		assertEquals("getIssuingStore()",  issuingStore, card.getIssuingStore());   
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	} 
	
	@Test
	public void getBalance()
	{
		double		balance;
		GiftCard	card;
		int			issuingStore;
	
		issuingStore = 1337;
		balance		 = 100.00;
		card	= new GiftCard(issuingStore, balance);
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	
	@Test
	public void deduct_RemainingBalance()
	{
		double		balance;
		GiftCard	card;
		int 		issuingStore;
		
		issuingStore = 1337;
		balance 	 = 100.00;
		card		 = new GiftCard(issuingStore, balance);
		
		
		
		assertEquals("deduct(10.00)", "Remaining Balance:  90.00", card.deduct(10.0));
	}

}  

	
	