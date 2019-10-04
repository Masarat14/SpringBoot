package com.SpringBoot.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile_Main {

	public static void main(String args[])
	{
		/*Airtel air= new Airtel();
		air.calling();
		air.data();
		Vodafone voda = new Vodafone();
		voda.calling();
		voda.data();*/
		
		//**********INTERFACE REFERENCE************//
		
		/*Sim sim = new Airtel();
		sim.calling();
		sim.data();*/
		
		
		//*******INVERSION OF CONTROL*******//
	//ApplicationContext is an IOC Container which is an advanced interface.
	//It is responsible for creating and managing objects without changing the source code
		ApplicationContext  context =  new ClassPathXmlApplicationContext("beans.xml");
		/*Airtel airtel = context.getBean("airtel",Airtel.class);
		airtel.calling();
		airtel.data();*/
		
//Applying Interface Reference//
		
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
		
		
	}
	
}
