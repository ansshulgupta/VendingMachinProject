package com.vendingmachine;

public class VendingMachineLogic {	
	
	SodaMachine_Bean smb=null; 
	
	double requestedcostofsodaglass=0.0;
	double addMoney=0.0;	
	double valueofonesodaglass=0;
	int totalmaxsoda=50;
	double Extramoney=0.0;
	int requestedsodaglass=0;
	
	public VendingMachineLogic(double valueofonesodaglass)
	{
		this.valueofonesodaglass=valueofonesodaglass;
	}
	
	public double addMoney(double addMoney) {
		
		if(addMoney>=requestedsodaglass*valueofonesodaglass)
		{
			this.addMoney= addMoney;
			 System.out.println("logs : added money "+addMoney);
			 
			 requestedcostofsodaglass=requestedsodaglass*valueofonesodaglass;
				System.out.println("Requested cost of sodaglass  " +requestedcostofsodaglass);
				
				Extramoney=addMoney-requestedcostofsodaglass;
				System.out.println("Extramoney "+Extramoney);
			 
			 return Extramoney;
		}
		else {
			System.out.println("please add appropriate amount "+requestedsodaglass*valueofonesodaglass+" $");
		return 0;
		}
		 
	}
	
	public int reStocked() {
		
		if(totalmaxsoda==0)
			totalmaxsoda=50;
	
		return totalmaxsoda;
	}
	
	public int vend(int requestedsodaglass) {	
		
		this.requestedsodaglass=requestedsodaglass;
		
		if(requestedsodaglass<=totalmaxsoda)
		{			
			totalmaxsoda=totalmaxsoda-requestedsodaglass;
			System.out.println("totalmaxsoda "+totalmaxsoda);
			
			return totalmaxsoda;
		}
		else {
			System.out.println("logs : that much amount is not available, "
					+ "we have only "+totalmaxsoda+" soda");
			
			return totalmaxsoda ;
		}
		
		
	}


	
}
