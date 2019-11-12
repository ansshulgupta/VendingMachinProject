package com.vendingmachine;

import java.util.Scanner;

public class User_Interaction {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		SodaMachine_Bean smb=new SodaMachine_Bean();


		double valueofonesodaglass=0.013;		
		double money_credit=0.0;
		int sodacount =0;

		VendingMachineLogic vml=new VendingMachineLogic(valueofonesodaglass);

		while(vml.reStocked()>0)
		{		
			System.out.println("We have orange soda "+ vml.reStocked()
			+" ltr of soda one glass of soda coste is  "+valueofonesodaglass+"$");

			System.out.println("You want, How many glass of soda ? \n");	

			sodacount =sc.nextInt();

			//smb.setSodacount_in_ltr(sodacount);


			System.out.println("you have entered "+sodacount+" soda glass \n");
			vml.vend(sodacount);	


			System.out.println("Please Enter the total cost of soda"
					+ " "+sodacount*valueofonesodaglass);	

			money_credit=sc.nextDouble();

			System.out.println("please hold the the glass "+sodacount+
					" /n and your extra money "+vml.addMoney(money_credit));


		}

		System.out.println("logs : refilling the tank");
	}				

}



//vml.reStocked();

//call add_credit();

//call vend()

//System.out.println("how much glass of soda you want to buy.");

//double soda_glass = sc.nextInt(); in glass.
//double required_amount=sodacount*soda_cost;
//	System.out.println("Your required amount=" );


